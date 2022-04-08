package prueba;
import atletas.Atleta;
import java.util.Arrays;
import java.util.Random;

public class Ejercicio20 {
    public static void main(String[] Args) {
        Atleta[] atletas = new Atleta[10];
        String[] nombres = { "David", "Leticia", "Vanessa", "Ana", "Carmen", "Bianca", "Miguel", "Beatriz", "Luz", "Michael", "Marisa", "Alberto", "Fran", "Laura"};
        String[] apellidos = { "Porto", "Prieto", "Quintas", "Solveira", "Castillo", "Brito", "Cal", "Franco", "Gago", "Gra�a", "Garrido", "Lema", "Parada"};
        String nuevoNombre;
        String nuevoApellido;
        String[] nombreGenerado;
        String[] apellidoGenerado;
        Random aleat = new Random();
        
        // Genera nombres
        nombreGenerado = new String[atletas.length];
        apellidoGenerado = new String[atletas.length];
        
        // Genera atletas
        for (int i = 0; i < atletas.length; i++) {
            atletas[i] = new Atleta();
            
            // Genero nombre único
            nuevoNombre = nombres[aleat.nextInt(nombres.length - 1)];
            while(Arrays.asList(nombreGenerado).contains(nuevoNombre)){
                nuevoNombre = nombres[aleat.nextInt(nombres.length - 1)];
            }
            nombreGenerado[i] = nuevoNombre;
            atletas[i].setNombre(nombreGenerado[i]);
            
            // Genero apellido único
            nuevoApellido = apellidos[aleat.nextInt(apellidos.length - 1)];
            while(Arrays.asList(apellidoGenerado).contains(nuevoApellido)){
                nuevoApellido = apellidos[aleat.nextInt(nombres.length - 1)];
            }
            apellidoGenerado[i] = nuevoApellido;            
            atletas[i].setApellido(apellidoGenerado[i]);
            
            atletas[i].setDorsal(i + 1);
            atletas[i].setTiempo((aleat.nextInt(1800) + 300));
        }
        
        // Visualiza atletas
        for (int i = 0; i < atletas.length; i++) {
                System.out.println(atletas[i].toString());
        }
    }
}
