/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Random;
/**
 *
 * @author dual106
 */
public class NameGenerator {
    public static void main(String[] args) {
        String name = "";
        String selectedChar = "";
        String[] consonant = {"b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "ñ", "p", "q", "r", "s", "t", "v", "w", "x", "y", "z"};
        String[] vowel = {"a", "e", "i", "o", "u"};
        Random aleat = new Random();
        for (int i = 0; i < 10; i++) {
            if(selectedChar.equals("")){
                selectedChar = consonant[aleat.nextInt(consonant.length - 1)];
            }
            name += selectedChar;
        }
        System.out.println(name);
    }
}
