/**
 * 
 */
package ExUd3Estructuras;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Pablo Bermejo
 *
 */
public class Ejercicio2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Random aleat = new Random();
		Scanner scan = new Scanner(System.in);
		int arco;
		int x;
		int y;
		int asteroides;
		int xMin, xMax;
		int yMin, yMax;		
		int[][] campo = new int[10][10];
		
		/**
		 * Rellena el campo con asteroides
		 */
		for (int i = 0; i < campo.length; i++) {
			for (int j = 0; j < campo[i].length; j++) {
				campo[i][j] = aleat.nextInt(2);
			}
		}
		
		do {
			System.out.println("Introduce el arco (-1 para finalizar el programa): ");
			arco = scan.nextInt();
			
			System.out.println("Introduce la fila: ");
			x = scan.nextInt();
			
			System.out.println("Introduce la columna: ");
			y = scan.nextInt();
			
			
			/**
			 * Establece los límites del arco de búsqueda 
			 * para que estén dentro de los límites del campo de asteroides
			 */
			xMin = x - arco;
			if (xMin < 0) {
				xMin = 0;
			}
			
			xMax = x + arco;
			if (xMax > campo.length - 1) {
				xMax = campo.length - 1;
			}
			
			yMin = y - arco;
			if (yMin < 0) {
				yMin = 0;
			}
			
			yMax = y + arco;
			if (yMax > campo.length - 1) {
				yMax = campo.length - 1;
			}
			
			/**
			 * Contabiliza los asteroides
			 */
			asteroides = 0;
			for (int i = xMin; i <= xMax; i++) {
				for (int j = yMin; j <= yMax; j++) {
					
					if(campo[i][j] > 0) {
						asteroides++;
					}
				}
			}
			
			System.out.println("Número de asteroides: " + asteroides);
			
		} while(arco > 0);

	}

}
