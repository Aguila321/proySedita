package bean;

/**
 * Clase que Contiene los atributos de la tabla Item
 * @author alex_
 *
 */
public class Item {
	
	// ATRIBUTOS
	
	/** Identificador del Item */
	private int idItem;
	/** Nombre del Item */
	private String nombreItem;
	/** Precio del Item */
	private int precioItem;
	/** Tipo del Item */
	private TipoItem tipoItem;
	/** Rareza del Item */
	private RarezaItem rarezaItem;
	
	// CONSTRUCTOR
	
	/**
	 * Constructor de la clase sin parametros
	 */
	public Item() {
		super();
	}
	/**
	 * Constructor de la clase con parametros
	 * @param idItem
	 * @param nombreItem
	 * @param precioItem
	 * @param tipoItem
	 * @param rarezaItem
	 */
	public Item(int idItem, String nombreItem, int precioItem, TipoItem tipoItem, RarezaItem rarezaItem) {
		super();
		this.idItem = idItem;
		this.nombreItem = nombreItem;
		this.precioItem = precioItem;
		this.tipoItem = tipoItem;
		this.rarezaItem = rarezaItem;
	}
	
	// GET - SET
	
	/**
	 * Metodo que obtiene el Identificador del Item 
	 * @return idItem identificador del item, tipo {@link Integer}
	 */
	public int getIditem() {
		return idItem;
	}
	/**
	 * Metodo que envia el Identificador del Item 
	 * @param idItem identificador del item, tipo {@link Integer}
	 */
	public void setIditem(int idItem) {
		this.idItem = idItem;
	}
	/**
	 * Metodo que obtiene el Nombre del Item
	 * @return nombreItem nombre del item, tipo {@link String}
	 */
	public String getNombreItem() {
		return nombreItem;
	}
	/**
	 * Metodo que envia el Nombre del Item
	 * @param nombreItem nombre del item, tipo {@link String}
	 */
	public void setNombreItem(String nombreItem) {
		this.nombreItem = nombreItem;
	}
	/**
	 * Metodo que obtiene el Precio del Item
	 * @return precioItem precio del item, tipo {@link Integer}
	 */
	public int getPrecioItem() {
		return precioItem;
	}
	/**
	 * Metodo que envia el Precio del Item
	 * @param precioItem precio del item, tipo {@link Integer}
	 */
	public void setPrecioItem(int precioItem) {
		this.precioItem = precioItem;
	}
	/**
	 * Metodo que obtiene el Bean del tipo de Item
	 * @return tipoItem tipo del item, tipo bean {@link TipoItem}
	 */
	public TipoItem getTipoItem() {
		return tipoItem;
	}
	/**
	 * Metodo que envia el Bean del tipo de Item
	 * @param tipoItem tipo del item, tipo bean {@link TipoItem}
	 */
	public void setTipoItem(TipoItem tipo) {
		this.tipoItem = tipo;
	}
	/**
	 * Metodo que obtiene el bean de la Rareza del Item
	 * @return rarezaItem rareza del item, tipo bean {@link RarezaItem}
	 */
	public RarezaItem getRarezaItem() {
		return rarezaItem;
	}
	/**
	 * Metodo que envia el bean de la Rareza del Item
	 * @param rarezaItem rareza del item, tipo bean {@link RarezaItem}
	 */
	public void setRarezaItem(RarezaItem rarezaItem) {
		this.rarezaItem = rarezaItem;
	}

}
