package aceptaElReto;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author pbermejo
 *
 */
public class Problema101 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n;
		Scanner scan = new Scanner(System.in);
		int[][] cuadrado;
		int cm;
		int cm2;
		long columna, fila, diagonal1, diagonal2, esquinas, lados;
		int[] valores;
		Boolean esoterico;
		Boolean diabolico;
		
		do {
			n = scan.nextInt();
			cuadrado = new int[n][n];
			esoterico = true;
			diabolico = true;
			if(n == 0) {
				break;
			}
			
			/**
			 * Rellena cuadrado y
			 * guarda valores en un array
			 */
			valores = new int[n * n];
			for (int i = 0; i < n * n; i++) {
				valores[i] = scan.nextInt();
				cuadrado[i / n][i% n] = valores [i];
			}
			
			/**
			 * Calcula la constante mágica
			 * 
			 *  · · · · ·
			 *  · · · · ·
			 *  · · + · ·
			 *  · · · · ·
			 *  · · · · ·
			 */
			cm = 0;
			for (int i = 0; i < n; i++) {
				cm += cuadrado[i][i];
			}
			
			/**
			 * Calcula la constante mágica 2
			 */
			cm2 = 4 * cm / n;
			
			/**
			 * Comprueba si es cuadrado mágico 
			 */
			for (int i = 0; i < cuadrado.length; i++) {
				columna = 0;
				fila = 0;
				diagonal1 = 0;
				diagonal2 = 0;
				for (int j = 0; j < cuadrado[i].length; j++) {
					columna += cuadrado[i][j];
					fila += cuadrado[j][i];
					diagonal1 += cuadrado[j][j];
					diagonal2 += cuadrado[j][Math.abs(j - j)];
				}
				if(columna != cm || fila != cm || diagonal1 != cm || diagonal2 != cm) {
					diabolico = false;
					break;
				}
			}
			
			/**
			 * Comprueba si es cuadrado mágico diabólico esotérico 
			 */
			/**
			 * 1. El cuadrado contiene los números del 1 al n²;
			 */
			Arrays.sort(valores);
			for (int i = 0; i < valores.length; i++) {
				if(valores[i] !=  i + 1) {
					esoterico = false;
					break;
				}
			}
			/**
			 * 2. La suma de sus esquinas = cm2
			 * 
			 *  + · · · +
			 *  · · · · ·
			 *  · · · · ·
			 *  · · · · ·
			 *  + · · · +
			 */
			esquinas = 0;
			esquinas += cuadrado[0][0]; 		// NW
			esquinas += cuadrado[0][n - 1];		// NE
			esquinas += cuadrado[n - 1][0];		// SE
			esquinas += cuadrado[n - 1][n - 1]; // SW
			if(esquinas != cm2) {
				esoterico = false;
			}
			
			/**
			 * 3. La suma de las casillas de las mitades = cm2
			 * 
			 *  · · + · ·
			 *  · · · · ·
			 *  + · · · +
			 *  · · · · ·
			 *  · · + · ·
			 */
			lados = 0;
			if(n % 2 > 0) {
				lados += cuadrado[0][n / 2]; 		// N
				lados += cuadrado[n / 2][n - 1];	// E
				lados += cuadrado[n - 1][n / 2]; 	// S
				lados += cuadrado[n / 2][0];		// W
				if(lados != cm2) {
					esoterico = false;
				}
			}else {
				lados += cuadrado[0][(n / 2) - 1] + cuadrado[0][n / 2]; 		// N
				lados += cuadrado[(n / 2) - 1][n - 1] + cuadrado[n / 2][n - 1];	// E
				lados += cuadrado[n - 1][(n / 2) - 1] + cuadrado[n - 1][n / 2]; // S
				lados += cuadrado[(n / 2) - 1][0] + cuadrado[n / 2][0];			// W
				if(lados != 2 * cm2) {
					esoterico = false;
				}
			}
			
			/**
			 * Muestra resultado en consola
			 */
			if(diabolico) {
				if(esoterico) {
					System.out.println("ESOTERICO");
				}else {
					System.out.println("DIABOLICO");
				}
			} else {
				System.out.println("NO");				
			}
			
		} while (n > 0);
	}
}