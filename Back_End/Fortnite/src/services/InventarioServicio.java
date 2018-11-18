package services;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import bean.Inventario;
import bean.Item;
import negocio.InventarioNegocio;

/**
 * 
 * @author carlos carrion
 *
 */

@Path("/proyecto")
public class InventarioServicio {

	InventarioNegocio invNegocio = new InventarioNegocio();
	private static List<Inventario> listaInventario = null;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("inventario")
	public List<Inventario> listaJSON() {

		listaInventario = invNegocio.inventarioLista();
		System.out.println(listaInventario);
		return listaInventario;
	}

}
