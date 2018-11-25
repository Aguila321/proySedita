package bean;

public class OrdenItemDetalle {
	
private OrdenItem ordeItem;
private Item item;
private double precio;

public OrdenItemDetalle() {
}



public OrdenItemDetalle(OrdenItem ordeItem, Item item, double precio) {
	super();
	this.ordeItem = ordeItem;
	this.item = item;
	this.precio = precio;
}



public OrdenItem getOrdeItem() {
	return ordeItem;
}



public void setOrdeItem(OrdenItem ordeItem) {
	this.ordeItem = ordeItem;
}



public Item getItem() {
	return item;
}



public void setItem(Item item) {
	this.item = item;
}



public double getPrecio() {
	return precio;
}



public void setPrecio(double precio) {
	this.precio = precio;
}






}
