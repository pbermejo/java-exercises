/**
 * 
 */
package ExUd3Estructuras;

import java.util.Random;

/**
 * @author Pablo Bermejo
 *
 */
public class Ejercicio3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Random aleat = new Random();	
		int[][] tabla = new int[24][10];
		int menor;
		int mayor;
		int vecesMenor;
		int vecesMayor;
		
		/**
		 * Llena las 20 primeras filas de valores aleatorios
		 */
		for (int i = 0; i < 21; i++) {
			
			for (int j = 0; j < tabla[i].length; j++) {
				
				tabla[i][j] = aleat.nextInt(10) + 1;
			}
		}
		
		/**
		 * Recorre la tabla por columnas
		 * 
		 */
		
		for (int i = 0; i < 10; i++) {
			menor = 10;
			mayor = 0;
			vecesMenor = 0;
			vecesMayor = 0;
			
			/**
			 * Calcula menores y mayores
			 */
			for (int j = 0; j < 21; j++) {
				
				if(tabla[j][i] < menor) {
					menor = tabla[j][i];
				}
				
				if(tabla[j][i] > mayor) {
					mayor = tabla[j][i];
				}
				
			}
			
			/**
			 * Hace el recuento de menores y mayores
			 */
			for (int j = 0; j < 21; j++) {
				
				if(tabla[j][i] == menor) {
					vecesMenor++;
				}
				
				if(tabla[j][i] == mayor) {
					vecesMayor++;
				}
			}
			
			/**
			 * Guarda los resultados en las filas 21 a 24
			 */			
			tabla[20][i] = menor;
			tabla[21][i] = vecesMenor;
			tabla[22][i] = mayor;
			tabla[23][i] = vecesMayor;
		}
	}

}
