/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reverseword;

import java.util.Scanner;

/**
 *
 * @author Kevin Casin
 */
public class ReverseWord {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // take input from user - Scanner
        Scanner input = new Scanner(System.in);
        String word = input.next();
        char[] reverse = new char[word.length()];
        
        for (int i = 0; i < word.length(); i++)
        {
            reverse[i] = word.charAt(i);
        }
        
        for (int i = reverse.length -1; i >= 0; i--)
        {
            System.out.println(reverse[i]);
        }
    }
    
}
