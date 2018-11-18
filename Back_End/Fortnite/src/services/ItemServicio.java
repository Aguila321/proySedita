package services;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import bean.Item;
import negocio.ItemNegocio;

@Path("/proyecto")
public class ItemServicio {
	//
	ItemNegocio negocioItem = new ItemNegocio();
	private static List<Item> listaItem=null;
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("item")
	public List<Item> listaJSON(){
		
		listaItem =  negocioItem.listaItem();
		System.out.println(listaItem);
		return listaItem;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("itemFil")
	public List<Item> ItemFiltroJSON(@QueryParam("id")int codigoItem){
		
		listaItem =  negocioItem.obtenerListaItem(codigoItem);
		System.out.println(listaItem);
		return listaItem;
	}
}
