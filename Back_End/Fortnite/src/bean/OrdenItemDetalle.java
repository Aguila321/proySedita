package bean;

public class OrdenItemDetalle {
private int idCompra ;
private Item item;
private int precio;

public int getIdCompra() {
	return idCompra;
}
public void setIdCompra(int idCompra) {
	this.idCompra = idCompra;
}
public Item getItem() {
	return item;
}
public void setItem(Item item) {
	this.item = item;
}
public int getPrecio() {
	return precio;
}
public void setPrecio(int precio) {
	this.precio = precio;
}

public OrdenItemDetalle(int idCompra, Item item, int precio) {
	super();
	this.idCompra = idCompra;
	this.item = item;
	this.precio = precio;
}


}
