package es.edu.android.whatsthat.util;
import android.content.Context;
import android.widget.Toast;

public class ToastLogger {
	private Context ctx;
	
	public ToastLogger(Context context) {
		this.ctx = context;
	}
	
	public void log(String msg) {
		Toast.makeText(this.ctx, msg, Toast.LENGTH_LONG).show();
	}
}
