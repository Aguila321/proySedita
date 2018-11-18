package interfaces;

import java.util.List;

import bean.Item;
import bean.RarezaItem;
import bean.TipoItem;

public interface ItemInterface {
	
	public List<Item> listaItem() ;
	public TipoItem obtenerTipoItem(int id);
	public RarezaItem obtenerRareza(int id);	
	public List<Item> obtenerListaItem(int codigoItem);
	
	
}
