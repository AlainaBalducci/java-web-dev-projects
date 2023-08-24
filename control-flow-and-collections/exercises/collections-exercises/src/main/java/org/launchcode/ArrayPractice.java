package org.launchcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static org.launchcode.ArrayListPractice.fiveLetters;
import static org.launchcode.ArrayListPractice.sumEven;

public class ArrayPractice {
    public static void main(String[] args) {
        Integer[] IntegerArr = {1, 1, 2, 3, 5, 8};
        ArrayList<Integer> numsArrList = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        int firstNumber = numsArrList.get(0);
        System.out.println(sumEven(numsArrList));

        String suess = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] sentence = suess.split("\\.");
        String[] sentence1 = suess.split(" ");
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(sentence1));
        System.out.println(fiveLetters(arrayList));
        Scanner input = new Scanner(System.in);
        System.out.println(Arrays.toString(sentence));
        for (int i = 0; i < IntegerArr.length; i++) {
            if(IntegerArr[i] % 2 != 0) {
            System.out.println(IntegerArr[i]);
            }
        }

    }
}
