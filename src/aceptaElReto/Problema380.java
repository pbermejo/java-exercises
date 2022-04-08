package aceptaElReto;

import java.util.Scanner;

public class Problema380 {	

    public static void main(String[] args) {
        /*
        ¡Me caso!
        */
    	Scanner scan = new Scanner(System.in);
    	int gastos;
        int importe;
        int suma;
        gastos = scan.nextInt();
        while (gastos > 0){
            suma = 0;
            for (int i = 0; i < gastos; i++) {
                importe = scan.nextInt();
                suma += importe;
            }
            System.out.println(suma);
            gastos = scan.nextInt();
        }        
    }
}