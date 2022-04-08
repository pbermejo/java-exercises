/**
 * 
 */
package aceptaElReto;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author Pablo Bermejo
 * Ajedrez asistido por computador
 */
public class Problema481 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		int x, y;
		String[] col = {"a","b","c","d","e","f","g","h"};
		String resultado;
		
		do {
			x = scan.nextInt();
			y = scan.nextInt();
			
			if(x == 0 && y == 0) {
				break;
			}
			
			// x = col
			// y = row
			Arrays.sort(col, Collections.reverseOrder());
			resultado = "";
			resultado += col[x - 1];
			resultado += Integer.toString(y);
			
			System.out.println(resultado);
			
		}while(x > 0 && y > 0);
	}

}
