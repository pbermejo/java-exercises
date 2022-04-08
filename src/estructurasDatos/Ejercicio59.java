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
public class Ejercicio59 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList <Integer> valoresAzar = new ArrayList();
		Random r = new Random();
		
		for (int i = 0; i < 40; i++) {
			valoresAzar.add(r.nextInt(40) + 20);
		}
		
		System.out.println(valoresAzar.toString());
		Collections.sort(valoresAzar);
		System.out.println("Menor: " + valoresAzar.get(0));
		System.out.println("Mayor: " + valoresAzar.get(valoresAzar.size() - 1));
	}

}
