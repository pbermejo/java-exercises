package aceptaElReto;

import java.util.Scanner;

public class Problema375 {

    public static void main(String[] args) {
        /*
        Pistas de aterrizaje
         */
        String pista;
        int numPista;
        String orientacion;
        String posicionPista;
        Scanner scan;
        scan = new Scanner(System.in);
        while (scan.hasNext()) {
            pista = scan.nextLine();
            numPista = Integer.parseInt(pista.substring(0, 2));
            if (numPista > 36 || numPista < 1) {
                break;
            }
            if (numPista <= 18) {
                numPista += 18;
            } else {
                numPista -= 18;
            }
            orientacion = "";
            orientacion = Integer.toString(numPista);
            if (numPista < 10) {
                orientacion = "0" + Integer.toString(numPista);
            }
            posicionPista = "";
            if (pista.length() > 2) {
                posicionPista = pista.substring(2, 3);
            }
            if (posicionPista.equals("R")) {
                posicionPista = "L";
            } else if (posicionPista.equals("L")) {
                posicionPista = "R";
            }

            System.out.println(orientacion + posicionPista);
        }
    }
}
