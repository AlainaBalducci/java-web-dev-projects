package org.launchcode;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {


    public static int sumEven(ArrayList<Integer> arr) {

        int total = 0;
        for (int integer : arr) {
            if (integer % 2 == 0) {
                total += integer;
            }
        }
        return total;
    }

    public static ArrayList<String> fiveLetters(ArrayList<String> list) {
        ArrayList<String> what = new ArrayList<>();
        System.out.println("Enter a word length: ");
        Scanner input = new Scanner(System.in);
        int numChars = input.nextInt();
        for (String word : list) {
            if (word.length() == numChars) {
                what.add(word);
            }
        }
        return what;
    }

}
