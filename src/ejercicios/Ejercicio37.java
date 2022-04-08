package ejercicios;

import java.util.Scanner;

public class Ejercicio37 {
    public static void main(String[] args) {
        /*
        LEER 10 NÚMEROS Y MOSTRAR EL MAYOR
        */
        int cont = 0, num, mayor;
        Scanner scan;
        scan = new Scanner(System.in);
        System.out.println("Introduzca un número: ");
        num = scan.nextInt();
        mayor = num;
        while (cont < 4){
            num = scan.nextInt();
            if(num > mayor){
                mayor = num;
            }
            cont++;
        }
        System.out.println("El mayor de los números introducidos es: " + mayor);
    }
}