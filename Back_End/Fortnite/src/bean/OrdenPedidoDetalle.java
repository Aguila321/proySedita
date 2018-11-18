package bean;

/**
 * Clase que Contiene los atributos de la tabla Orden Pedido Detalle
 * @author alex_
 *
 */
public class OrdenPedidoDetalle {
	
	// ATRIBUTOS
	
	/** Identificador del Pedido*/
	private OrdenPedido pedido;
	/** Identificador de los Pavos */
	private Pavos pavos;
	/** Cantidad de Pavos */ 
	private int cantidad;
	/** Precio de los Pavos */
	private double precio;
	
	// CONSTRUCTOR
	
	/**
	 * Constructor de la clase sin parametros
	 */
	public OrdenPedidoDetalle() {
		super();
	}
	/**
	 * Constructor de la clase con parametros
	 * @param idPedido
	 * @param pavos
	 * @param cantidad
	 * @param precio
	 */
	public OrdenPedidoDetalle(OrdenPedido pedido, Pavos pavos, int cantidad, double precio) {
		super();
		this.pedido = pedido;
		this.pavos = pavos;
		this.cantidad = cantidad;
		this.precio = precio;
	}
	
	// GET - SET
	
	/**
	 * Metodo que obtiene el Identificador del Pedido
	 * @return pedido identificador del pedido, tipo {@link OrdenPedido}
	 */
	public OrdenPedido getPedido() {
		return pedido;
	}
	/**
	 * Metodo que envia el Identificador del Pedido
	 * @param pedido identificador del pedido, tipo {@link OrdenPedido}
	 */
	public void setPedido(OrdenPedido pedido) {
		this.pedido = pedido;
	}
	/**
	 * Metodo que obtiene el Identificador de los Pavos
	 * @return pavos identificador de los pavos, tipo {@link Pavos}
	 */
	public Pavos getPavos() {
		return pavos;
	}
	/**
	 * Metodo que envia el Identificador de los Pavos 
	 * @param pavos identificador de los pavos, tipo {@link Pavos}
	 */
	public void setPavos(Pavos pavos) {
		this.pavos = pavos;
	}
	/**
	 * Metodo que obtiene la cantidad de Pavos
	 * @return cantidad cantidad de los pavos, tipo {@link Integer}
	 */
	public int getCantidad() {
		return cantidad;
	}
	/**
	 * Metodo que envia la cantidad de Pavos
	 * @param cantidad cantidad de los pavos, tipo {@link Integer}
	 */
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	/**
	 * Metodo que obtiene el Precio de los Pavos
	 * @return precio precio de los pavos, tipo {@link Double}
	 */
	public double getPrecio() {
		return precio;
	}
	/**
	 * Metodo que envia el Precio de los Pavos
	 * @param precio precio de los pavos, tipo {@link Double} 
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	
	
	
	
	



}
