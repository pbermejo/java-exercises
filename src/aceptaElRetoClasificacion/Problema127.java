package aceptaElRetoClasificacion;

import java.util.ArrayList;
import java.util.Scanner;

public class Problema127 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int casos;
		int camas;
		int palabras;
		int descarte;
		String linea;
		ArrayList <String> nombres;
		ArrayList <String> nombresAux;
		
		casos = scan.nextInt();
		scan.nextLine();
		
		for (int i = 0; i < casos; i++) {
			/**
			 * Lee la entrada
			 */
			linea = scan.nextLine();
			
			/**
			 * Procesa la entrada y genera un array con los datos
			 * Extrae los datos de palabras y camas
			 */
			String[] lineaProcesada = linea.split(" ");			
			palabras = Integer.parseInt(lineaProcesada[lineaProcesada.length - 1]);
			camas = Integer.parseInt(lineaProcesada[lineaProcesada.length - 2]);
			
			if(camas == 0) {
				System.out.println("NADIE TIENE CAMA");
				continue;
			}
			
			/**
			 * Genera un array de nombres
			 */
			nombres = new ArrayList<String>();			
			for (String nombre : lineaProcesada) {
				if(nombre.equals("F")) {
					break;
				}
				nombres.add(nombre);
			}
			
			if(camas == nombres.size()) {
				System.out.println("TODOS TIENEN CAMA");
				continue;
			}
			
			/**
			 * Procesa los nombres para hacer los descartes
			 */
			nombresAux = new ArrayList<String>();
			while(nombres.size() > camas) {
				
				/**
				 * Selecciona el elemento a descartar
				 */
				if(palabras % nombres.size() > 0) {
					descarte = palabras % nombres.size() - 1;
				}else {
					descarte = palabras - 1;
				}
				nombres.remove(descarte);
				if(nombres.size() == camas) {
					break;
				}
				/**
				 * Reordena el array de nombres empezando por el siguiente nombre al descartado
				 */
				for (int j = descarte; j < nombres.size(); j++) {
					nombresAux.add(nombres.get(j));
				}
				for (int j = 0; j < descarte; j++) {
					nombresAux.add(nombres.get(j));
				}
				nombres.clear();
				for(String nombre : nombresAux) {
					nombres.add(nombre);
				}
				nombresAux.clear();
			}
			String resultado = "";
			for (String nombre : nombres) {
				resultado += nombre;
				resultado += " ";
			}
			resultado = resultado.trim();
			System.out.println(resultado);
		}

	}

}
