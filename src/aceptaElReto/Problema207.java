/**
 * 
 */
package aceptaElReto;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author dual106
 *
 */
public class Problema207 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int c;
		int f;
		int a;
		int[][] camping;
		int[][] arboles;
		int sombra;
		Scanner scan = new Scanner(System.in);
		
		do {
			/**
			 * Lee datos mientras no se introduzca 0 0 0
			 */
			c = scan.nextInt();
			f = scan.nextInt();
			a = scan.nextInt();
			if(c == 0 && f == 0 && a == 0) {
				break;
			}
			scan.nextLine();
			
			/**
			 * Crea matriz de posiciones de arboles
			 */
			arboles = new int[a][2];			
			for (int i = 0; i < a * 2; i++) {
				arboles[i / 2][i % 2] = scan.nextInt() - 1;
			}
			
			/**
			 * Crea camping y coloca árboles
			 */
			camping = new int[f][c];
			for (int i = 0; i < arboles.length; i++) {
				camping[arboles[i][1]][arboles[i][0]] = 1;
			}
			
			/**
			 * Calcula sombras en las parcelas adyacentes a cada árbol
			 */
			sombra = 0;
			for (int i = 0; i < camping.length; i++) {
				for (int j = 0; j < camping[i].length; j++) {
					if(camping[i][j] > 0) {
						
						/**
						 * Comprueba que las parcelas adyacentes se encuentran dentro de los límites del camping
						 * Comprueba si en esa coordenada hay un árbol
						 */

						/**
						 * Parcela NW
						 */
						if (i - 1 >= 0 && j - 1 >= 0 && camping[i - 1][j - 1] == 0) {
							camping[i - 1][j - 1] = -1;
						}
						/**
						 * Parcela  N
						 */
						if (j - 1 >= 0 && camping[i][j - 1] == 0) {
							camping[i][j - 1] = -1;
						}
						/**
						 * Parcela NE
						 */
						if (i + 1 < camping.length && j - 1 >= 0 && camping[i + 1][j - 1] == 0) {
							camping[i + 1][j - 1] = -1;
						}
						/**
						 * Parcela E
						 */
						if (i + 1 < camping.length && camping[i + 1][j] == 0) {
							camping[i + 1][j] = -1;
						}
						/**
						 * Parcela SE
						 */
						if (i + 1 < camping.length &&  j + 1 < camping[i].length && camping[i + 1][j + 1] == 0) {
							camping[i + 1][j + 1] = -1;
						}
						/**
						 * Parcela S
						 */
						if (j + 1 < camping[i].length && camping[i][j + 1] == 0) {
							camping[i][j + 1] = -1;
						}
						/**
						 * Parcela SW
						 */
						if (i - 1 >= 0 && j + 1 < camping[i].length && camping[i - 1][j + 1] == 0) {
							camping[i - 1][j + 1] = -1;
						}
						/**
						 * Parcela W
						 */
						if (i - 1 >= 0 && camping[i - 1][j] == 0) {
							camping[i - 1][j] = -1;
						}
						
					}
				}
			}
			
			/**
			 * Cuenta las sombras
			 */
			for (int i = 0; i < camping.length; i++) {
				for (int j = 0; j < camping[i].length; j++) {
					if(camping[i][j] < 0) {
						sombra++;
					}
				}
			}
			System.out.println(sombra);
		} while(c > 0 && f > 0 && a > 0);
	}

}
