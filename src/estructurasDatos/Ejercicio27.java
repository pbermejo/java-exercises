package estructurasDatos;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio27 {

    public static void main(String[] args) {
        String[] nombre = { "David", "Leticia", "Vanessa", "Ana", "Carmen", "Bianca", "Miguel", "Beatriz", "Luz", "Michael"};
        String[] apellido1 = { "Porto", "Prieto", "Quintas", "Solveira", "Castillo", "Brito", "Cal", "Franco", "Gago", "Garrido"};
        String[] apellido2 = { "López", "Fernández", "Pérez", "González", "Bermejo", "Novoa", "Fraguas", "Vidal", "Arce", "Bustillo"};
        String[] nombresApellidos = new String[30];
        String[] nombresCompletos = new String[5];
        String[] nombreGen;
        String[] apellido1Gen;
        String[] apellido2Gen;
        String nuevoNombre;
        String nuevoApellido1;
        String nuevoApellido2;
        Random aleat = new Random();

        // a) Copia 3 arrays en 1
        System.arraycopy(nombre, 0, nombresApellidos, 0, nombre.length);
        System.arraycopy(apellido1, 0, nombresApellidos, nombre.length, apellido1.length);
        System.arraycopy(apellido2, 0, nombresApellidos, (nombre.length + apellido1.length), apellido2.length);
        
        System.out.println("Array de nombres y apellidos: ");
        for (int i = 0; i < nombresApellidos.length; i++) {
            System.out.println(nombresApellidos[i]);            
        }

        // b) Genera nombres completos con repetici�n
        for (int i = 0; i < nombresCompletos.length; i++) {
            nuevoNombre = nombre[aleat.nextInt(nombre.length)];
            nuevoApellido1 = apellido1[aleat.nextInt(apellido1.length)];
            nuevoApellido2 = apellido2[aleat.nextInt(apellido2.length)];

            nombresCompletos[i] = nuevoNombre;
            nombresCompletos[i] += " ";
            nombresCompletos[i] += nuevoApellido1;
            nombresCompletos[i] += " ";
            nombresCompletos[i] += nuevoApellido2;
        }
        Arrays.sort(nombresCompletos);
        
        System.out.println("\nNombres completos con repetición: ");
        for (int i = 0; i < nombresCompletos.length; i++) {
            System.out.println(nombresCompletos[i]);            
        }

        // c) Genera nombres completos sin repetici�n
        nombreGen = new String[nombresCompletos.length];
        apellido1Gen = new String[nombresCompletos.length];
        apellido2Gen = new String[nombresCompletos.length];
        for (int i = 0; i < nombresCompletos.length; i++) {
            
            // Genera nombre que no haya sido generado
            nuevoNombre = nombre[aleat.nextInt(nombre.length)];
            while(Arrays.asList(nombreGen).contains(nuevoNombre)){
                nuevoNombre = nombre[aleat.nextInt(nombre.length - 1)];
            }
            nombreGen[i] = nuevoNombre;
               
            // Genera apellido1 que no haya sido generado
            nuevoApellido1 = apellido1[aleat.nextInt(apellido1.length)];
            while(Arrays.asList(apellido1Gen).contains(nuevoApellido1)){
                nuevoApellido1 = apellido1[aleat.nextInt(apellido1.length - 1)];
            }
            apellido1Gen[i] = nuevoApellido1;
            
            // Genera apellido2 que no haya sido generado
            nuevoApellido2 = apellido2[aleat.nextInt(apellido2.length)];
            while(Arrays.asList(apellido2Gen).contains(nuevoApellido2)){
                nuevoApellido2 = apellido2[aleat.nextInt(apellido2.length - 2)];
            }
            apellido2Gen[i] = nuevoApellido2;

            nombresCompletos[i] = nuevoNombre;
            nombresCompletos[i] += " ";
            nombresCompletos[i] += nuevoApellido1;
            nombresCompletos[i] += " ";
            nombresCompletos[i] += nuevoApellido2;
        }
        
        System.out.println("\nNombres completos sin repetición: ");
        for (int i = 0; i < nombresCompletos.length; i++) {
            System.out.println(nombresCompletos[i]);            
        }
    }
}
