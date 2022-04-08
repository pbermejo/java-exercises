package estructurasDatos;
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        long[] fibonacci;
        int n;
        Scanner scan = new Scanner(System.in);
        
        do{
            System.out.println("Introduce un número:");
            n = scan.nextInt();
            if(n >= 0){
                fibonacci = new long[n];
                System.out.println("Fibonacci de " + n + ": ");
                for (int i = 0; i < n; i++) {
                    if(i < 2){
                        fibonacci[i] = i;
                    }else{
                        fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];                
                    }
                    System.out.println(fibonacci[i]);
                }            
            }
        }while(n < 0);
    }
}
