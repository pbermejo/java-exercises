package estructurasDatos;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio41 {

	public static void main(String[] args) {
		int[][] matriz = new int[4][5];
		int[] sumaFilas = new int[4];
		int[] sumaColumnas = new int[5]; 		
		Random r = new Random();
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = r.nextInt(10) + 1;
			}
		}
		
		for (int i = 0; i < 4; i++) {
			sumaFilas[i] = 0;
			for (int j = 0; j < 5; j++) {
				sumaFilas[i] += matriz[i][j];
			}
		}
		for (int j = 0; j < 5; j++) {
			sumaColumnas[j] = 0;
			for (int i= 0; i < 4; i++) {
				if(matriz[i][j] % 2 == 0) {
					sumaColumnas[j] += matriz[i][j];
				}
			}
		}
		System.out.println(Arrays.toString(sumaFilas));
		System.out.println(Arrays.toString(sumaColumnas));
	}

}
