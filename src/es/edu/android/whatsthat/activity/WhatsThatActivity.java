package es.edu.android.whatsthat.activity;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;

import es.edu.android.whatsthat.R;
import es.edu.android.whatsthat.adapter.ListViewAdapter;
import es.edu.android.whatsthat.handler.ListElementHandler;
import es.edu.android.whatsthat.util.ToastLogger;

public abstract class WhatsThatActivity extends Activity {
	ToastLogger LOG = new ToastLogger(this);
	private Context ctx;
	ArrayList<ListElementHandler> lstMenu = new ArrayList<ListElementHandler>();
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		onCreate(savedInstanceState, this);
	}

	protected void onCreate(Bundle savedInstanceState, Activity menuActivity) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_menu);
		
		ctx = menuActivity;
		
        ListView listControls = (ListView) findViewById(R.id.customListInitMenu);
        
        populateListMenu();
        ListViewAdapter mAdapter = new ListViewAdapter(this, lstMenu);
        listControls.setAdapter(mAdapter);
        
        AdView adView = new AdView(ctx);
        adView.setAdUnitId("ca-app-pub-4248001670011098/8137011962");
        adView.setAdSize(AdSize.BANNER);
        
        LinearLayout layout = (LinearLayout) findViewById(R.id.layout_menu);
        layout.addView(adView);
        
        /************* DEBUGING ONLY **********************/
        AdRequest adRequest = new AdRequest.Builder()
        .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
        .addTestDevice("0CEB8B65FF4067C7B94EE31E815FD789")
        .build();
        adView.loadAd(adRequest);
        /**************************************************/
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu, menu);
		return true;
	}
	
	protected abstract void populateListMenu();
}
