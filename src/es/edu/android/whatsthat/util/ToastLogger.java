package es.edu.android.whatsthat.util;
import android.widget.*;
import android.content.Context;
import java.io.*;
//import java.util.logging.*;
//import org.apache.log4j.Logger;

public class ToastLogger {
	private Context ctx;
	//private static final Logger = Logger.get
	
	public ToastLogger(Context context) {
		this.ctx = context;
	}
	
	public void log(String msg) {
		Toast.makeText(this.ctx, msg, Toast.LENGTH_LONG).show();
		
	}
}
