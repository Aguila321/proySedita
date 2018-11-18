package bean;

/**
 * Clase que Contiene los atributos de la tabla Pavos
 * @author alex_
 *
 */
public class Pavos {
	
	// ATRIBUTOS
	
	/** Identificador de los Pavos */
	private int idpavos;
	/** Cantidad de Pavos */
	private int cantidad;
	/** Descripcion de los Pavos*/
	private String descripcion;
	/** Precio de los Pavos */
	private double precio;
	
	// CONSTRUCTOR
	
	/**
	 * Constructor de la clase sin parametros
	 */
	public Pavos() {
		super();
	}
	/**
	 * Constructor de la clase con parametros
	 * @param idpavos
	 * @param descripcion
	 * @param cantidad
	 * @param precio
	 */
	public Pavos(int idpavos, String descripcion, int cantidad, double precio) {
		super();
		this.idpavos = idpavos;
		this.descripcion = descripcion;
		this.cantidad = cantidad;
		this.precio = precio;
	}
	
	// GET - SET
	
	/**
	 * Metodo que obtiene el Identificador de los Pavos
	 * @return idpavos identificador de los pavos, tipo {@link Integer}
	 */
	public int getIdpavos() {
		return idpavos;
	}
	/**
	 * Metodo que envia el Identificador de los Pavos
	 * @param idpavos identificador de los pavos, tipo {@link Integer}
	 */
	public void setIdpavos(int idpavos) {
		this.idpavos = idpavos;
	}
	/**
	 * Metodo que obtiene la Cantidad de Pavos
	 * @return cantidad cantidad de pavos, tipo {@link Integer}
	 */
	public int getCantidad() {
		return cantidad;
	}
	/**
	 * Metodo que envia la Cantidad de Pavos
	 * @param cantidad cantidad de pavos, tipo {@link Integer}
	 */
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	/**
	 * Metodo que obtiene el Precio de los Pavos
	 * @return precio precio de los pavos, tipo {@link Double}
	 */
	public double getPrecio() {
		return precio;
	}
	/**
	 * Metodo que envia el Precio de los Pavos
	 * @param precio precio de los pavos, tipo {@link Double}
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	/**
	 * Metodo que obtiene la Descripcion de los Pavos
	 * @return descripcion descripcion de los pavos, tipo {@link String}
	 */
	public String getDescripcion() {
		return descripcion;
	}
	/**
	 * Metodo que envia la Descripcion de los Pavos
	 * @param descripcion descripcion de los pavos, tipo {@link String}
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	

}
