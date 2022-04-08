/**
 * 
 */
package baloncesto;

/**
 * @author Pablo Bermejo
 *
 */
public class Ejercicio34 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Jugador jugon = new Jugador("Pau", "Gasol", 40, 2);
		Jugador jugon2 = new Jugador();
		System.out.println(jugon.visualizaDatos());
		jugon2.setNombre("Juan Carlos");
		jugon2.setApellidos("Navarro");
		jugon2.setEdad(40);
		jugon2.setTipoJugador(1);
		System.out.println(jugon2.visualizaDatos());
	}

}
