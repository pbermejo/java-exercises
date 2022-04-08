/**
 * 
 */
package aceptaElReto;

import java.util.Scanner;

/**
 * @author Pablo Bermejo
 *
 */
public class Problema256 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String entrada;
		String a, b, c;
		String resultado;
		int mayorLongitud = 0;
		boolean exito;
		
		do {
			a = scan.next();
			b = scan.next();
			c = scan.next();
			
			/**
			 * Iguala longitudes
			 */
			if(a.length() >= b.length() && a.length() >= c.length()) {
				mayorLongitud = a.length();
			}else if(b.length() >= a.length() && b.length() >= c.length()) {
				mayorLongitud = b.length();
			}else{
				mayorLongitud = c.length();
			}
			
			while(a.length() < mayorLongitud) {
				a = "0" + a;
			}
			while(b.length() < mayorLongitud) {
				b = "0" + b;
			}
			while(c.length() < mayorLongitud) {
				c = "0" + c;
			}
			
			/**
			 * Compara dígitos:
			 * De cada dígito por lo menos tiene que haber 2 iguales
			 */
			resultado = "";
			exito = true;
			for (int i = 0; i < mayorLongitud; i++) {				
				if(
						Character.toString(a.charAt(i)).equals(Character.toString(b.charAt(i))) || 
						Character.toString(a.charAt(i)).equals(Character.toString(c.charAt(i)))) {
					resultado += Character.toString(a.charAt(i));
				}else if(Character.toString(b.charAt(i)).equals(Character.toString(c.charAt(i)))){
					resultado += Character.toString(b.charAt(i));
				}else {
					exito = false;
					break;
				}
			}
			
			if(exito) {
				System.out.println(Integer.parseInt(resultado));
			}else {
				System.out.println("RUIDO COSMICO");				
			}
		} while (scan.hasNext());
	}
}
