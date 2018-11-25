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
	

	public Item(int idItem, String nombreItem, int precioItem, TipoItem tipoItem, RarezaItem rarezaItem) {
		super();
		this.idItem = idItem;
		this.nombreItem = nombreItem;
		this.precioItem = precioItem;
		this.tipoItem = tipoItem;
		this.rarezaItem = rarezaItem;
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
	
	
	

}
