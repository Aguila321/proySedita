package interfaces;

import java.util.List;

import bean.Inventario;
import bean.Item;
import bean.Pais;
import bean.Pavos;
import bean.RarezaItem;
import bean.TipoItem;
import bean.TipoUsuario;
import bean.Usuario;

/**
 * 
 * @autor Carlos Carrion
 * 
 * */

public interface InventarioInterface {

	public List<Inventario> inventarioLista();
	public Item obtenerItem(int codigoItem);
	public Usuario obtenerUsuario(int idUser);
	public TipoItem obtenerTipoItem(int id);
	public RarezaItem obtenerRareza(int id);
	public Pais obtenerPais(int id);
	public TipoUsuario obtenerTipoUsuario(int id);
	public Pavos obtenerPavos(int id);
	
}
