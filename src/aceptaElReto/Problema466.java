package aceptaElReto;

import java.util.Scanner;

public class Problema466 {

	public static void main(String[] args) {
		/**
		 * Multiplicando mal
		 */
		int casos;
		String entrada;
		StringBuilder num1;
		StringBuilder num2;
		StringBuilder resultado;
		int multiplicaPosicion;
		int resto;
		int resultadoPosicion;
		int difCaracteres;
		
		Scanner scan = new Scanner(System.in);
		casos = scan.nextInt();
		scan.nextLine();
		
		for (int i = 0; i < casos; i++) {
			entrada = scan.nextLine();
			
			/**
			 *  Lee como cadena,
			 *  parte en 2 números
			 *  Invierte el orden de los caracteres
			 */
			num1 = new StringBuilder();
			num1.append(entrada.substring(0, entrada.indexOf(" ")));
			num1 = num1.reverse();
			
			num2 = new StringBuilder();
			num2.append(entrada.substring(entrada.indexOf(" ") + 1, entrada.length()));
			num2 = num2.reverse();
			
			
			/**
			 *  Añade tantos ceros como la diferencia 
			 *  de caracteres de cada número
			 */
			difCaracteres = Math.abs(num1.length() - num2.length());
			for (int j = 0; j < difCaracteres; j++) {
				if(num1.length() < num2.length()) {
					num1.append("0");
				}
				if(num1.length() > num2.length()) {
					num2.append("0");
				}
			}
			
			/**
			 *  Opera los números:
			 *  Multiplica los números de cada posición
			 *  Lleva la cuenta de cada multiplicación
			 *  y añade el resto a la multiplicación siguiente
			 */
			resultado = new StringBuilder();
			resto = 0;
			for (int j = 0; j < num1.length(); j++) {
				multiplicaPosicion = Integer.valueOf(Character.toString(num1.charAt(j))) * Integer.valueOf(Character.toString(num2.charAt(j)));
				multiplicaPosicion += resto;
				resto = multiplicaPosicion / 10;
				resultadoPosicion = multiplicaPosicion % 10;
				resultado.append(Integer.toString(resultadoPosicion));
			}
			/**
			 * Si quedase un resto de la operación anterior 
			 * se le añade a la cadena
			 */
			if(resto > 0) {
				resultado.append(Integer.toString(resto));
			}
			
			/**
			 * Se invierte el orden de la cadena de nuevo 
			 * y se muestra en consola
			 */
			System.out.println(resultado.reverse());
		}
	}

}
