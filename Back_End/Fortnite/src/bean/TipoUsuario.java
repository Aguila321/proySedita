package bean;

/**
 * Clase que Contiene los atributos de la tabla Tipo Usuario
 * @author alex_
 *
 */
public class TipoUsuario {
	
	// ATRIBUTOS
	
	/** Identificador del Tipo */
	private int idTipoUsuario;
	/** Descripcion del Tipo */
	private String descripcion;

	// CONSTRUCTOR
	
	/**
	 * Constructor de la clase sin parametros
	 */
	public TipoUsuario() {
		super();
	}
	/**
	 * Constructor de la clase con parametros
	 * @param idTipoUsuario
	 * @param descripcion
	 */
	public TipoUsuario(int idTipoUsuario, String descripcion) {
		super();
		this.idTipoUsuario = idTipoUsuario;
		this.descripcion = descripcion;
	}
	
	// GET - SET
	
	/**
	 * Metodo que obtiene el Identificador del Tipo de Usuario
	 * @return idTipoUsuario identificador del tipo de usuario, tipo {@link Integer}
	 */
	public int getIdtipo() {
		return idTipoUsuario;
	}
	/**
	 * Metodo que envia el Identificador del Tipo de Usuario
	 * @param idTipoUsuario identificador del tipo de usuario, tipo {@link Integer}
	 */
	public void setIdtipo(int idTipoUsuario) {
		this.idTipoUsuario = idTipoUsuario;
	}
	/**
	 * Metodo que obtiene la descripcion del Tipo de Usuario
	 * @return descripcion descripcion del tipo de usuario, tipo {@link String}
	 */
	public String getDescripcion() {
		return descripcion;
	}
	/**
	 * Metodo que envia la descripcion del Tipo de Usuario
	 * @param descripcion descripcion del tipo de usuario, tipo {@link String}
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
