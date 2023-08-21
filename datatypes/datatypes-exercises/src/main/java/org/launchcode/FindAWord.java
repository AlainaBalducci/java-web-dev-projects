package org.launchcode;

import java.util.Scanner;

public class FindAWord {
    public static void main(String[] args) {
        String unEditedString = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, ‘and what is the use of a book,’ thought Alice ‘without pictures or conversation?’";
        String aliceFirstSentence = unEditedString.toLowerCase();
        Scanner input = new Scanner(System.in);
        System.out.println("What word would you like to search for in the first sentence of Alice in Wonderland?");
        String searchedWord = input.nextLine().toLowerCase();

        boolean result = aliceFirstSentence.contains(searchedWord);
        System.out.println("Does the first sentence contain your word? " + result);

        int index = aliceFirstSentence.indexOf(searchedWord);
        int length = searchedWord.length();
        System.out.println("Your search term first appears at index " + index + ". Your term is " + length + " characters long.");
        String newSentence = aliceFirstSentence.replace(searchedWord, "");
        System.out.println(newSentence);
    }
}
