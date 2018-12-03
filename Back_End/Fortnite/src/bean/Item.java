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
	/** Imagen del Detalle */
	private String urlDet;
	/** Imagen de Icon */
	private String icon;
	
	// CONSTRUCTOR
	
	/**
	 * Constructor de la clase sin parametros
	 */
	public Item() {
		super();
	}
	

	public Item(int idItem, String nombreItem, int precioItem, TipoItem tipoItem, RarezaItem rarezaItem, String urlDet , String icon) {
		super();
		this.idItem = idItem;
		this.nombreItem = nombreItem;
		this.precioItem = precioItem;
		this.tipoItem = tipoItem;
		this.rarezaItem = rarezaItem;
		this.urlDet = urlDet;
		this.icon = icon;
	}


	public int getIdItem() {
		return idItem;
	}

	public void setIdItem(int idItem) {
		this.idItem = idItem;
	}
	

	public String getNombreItem() {
		return nombreItem;
	}

	public void setNombreItem(String nombreItem) {
		this.nombreItem = nombreItem;
	}

	public int getPrecioItem() {
		return precioItem;
	}

	public void setPrecioItem(int precioItem) {
		this.precioItem = precioItem;
	}

	public TipoItem getTipoItem() {
		return tipoItem;
	}

	public void setTipoItem(TipoItem tipoItem) {
		this.tipoItem = tipoItem;
	}

	public RarezaItem getRarezaItem() {
		return rarezaItem;
	}

	public void setRarezaItem(RarezaItem rarezaItem) {
		this.rarezaItem = rarezaItem;
	}

	public String getUrlDet() {
		return urlDet;
	}

	public void setUrlDet(String urlDet) {
		this.urlDet = urlDet;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}
	
	
	

}
