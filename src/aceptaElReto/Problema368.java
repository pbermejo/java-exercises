package aceptaElReto;

import java.util.Scanner;

public class Problema368 {
    public static void main(String[] args) {
        /*
        CCOCIENDO HUEVOS
        */
        int h, c;
        
        Scanner scan;
        scan = new Scanner(System.in);
        h = scan.nextInt();
        c = scan.nextInt();
        
        while(h > 0){
            if (h / c > 0) {
                if(h % c > 0){
                    System.out.println(10 * (1 + (h / c)));
                }else{
                    System.out.println(10 * (h / c));
                }
            }else{
                System.out.println(10);
            }
            h = scan.nextInt();
            c = scan.nextInt();
        }
    }
}