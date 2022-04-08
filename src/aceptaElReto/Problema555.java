/**
 * 
 */
package aceptaElReto;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Pablo Bermejo
 * Fuga de Alcatraz
 */
public class Problema555 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String linea;
		String[] procesada;
		int x;
		int y;
		int v;
		int area[];
		int menor;
		int mayor;
		boolean escapan;
		
		do {
			/**
			 * Lee la entrada
			 */	
			linea = scan.nextLine();
			if(linea.equals("0")) {
				break;
			}
			procesada = linea.split(" ");

			x = Integer.parseInt(procesada[0]);
			
			y = Integer.parseInt(procesada[1]);
			
			v = Integer.parseInt(procesada[2]);
			
			area = new int[v];
			for (int i = 0; i < v; i++) {				
				area[i] = Integer.parseInt(procesada[i * 2 + 3]);
			}
			Arrays.sort(procesada);
			
			menor = area[0] - 21;
			mayor = area[0] + 21;
			escapan = false;

			for (int i = 0; i < area.length; i++) {
				if(area[i] - 21 <= mayor) {
					mayor = area[i] + 21;
				}else {
					escapan = true;
					break;
				}
			}
			
			if(menor > 0 || mayor < x) {
				escapan = true;
			}

			if(escapan) {
				System.out.println("SI");
			}else {
				System.out.println("NO");
			}
		} while(!linea.equals("0"));

	}

}
