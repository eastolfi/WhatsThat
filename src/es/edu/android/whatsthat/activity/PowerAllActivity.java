package es.edu.android.whatsthat.activity;

import java.util.Iterator;
import java.util.Map;

import es.edu.android.whatsthat.R;
import es.edu.android.whatsthat.handler.ListElementHandler;
import es.edu.android.whatsthat.helper.SqlHelper;
import es.edu.android.whatsthat.util.IConstants;

public class PowerAllActivity extends WhatsThatActivity {

	@Override
	protected void populateListMenu() {
		SqlHelper sqlHelper = new SqlHelper(this);

		Map<String, String> allPowerCodes = sqlHelper.getAllPowerCodes();

		for (Iterator<String> iterator = allPowerCodes.keySet().iterator(); iterator
				.hasNext();) {
			String brand = iterator.next();
			String ir_code = allPowerCodes.get(brand);

			lstMenu.add(new ListElementHandler(brand,
					"Botón de encendido para TV " + brand,
					R.drawable.ic_launcher, IConstants.ACTION_SEND_IR, ir_code));
		}
	}

}
