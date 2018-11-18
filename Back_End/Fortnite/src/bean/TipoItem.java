package bean;

/**
 * Clase que Contiene los atributos de la tabla Tipo Item
 * @author alex_
 *
 */
public class TipoItem {
	
	/** Identificador del Tipo Item */
 	private int idTipoItem;
 	/** Descripcion del Tipo Item */
	private String descripcion;
	
	
	// CONSTRUCTORES
	
	/**
	 * Constructor Vacio de la Clase
	 */
	public TipoItem() {
		super();
	}

	/**
	 * Constructor con parametros de la Clase
	 * @param idTipoItem
	 * @param descripcion
	 */
	public TipoItem(int idTipoItem, String descripcion) {
		super();
		this.idTipoItem = idTipoItem;
		this.descripcion = descripcion;
	}
	
	
	// GET - SET
	
	/**
	 * Metodo que obtiene el Identificador del Tipo Item 
	 * @return idTipoItem identificador del tipo item, tipo {@link Integer}
	 */
	public int getIdTipoItem() {
		return idTipoItem;
	}
	/**
	 * Metodo que envia el Identificador del Tipo Item 
	 * @param idTipoItem identificador del tipo item, tipo {@link Integer}
	 */
	public void setIdTipoItem(int idTipoItem) {
		this.idTipoItem = idTipoItem;
	}
	/**
	 * Metodo que obtiene la Descripcion del Tipo Item
	 * @return descripcion descripcion del tipo item, tipo {@link String}
	 */
	public String getDescripcion() {
		return descripcion;
	}
	/**
	 * Metodo que envia la Descripcion del Tipo Item
	 * @param descripcion descripcion del tipo item, tipo {@link String}
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
