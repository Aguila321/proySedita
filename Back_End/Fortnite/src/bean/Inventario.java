package bean;

/**
 * Clase que Contiene los atributos de la tabla Inventario
 * @author alex_
 *
 */
public class Inventario {

	// ATRIBUTOS
	
	/** Identificador del Usuario */
	private Usuario usuario;
	/** Identificador del Item */
	private Item item;
	
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
	public Inventario(Usuario usuario, Item item) {
		this.usuario = usuario;
		this.item = item;
	}
	
	// GET - SET
	
	/**
	 * Metodo que obtiene el Identificador del Usuario
	 * @return usuario identificador del usuario, tipo {@link Usuario}
	 */
	public Usuario getUsuario() {
		return usuario;
	}
	/**
	 * Metodo que envia el Identificador del Usuario
	 * @param usuario identificador del usuario, tipo {@link Usuario}
	 */
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	/**
	 * Metodo que obtiene el Identificador del Item
	 * @return item identificador del item, tipo {@link Item}
	 */
	public Item getItem() {
		return item;
	}
	/**
	 * Metodo que envia el Identificador del Item
	 * @param item identificador del item, tipo {@link Item}
	 */
	public void setItem(Item item) {
		this.item = item;
	}
	
	
	
}
