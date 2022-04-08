package objetos;

public class SecNumeros {
    private int numero;
    
    public SecNumeros() {
        this.numero = 22;
    }

    public SecNumeros(int numero) {
        this.numero = numero;
    }
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public int longitudCiclo(){
        int nuevoNumero = numero;
        int longitud = 0;
        
        while(nuevoNumero != 1){
            if(nuevoNumero % 2 == 0){
                nuevoNumero = nuevoNumero / 2;
            }else{
                nuevoNumero = 3 * nuevoNumero + 1;
            }
            longitud++;
        }
        return longitud;
    }
    
    public void escribeSecuencia(){
        int nuevoNumero = numero;
        
        System.out.print(nuevoNumero);
        while(nuevoNumero != 1){
            if(nuevoNumero % 2 == 0){
                nuevoNumero = nuevoNumero / 2;
            }else{
                nuevoNumero = 3 * nuevoNumero + 1;
            }
            System.out.print(", ");
            System.out.print(nuevoNumero);
        }
        System.out.println("");
    }
}
