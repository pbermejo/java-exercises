package accesoUsuarios;

import java.util.Scanner;

public class RegistroUsuario {
	
	public static void main(String[] args) {
		
		String nombre, apellido1, apellido2, password;
		Usuario user;
		ComprobarFuerzaPassword compruebaPass;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Introduzca su nombre:");
		nombre = scan.nextLine();
		
		System.out.println("Introduzca su primer apellido:");
		apellido1 = scan.nextLine();
		
		System.out.println("Introduzca su segundo apellido:");
		apellido2 = scan.nextLine();
		
		
		/**
		 * Crea objeto con los siguientes par?metros: 
		 * 2 may?sculas, 
		 * 2 min?sculas, 
		 * 2 n?meros 
		 * y una longitud m?nima de 8 caracteres.
		 */
		compruebaPass = new ComprobarFuerzaPassword(8, 2, 2, 2);
		do {
			System.out.println("Introduzca una contrase?a v?lida:");
			password = scan.nextLine();			
		}while(!compruebaPass.esFuerte(password));
		
		user = new Usuario(nombre, apellido1, apellido2, password);
		scan.close();
		System.out.println(user.toString());
	}
	
}
