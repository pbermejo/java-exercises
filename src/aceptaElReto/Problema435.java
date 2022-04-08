package aceptaElReto;

import java.util.Scanner;

/*
El Pijote
*/
public class Problema435 {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        String entrada;
        int mayor;
        boolean esSubnormal;
        Scanner scan = new Scanner(System.in);            
        
        while(scan.hasNext()){
            entrada = scan.next();
            esSubnormal = true;
            mayor = 0;
            // Relleno numeros[] con 0
            for (int i = 0; i < numeros.length; i++) {
                numeros[i] = 0;
            }
            // Hago el contador de cada cifra
            for (int i = 0; i < entrada.length(); i++) {
                numeros[Integer.parseInt(String.valueOf(entrada.charAt(i)))]++;
            }
            // Hallo el mayor de los contadores
            for (int i = 0; i < numeros.length; i++) {
                if(numeros[i] != mayor){
                    mayor = numeros[i];
                }
            }
            // Compruebo si hay algún contador diferente del mayor de ellos
            for (int i = 0; i < numeros.length; i++) {
                if(numeros[i] == 0 || numeros[i] != mayor){
                    esSubnormal = false;
                    break;
                }
            }
            if(esSubnormal){
                System.out.println("subnormal");
            }else{
                System.out.println("no subnormal");
            }
        }
    }
}