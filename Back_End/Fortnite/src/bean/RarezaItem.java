package bean;

/**
 * Clase que Contiene los atributos de la tabla Rareza
 * @author alex_
 *
 */
public class RarezaItem {
	
	// ATRIBUTOS
	
	/** Identificador de la Rareza */
	private int idrareaza;
	/** Descripcion de la Rareza */
	private String descripcion;
	/** Color */
	private String color;

	// CONSTRUCTOR
	
	/**
	 * Constructor de la clase sin parametros
	 */
	public RarezaItem() {
		super();
	}
	/**
	 * Constructor de la clase con parametros
	 * @param idrareaza
	 * @param descripcion
	 */
	public RarezaItem(int idrareaza, String descripcion, String color) {
		super();
		this.idrareaza = idrareaza;
		this.descripcion = descripcion;
		this.color = color;
	}
	
	// GET - SET
	
	/**
	 * Metodo que obtiene el Identificador de la Rareza 
	 * @return idrareaza identificador de la rareza, tipo {@link Rareza}
	 */
	public int getIdrareaza() {
		return idrareaza;
	}
	/**
	 * Metodo que envia el Identificador de la Rareza  
	 * @param idrareaza idrareaza identificador de la rareza, tipo {@link Rareza}
	 */
	public void setIdrareaza(int idrareaza) {
		this.idrareaza = idrareaza;
	}
	/**
	 * Metodo que obtiene la Descripcion de la Rareza
	 * @return descripcion descripcion de la rareza, tipo {@link String}
	 */
	public String getDescripcion() {
		return descripcion;
	}
	/**
	 * Metodo que envia la Descripcion de la Rareza
	 * @param descripcion descripcion de la rareza, tipo {@link String}
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	/**
	 * Metodo que obtiene el Color de la Rareza
	 * @return color color de la rareza, tipo {@link String}
	 */
	public String getColor() {
		return color;
	}
	/**
	 * Metodo que envia el Color de la Rareza
	 * @param color color de la rareza, tipo {@link String}
	 */
	public void setColor(String color) {
		this.color = color;
	}
	 
	

}
