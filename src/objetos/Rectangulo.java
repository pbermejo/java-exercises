package objetos;

public class Rectangulo {
    private float largo;
    private float alto;

    public Rectangulo() {
    }
    
    public Rectangulo(float largo, float alto) {
        this.largo = largo;
        this.alto = alto;
    }
    
    // Getters y Setters
    public float getLargo() {
        return largo;
    }

    public void setLargo(float largo) {
        this.largo = largo;
    }

    public float getAlto() {
        return alto;
    }

    public void setAlto(float alto) {
        this.alto = alto;
    }
    
    // Métodos
    public float perimetro(){
        float perimetro;
        perimetro = 2 * largo + 2 * alto;
        return perimetro;
    }
    public float superficie(){
        float superficie;
        superficie = largo * alto;
        return superficie;
    }
    public void visualiza(){
        System.out.println("Largo: " + largo);
        System.out.println("Alto: " + alto);
        System.out.println("Superficie: " + superficie());
        System.out.println("Perimetro: " + perimetro() + "\n");
    }
}
