package services;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import bean.CompraItemPersonalizado;
import negocio.OrdenItemNegocio;

@Path("/proyecto")
public class OrdenItemServicio {
OrdenItemNegocio ordeItemNegocio = new OrdenItemNegocio();

@POST
@Produces(MediaType.APPLICATION_JSON)
@Path("compraItem")
public int CompraItem(CompraItemPersonalizado cpi){
	int ok=0;
	ok =  ordeItemNegocio.compraItem(cpi);
	ok +=2;
	System.out.println("en el servicio  :" + ok);
	return ok;
}
}
