package ejercicios;

public class Ejercicio33 {
    public static void main(String[] args) {
        /*
        CALCULAR LA MEDIA DE LOS PRIMEROS 30 NÚMEROS NATURALES
        */
        double suma = 0;
        int cont = 0;
        while (cont <= 30) {
            suma += cont++;
        }
        System.out.println(suma / (cont - 1));
    }
}