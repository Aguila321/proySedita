package interfaces;
import bean.CompraPavosPersonalizado;
import bean.OrdenPedido;
public interface OrdenPedidoInteface {
	
	public Integer comprarPavos (OrdenPedido op);
	public Integer comprarPavos2 (CompraPavosPersonalizado op);
	public int AutoGenerado();
}
