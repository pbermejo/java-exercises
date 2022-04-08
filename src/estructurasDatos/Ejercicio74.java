/**
 * 
 */
package estructurasDatos;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

/**
 * @author Pablo Bermejo
 *
 */
public class Ejercicio74 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String entrada = scan.nextLine();
		Stack<Character> pila = new Stack<Character>();
		
		for (int i = 0; i < entrada.length(); i++) {
			pila.push(entrada.charAt(i));
		}
		
		while(!pila.isEmpty()) {
			System.out.print(pila.pop());
		}
		System.out.println();
	}

}
