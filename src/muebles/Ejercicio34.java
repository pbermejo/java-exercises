/**
 * 
 */
package muebles;

/**
 * @author Pablo Bermejo
 *
 */
public class Ejercicio34 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/**
		 * OPCIÓN 1: Crea un objeto color y lo inyecta al objeto mesa.
		 * Más tarde crea otro objeto color y lo inyecta. El anterior es borrado por el recolector de basura.
		 */
		
		Mesa mesaComedor = new Mesa(200, 100, 100, new Color((short) 128, (short) 255, (short) 128), 4);		
		System.out.println(mesaComedor.visualizaMesa());
		mesaComedor.setColor(new Color((short) 255, (short) 0, (short) 0));
		System.out.println(mesaComedor.visualizaMesa());
		
		/**
		 * OPCIÓN 2:
		 */
		Color rojo = new Color((short) 255, (short) 0, (short) 0);
		mesaComedor.setColor(rojo);
		System.out.println(mesaComedor.visualizaMesa());
		
		/**
		 * OPCIÓN 3:
		 */
		mesaComedor.color.setRed((short) 255);
		mesaComedor.color.setGreen((short) 0);
		mesaComedor.color.setBlue((short) 0);
		System.out.println(mesaComedor.visualizaMesa());
	}

}
