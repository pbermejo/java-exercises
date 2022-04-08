package ejercicios;

import java.util.Scanner;

public class Ejercicio38 {
    public static void main(String[] args) {
        /*
        LEER NÚMEROS HASTA INTRODUCIR -1 Y MOSTRAR EL MAYOR
        */
        int cont = 0, num, mayor;
        Scanner scan;
        scan = new Scanner(System.in);
        System.out.println("Introduzca un número: ");
        num = scan.nextInt();
        mayor = num;
        while (num != -1){
            num = scan.nextInt();
            if(num > mayor){
                mayor = num;
            }
            cont++;
        }
        System.out.println("El mayor de los números introducidos es: " + mayor);
    }
}