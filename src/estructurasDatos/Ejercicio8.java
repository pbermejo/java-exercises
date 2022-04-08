package estructurasDatos;
import java.util.Random;

public class Ejercicio8 {
    public static void main(String[] args) {
        int[] array1 = new int[20];
        int[] array2 = new int[20];
        int[] arraySuma = new int[20];
        Random aleat = new Random(); 
        
        for (int i = 0; i < arraySuma.length; i++) {
            array1[i] = aleat.nextInt(10) + 1;
            array2[i] = aleat.nextInt(10) + 1;
            arraySuma[i] = array1[i] + array2[i];
        }
        System.out.print("Array 1: ");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i]);
            if(i < array1.length){
                System.out.print(", ");
            }
        }
        System.out.println("");
        System.out.print("Array 2: ");
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i]);
            if(i < array2.length){
                System.out.print(", ");
            }
        }
        System.out.println("");
        System.out.print("Resultado: ");
        for (int i = 0; i < arraySuma.length; i++) {
            System.out.print(arraySuma[i]);
            if(i < arraySuma.length){
                System.out.print(", ");
            }
        }
        System.out.println("");
    }
}
