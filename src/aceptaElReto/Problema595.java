/**
 * 
 */
package aceptaElReto;

import java.util.Scanner;

/**
 * @author Pablo Bermejo
 * ¿En qué volumen?
 */
public class Problema595 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		int casos;
		int problema;
		
		casos = scan.nextInt();
		for (int i = 0; i < casos; i++) {
			
			problema = scan.nextInt();
			System.out.println(problema / 100);
			
		}
	}

}
