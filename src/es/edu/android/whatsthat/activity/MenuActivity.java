package es.edu.android.whatsthat.activity;

import es.edu.android.whatsthat.R;
import es.edu.android.whatsthat.handler.ListElementHandler;
import es.edu.android.whatsthat.util.IConstants;

public class MenuActivity extends WhatsThatActivity {
	
	@Override
	protected void populateListMenu() {
    	lstMenu.add(new ListElementHandler("Power (De todas las marcas)", "Lista con botones de encendido", 
    			R.drawable.ic_launcher, IConstants.ACTION_START_ACTIVITY, PowerAllActivity.class));
    	
    	lstMenu.add(new ListElementHandler("Marcas", "Listado de todas las marcas", 
    			R.drawable.ic_launcher, IConstants.ACTION_START_ACTIVITY, BrandsAllActivity.class));
    	
    	lstMenu.add(new ListElementHandler("Mando completo", "Mando con todos los controles", 
    			R.drawable.ic_launcher, IConstants.ACTION_START_ACTIVITY, RemoteFullActivity.class));
    	
//    	lstMenu.add(new ListElementHandler("Administrar", "Sección de administración", 
//    			R.drawable.ic_launcher, IConstants.ACTION_SEND_IR, IConstants.POWER_SAMSUNG));
    	
    	lstMenu.add(new ListElementHandler("Ajustes", "Ajustes de la aplicación", 
    			R.drawable.ic_launcher, IConstants.ACTION_START_ACTIVITY, SettingsActivity.class));
    }

}
