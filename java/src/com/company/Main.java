package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Првое задание
        String firstNumber = "1";
        String secondNumber = "2";
        String thirdNumber = "3";
        System.out.println(firstNumber + " " + secondNumber + " " + thirdNumber);
        // второе задание
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        System.out.println("Ваше число:" + number);
        // Третье задание
        System.out.print("Введите длину: ");
        double length = scanner.nextDouble();
        System.out.print("Введите ширину: ");
        double width = scanner.nextDouble();
        double perimetr = 2 * (length + width);
        double diagonal = Math.sqrt((length * length) + (width * width));
        System.out.println("Периметр прямоугольника равен: " + perimetr);
        System.out.println("Длина диагонали равна: " + diagonal);
        System.out.print("Введите первое число: ");
        double theFirstNumber = scanner.nextDouble();
        System.out.print("Введите второе число: ");
        double theSecondNumber = scanner.nextDouble();
        if (theFirstNumber > theSecondNumber) {
            System.out.println("Первое число больше второго");
        } else if (theFirstNumber < theSecondNumber) {
            System.out.println("Второе число больше первого");
        } else if (theFirstNumber == theSecondNumber) {
            System.out.println("Числа равны");
        }
        // Четвертое задание
        System.out.print("Введите первое число: ");
        double num1 = scanner.nextDouble();
        System.out.print("Введите второе число: ");
        double num2 = scanner.nextDouble();
        System.out.print("Введите действие(*+/-): ");
        String deistvie = scanner.next();
        double ans = 0;
        boolean error = false;
        switch (deistvie) {
            case "+":
                ans = num1 + num2;
                break;
            case "-":
                ans = num1 - num2;
                break;
            case "*":
                ans = num1 * num2;
                break;
            case "/":
                if (num2 != 0) {
                    ans = num1 / num2;
                } else {
                    error = true;
                    System.out.println("На ноль делить нельзя!");
                }
                break;
            default:
                System.out.println("Ошибка!");
                break;
        }
        if (!error) {
            System.out.println(num1 + " " + deistvie + " " + num2 + " = " + ans);
        }

    }
}
