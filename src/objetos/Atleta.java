package objetos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dual106
 */
public class Atleta {
    
    public String nombre;
    public int edad;
    public double altura;
    public double peso;
    public String nif;

    public Atleta(String nombre, int edad, double altura, double peso, String nif) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
        this.nif = nif;
    }

    public Atleta() {
    }
    
    
    
    public void visualiza(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Peso: " + peso + "kg");
        System.out.println("NIF: " + nif);
        if (edad < 18) {
            System.out.println("Menor de edad");
        } else {
            System.out.println("Mayor de edad");
        }
    }
}
