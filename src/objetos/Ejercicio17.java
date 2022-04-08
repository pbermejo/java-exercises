package objetos;
import java.util.Random;

public class Ejercicio17 {
    public static void main(String[] args) {
        SecNumeros secuencia[] = new SecNumeros[100];
        Random aleat = new Random();
        int azar;
        for (int i = 0; i < secuencia.length; i++) {
            azar = aleat.nextInt(1000) + 1;
            secuencia[i] = new SecNumeros(azar);
            System.out.println("Objeto " + i + ":");
            System.out.println("n = " + azar);
            System.out.println("Longitud de la secuencia: " + secuencia[i].longitudCiclo() + "\n");
        }
    }
}