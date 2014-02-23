package es.edu.android.whatsthat.helper;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;

public class DatabaseHelper extends SQLiteOpenHelper {
	
	private static final int DATABASE_VERSION = 1;
	private static final String DATABASE_NAME = "whatsthat_db";
	private static final String IR_TABLE_NAME = "wt_ir_code";
	private Map<String, String> COLUMNS = new LinkedHashMap<String, String>();
	
	public DatabaseHelper(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
	}
	
	@Override
	public void onCreate(SQLiteDatabase db) {
		COLUMNS = new LinkedHashMap<String, String>();
		COLUMNS.put("code", "text");
		COLUMNS.put("marca", "text");
		db.execSQL(sqlCreateTable(IR_TABLE_NAME, COLUMNS));
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
		
	}
	
	private String sqlCreateTable(String table, Map<String, String> columns) {
		String sql = "";
		
		sql += "CREATE TABLE " + table + " (" +
				BaseColumns._ID + " integer primary key autoincrement, ";
		
		int cont = 0;
		for (Iterator<String> it = columns.keySet().iterator(); it.hasNext();) {
			cont++;
			String name = (String) it.next();
			String type = columns.get(name);
			sql += name + " " + type;
			if (cont <= columns.size()) {
				sql += ", ";
			}
		}
		sql += ");";
		
		return sql;
	}

}
