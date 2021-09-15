package ru.vsu.cs.dolzhenkoms;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double r1 = readNumber();
        double r2 = readNumber();
        double r3 = readNumber();

        double square = getSquareOfShadedFigure(r1, r2, r3);

        printSquareOfShadedFigure(square);

    }
    private static double readNumber() {
        Scanner scn = new Scanner(System.in);
        double num = scn.nextDouble();
        return num;
    }
    private static double getSquareOfShadedFigure(double r1, double r2, double r3) {
        double totalSquare = 0, s1 = 0, s2 = 0, s3 = 0;

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
            System.out.printf("Wrong entered data for square. Please retry...");
        }
    }
}
