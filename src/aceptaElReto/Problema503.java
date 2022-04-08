/**
 * 
 */
package aceptaElReto;

import java.util.Scanner;

/**
 * @author Pablo Bermejo
 * Dados de rol
 */
public class Problema503 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int casos;
		int[] numeros;
		int d1;
		int d2;
		int mayor;
		String resultado;
		
		casos = scan.nextInt();
		for (int i = 0; i < casos; i++) {
			
			d1 = scan.nextInt();
			d2 = scan.nextInt();
			
			numeros = new int[d1 + d2 + 1];
			for (int j = 1; j <= d1; j++) {
				for (int k = 1; k <= d2; k++) {
					numeros[j + k]++;
				}
			}
			
			mayor = numeros[0];
			for (int n : numeros) {
				if(n > mayor) {
					mayor = n;
				}
			}
			
			resultado = "";
			for (int j = 0; j < numeros.length; j++) {
				if(numeros[j] == mayor) {
					resultado += Integer.toString(j);
					resultado += " ";
				}
			}
			resultado = resultado.trim();
			System.out.println(resultado);
			
		}
	}

}
