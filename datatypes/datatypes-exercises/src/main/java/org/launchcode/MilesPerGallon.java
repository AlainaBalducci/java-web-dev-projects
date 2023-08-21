package org.launchcode;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        double numMiles;
        double gallonsOfGas;
        double milesPerGallon;
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven?");
        numMiles = input.nextDouble();
        System.out.println("How much gas (in gallons) have you used?");
        gallonsOfGas = input.nextDouble();
        milesPerGallon = numMiles / gallonsOfGas;
        System.out.println("Your car gets " + milesPerGallon + " miles per gallon");
    }
}
