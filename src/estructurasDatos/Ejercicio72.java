/**
 * 
 */
package estructurasDatos;

import java.util.Random;
import java.util.TreeSet;

/**
 * @author Pablo Bermejo
 *
 */
public class Ejercicio72 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TreeSet <Integer> numeros = new TreeSet();
		Random r = new Random();
		
		do {
			numeros.add(r.nextInt(10));
		} while (numeros.size() < 10);
		
		System.out.println(numeros.toString());
	}
}
