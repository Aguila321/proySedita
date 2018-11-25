package bean;

public class CompraPavosPersonalizado { // Clase Personaliza para la Compra
	
	private int idPedido;
	/** Fecha del Pedido */
	private String fechaPedido;
	/** Usuario que realizo el pedido */
	private Usuario usuario ;
	
	private OrdenPedidoDetalle pedidoDetalle;
	
	public int getIdPedido() {
		return idPedido;
	}
	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}
	public String getFechaPedido() {
		return fechaPedido;
	}
	public void setFechaPedido(String fechaPedido) {
		this.fechaPedido = fechaPedido;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public OrdenPedidoDetalle getPedidoDetalle() {
		return pedidoDetalle;
	}
	public void setPedidoDetalle(OrdenPedidoDetalle pedidoDetalle) {
		this.pedidoDetalle = pedidoDetalle;
	}
	
	
	

}
