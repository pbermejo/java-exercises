package aceptaElReto;

import java.util.Scanner;

public class Problema439 {
	/*
	 * Velocidad = desplazamiento/tiempo
	 */
	public static void main(String[] args) {
		int casos;
		int desplazamiento;
		int tiempo;
		int velocidad;
		String entrada;
		String[] magnitudes;

		Scanner scan = new Scanner(System.in);
		casos = scan.nextInt();
		entrada = scan.nextLine();	
		for (int i = 0; i < casos; i++) {
			desplazamiento = 0;
			tiempo = 0;
			velocidad = 0;
			entrada = scan.nextLine();		
			magnitudes = entrada.split(" ");	
			for(String magnitud : magnitudes){
				if(magnitud.charAt(0) == 'D'){
					magnitud = magnitud.substring(2, magnitud.length());
					desplazamiento = Integer.parseInt(magnitud);
				}
				if(magnitud.charAt(0) == 'T'){
					magnitud = magnitud.substring(2, magnitud.length());
					tiempo = Integer.parseInt(magnitud);
				}
				if(magnitud.charAt(0) == 'V'){
					magnitud = magnitud.substring(2, magnitud.length());
					velocidad = Integer.parseInt(magnitud);
				}
			}
			if(desplazamiento == 0){
				desplazamiento = velocidad * tiempo;
				System.out.println("D=" + desplazamiento);
			}
			if(tiempo == 0){
				tiempo = desplazamiento / velocidad;
				System.out.println("T=" + tiempo);
			}
			if(velocidad == 0){
				velocidad = desplazamiento / tiempo;
				System.out.println("V=" + velocidad);
			}
		}
    }
}