package aceptaElReto;

import java.util.Scanner;

public class Problema310 {	

    public static void main(String[] args) {
        /*
        Altura de un Arbol general
        */
    	Scanner scan = new Scanner(System.in);
    	int altura = 0;
    	String entrada;
    	String[] numStr;
    	int[] arbol;
    	
    	// Leo entrada y la convierto a array de enteros
    	entrada = scan.nextLine();
    	numStr = entrada.split(" ");
    	arbol = new int[numStr.length];
    	for (int i = 0; i < arbol.length; i++) {
			arbol[i] = Integer.parseInt(numStr[i]);
		}
    	
    	for (int i = 0; i < arbol.length; i++) {
			System.out.print(arbol[i] + "\t");
		}
    }
}