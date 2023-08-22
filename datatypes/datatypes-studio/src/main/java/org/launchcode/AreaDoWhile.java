package org.launchcode;

import java.util.Scanner;
import org.launchcode.Circle;
public class AreaDoWhile {
    public static void main(String[] args) {
        double radius;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Enter a radius: ");
            radius = input.nextDouble();

            if (radius <= 0) {
                System.out.println("Radius needs to be a positive number above zero!");
            }
        } while (radius <= 0);

        double area = Circle.getArea(radius);
        System.out.println("The area of a circle of radius " + radius + " is: " + area);

        input.close();
    }
}
