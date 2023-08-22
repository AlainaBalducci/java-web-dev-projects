package org.launchcode;

import java.util.Scanner;
import org.launchcode.Circle;
public class AreaWhile {
    public static void main(String[] args) {
        double radius;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a radius: ");
        radius = input.nextDouble();

        while (radius <= 0) {
            System.out.println("Radius needs to be a positive number above zero!");
            System.out.println("Enter a radius: ");
            radius = input.nextDouble();
        }

        double area = Circle.getArea(radius);
        System.out.println("The area of a circle of radius " + radius + " is: " + area);
        input.close();
    }
}
