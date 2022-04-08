/**
 * 
 */
package estructurasDatos;

import java.util.ArrayList;
import java.util.Collections;
/**
 * @author dual106
 *
 */
import java.util.Random;
public class Ejercicio60 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList <Integer> valoresAzar = new ArrayList();
		Random r = new Random();
		int aleat;
		
		for (int i = 0; i < 60; i++) {
			
			// Genera valores al azar mientras ya existan en el array.
			do {
				aleat = r.nextInt(60);
			} while ((valoresAzar.contains(aleat)));
			valoresAzar.add(aleat);
		}
		
		// Mostrar en consola de valores menor y mayor.
		Collections.sort(valoresAzar);
		System.out.println("Menor: " + valoresAzar.get(0));
		System.out.println("Mayor: " + valoresAzar.get(valoresAzar.size() - 1));
		
		// Alternativa para mostrar en consola los valores menor y mayor.
		
		Collections.sort(valoresAzar);
		System.out.println("Menor: " + valoresAzar.get(0));
		
		Collections.sort(valoresAzar, Collections.reverseOrder());
		System.out.println("Mayor: " + valoresAzar.get(0));
	}

}
