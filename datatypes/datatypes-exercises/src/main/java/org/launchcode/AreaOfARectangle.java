package org.launchcode;

import java.util.Scanner;

public class AreaOfARectangle {
    public static void main(String[] args) {
        int lengthOfRect;
        int widthOfRect;
        int areaOfRect;
        Scanner input = new Scanner(System.in);
        System.out.println("What is the length of your rectangle?");
        lengthOfRect = input.nextInt();
        System.out.println("What is the width of your rectangle?");
        widthOfRect = input.nextInt();
        areaOfRect = lengthOfRect * widthOfRect;
        System.out.println("The area of that rectangle is " + areaOfRect);

    }
}
