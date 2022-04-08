package estructurasDatos;
import java.util.Scanner;
import java.util.Random;

public class Ejercicio3 {
    public static void main(String[] args) {
        int pos;
        int[] arrNum = new int[10];
        Scanner scan = new Scanner(System.in); 
        Random aleat = new Random();
        
        for (int i = 0; i < arrNum.length; i++) {
            arrNum[i] = aleat.nextInt(99);
        }
        
        System.out.println("Escribe un número entre 1 y 10");
        pos = scan.nextInt();
        System.out.println("El número en la posición " + pos + " es: " + arrNum[pos]);
    }
}
