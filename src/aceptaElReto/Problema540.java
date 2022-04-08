/**
 * 
 */
package aceptaElReto;

import java.util.Scanner;

/**
 * @author Pablo Bermejo
 * Por el hueco de la escalera
 */
public class Problema540 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int casos;
		int piso;
		int escalonesPiso;
		int pisosActuales;
		int escalonesActuales;
		int escalonesSubidos;
		int escalonesBajados;
		
		casos = scan.nextInt();
		for (int i = 0; i < casos; i++) {
			piso = scan.nextInt();
			escalonesPiso = scan.nextInt();
			pisosActuales = scan.nextInt();
			escalonesActuales = scan.nextInt();
			
			escalonesBajados = pisosActuales * escalonesPiso + escalonesActuales;
			escalonesSubidos = escalonesBajados + piso * escalonesPiso;
			
			System.out.println(escalonesBajados + " " + escalonesSubidos);
		}
	}

}
