package objetos;


import objetos.Atleta;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dual106
 */
public class ProbandoAtletas {
    public static void main(String[] args){
        
        Atleta luis = new Atleta("Luis", 13, 145.78, 45.34, "111111111S");
        
        Atleta maria = new Atleta();
        
        luis.visualiza();
    }
}
