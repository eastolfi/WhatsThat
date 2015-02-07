package es.edu.android.whatsthat.activity;

import java.util.List;

import es.edu.android.whatsthat.R;
import es.edu.android.whatsthat.handler.ListElementHandler;
import es.edu.android.whatsthat.helper.SqlHelper;
import es.edu.android.whatsthat.util.IConstants;

public class BrandsAllActivity extends WhatsThatActivity {

	@Override
	protected void populateListMenu() {
		SqlHelper sqlHelper = new SqlHelper(this);

		List<CharSequence> allBrands = sqlHelper.getAllBrands();

		for (CharSequence brand : allBrands) {
			lstMenu.add(new ListElementHandler(brand.toString(),
					"Controles para TVs " + brand,
					R.drawable.ic_launcher, IConstants.ACTION_START_ACTIVITY, 
					BrandControlsActivity.class, brand.toString()));
		}
	}

}
