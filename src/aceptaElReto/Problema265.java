package aceptaElReto;

import java.util.Scanner;

public class Problema265 {
    public static void main(String[] args) {
        /*
        El día de Navidad
        */
        String texto;
		int suma;
        
        Scanner scan;
        scan = new Scanner(System.in);
		do{
			suma = 0;
			texto = scan.nextLine();
			if(Integer.parseInt(texto) < 1){
				break;
			}
			for(int i = 0; i <= texto.length() - 1; i++){
				suma += Integer.parseInt(texto.substring(i, texto.length()));
			}
			System.out.println(suma);
		}while(!texto.equals("0"));
    }
}