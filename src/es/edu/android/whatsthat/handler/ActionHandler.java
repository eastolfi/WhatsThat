package es.edu.android.whatsthat.handler;

import es.edu.android.whatsthat.util.IConstants;

/**
 * Clase que gestiona las acciones que realizará los elementos del menú
 * 
 * @author Eduardo
 * @since 03/02/2015
 * @version 0.0.2
 */
@SuppressWarnings("rawtypes")
public class ActionHandler {
	// Tipo de acción a realizar
	private String actionType;
	// Codigo IR a enviar
	private String actionDataCode;
	// Clase de la actividad que se va a abrir
	private Class actionDataClass;
	// Nombre de la marca para filtrar
	private String brandName;
	
	
	/**
	 * Constructor por defecto - No efectúa ninguna función
	 */
	public ActionHandler() {
		// Do nothing
	}
	
	/**
	 * Constructor que inicializa una acción tipo IR
	 * 
	 * @param _actionType Tipo de la acción a realizar (SEND_IR)
	 * @param _actionData Código IR que se va a enviar
	 */
	public ActionHandler(String _actionType, String _actionData) {
		this.actionType = _actionType;
		this.actionDataCode = _actionData;
	}

	/**
	 * Constructor que inicializa una acción tipo Activity
	 * 
	 * @param _actionType Tipo de la acción a realizar (START_ACT)
	 * @param _actionData Actividad que se va a abrir
	 */
	public ActionHandler(String _actionType, Class _actionData) {
		this.actionType = _actionType;
		this.actionDataClass = _actionData;
	}
	
	public String getActionType() {
		return actionType;
	}
	public void setActionType(String actionType) {
		this.actionType = actionType;
	}
	
	public Object getActionData() {
		Object result = null;
		
		if (this.actionType == IConstants.ACTION_SEND_IR) {
			result = actionDataCode;
		} else if (this.actionType == IConstants.ACTION_START_ACTIVITY) {
			result = actionDataClass;
		}
		
		return result;
	}
	
	
	public void setActionData(String actionData) {
		this.actionDataCode = actionData;
	}
	
	public void setActionData(Class actionData) {
		this.actionDataClass = actionData;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
};