package objetos;

public class Ejercicio105 {
    public static void main(String[] args){
        
        Atleta luis;
        
        luis = new Atleta();
        luis.altura = 145.34;
        luis.edad = 13;
        luis.nif = "111111111S";
        luis.nombre = "Luis";
        luis.peso = 34.45;
        
        luis.visualiza();
    }
}
