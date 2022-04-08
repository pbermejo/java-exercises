/**
 * 
 */
package aceptaElReto;

import java.util.Scanner;

/**
 * @author Pablo Bermejo
 * Gorros de colores
 */
public class Problema587 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		int casos;
		String gorros;
		String apuesta;
		int minutos;
		
		casos = scan.nextInt();
		for (int i = 0; i < casos; i++) {
			
			gorros = scan.next();
			apuesta = "";
			minutos = 0;
			
			for (int j = 0; j < gorros.length(); j++) {
				if(j % 2 == 0) {
					apuesta += gorros.charAt(j);
				}else {
					apuesta  += gorros.charAt(j - 1);
				}
			}
			
			for (int j = 0; j < gorros.length(); j++) {
				if(gorros.charAt(j) == apuesta.charAt(j)) {
					minutos++;
				}
			}
			System.out.println(minutos);
			
		}
	}

}
