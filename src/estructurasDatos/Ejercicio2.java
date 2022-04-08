package estructurasDatos;

public class Ejercicio2 {
    public static void main(String[] args) {
        int[] arrNum = new int[10];
        
        for (int i = 0; i < arrNum.length; i++) {
            arrNum[i] = 10 * (i + 1);
        }
        for (int i = 0; i < arrNum.length; i++) {
            System.out.println("Ascendente, posición " + i + ": " + arrNum[i]);
        }
        for (int i = arrNum.length - 1; i >= 0; i--) {
            System.out.println("Descendente, posición " + i + ": " + arrNum[i]);
        }
    }
}
