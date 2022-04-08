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
public class Ejercicio73 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String nombre = "dabalearrozalazorraelabad";
		TreeSet <Character> caracteres = new TreeSet();
		
		for (int i = 0; i < nombre.length(); i++) {
			caracteres.add(nombre.charAt(i));
		}
		
		System.out.println(caracteres.toString());
	}
}
