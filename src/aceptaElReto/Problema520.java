/**
 * 
 */
package aceptaElReto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author Pablo Bermejo
 * Dónde está la bolita?
 */
public class Problema520 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int c, p;
		int p1, p2;
		ArrayList<Integer> cubiletes;
		
		do {
			c = scan.nextInt();
			p = scan.nextInt();
			if(c == 0 && p == 0) {
				break;
			}
			cubiletes = new ArrayList<Integer>();
			for (int i = 0; i < c; i++) {
				cubiletes.add(0);
			}
			cubiletes.set(p - 1, 1);
			do {
				p1 = scan.nextInt();
				p2 = scan.nextInt();
				if(p1 == 0 && p2 == 0) {
					break;
				}
				Collections.swap(cubiletes, p1 - 1, p2 - 1);
			} while(p1 > 0 && p2 > 0);
			System.out.println(cubiletes.indexOf(1) + 1);			
			
		} while(c > 0 && p > 0);

	}

}
