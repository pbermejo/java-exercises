package accesoUsuarios;

public class Usuario {
	private String nombre;
	private String apellido1;
	private String apellido2;
	private String password;
	protected String login;

	/**
	 * @param nombre
	 * @param apellido1
	 * @param apellido2
	 * @param password
	 */
	public Usuario(String nombre, String apellido1, String apellido2, String password) {
		super();
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.login = apellido1.substring(0, 2) + apellido2.substring(0, 2) + nombre.substring(0, 2);
		this.password = Integer.toString(password.hashCode());
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
		this.login = apellido1.substring(0, 2) + apellido2.substring(0, 2) + nombre.substring(0, 2);
	}

	/**
	 * @return the apellido1
	 */
	public String getApellido1() {
		return apellido1;
	}

	/**
	 * @param apellido1 the apellido1 to set
	 */
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
		this.login = apellido1.substring(0, 2) + apellido2.substring(0, 2) + nombre.substring(0, 2);
	}

	/**
	 * @return the apellido2
	 */
	public String getApellido2() {
		return apellido2;
	}

	/**
	 * @param apellido2 the apellido2 to set
	 */
	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
		this.login = apellido1.substring(0, 2) + apellido2.substring(0, 2) + nombre.substring(0, 2);
	}

	/**
	 * @return the login
	 */
	public String getLogin() {
		return login;
	}

	/**
	 * @return true si la contraseña es correcta
	 */

	public Boolean comprobarPass(String nuevaPassword) {
		return password.equals(Integer.toString(nuevaPassword.hashCode()));
	}

	/**
	 * @return
	 * @see java.lang.String#toString()
	 */
	public String toString() {
		return ("Usuario: " + this.getLogin() + "\nNombre completo: " + this.getNombre() + " " + this.getApellido1()
				+ " " + this.getApellido2());
	}

}
