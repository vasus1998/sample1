package com.company;

import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static int first() {
        System.out.print("Input number: ");
        int number = scanner.nextInt();
        return Integer.compare(number, 0);
    }

    public static int second() {
        System.out.print("Input number: ");
        int number = scanner.nextInt();
        int counter = 0;
        for (int i = number; i < (2 * number); i++) {
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    counter++;
                }
            }
        }
        return counter;
    }

    public static int third() {
        System.out.print("Input number X: ");
        int theXNumber = scanner.nextInt();
        System.out.println();
        System.out.print("Input D number: ");
        int theDNumber = scanner.nextInt();
        int counter = 0;
        while (theXNumber > 0) {
            if ((theXNumber % 10) == theDNumber) {
                counter++;
            }
            theXNumber /= 10;
        }
        return counter;
    }

    public static int fourth() {
        System.out.print("Input number: ");
        int number = scanner.nextInt();
        int firstCounter = 0; // четные
        int secondCounter = 0; // нечетные
        while (number > 0) {
            if ((number % 10) / 2 == 0) {
                firstCounter++;
            } else {
                secondCounter++;
            }
            number /= 10;
        }
        return Integer.compare(firstCounter, secondCounter);
    }

    public static double fifth() {
        System.out.print("A(x) = ");
        int ax = scanner.nextInt();
        System.out.print("A(y) = ");
        int ay = scanner.nextInt();
        System.out.print("B(x) = ");
        int bx = scanner.nextInt();
        System.out.print("B(y) = ");
        int by = scanner.nextInt();
        return Math.sqrt(Math.pow((ax - bx), 2) + Math.pow((ay - by), 2));
    }

    public static int sixth() {
        System.out.print("A(x) = ");
        int ax = scanner.nextInt();
        System.out.print("A(y) = ");
        int ay = scanner.nextInt();
        if (ax > 0 && ay > 0) return 1;
        if (ax < 0 && ay > 0) return 2;
        if (ax < 0 && ay < 0) return 3;
        if (ax > 0 && ay < 0) return 4;
        return -1;
    }

    public static String seventh() {
        System.out.print("Координаты центра круга: A(x) = ");
        int ax = scanner.nextInt();
        System.out.print("A(y) = ");
        int ay = scanner.nextInt();
        System.out.print("Координаты точки B(x) = ");
        int bx = scanner.nextInt();
        System.out.print("A(y) = ");
        int by = scanner.nextInt();
        System.out.print("Radius = ");
        int radius = scanner.nextInt();
        double length = Math.sqrt(Math.pow((ax - bx), 2) + Math.pow((ay - by), 2));
        return (length > radius) ? "Точка вне круга" : "Точка в круге";
    }

    public static void main(String[] args) {
        System.out.println(Main.first());
        System.out.println(Main.second());
        System.out.println(Main.third());
        System.out.println(Main.fourth());
        System.out.println(Main.fifth());
        System.out.println(Main.sixth());
        System.out.println(Main.seventh());
    }

}
