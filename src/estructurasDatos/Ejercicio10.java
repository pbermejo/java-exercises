package estructurasDatos;
import java.util.Random;

public class Ejercicio10 {
    public static void main(String[] args) {
        int[] numeros = new int[50];
        int[] calculos = new int[4];
        int menor;
        int mayor;
        int suma = 0;
        double media;
        Random aleat = new Random();
        
        // Asigno valores a numeros[]
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = aleat.nextInt(60) + 20;
            calculos[2] += numeros[i];
        }
        calculos[0] = numeros[0];
        calculos[1] = numeros[0];
        
        // Leo valores de numeros[] y asigno el resultado de los cálgulos a calculos[]
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
            if(calculos[0] > numeros[i]){
                calculos[0] = numeros[i];
            }
            if(calculos[1] < numeros[i]){
                calculos[1] = numeros[i];
            }
        }
        calculos[3] = calculos[2] / numeros.length;
        
        // Muestro valores de numeros[] y calculos[]
        System.out.println("Números:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println("");
        System.out.println("Cálculos:");
        for (int i = 0; i < calculos.length; i++) {
            System.out.print(calculos[i] + " ");
        }
        System.out.println("");
    }
}
