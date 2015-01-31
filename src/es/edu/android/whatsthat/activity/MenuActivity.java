package es.edu.android.whatsthat.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import es.edu.android.whatsthat.R;
import es.edu.android.whatsthat.util.*;
import android.widget.*;

public class MenuActivity extends Activity {
	ToastLogger LOG = new ToastLogger(this);
	private Context ctx;
	
	public Button btPowerAll;
	public Button btViewAll;
	public Button btAdmin;
	public Button btSettings;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_menu);
		
		ctx = this;
		
		btPowerAll = (Button) findViewById(R.id.power_view_all);
		btViewAll = (Button) findViewById(R.id.view_all);
		
		btPowerAll.setOnClickListener(new mOnClickListener(ControllerActivity.class));
		
		btViewAll.setOnClickListener(new mOnClickListener(null));
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu, menu);
		return true;
	}
	
	@SuppressWarnings("rawtypes")
	private class mOnClickListener implements OnClickListener {
		private Context _ctx;
		private Class _class;
		
		public mOnClickListener(Class clazz) {
			if (ctx != null) {
				_ctx = ctx;
			} else {
				_ctx = getApplicationContext();
			}
			_class = clazz;
		}
		
		@Override
		public void onClick(View v) {
			if (_class != null) {
				Intent i = new Intent(_ctx, _class);
				LOG.log(i.toString());
				startActivity(i);
			}
		}
		
	}

}
