/**
 * 
 */
package ExUd3Estructuras;

import java.util.ArrayList;
import java.util.Random;
import java.util.TreeSet;

/**
 * @author Pablo Bermejo
 *
 */
public class Ejercicio4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Random aleat = new Random();
		ArrayList <Integer> numeros = new ArrayList<Integer>();
		TreeSet <Integer> pares = new TreeSet<Integer>();
		String resultado = "";
		int r;
		
		for (int i = 0; i < 120; i++) {
			r = aleat.nextInt(50) + 1;
			numeros.add(r);
			if(r % 2 > 0) {
				pares.add(r);
			}
		}
		
		System.out.println(numeros.toString());
		System.out.println(pares.toString());
	}

}
