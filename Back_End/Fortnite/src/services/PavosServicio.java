package services;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import bean.Pavos;
import bean.Pavos;
import negocio.ObtenerNegocio;
import negocio.PavosNegocio;

@Path("/proyecto")
public class PavosServicio {
PavosNegocio pavosNegocio = new PavosNegocio();
ObtenerNegocio obtenerNegocio = new ObtenerNegocio();

private static List<Pavos> listaPavos=null;
@GET
@Produces(MediaType.APPLICATION_JSON)
@Path("pavos")
public List<Pavos> listaJSON(){
	
	listaPavos =  pavosNegocio.listaPavos();
	System.out.println(listaPavos);
	return listaPavos;
}


@GET
@Produces(MediaType.APPLICATION_JSON)
@Path("PavosFil")
public Pavos PavosFiltroJSON(@QueryParam("idPavos")int id){
	Pavos pavos = new Pavos();
	pavos =  obtenerNegocio.obtenerPavos(id);
	System.out.println(listaPavos);
	return pavos;
}
}
