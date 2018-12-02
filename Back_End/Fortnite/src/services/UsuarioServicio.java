package services;
import java.io.IOException;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import bean.Usuario;
import negocio.UsuarioNegocio;

@Path("/proyecto")
public class UsuarioServicio  implements ContainerResponseFilter{
	UsuarioNegocio usuarioNegocio = new UsuarioNegocio();
	private static List<Usuario> listaUsuario = null;
	Usuario usu =new Usuario();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("usuario")
	public List<Usuario> listaJSON(){
		listaUsuario = usuarioNegocio.usuarioLista();
		return listaUsuario;
	}
	
	@POST
	
	@Produces(MediaType.APPLICATION_JSON)
	@Path("regUsuario")
	public Response registrarUsuario (Usuario u) {
//		Response.ok().header("Access-Control-Allow-Origin", "*")
//		.header("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT")
//		.allow("OPTIONS").build();
//		String mensaje="";
//		int ok = usuarioNegocio.RegistrarUsuario(u);
//		if(ok==1) {
//			mensaje="Registrado Correctamente!!";
//			
//		}else {
//			mensaje="Tu madre es una bitch";
//		}
//		
//		return mensaje;
		
		int ok = usuarioNegocio.RegistrarUsuario(u);
		return Response.ok() //200
				.entity(ok)
				.header("Access-Control-Allow-Origin", "*")
				.header("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT")
				.allow("OPTIONS").build();
		
	}
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Path("loginUsuario")
	public Usuario loginUsuario(Usuario u){
		
		//String mensaje="";
		usu = usuarioNegocio.loginUsuario(u.getUsername(),u.getClave());
		if(usu==null) return null;
			
		
		 return usu;
	}

	@Override
	public void filter(ContainerRequestContext requestContext, ContainerResponseContext response) throws IOException {
		// TODO Auto-generated method stub
	     response.getHeaders().add("Access-Control-Allow-Origin", "*");
	        response.getHeaders().add("Access-Control-Allow-Headers",
	                "origin, content-type, accept, authorization");
	        response.getHeaders().add("Access-Control-Allow-Credentials", "true");
	        response.getHeaders().add("Access-Control-Allow-Methods",
	                "GET, POST, PUT, DELETE, OPTIONS, HEAD");
	    
	}
	
}

