package estructurasDatos;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Ejercicio20 {
    public static void main(String[] args) {
    	int[] randomArray = new int[100];
        Integer[] masRepetido = new Integer[100];
        Random aleat = new Random();
        
        for (int i = 0; i < randomArray.length; i++) {
        	randomArray[i] = (aleat.nextInt(100));			
		}
        
        Arrays.fill(masRepetido, 0);
        for (int i : randomArray) {
        	masRepetido[randomArray[i]]++;
        }
        Arrays.sort(masRepetido, Collections.reverseOrder());
        System.out.println(masRepetido[0]);
    }
}