package atletas;

public class Atleta {
    private String nombre;
    private String apellido;
    private int dorsal;
    private int tiempo;

    public Atleta() {
    }

    public Atleta(String nombre, String apellido, int dorsal, int tiempo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dorsal = dorsal;
        this.tiempo = tiempo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public String toString() {
        return ("Nombre y apellido: " + nombre + " " + apellido + "\t dorsal: " + dorsal + "\t tiempo: " + tiempo);
    }
}
