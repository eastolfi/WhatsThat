package es.edu.android.whatsthat.handler;


/**
 * Clase que gestiona la información de los elementos del menú
 * 
 * @author Eduardo
 * @since 03/02/2015
 * @version 0.0.2
 */
@SuppressWarnings("rawtypes")
public class ListElementHandler {
	private String textoColumna;
	private String textoDetalle;
	private Integer imageSource;
	private ActionHandler actionHandler;
	
	public ListElementHandler() {
		this.actionHandler = new ActionHandler();
	}
	
	public ListElementHandler(String _textoColumna, String _textoDetalle, Integer _imageSource) {
		this();
		
		this.textoColumna = _textoColumna;
		this.textoDetalle = _textoDetalle;
		this.imageSource = _imageSource;
	}
	
	public ListElementHandler(String _textoColumna, String _textoDetalle, Integer _imageSource,
			String _actionType, String _actionData) {
		this(_textoColumna, _textoDetalle, _imageSource);

		this.actionHandler.setActionType(_actionType);
		this.actionHandler.setActionData(_actionData);
	}
	
	public ListElementHandler(String _textoColumna, String _textoDetalle, Integer _imageSource,
			String _actionType, Class _actionData) {
		this(_textoColumna, _textoDetalle, _imageSource);

		this.actionHandler.setActionType(_actionType);
		this.actionHandler.setActionData(_actionData);
	}
	
	public ListElementHandler(String _textoColumna, String _textoDetalle, Integer _imageSource,
			String _actionType, Class _actionData, String _brandName) {
		this(_textoColumna, _textoDetalle, _imageSource, _actionType, _actionData);

		this.actionHandler.setBrandName(_brandName);
	}

	public String getTextoColumna() {
		return textoColumna;
	}

	public void setTextoColumna(String textoColumna) {
		this.textoColumna = textoColumna;
	}

	public String getTextoDetalle() {
		return textoDetalle;
	}

	public void setTextoDetalle(String textoDetalle) {
		this.textoDetalle = textoDetalle;
	}

	public Integer getImageSource() {
		return imageSource;
	}

	public void setImageSource(Integer imageSource) {
		this.imageSource = imageSource;
	}

	public ActionHandler getActionHandler() {
		return actionHandler;
	}

	public void setActionHandler(ActionHandler actionHandler) {
		this.actionHandler = actionHandler;
	}
};
