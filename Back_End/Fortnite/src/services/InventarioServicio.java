package services;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import bean.Inventario;
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
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("inventarioFil")
	public Inventario inventarioXusuario(@QueryParam("idUsu")int id) {
		Inventario inventario = new Inventario();	
		
		inventario = invNegocio.obtenerInvetario(id);
		System.out.println(listaInventario);
		return inventario;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("locker")
	public List<Inventario> userInventario(@QueryParam("iduser")int id) {
		List<Inventario> lista = new ArrayList<>();
		
		lista = invNegocio.iventarioUser(id);
		System.out.println(listaInventario);
		return lista;
	
		
	}
}
