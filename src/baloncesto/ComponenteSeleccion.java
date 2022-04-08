/**
 * 
 */
package baloncesto;

/**
 * @author Pablo Bermejo
 *
 */
public class ComponenteSeleccion {

	protected String nombre;
	protected String apellidos;
	protected int edad;
	
	/**
	 * 
	 */
	public ComponenteSeleccion() {
	}
	
	/**
	 * @param nombre
	 * @param apellidos
	 * @param edad
	 */
	public ComponenteSeleccion(String nombre, String apellidos, int edad) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
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
	}

	/**
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	/**
	 * Muestra los datos de la clase.
	 * @return nombre, apellidos y edad
	 */
	public String visualizaDatos () {
		return (this.getNombre() + " " + this.getApellidos() + ", edad: " + this.getEdad() + " años.");
	}
}
