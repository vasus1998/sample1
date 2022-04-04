package com.company;

import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);
    public static int first(int number) {
        return Integer.compare(number, 0);
    }

    public static int second(int number) {
        int counter = 0;
        int multiply = 2;
        for (int i = number; i < (multiply * number); i++) {
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    counter++;
                }
            }
        }
        return counter;
    }

    public static int third(int theXNumber, int theDNumber) {
        int counter = 0;
        while (theXNumber > 0) {
            if ((theXNumber % 10) == theDNumber) {
                counter++;
            }
            theXNumber /= 10;
        }
        return counter;
    }

    public static int fourth(int number) {
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

    public static double fifth(int ax, int ay, int bx, int by) {
        int power = 2;
        return Math.sqrt(Math.pow((ax - bx), power) + Math.pow((ay - by), power));
    }

    public static int sixth() {
        System.out.print("Input A(x) = ");
        int ax = scanner.nextInt();
        System.out.print("Input A(y) = ");
        int ay = scanner.nextInt();
        if (ax > 0 && ay > 0) return 1;
        if (ax < 0 && ay > 0) return 2;
        if (ax < 0 && ay < 0) return 3;
        if (ax > 0 && ay < 0) return 4;
        return -1;
    }

    public static String seventh() {
        System.out.print("Input A(x) = ");
        int ax = scanner.nextInt();
        System.out.print("Input A(y) = ");
        int ay = scanner.nextInt();
        System.out.print("Input B(x) = ");
        int bx = scanner.nextInt();
        System.out.print("Input B(y) = ");
        int by = scanner.nextInt();
        System.out.print("Input radius = ");
        int radius = scanner.nextInt();
        double length = fifth(ax, ay, bx, by);
        //double length = Math.sqrt(Math.pow((ax - bx), 2) + Math.pow((ay - by), 2));
        return (length > radius) ? "Точка вне круга" : "Точка в круге";
    }

    public static void main(String[] args) {
        System.out.println(first(-66));
        System.out.println(second(34));
        System.out.println(third(23, 2));
        System.out.println(fourth(12));
        System.out.println(fifth(12,-15, 24, 12));
        System.out.println(sixth());
        System.out.println(seventh());
    }
    // Добавить ввод данных
}
