package objetos;
import libros.Isbn;

public class Ejercicio14 {
    public static void main(String[] args) {
        Isbn num = new Isbn();

        System.out.println(num.esValido("654-5-52189-6"));
        System.out.println(num.esValido("84-226-1586-X"));
        System.out.println(num.esValido("84-226-1586-J"));
        System.out.println(num.esValido("84--226-1586-X"));
        System.out.println(num.esValido("84-226-158-6X"));
        System.out.println(num.esValido("84-226-1586-0"));
        System.out.println(num.esValido("84-226-1586"));
        System.out.println(num.esValido("no-valido-1-X"));
    }
}
