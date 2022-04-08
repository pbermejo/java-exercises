package estructurasDatos;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        int num;
        int[] arrNum = new int[100];
        Scanner scan = new Scanner(System.in); 
        
        num = scan.nextInt();
        for (int i = 0; i < arrNum.length; i++) {
            arrNum[i] = num;
        }
        for (int i = 0; i < arrNum.length; i++) {
            System.out.println("Número en la posición " + i + ": " + arrNum[i]);
        }
    }
}
