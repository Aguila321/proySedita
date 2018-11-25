package bean;

/**
 * Clase que Contiene los atributos de la tabla Orden Item
 * @author alex_
 *
 */
public class OrdenItem {

	// ATRIBUTOS
	private int idCompra ;
	private Usuario usuario;
	// CONSTRUCTOR
	public OrdenItem(int idCompra, Usuario usuario) {
		super();
		this.idCompra = idCompra;
		this.usuario = usuario;
	}
	// GET - SET
	public int getIdCompra() {
		return idCompra;
	}

	public void setIdCompra(int idCompra) {
		this.idCompra = idCompra;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
}
