package es.edu.android.whatsthat.helper;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;

public class SqlHelper extends SQLiteOpenHelper {
	public static final int DB_VERSION = 1;
	public static final String DB_NAME = "IR_DDBB.db";
	
	// Ruta por defecto de Android de las bases de datos
    private static String DB_PATH;// = "/data/data/es.edu.android.whatsthat/databases/";
    
    private static String TABLE_BRANDS = "brands";
    private static String TABLE_REMOTE_CONTROLS = "remote_controls";
    private static String TABLE_IR_CODES = "ir_codes";
	
    private SQLiteDatabase database;

    private final Context ctx;
	
	public SqlHelper(Context context) {
		super(context, DB_NAME, null, DB_VERSION);
		this.ctx = context;
		
		DB_PATH = getDatabasePath(ctx);
		
		try {
			checkForUpdates();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private String getDatabasePath(Context _ctx) {
		String path = "";
		
		path = _ctx.getFilesDir().getAbsolutePath();
		path = path.substring(0, path.indexOf(_ctx.getPackageName()));
		path += _ctx.getPackageName() + "/databases/";
		
		return path;
	}

	private void checkForUpdates() throws IOException {
		boolean dbExist = checkDatabase();
		
		if (!dbExist) {
			// Creamos una base de datos vacia para poder sobreescribirla con la nuestra
			this.getReadableDatabase();

			copyDatabase();
		} else {
			this.getReadableDatabase();
		}
	}
	
	private boolean checkDatabase() {
		boolean res = false;
		SQLiteDatabase checkDB = null;
		
		try {
			String path = DB_PATH + DB_NAME;
			checkDB = SQLiteDatabase.openDatabase(path, null, SQLiteDatabase.OPEN_READONLY);
		} catch (SQLiteException e) {
			// No existe la base de datos aun
			res = false;
		}
		
		if (checkDB != null) {
			res = true;
			checkDB.close();
			checkDB = null;
		}
		
		return res;
	}
	
	private void copyDatabase() {
		InputStream is;
		try {
			is = ctx.getAssets().open(DB_NAME);
		
			String fileName = DB_PATH + DB_NAME;
			
			OutputStream os = new FileOutputStream(fileName);
			
			byte[] buffer = new byte[1024];
			int length;
			
			while ((length = is.read(buffer)) > 0) {
				os.write(buffer, 0, length);
			}
			
			os.flush();
			os.close();
			is.close();
		} catch (IOException e) {
			throw new Error("Error copiando la base de datos");
		}
	}
	
	public void openDatabase() throws SQLException {
		String path = DB_PATH + DB_NAME;
		
		database = SQLiteDatabase.openDatabase(path, null, SQLiteDatabase.OPEN_READONLY);
	}
	
	public synchronized void close() {
		if (database != null) {
			database.close();
		}
		
		super.close();
	}
	
	public List<CharSequence> getAllBrands() {
		List<CharSequence> data = new ArrayList<CharSequence>();
		
		if (database == null) {
			this.openDatabase();
		}
		
		if (database != null) {
			String[] selection = {"brand_name"};
			Cursor c = database.query(TABLE_BRANDS, selection,
					null, null, null, null, null, null);
			
			if (c != null && c.getCount() > 0) {
				while (c.moveToNext()) {
					data.add(c.getString(c.getColumnIndex("brand_name")));
				}
			}
		}
		
		if (database != null) {
			database.close();
		}
		
		return data;
	}
	
	public List<CharSequence> getAllRemoteControls() {
		List<CharSequence> data = new ArrayList<CharSequence>();
		
		if (database == null) {
			this.openDatabase();
		}
		
		if (database != null) {
			String[] selection = {"control_name"};
			Cursor c = database.query(TABLE_REMOTE_CONTROLS, selection,
					null, null, null, null, null, null);
			
			if (c != null && c.getCount() > 0) {
				while (c.moveToNext()) {
					data.add(c.getString(c.getColumnIndex("control_name")));
				}
			}
		}
		
		if (database != null) {
			database.close();
		}
		
		return data;
	}
	
	public List<CharSequence> getAllIRCodes() {
		List<CharSequence> data = new ArrayList<CharSequence>();
		
		if (database == null) {
			this.openDatabase();
		}
		
		if (database != null) {
			String[] selection = {"ir_code"};
			Cursor c = database.query(TABLE_IR_CODES, selection,
					null, null, null, null, null, null);
			
			if (c != null && c.getCount() > 0) {
				while (c.moveToNext()) {
					data.add(c.getString(c.getColumnIndex("ir_code")));
				}
			}
		}
		
		if (database != null) {
			database.close();
		}
		
		return data;
	}
	
	public Map<String, String> getAllPowerCodes() {
		Map<String, String> data = new HashMap<String, String>();
		
		if (database == null) {
			this.openDatabase();
		}
		
		if (database != null) {
			String query = " select irc.ir_code as ir_code, b.brand_name as brand_name " +
							" from ir_codes irc, brands b " +
							" inner join remote_controls rc " +
							" on irc.id_control = rc._id " +
							" where rc.control_name = '" + "Power" + "' " +
							" order by b.brand_name; ";
			
			Cursor c = database.rawQuery(query, null);
			
			if (c != null && c.getCount() > 0) {
				while (c.moveToNext()) {
					data.put(c.getString(c.getColumnIndex("brand_name")), 
							c.getString(c.getColumnIndex("ir_code")));
				}
			}
		}
		
		if (database != null) {
			database.close();
		}
		
		return data;
	}
	
	public Map<String, String> getAllControlsBrand(String brandName) {
		Map<String, String> data = new LinkedHashMap<String, String>();
		
		if (database == null) {
			this.openDatabase();
		}
		
		if (database != null) {
			String query = " select irc.ir_code as ir_code, rc.control_name as control " +
					" from ir_codes irc " +
					" inner join brands b " +
					" on irc.id_brand = b._id " +
					" inner join remote_controls rc " +
					" on irc.id_control = rc._id " +
					" where b.brand_name = '" + brandName + "' " +
					" order by rc.control_order ";
			
			Cursor c = database.rawQuery(query, null);
			
			if (c != null && c.getCount() > 0) {
				while (c.moveToNext()) {
					data.put(c.getString(c.getColumnIndex("control")), 
							c.getString(c.getColumnIndex("ir_code")));
				}
			}
		}
		
		if (database != null) {
			database.close();
		}
		
		return data;
	}
	
	@Override
	public void onCreate(SQLiteDatabase db) {
		// Not used
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		System.out.println("Actualizando base de datos...");
		
		ctx.deleteDatabase(DB_NAME);
		copyDatabase();
	}
}
