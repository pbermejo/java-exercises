/**
 * 
 */
package accesoUsuarios;

/**
 * @author dual106
 *
 */
public class Administrador extends Usuario {
	
	private boolean otorgaPrivilegios;
	
	public Administrador(String nombre, String apellido1, String apellido2, String password, boolean otorgaPrivilegios) {
		super(nombre, apellido1, apellido2, password);
		this.otorgaPrivilegios = otorgaPrivilegios;
		this.login = "super-" + apellido1.substring(0, 2) + apellido2.substring(0, 2) + nombre.substring(0, 2);
	}
	
	/**
	 * @return the otorgaPrivilegios
	 */
	public boolean isOtorgaPrivilegios() {
		return otorgaPrivilegios;
	}


	/**
	 * @param otorgaPrivilegios the otorgaPrivilegios to set
	 */
	public void setOtorgaPrivilegios(boolean otorgaPrivilegios) {
		this.otorgaPrivilegios = otorgaPrivilegios;
	}


	/**
	 * @return
	 * @see java.lang.String#toString()
	 */
	public String toString() {
		return ("Usuario: " + this.getLogin() + "\nNombre completo: " + this.getNombre() + " " + this.getApellido1() + " " + this.getApellido2() + "\nPuede otorgar privilegios: " + this.isOtorgaPrivilegios());
	}
}
