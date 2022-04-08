package aceptaElReto;

import java.util.Scanner;

public class Problema485 {
    public static void main(String[] args) {
        /*
        Senda pirenaica
        */
        int etapas;
        int[] distancias;
        int distanciaTotal;
        int distanciaRecorrida;
        String str;
        String[] strDist;
        Scanner scan;
        scan = new Scanner(System.in);

    	etapas = scan.nextInt();
        while(etapas > 0) {
        	distanciaTotal = 0;
        	distanciaRecorrida = 0;
        	str = scan.nextLine();
        	str = scan.nextLine();
        	strDist = str.split(" ");
        	distancias = new int[strDist.length];
        	for (int i = 0; i < distancias.length; i++) {
        		distancias[i] = Integer.parseInt(strDist[i]);
        		distanciaTotal += distancias[i];
        	}
        	for (int i = 0; i < distancias.length; i++) {
        		System.out.print(distanciaTotal - distanciaRecorrida);
        		distanciaRecorrida += distancias[i];
        		if(i < distancias.length - 1){
        			System.out.print(" ");
        		}
        	}
        	System.out.println("");
        	etapas = scan.nextInt();
        }
    }
}