package bean;

/**
 * Clase que Contiene los atributos de la tabla Orden Pedido
 * @author alex_
 *
 */
public class OrdenPedido {
	
	// ATRIBUTOS
	
	/** Identificador del Pedido */
	private int idPedido;
	/** Fecha del Pedido */
	private String fechaPedido;
	/** Usuario que realizo el pedido */
	private Usuario usuario ;
	
	// CONSTRUCTOR
	
	/**
	 * Constructor de la clase sin parametros
	 */
	public OrdenPedido() {
		super();
	}
	/**
	 * Constructor de la clase con parametros
	 * @param idPedido
	 * @param fechaPedido
	 * @param usuario
	 */
	public OrdenPedido(int idPedido, String fechaPedido, Usuario usuario) {
		super();
		this.idPedido = idPedido;
		this.fechaPedido = fechaPedido;
		this.usuario = usuario;
	}

	// GET - SET
	
	/**
	 * Metodo que obtiene el Identificador del Pedido
	 * @return idPedido identificador del pedido, tipo {@link Integer}
	 */
	public int getIdPedido() {
		return idPedido;
	}
	/**
	 * Metodo que envia el Identificador del Pedido
	 * @param idPedido identificador del pedido, tipo {@link Integer}
	 */
	public void setIPedido(int idPedido) {
		this.idPedido = idPedido;
	}
	/**
	 * Metodo que obtiene la Fecha del Pedido
	 * @return fechaPedido fecha del pedido, tip {@link String}
	 */
	public String getFechaPedido() {
		return fechaPedido;
	}
	/**
	 * Metodo que envia la Fecha del Pedido
	 * @param fechaPedido fecha del pedido, tip {@link String}
	 */
	public void setFechaPedido(String fechaPedido) {
		this.fechaPedido = fechaPedido;
	}
	/**
	 * Metodo que obtiene el bean del Usuario
	 * @return usuario usuario que realizo el pedido, tipo {@link Usuario}
	 */
	public Usuario getUsuario() {
		return usuario;
	}
	/**
	 * Metodo que envia el bean del Usuario
	 * @param usuario usuario que realizo el pedido, tipo {@link Usuario}
	 */
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
