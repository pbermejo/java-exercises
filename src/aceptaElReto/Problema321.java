package aceptaElReto;

import java.util.Scanner;

public class Problema321 {	

    public static void main(String[] args) {
        /*
        Double decker
        */
    	Scanner scan = new Scanner(System.in);
    	int n;
        int m;
        int autobuses;
        autobuses = scan.nextInt();
        for (int i = 0; i < autobuses; i++) {
            n = scan.nextInt();
            m = scan.nextInt();
            System.out.println(((n + m + 1) * (n + m) / 2) + 1 + n);
       }
    }
}