package examenes;


import java.util.Scanner;

public class ExamenEjercicio4 {

    public static void main(String[] args) {
        /*
        Rectángulo de asteriscos
         */
        int a, b;
        int i = 0;
        int j;
        Scanner scan;
        System.out.println("Introduce el largo y alto del rectángulo:");
        scan = new Scanner(System.in);
        a = scan.nextInt();
        b = scan.nextInt();
        
        // BUCLES WHILE

        while (i < b) {
            j = 0;
            while (j < a) {
                if (i > 0 && i < b - 1 && j > 0 && j < a) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
                j++;
            }
            System.out.println("*");
            i++;
        }

        // BUCLES DO-WHILE
        do {
            j = 0;
            do {
                if (i > 1 && i < b && j > 0 && j < a) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
                j++;
            }while (j < a);
            System.out.println("*");
            i--;
        }while(i > 0); 
    }
}
