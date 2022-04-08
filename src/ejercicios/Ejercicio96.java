package ejercicios;

import java.util.Random;
public class Ejercicio96 {
    public static void main(String[] args) {
        /*
        Lotería primitiva
        */
        Random aleat = new Random();
        int n1, n2, n3, n4, n5, n6;
        
        n1 = aleat.nextInt(49) + 1;
        
        do{
            n2 = aleat.nextInt(49) + 1;
        }while(n2 == n1);
        
        do{
            n3 = aleat.nextInt(49) + 1;
        }while(n3 == n1 || n3 == n2);
        
        do{
            n4 = aleat.nextInt(49) + 1;
        }while(n4 == n1 || n4 == n2 || n4 == n3);
        
        do{
            n5 = aleat.nextInt(49) + 1;
        }while(n5 == n1 || n5 == n2 || n5 == n3 || n5 == n4);
        
        do{
            n6 = aleat.nextInt(49) + 1;
        }while(n6 == n1 || n6 == n2 || n6 == n3 || n6 == n4 || n6 == n5);
        
        System.out.print("Combinación de la primitiva: ");
        System.out.println(n1 + ", " + n2 + ", " + n3 + ", " + n4 + ", " + n5 + ", " + n6);
        System.out.print("Número complementario: ");
        System.out.println(aleat.nextInt(49) + 1);
        System.out.print("Reintegro: ");
        System.out.println(aleat.nextInt(9) + 1);
    }
}