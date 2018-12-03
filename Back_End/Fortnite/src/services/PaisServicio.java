package services;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import bean.Pais;
import negocio.PaisNegocio;

@Path("/proyecto")
public class PaisServicio {
	PaisNegocio negocio = null;
	private static List<Pais> listaPais=null;
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("pais")
	public List<Pais> listaJSON(){
		negocio = new PaisNegocio();
		listaPais =  negocio.paises();
		System.out.println(listaPais);
		return listaPais;
	}
	
}
