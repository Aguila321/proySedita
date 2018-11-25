package services;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import bean.OrdenItemDetalle;
import negocio.DetalleItemNegocio;

@Path("/proyecto")
public class DetalleItemServicio {
DetalleItemNegocio detalleItemNegocio = new DetalleItemNegocio();

private static List<OrdenItemDetalle> listaDetalleItemNegocio = null;

@GET
@Produces(MediaType.APPLICATION_JSON)
@Path("detalleItem")
public List<OrdenItemDetalle> listaJSON() {

	listaDetalleItemNegocio = detalleItemNegocio.ItemPedidos();
	System.out.println(listaDetalleItemNegocio);
	return listaDetalleItemNegocio;
}
}
