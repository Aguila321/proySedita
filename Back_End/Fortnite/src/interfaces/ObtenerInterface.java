package interfaces;

import bean.OrdenPedido;
import bean.Pais;
import bean.Pavos;
import bean.RarezaItem;
import bean.TipoItem;
import bean.TipoUsuario;
import bean.Usuario;

public interface ObtenerInterface {

	public Pais obtenerPais(int id);
	public Usuario obtenerUsuario(int idUser);
	public TipoUsuario obtenerTipoUsuario(int id);
	public Pavos obtenerPavos(int id);
	public OrdenPedido obtenerPedido(int id);
}
