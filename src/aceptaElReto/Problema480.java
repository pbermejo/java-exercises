package aceptaElReto;

import java.util.Scanner;

public class Problema480 {
    public static void main(String[] args) {
        /*
        ¿Cuántas pido?
        */
        int casos;
        int N;
        int A;
        int B;
        int resto;
        
        Scanner scan;
        scan = new Scanner(System.in);
        casos = scan.nextInt();
        for (int i = 0; i < casos; i++){  
            N = scan.nextInt();
            A = scan.nextInt();
            B = scan.nextInt();
            resto = N % B;
            if(resto > A){
                System.out.println(N / B * A + A);
            }else{
                System.out.println(N / B * A + resto);
            }
        }
    }
}