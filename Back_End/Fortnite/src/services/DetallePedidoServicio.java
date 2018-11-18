package services;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import bean.OrdenPedidoDetalle;
import negocio.DetallePedidoNegocio;

@Path("/proyecto")
public class DetallePedidoServicio {

	DetallePedidoNegocio detallePedidoNegocio = new DetallePedidoNegocio();
	
	private static List<OrdenPedidoDetalle> listaDetallePedidoNegocio = null;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("detallePedido")
	public List<OrdenPedidoDetalle> listaJSON() {

		listaDetallePedidoNegocio = detallePedidoNegocio.UsuariosPedidos();
		System.out.println(listaDetallePedidoNegocio);
		return listaDetallePedidoNegocio;
	}

}
