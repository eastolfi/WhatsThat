package es.edu.android.whatsthat.helper;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.hardware.ConsumerIrManager;
import android.os.Build;
import android.util.SparseArray;

public class InfraredHelper {
	Context ctx;
	Object irdaService;
	ConsumerIrManager irManager = null;
	Method irWrite;
	SparseArray<String> irData;
	int irFrequency;
	
	public InfraredHelper(Activity act) {
		ctx = act.getApplicationContext();
		
		irManager = (ConsumerIrManager) ctx.getSystemService(Context.CONSUMER_IR_SERVICE);
	}
	
	public void emit(String code) {
		if (irManager != null && irManager.hasIrEmitter()) {
			
			int[] pattern = generatePattern(code);
			irManager.transmit(irFrequency, pattern);
		}
	}
	
	public void emitAll(List<String> list) {
		for (int i = 0; i < list.size(); i++) {
			String code = list.get(i);
			emit(code);
		}
	}
	
	private int[] generatePattern(String hexCode) {
		String decCode = hex2dec(hexCode);
		List<String> lst = new ArrayList<String>(Arrays.asList(decCode.split(",")));
		int[] pattern = null;
		
		irFrequency = Integer.parseInt(lst.get(0));
		lst.remove(0);
		
		if (Build.VERSION.SDK_INT == 19) {
			int lastIndex = Build.VERSION.RELEASE.lastIndexOf(".");
			int minorVersion = Integer.valueOf(Build.VERSION.RELEASE.substring(lastIndex + 1));
			
			// Si estamos en una versión superior a la 4.4.3
			if (minorVersion >= 3) {
				int pulses = 1000000 / irFrequency;
				int count, duration;
				
				for (int i = 0; i < lst.size(); i++) {
					count = Integer.parseInt(lst.get(i));
					duration = count * pulses;
					lst.set(i, Integer.toString(duration));
				}
				
			}
			
			pattern = toIntArrayS(lst);
		}
		
		return pattern;
	}
	
    private String hex2dec (String data) {
		List<String> list = new ArrayList<String>(Arrays.asList(data.split(" ")));
		list.remove(0); // dummy
		int frequency = Integer.parseInt(list.remove(0), 16); // frequency
		list.remove(0); // seq1
		list.remove(0); // seq2

		for (int i = 0; i < list.size(); i++) {
			list.set(i, Integer.toString(Integer.parseInt(list.get(i), 16)));
		}

		frequency = (int) (1000000 / (frequency * 0.241246));
		list.add(0, Integer.toString(frequency));

		data = "";
		for (String s : list) {
			data += s + ",";
		}
		return data;
	}
	
	
	private int[] toIntArrayS(List<String> list){
		int[] ret = new int[list.size()];
		
		for(int i = 0;i < ret.length;i++)
			ret[i] = Integer.parseInt(list.get(i));
		
		return ret;
	}
}
