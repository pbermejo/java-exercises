/**
 * 
 */
package baloncesto;

/**
 * @author Pablo Bermejo
 *
 */
public class Jugador extends ComponenteSeleccion {
	
	private int tipoJugador;

	/**
	 * 
	 */
	public Jugador() {
	}

	/**
	 * @param tipoJugador
	 */
	public Jugador(String nombre, String apellidos, int edad, int tipoJugador) {
		super(nombre, apellidos, edad);
		this.tipoJugador = tipoJugador;
	}

	/**
	 * @return the tipoJugador
	 */
	public int getTipoJugador() {
		return tipoJugador;
	}

	/**
	 * @param tipoJugador the tipoJugador to set
	 */
	public void setTipoJugador(int tipoJugador) {
		this.tipoJugador = tipoJugador;
	}
	
	/**
	 * Muestra los datos de la clase.
	 * @return
	 */
	public String visualizaDatos () {
		String[] tipoJugador = {"base", "pivot", "alero"};
		return (this.getNombre() + " " + this.getApellidos() + ", edad: " + this.getEdad() + ", puesto: " + tipoJugador[this.getTipoJugador() - 1]);
	}
}
