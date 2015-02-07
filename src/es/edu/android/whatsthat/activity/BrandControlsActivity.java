package es.edu.android.whatsthat.activity;

import java.util.Iterator;
import java.util.Map;

import es.edu.android.whatsthat.R;
import es.edu.android.whatsthat.handler.ListElementHandler;
import es.edu.android.whatsthat.helper.SqlHelper;
import es.edu.android.whatsthat.util.ConstantsCommon;
import es.edu.android.whatsthat.util.IConstants;

public class BrandControlsActivity extends WhatsThatActivity {

	@Override
	protected void populateListMenu() {
		SqlHelper sqlHelper = new SqlHelper(this);
		String brandName = getIntent().getExtras()
				.get(ConstantsCommon.FLAG_BRAND).toString();
		
		Map<String, String> allControlsBrand = sqlHelper.getAllControlsBrand(brandName);
		
		for (Iterator<String> iterator = allControlsBrand.keySet().iterator(); iterator.hasNext();) {
			String control = (String) iterator.next();
			String irCode = allControlsBrand.get(control);
			
			lstMenu.add(new ListElementHandler(control, "", R.drawable.ic_launcher, 
					IConstants.ACTION_SEND_IR, irCode));
		}
	}

}
