package aceptaElReto;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * @author Pablo Bermejo
 * 
 * Imprimiendo páginas sueltas
 */
public class Problema405 {
	/**
	 * @param args
	 */
    public static void main(String[] args) {

        Scanner scan;
        scan = new Scanner(System.in);
        int pagina;
        ArrayList <Integer> paginas;
        ArrayList <Integer> consecutivas;
        String resultado = "";
        
        paginas = new ArrayList();
        consecutivas = new ArrayList();
        do {
        	pagina = scan.nextInt();
        	if(pagina == 0) {
        		break;
        	}
        	paginas.add(pagina);        	
        } while (pagina > 0);
        
        // 100 102 103 104 106 108 109 110 120 121 122 150 0
        
        for (int i = 0; i < paginas.size(); i++) {
    		if(i == 0) {
    			resultado = paginas.get(i).toString();        			
    		}else { 
    			consecutivas.add(paginas.get(i));
    			if(paginas.get(i) != paginas.get(i - 1) + 1) {
    				if(consecutivas.size() < 2) {
    					resultado += ",";    					
    					resultado += consecutivas.get(consecutivas.size() - 1);
    					consecutivas.clear();
    				}else {
    					resultado += "-";    					
    					resultado += consecutivas.get(consecutivas.size() - 1);
    					consecutivas.clear();
    				}
    			}
    		}
		}
        System.out.println(resultado);
    }
}