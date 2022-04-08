package aceptaElRetoClasificacion;

import java.util.Scanner;

public class Problema219 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int casos;
		int decimos;
		int num;
		int pares;
		
		
		casos = scan.nextInt();
		
		for (int i = 0; i < casos; i++) {
			
			decimos = scan.nextInt();
			pares = 0;
			for (int j = 0; j < decimos; j++) {
				num = scan.nextInt();
				if(num % 2 == 0) {
					pares++;
				}
			}
			System.out.println(pares);
		}

	}

}
