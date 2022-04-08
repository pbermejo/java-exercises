/**
 * 
 */
package aceptaElReto;

import java.util.Scanner;

/**
 * @author Pablo Bermejo
 * 
 * Temperaturas extremas
 */
public class Problema314 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int casos;
		int numRegistros;
		int[] temperaturas;
		int picos;
		int valles;
		int menor;
		int mayor;
		Scanner scan = new Scanner(System.in);
		
		casos = scan.nextInt();
		for (int i = 0; i < casos; i++) {
			numRegistros = scan.nextInt();
			temperaturas = new int[numRegistros];
			
			for (int j = 0; j < numRegistros; j++) {
				temperaturas[j] = scan.nextInt();
			}
			
			
			picos = 0;
			valles = 0;
			for (int j = 1; j < temperaturas.length - 1; j++) {
				if(temperaturas[j] > temperaturas[j - 1] && temperaturas[j] > temperaturas[j + 1]) {
					picos++;
				}
				if(temperaturas[j] < temperaturas[j - 1] && temperaturas[j] < temperaturas[j + 1]) {
					valles++;
				}
			}
			
			System.out.println(picos + " " + valles);
		}
	}

}
