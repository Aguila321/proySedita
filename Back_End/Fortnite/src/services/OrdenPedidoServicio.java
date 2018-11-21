package services;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import bean.Item;
import bean.OrdenPedido;
import negocio.ItemNegocio;
import negocio.OrdenPedidoNegocio;

@Path("/proyecto")
public class OrdenPedidoServicio {
	OrdenPedidoNegocio ordenPedidoNegocio = new OrdenPedidoNegocio();
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Path("compraPavos")
	public int CompraPavos(OrdenPedido op){
		int ok=0;
		ok =  ordenPedidoNegocio.comprarPavos(op);
		System.out.println("en el servicio  :" + ok);
		return ok;
	}
	

}
