package ejercicios;

import java.util.Scanner;

public class Ejercicio30 {
    public static void main(String[] args) {
        /*
        COMPROBAR FECHAS
        */
        int day, month, year;
        boolean fechaCorrecta = true;
        Scanner scan;
        
        scan = new Scanner(System.in);
        day = scan.nextInt();
        month = scan.nextInt();
        year = scan.nextInt();
        
        if(year < 0){
            System.out.println("Fecha incorrecta: El año debe ser mayor que 0");
            fechaCorrecta = false;
        }
        switch(month){
            case 4:
            case 6:
            case 9:
            case 11:
                if (day < 1 || day > 30) {
                    System.out.println("Fecha incorrecta: El día debe estar comprendido entre 1 y 30");
                    fechaCorrecta = false;
                }
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if (day < 0 || day > 31) {
                    System.out.println("Fecha incorrecta: El día debe estar comprendido entre 1 y 31");
                    fechaCorrecta = false;
                }
                break;
            case 2:
                // COMPRUEBO SI ES BISIESTO
                if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0 && day > 29 || day < 0){
                    System.out.println("Fecha incorrecta: El día debe estar comprendido entre 1 y 29");
                    fechaCorrecta = false;
                }
                if(year % 4 > 0 && day > 28 || day < 0){
                    System.out.println("Fecha incorrecta: El día debe estar comprendido entre 1 y 28");
                    fechaCorrecta = false;
                }
                break;
            default:
                System.out.println("Fecha incorrecta: El mes debe estar comprendido entre 1 y 12");
                fechaCorrecta = false;
        }
        if(fechaCorrecta){
            System.out.println("La fecha es correcta");
        }  
    }
}