/**
 * 
 */
package ExUd3Estructuras;

import java.util.Scanner;

/**
 * @author Pablo Bermejo
 *
 */
public class Ejercicio1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String cadenaAnalizar;
		String cadenaBuscar;
		int[] contadores;
		
		System.out.println("Introduce la cadena a estudiar: ");
		cadenaAnalizar = scan.nextLine();
		
		System.out.println("Introduce la cadena con los caracteres a contar: ");
		cadenaBuscar = scan.nextLine();
		
		/**
		 * Depura la entrada eliminando posibles espacios
		 */
		cadenaAnalizar = cadenaAnalizar.replace(" ", "");
		cadenaBuscar = cadenaBuscar.replace(" ", "");
		
		/**
		 * Guarda contadores de cada caracter buscado
		 */
		contadores = new int[cadenaBuscar.length()];
		
		for (int i = 0; i < cadenaBuscar.length(); i++) {
			for (int j = 0; j < cadenaAnalizar.length(); j++) {
				String letraBuscar = Character.toString(cadenaBuscar.charAt(i)).toLowerCase();
				String letraAnalizar = Character.toString(cadenaAnalizar.charAt(j)).toLowerCase();
				
				if(letraBuscar.equals(letraAnalizar)) {
					contadores[i]++;
				}
			}
		}
		
		/**
		 * Muestra el resultado por cada cara caracter
		 */		
		for (int i = 0; i < cadenaBuscar.length(); i++) {
			String veces;
			if(contadores[i] > 1) {
				System.out.println("El carácter " + cadenaBuscar.charAt(i) + " aparece " + contadores[i] + " veces");
			}else if(contadores[i] == 1) {
				System.out.println("El carácter " + cadenaBuscar.charAt(i) + " aparece " + contadores[i] + " vez");
			}else {
				System.out.println("El carácter no aparece");				
			}
		}
	}

}
