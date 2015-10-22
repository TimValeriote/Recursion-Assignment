
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tim
 */
public class reverseString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        reverseString test = new reverseString();
        test.reverseString("Fountain");
        
        
    }

    public String reverseString(String word) {
        int length = word.length();

        if (length == 0) {
            return word;
        }
        if (length == 1) {
            return word;
        }

        char x = word.charAt(length - 1);
        char y = word.charAt(0);

        word = word.substring(1, length - 1);

        return y + reverseString(word) + x;
    }

}
