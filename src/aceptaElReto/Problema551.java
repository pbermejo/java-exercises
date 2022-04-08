/**
 * 
 */
package aceptaElReto;

import java.util.Scanner;

/**
 * @author Pablo Bermejo
 * Mensaje secreto
 */
public class Problema551 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scan =  new Scanner(System.in);
		String entrada;
		String c;
		int num;
		
		while(scan.hasNext()) {
			entrada = scan.nextLine();
			num = 0;
	        
			for (int i = 0; i < entrada.length(); i++) {	 
	            
	            num = num * 10 + (entrada.charAt(i) - '0');	 
	            
	            if (num >= 32 && num <= 122) { 	                
	                char ch = (char)num;
	                System.out.print(ch);
	                num = 0;
	            }
	        }
			System.out.println();
		}
	}

}
