package bean;

public class CompraItemPersonalizado {
private int idItem ;
private Usuario usuario ;
private OrdenItemDetalle itemDetalle;

public CompraItemPersonalizado(int idItem, Usuario usuario, OrdenItemDetalle itemDetalle) {
	super();
	this.idItem = idItem;
	this.usuario = usuario;
	this.itemDetalle = itemDetalle;
}

public int getIdItem() {
	return idItem;
}
public void setIdItem(int idItem) {
	this.idItem = idItem;
}
public Usuario getUsuario() {
	return usuario;
}
public void setUsuario(Usuario usuario) {
	this.usuario = usuario;
}
public OrdenItemDetalle getItemDetalle() {
	return itemDetalle;
}
public void setItemDetalle(OrdenItemDetalle itemDetalle) {
	this.itemDetalle = itemDetalle;
}

}
