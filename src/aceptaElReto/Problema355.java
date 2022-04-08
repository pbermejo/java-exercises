package aceptaElReto;

import java.util.Scanner;

public class Problema355 {
	/* 
	Gregorio XIII
	 */
    public static void main(String[] args) {
		int casos;
		int anno;
        Scanner scan = new Scanner(System.in);
        casos = scan.nextInt();
        
        for(int i = 0; i < casos; i++){
			anno = scan.nextInt();
			if(anno % 4 == 0 && anno % 100 != 0 || anno % 400 == 0){
                System.out.println(29);
            }else{
                System.out.println(28);
            }
        }
    }
}