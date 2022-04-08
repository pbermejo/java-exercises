package estructurasDatos;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio40 {

	public static void main(String[] args) {
		int[][] matriz = new int[4][5];
		int suma;
		
		Random r = new Random();
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = r.nextInt(10) + 1;
			}
		}
		
		for (int i = 0; i < 4; i++) {
			suma = 0;
			for (int j = 0; j < 5; j++) {
				suma += matriz[i][j];
			}
			System.out.println("Suma de los elementos de la fila " + i + " --> " + suma);
		}
		
		for (int j = 0; j < 5; j++) {
			suma = 0;
			for (int i= 0; i < 4; i++) {
				if(matriz[i][j] % 2 == 0) {
					suma += matriz[i][j];
				}
			}
			System.out.println("Suma de los elementos pares de la columna " + j + " --> " + suma);
		}
	}

}
