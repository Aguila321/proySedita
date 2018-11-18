package bean;

/**
 * Clase que Contiene los atributos de la tabla Pais
 * @author alex_
 *
 */
public class Pais {
	
	// ATRIBUTOS
	
	/** Identificador del Pais */
	private int idpais;
	/** Nombre del Pais */
	private String nombrePais;
	
	// CONSTRUCTOR
	
	/**
	 * Constructor de la clase sin parametros
	 */
	public Pais() {
		super();
	}
	/**
	 * Constructor de la clase con parametros
	 * @param idpais
	 * @param nombrePais
	 */
	public Pais(int idpais, String nombrePais) {
		super();
		this.idpais = idpais;
		this.nombrePais = nombrePais;
	}

	// GET / SET
	
	/**
	 * Metodo que obtiene el Identificador del Pais
	 * @return idpais identificador del pais, tipo {@link Integer}
	 */
	public int getIdpais() {
		return idpais;
	}
	/**
	 * Metodo que envia el Identificador del Pais
	 * @param idpais identificador del pais, tipo {@link Integer}
	 */
	public void setIdpais(int idpais) {
		this.idpais = idpais;
	}
	/**
	 * Metodo que obtiene el Nombre del Pais
	 * @return nombrePais nombre del pais, tipo {@link String}
	 */
	public String getNombrePais() {
		return nombrePais;
	}
	/**
	 * Metodo que envia el Nombre del Pais
	 * @param nombrePais nombre del pais, tipo {@link String}
	 */
	public void setNombrePais(String nombrePais) {
		this.nombrePais = nombrePais;
	}
}
