/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion;

import java.util.Scanner;

/**
 *
 * @author samiorga
 */
public class WordScramble {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a scrambled word: ");
        String sLetters = input.nextLine();

        String letters = sLetters;
        System.out.println("Word Scramble \n");
        scrambleWords(letters, "");
    }

    public static void scrambleWords(String word, String scrambledLetters) {
        String remainingLetters;
        String origWord = word;
        String origScrambledLetters = scrambledLetters;

        if (word.length() == 1) {
            System.out.println(scrambledLetters + word);
        } else {
            for (int pos = 0; pos < origWord.length(); pos++) {
                remainingLetters = origWord.substring(0, pos)
                        + origWord.substring(pos + 1, origWord.length());
                scrambleWords(remainingLetters, origScrambledLetters 
                        + origWord.charAt(pos));
            }
        }
    }
}
