package ejercicios;

import java.util.Scanner;

public class Ejercicio41 {
    public static void main(String[] args) {
        /*
        MOSTRAR MAYOR Y MENOR DE ENTEROS POSITIVOS INTRODUCIDOS
        */
        int num;
        int menor = 0;
        int mayor = 0;
        int cont = 1;
        int casos;
        
        Scanner scan;
        scan = new Scanner(System.in);
        System.out.println("Introduzca cuántos números se leerán:");
        casos = scan.nextInt();
        System.out.println("Introduzca " + casos + " números:");
        while(cont <= casos){
            num = scan.nextInt();
            if(cont == 1){
                menor = num;
            }
            if(num >= 0){
                if(num > mayor){
                    mayor = num;
                }
                if (num < menor) {
                    System.out.println(menor);
                    menor = num;
                }
                cont++;
            }else{
                System.out.println("Error: no se admiten números negativos. Introduce otro entero positivo:");
            }
        }
        
        System.out.println("Mayor: " + mayor);
        System.out.println("Menor: " + menor);
    }
}