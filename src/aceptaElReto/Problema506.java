/**
 * 
 */
package aceptaElReto;

import java.util.Scanner;

/**
 * @author Pablo Bermejo
 * Tensión descompensada
 */
public class Problema506 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int casos;
		String entrada;
		String[] presion;
		int pmax, pmin;
		
		casos = scan.nextInt();
		scan.nextLine();
		for (int i = 0; i < casos; i++) {
			
			entrada = scan.nextLine();
			entrada = entrada.replace(" ","");
			presion = entrada.split("/");
			pmax = Integer.parseInt(presion[0]);
			pmin = Integer.parseInt(presion[1]);
			
			if(pmax < pmin) {
				System.out.println("MAL");
			}else {
				System.out.println("BIEN");
			}
		}
	}

}
