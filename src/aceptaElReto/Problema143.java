/**
 * 
 */
package aceptaElReto;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

/**
 * @author Pablo Bermejo Tortitas
 */
public class Problema143 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> espatula = new ArrayList<Integer>();
		Stack<Integer> plato = new Stack<Integer>();
		String volteosDatos;
		int tortita;
		int volteos;
		int vuelta;
		do {
			/**
			 * Si hay tortitas
			 */
			do {
				tortita = scan.nextInt();
				if (tortita < 1) {
					break;
				}

				/**
				 * Amontona tortitas en el montón
				 */
				plato.add(tortita);
			
			} while (tortita > 0);
			/**
			 * Si hay volteos, voltea las tortitas
			 */
			volteos = scan.nextInt();
			for (int i = 0; i < volteos; i++) {
				
				vuelta = scan.nextInt();
				vuelta = plato.size() - vuelta;
				
				/**
				 * Pasa las tortitas del plato a la espatula
				 */
				
				while(plato.size() > vuelta) {
					espatula.add(plato.pop());
				}
				
				/**
				 * Pasa las tortitas de la espatula al plato
				 */
				for (int j = 0; j < espatula.size(); j++) {
					plato.add(espatula.get(j));					
				}
			}
			
			/**
			 * Muestra el tamaño de la última tortita del plato
			 */
			if(plato.empty()) {
				break;
			}
			System.out.println(plato.pop());
			plato.clear();
			espatula.clear();
			
		} while (tortita != 0);
	}
}
