package aceptaElRetoClasificacion;

import java.util.Scanner;

public class Problema178 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int casos;
		String titular;
		String mensaje;
		boolean contiene;
		
		casos = scan.nextInt();
		scan.nextLine();
		
		for (int i = 0; i < casos; i++) {
			titular = scan.nextLine();
			titular = titular.replace(" ", "");
			titular = titular.toLowerCase();
			
			mensaje = scan.nextLine();
			mensaje = mensaje.replace(" ", "");
			mensaje = mensaje.toLowerCase();
			
			System.out.println();
			System.out.println(titular);
			System.out.println(mensaje);
			
			contiene = true;
			for (int j = 0; j < mensaje.length(); j++) {
				String letra = Character.toString(mensaje.charAt(j));
				if(!titular.contains(letra)) {
					contiene = false;
					break;
				}
			}
			if(contiene) {
				System.out.println("SI");
			}else {
				System.out.println("NO");
			}
		}
		scan.close();

	}

}
