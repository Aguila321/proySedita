package interfaces;
import java.util.List;

import bean.Pais;
import bean.Usuario;

public interface UsuarioInterface {
	public List<Usuario> usuarioLista();	
	public int RegistrarUsuario (Usuario u);
	public Usuario loginUsuario(String user,String pass);
	//public List<Pais> cargarPais();
}
