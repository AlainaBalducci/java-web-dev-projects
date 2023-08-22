package org.launchcode;

import java.util.Scanner;
import org.launchcode.Circle;
public class Area {
    public static void main(String[] args) {
        double radius;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        radius = input.nextDouble();
        double area =Circle.getArea(radius);
        if(radius > 0) {
            System.out.println("The area of a circle of radius " + radius + " is: " + area);
        } else {
            System.out.println("Radius needs to be a positive number above zero!");
        }
        input.close();
    }
}
