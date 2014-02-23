package es.edu.android.whatsthat.activity;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.ListView;
import es.edu.android.whatsthat.R;
import es.edu.android.whatsthat.adapter.ListViewAdapter;
import es.edu.android.whatsthat.adapter.ListViewAdapter.ViewHolder;
import es.edu.android.whatsthat.helper.InfraredHelper;
import es.edu.android.whatsthat.util.IConstants;

public class ControllerActivity extends Activity {
	
	Object irdaService;
	Method irWrite;
	SparseArray<String> irData;
	Button bt;
	InfraredHelper irHelper;
	
	ArrayList<HashMap<String, Object>> lst;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_controller);
        
        ListView listControls = (ListView) findViewById(R.id.listControls);
        
        populateList();
        ListViewAdapter mAdapter = new ListViewAdapter(this, lst);
        listControls.setAdapter(mAdapter);
        
        irHelper = new InfraredHelper(this);
        
        listControls.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
				ViewHolder tag = (ViewHolder) arg1.getTag();
				if (tag.getIrCode().equals(IConstants.POWER_ALL)) {
					irHelper.sendAll(IConstants.POWER_LIST);
				} else {
					irHelper.send(tag.getIrCode());
				}
			}
        	
		});
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    private void populateList() {
    	lst = new ArrayList<HashMap<String, Object>>();
    	
    	HashMap<String, Object> tmp = new HashMap<String, Object>();
    	tmp.put(IConstants.TEXT_COLUMN, "Samsung Power");
    	tmp.put(IConstants.IMAGE_COLUMN, R.drawable.ic_launcher);
    	tmp.put(IConstants.CODE_COLUMN, hex2dec(IConstants.POWER_SAMSUNG));
    	
    	lst.add(tmp);
    	
    	tmp = new HashMap<String, Object>();
    	tmp.put(IConstants.TEXT_COLUMN, "LG Power ON");
    	tmp.put(IConstants.IMAGE_COLUMN, R.drawable.ic_launcher);
    	tmp.put(IConstants.CODE_COLUMN, hex2dec(IConstants.POWER_ON_LG));
    	
    	lst.add(tmp);
    	
    	tmp = new HashMap<String, Object>();
    	tmp.put(IConstants.TEXT_COLUMN, "LG Power OFF");
    	tmp.put(IConstants.IMAGE_COLUMN, R.drawable.ic_launcher);
    	tmp.put(IConstants.CODE_COLUMN, hex2dec(IConstants.POWER_OFF_LG));
    	
    	lst.add(tmp);
    	
    	tmp = new HashMap<String, Object>();
    	tmp.put(IConstants.TEXT_COLUMN, "Power");
    	tmp.put(IConstants.IMAGE_COLUMN, R.drawable.ic_launcher);
    	tmp.put(IConstants.CODE_COLUMN, IConstants.POWER_ALL);
    	
    	lst.add(tmp);
    	
//    	tmp = new HashMap<String, Object>();
//    	tmp.put(IConstants.TEXT_COLUMN, "TEST");
//    	tmp.put(IConstants.IMAGE_COLUMN, R.drawable.ic_launcher);
//    	tmp.put(IConstants.CODE_COLUMN, IConstants.TEST);
//    	
//    	lst.add(tmp);
    }
    
    protected String hex2dec (String data) {
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
    
}
