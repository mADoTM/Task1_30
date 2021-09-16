package ru.vsu.cs.dolzhenkoms;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double r1 = readRadius("Small");
        double r2 = readRadius("Middle");
        double r3 = readRadius("Large");

        double square = getSquareOfShadedFigure(r1, r2, r3);

        printSquareOfShadedFigure(square);

    }

    private static double readRadius(String radiusType) {
        System.out.printf("Enter %s Radius - ", radiusType);

        Scanner scn = new Scanner(System.in);
        double value = scn.nextDouble();

        if(value < 0) {
            System.out.println("Error. Radius can be only more than 0");
            System.exit(1);
        }

        return value;
    }

    private static double getSquareOfShadedFigure(double r1, double r2, double r3) {
        double totalSquare, s1 = 0, s2 = 0, s3 = 0;

        if(r1 >= 0 && r2 >= 0 && r3 > 0) {
            s1 = r3 * r3;
            s2 = s1 - 0.25 * Math.PI * r3 * r3;
            s3 = 0.375 * Math.PI * (r2 * r2 - r1 * r1);
        }

        totalSquare = s1 + s2 + s3;
        return totalSquare;
    }

    private static void printSquareOfShadedFigure(double square) {
        if(square >= 0) {
            System.out.printf("The Square of Shaded Figure is %1$.3f", square);
        }
        else {
            System.out.println("Wrong entered data for square. Please retry...");
        }
    }
}
