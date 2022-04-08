package aceptaElRetoClasificacion;

import java.util.Arrays;
import java.util.Scanner;

public class Problema521 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int p, l, a;
		int piso;
		String letra;
		String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int asistentes;
		int viviendas;
		int[][] edificio;
		
		do {
			p = scan.nextInt();
			l = scan.nextInt();
			a = scan.nextInt();
			
			if(p == 0 && l == 0 && a == 0) {
				break;
			}
			
			edificio = new int[p][l];
			
			for (int i = 0; i < a; i++) {
				piso = scan.nextInt();
				letra = scan.next();
				edificio[piso -1][abc.indexOf(letra)]++;
			}
			
			asistentes = 0;
			for (int i = 0; i < edificio.length; i++) {
				for (int j = 0; j < edificio[i].length; j++) {
					if(edificio[i][j] > 0) {
						asistentes++;
					}
				}
			}
			viviendas = p * l;
			if(asistentes >= viviendas / 2 + viviendas % 2) {
				System.out.println("EMPEZAMOS");
			}else {
				System.out.println("ESPERAMOS");
			}
		} while(p > 0 && l > 0 && a > 0);

	}

}
