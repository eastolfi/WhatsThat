package es.edu.android.whatsthat.helper;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

import android.app.Activity;
import android.util.SparseArray;
import es.edu.android.whatsthat.util.IConstants;

public class InfraredHelper {
	Object irdaService;
	Method irWrite;
	SparseArray<String> irData;
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public InfraredHelper(Activity ctx) {
		irdaService = ctx.getSystemService(IConstants.SERVICE_IRDA);
		
		Class c = irdaService.getClass();
		Class p[] = { String.class };
		try {
			irWrite = c.getMethod(IConstants.WRITE_SEND_IR, p);
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}
	}
	
	
	public void send(String code) {
		try {
			irWrite.invoke(irdaService, code);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
	}
	
	public void sendAll(List<String> list) {
    	for (int i = 0; i < list.size(); i++) {
			String code = list.get(i);
			send(code);
		}
    }
}
