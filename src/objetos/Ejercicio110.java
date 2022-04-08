package objetos;

public class Ejercicio110 {
    public static void main(String[] args) {
        Portatil pc1 = new Portatil();
        Portatil pc2 = new Portatil();
        pc1.setMarca("Asusito");
        pc2.setMarca("Nisupu");
        
        pc1.visualiza();
        System.out.println(".................");
        pc2.visualiza();
    }
}