package ejercicios;

import static java.lang.Character.isDigit;
import java.util.Scanner;
import java.lang.Character;

public class Ejercicio51 {
    public static void main(String[] args) {
        /*
        Leer fechas
        */
        
        String date;
        String num;
        int day = 0;
        int month;
        int year;
        int separador;
        boolean fechaCorrecta = true;
        boolean formatoCorrecto = true;
        
        Scanner scan;
        System.out.println("Introduce una fecha:");
        scan = new Scanner(System.in);
        date = scan.nextLine();
        
        // Validación de formato correcto        
        if(date.length() != 10 
                || date.charAt(2) != '/' 
                || date.charAt(5) != '/' 
                || !Character.isDigit(date.charAt(0))
                || !Character.isDigit(date.charAt(1))
                || !Character.isDigit(date.charAt(3))
                || !Character.isDigit(date.charAt(4))
                || !Character.isDigit(date.charAt(6))
                || !Character.isDigit(date.charAt(7))
                || !Character.isDigit(date.charAt(8))
                || !Character.isDigit(date.charAt(9))
                )
        {
             formatoCorrecto = false;
        }
        
        
        if(formatoCorrecto){
            System.out.println("El formato es correcto");
        }else{
            System.out.println("Formato incorrecto: El formato debe ser \"dd/mm/aaaa\"");
        }
        
        // Parseo de fecha
        separador = date.indexOf("/");
        
        num = date.substring(0, separador);
        day = Integer.parseInt(num);
        
        num = date.substring(separador + 1, date.indexOf("/", separador + 1));   
        month = Integer.parseInt(num);
        
        separador =  date.indexOf("/", separador + 1);
        num = date.substring(separador + 1, date.length());
        year = Integer.parseInt(num);
        
        
        // Validación de fecha correcta
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