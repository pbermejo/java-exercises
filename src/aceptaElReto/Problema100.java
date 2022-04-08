package aceptaElReto;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Problema100 {

	public static void main(String[] args) {
		/**
		 * Constante de Kaprekar
		 */
		int casos;
		boolean isRepDigit = true;
		Integer[] digitos;
		String entrada;
		int numDesc;
		String reversa;
		int numAsc;
		int iteraciones;
		
		Scanner scan = new Scanner(System.in);
		casos = scan.nextInt();
		scan.nextLine();
		digitos = new Integer[4];
		
		for (int i = 0; i < casos; i++) {
			iteraciones = 0;
			entrada = scan.nextLine();
			
			// Si es la constante de Kaprekar,
			// asigna valor de iteraciones y 
			// continúa al siguiente caso
			
			if(entrada.equals("6174")) {
				iteraciones = 0;
			}
			
			// Opera mientras sea distinto 
			// de la constante de Kaprekar
			
			while(!entrada.equals("6174")) {

				// Rellena el array con 0
				// Inserta los números de la entrada 
				// en las últimas posiciones
				
				Arrays.fill(digitos, 0);
				while(entrada.length() < 4) {
					entrada = "0" + entrada;
				}
				for (int j = digitos.length - 1; j >= 0; j--) {
					digitos[j] = Integer.parseInt(Character.toString(entrada.charAt(j)));
				}
				
				// Si es repdigit, 
				// asigna valor de iteraciones y 
				// continúa al siguiente caso
				
				isRepDigit = true;
				for (int j = 1; j < entrada.length(); j++) {
					if(entrada.charAt(j) != entrada.charAt(j - 1)) {
						isRepDigit = false;
						break;
					}
				}
				if(isRepDigit) {
					iteraciones = 8;
					break;
				}
				
				// Prepara las variables de cadena 
				// para concatenarle los dígitos
				
				entrada = "";
				reversa = "";
				
				// Ordena el array y 
				// concatena valores en la variable de cadena
				
				Arrays.sort(digitos);
				for (int j = 0; j < digitos.length; j++) {
					entrada += Integer.toString(digitos[j]);
				}
				numDesc = Integer.parseInt(entrada);
				
				// Ordena el array descendente y 
				// concatena valores en la variable de cadena
				
				Arrays.sort(digitos, Collections.reverseOrder());
				for (int j = 0; j < digitos.length; j++) {
					reversa += Integer.toString(digitos[j]);
				}
				numAsc = Integer.parseInt(reversa);
				
				// Opera y 
				// obtiene la diferencia entre el mayor y el menor
				
				entrada = Integer.toString(Math.abs(numDesc - numAsc));
				iteraciones++;
			}
			System.out.println(iteraciones);
		}
	}

}
