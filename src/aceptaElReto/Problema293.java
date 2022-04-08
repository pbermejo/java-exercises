package aceptaElReto;

import java.util.Scanner;

public class Problema293 {
    public static void main(String[] args) {
        /*
        ARTRÓPODOS
        */
        int casos, numInsectos, numAracnidos, numCrustaceos, numEscolopendras, numAnillos;
        Scanner scan;
        scan = new Scanner(System.in);
        casos = scan.nextInt();
        numInsectos = scan.nextInt();
        numAracnidos = scan.nextInt();
        numCrustaceos = scan.nextInt();
        numEscolopendras = scan.nextInt();
        numAnillos = scan.nextInt();
        for (int i = 0; i < casos; i++){
            System.out.println(6 * numInsectos + 8 * numAracnidos + 10 * numCrustaceos + 2 * numAnillos * numEscolopendras);            
            numInsectos = scan.nextInt();
            numAracnidos = scan.nextInt();
            numCrustaceos = scan.nextInt();
            numEscolopendras = scan.nextInt();
            numAnillos = scan.nextInt();            
        }
    }
}