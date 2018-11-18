package bean;

/**
 * Clase que Contiene los atributos de la tabla Usuario
 * @author alex_
 *
 */
public class Usuario {

	// ATRIBUTOS
	
	/** Identificador del Usuario */
	private int iduser;
	/** Nombre del Usuario */
	private String nombre;
	/** Apellido del Usuario */
	private String apellido;
	/** Username del Usuario */
	private String username;
	/** Clave del Usuario */
	private String clave; 
	/** Fecha de Nacimiento del Usuario */
	private String fecnac;
	/** Email del Usuario */
	private String email;  
	/** Cantidad de Pavos del Usuario */
	private int pavos;
	/** Pais del Usuario */
	private Pais pais;
	
	/** Tipo de Usuario */
	private TipoUsuario tipo;
	
	// CONSTRUCTOR
	
	/**
	 * Constructor de la clase sin parametros
	 */
	public Usuario () {
		super();
	}
	/**
	 * Constructor de la clasae con parametros
	 * @param iduser
	 * @param nombre
	 * @param apellido
	 * @param username
	 * @param clave
	 * @param fecnac
	 * @param email
	 * @param pavos
	 * @param idpais
	 * @param idtipo
	 */
	public Usuario(int iduser, String nombre, String apellido, String username, String clave, String fecnac,
			String email, int pavos, Pais pais, TipoUsuario tipo) {
		super();
		this.iduser = iduser;
		this.nombre = nombre;
		this.apellido = apellido;
		this.username = username;
		this.clave = clave;
		this.fecnac = fecnac;
		this.email = email;
		this.pavos = pavos;
		this.pais = pais;
		this.tipo = tipo;
	}
	
	// GET - SET
	
	/**
	 * Metodo que obtiene el Identificador del Usuario
	 * @return iduser identificador del usuario, tipo {@link Integer}
	 */
	public int getIduser() {
		return iduser;
	}
	/**
	 * Metodo que envia el Identificador del Usuario
	 * @param iduser identificador del usuario, tipo {@link Integer}
	 */
	public void setIduser(int iduser) {
		this.iduser = iduser;
	}
	/**
	 * Metodo que obtiene el Nombre del Usuario
	 * @return nombre nombre del usuario, tipo {@link String}
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * Metodo que envia el Nombre del Usuario
	 * @param nombre nombre del usuario, tipo {@link String}
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * Metodo que obtiene el Apellido del Usuario
	 * @return apellido apellido del usuario, tipo {@link String}
	 */
	public String getApellido() {
		return apellido;
	}
	/**
	 * Metodo que envia el Apellido del Usuario 
	 * @param apellido apellido del usuario, tipo {@link String}
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	/**
	 * Metodo que obtiene el Username del Usuario
	 * @return username username del usuario, tipo {@link String}
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * Metodo que envia el Username del Usuario
	 * @param username username del usuario, tipo {@link String}
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * Metodo que obtiene la Clave del Usuario
	 * @return clave clave del usuario, tipo {@link String}
	 */
	public String getClave() {
		return clave;
	}
	/**
	 * Metodo que envia la Clave del Usuario
	 * @param clave clave del usuario, tipo {@link String}
	 */
	public void setClave(String clave) {
		this.clave = clave;
	}
	/**
	 * Metodo que obtiene la Fecha de Nacimiento del Usuario
	 * @return fecnac fecha de nacimiento del usuario, tipo {@link String}
	 */
	public String getFecnac() {
		return fecnac;
	}
	/**
	 * Metodo que envia la Fecha de Nacimiento del Usuario 
	 * @param fecnac fecha de nacimiento del usuario, tipo {@link String}
	 */
	public void setFecnac(String fecnac) {
		this.fecnac = fecnac;
	}
	/**
	 * Metodo que obtiene el Email del Usuario
	 * @return email email del usuario, tipo {@link String} 
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * Metodo que envia el Email del Usuario
	 * @param email email del usuario, tipo {@link String} 
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * Metodo que obtiene la Cantidad de Pavos del Usuario
	 * @return pavos cantidad de pavos del usuario, tipo {@link Pavos}
	 */
	
	public Pais getPais() {
		return pais;
	}
	public int getPavos() {
		return pavos;
	}
	/**
	 * Metodo que obtiene el Pais del Usuario
	 * @return pais pais del usuario, tipo {@link Pais}
	 */
	
	public void setPavos(int pavos) {
		this.pavos = pavos;
	}
	/**
	 * Metodo que envia el Pais del Usuario
	 * @param pais pais del usuario, tipo {@link Pais}
	 */
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	/**
	 * Metodo que obtiene el Tipo de Usuario
	 * @return tipo tipo de usuario, tipo {@link TipoUsuario}
	 */
	public TipoUsuario getTipo() {
		return tipo;
	}
	/**
	 * Metodo que envia el Tipo de Usuario
	 * @param tipo tipo de usuario, tipo {@link TipoUsuario}
	 */
	public void setTipo(TipoUsuario tipo) {
		this.tipo = tipo;
	}
	

	
	


}
