package bean;

/**
 * Clase que Contiene los atributos de la tabla Inventario
 * @author alex_
 *
 */
public class Inventario {

	// ATRIBUTOS
	
	/** Identificador del Usuario */
	private int usuario;
	/** Identificador del Item */
	private int item;
	
	private String nombreItem;
	
	private int idrarity;
	
	private int idtipo;
	
	private int precio;
	
	private String urlDetail;
	
	private String urlImg;
	
	// CONSTRUCTOR
	
	/**
	 * Constructor de la clase sin parametros
	 */
	public Inventario() {
		super();
	}
	/**
	 * Constructor de la clase con parametros
	 * @param usuario
	 * @param item
	 */
	public Inventario(int usuario, int item) {
		this.usuario = usuario;
		this.item = item;
	}
	
	// GET - SET
	
	/**
	 * Metodo que obtiene el Identificador del Usuario
	 * @return usuario identificador del usuario, tipo {@link Usuario}
	 */
	public int getUsuario() {
		return usuario;
	}
	/**
	 * Metodo que envia el Identificador del Usuario
	 * @param usuario identificador del usuario, tipo {@link Usuario}
	 */
	public void setUsuario(int usuario) {
		this.usuario = usuario;
	}
	/**
	 * Metodo que obtiene el Identificador del Item
	 * @return item identificador del item, tipo {@link Item}
	 */
	public int getItem() {
		return item;
	}
	/**
	 * Metodo que envia el Identificador del Item
	 * @param item identificador del item, tipo {@link Item}
	 */
	public void setItem(int item) {
		this.item = item;
	}
	public String getNombreItem() {
		return nombreItem;
	}
	public void setNombreItem(String nombreItem) {
		this.nombreItem = nombreItem;
	}
	public int getIdrarity() {
		return idrarity;
	}
	public void setIdrarity(int idrarity) {
		this.idrarity = idrarity;
	}
	public int getIdtipo() {
		return idtipo;
	}
	public void setIdtipo(int idtipo) {
		this.idtipo = idtipo;
	}
	public String getUrlDetail() {
		return urlDetail;
	}
	public void setUrlDetail(String urlDetail) {
		this.urlDetail = urlDetail;
	}
	public String getUrlImg() {
		return urlImg;
	}
	public void setUrlImg(String urlImg) {
		this.urlImg = urlImg;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	
	
	
}
