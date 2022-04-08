package libros;

public class Isbn {
    public static boolean esValido(String isbn){
        boolean valido = false;
        int suma = 0;
        int r;
        
        /**
         * Compruebo tamaño de la cadena
         */
        if(isbn.length() != 13) {
        	return false;
        }
        
        /**
         * Compruebo que no contenga guiones seguidos
         */
        if(isbn.contains("--")) {
        	return false;
        }
        
        /**
         * Compruebo que contenga 3 guiones
         */
        if(isbn.length() - isbn.replace("-", "").length() != 3) {
        	return false;
        }
        
        /**
         * Compruebo que el penúltimo caracter sea un guión
         */       
        if(isbn.charAt(11) != '-') {
        	return false;
        }
        
        /**
         * Quito los guiones
         * Compruebo que los caracteres sean números
         * y los opero multiplicando por su posición
         * y guardo la suma
         */
        isbn = isbn.replace("-", "");
        for (int i = 0; i < isbn.length() - 1; i++) {
			if(Character.isDigit(isbn.charAt(i))) {
				suma += (i + 1) * Integer.parseInt(Character.toString(isbn.charAt(i)));
			}else {
				return false;
			}
		}
        /**
         * Calculo el resto 
         * y lo comparo con el último caracter de la cadena sin guiones
         */
        r = suma % 11;
        if(Integer.toString(r).equals(Character.toString(isbn.charAt(isbn.length() - 1))) ) {
        	valido = true;
        }
        /**
         * Si el resto es 10,
         * compruebo que el último caracer de la cadena sea "X"
         */
        if(r == 10 && Character.toString(isbn.charAt(isbn.length() - 1)).toUpperCase().equals("X")) {
        	valido = true;
        }
        return valido;
    }
}
