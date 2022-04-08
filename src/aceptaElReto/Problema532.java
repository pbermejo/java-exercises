/**
 * 
 */
package aceptaElReto;

import java.util.Scanner;

/**
 * @author Pablo Bermejo
 * Reduciendo envases
 */
public class Problema532 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int casos;
		int pesoNeto;
		int pesoTotal;
		
		casos = scan.nextInt();
		for (int i = 0; i < casos; i++) {
			
			pesoNeto = scan.nextInt();
			pesoTotal = scan.nextInt();
			System.out.println(pesoTotal - pesoNeto);
			
		}
	}

}
