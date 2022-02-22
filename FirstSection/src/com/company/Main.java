package com.company;

import java.util.Scanner;

public class Main {

    public static void firstExample() {
        String firstNumber = "1";
        String secondNumber = "2";
        String thirdNumber = "3";
        System.out.println(firstNumber + " " + secondNumber + " " + thirdNumber);
    }

    public static void secondExamole(){
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        System.out.println("Ваше число:" + number);
    }

    public static void thirdExample(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину: ");
        double length = scanner.nextDouble();
        System.out.print("Введите ширину: ");
        double width = scanner.nextDouble();
        double perimeter = 2 * (length + width);
        double diagonal = Math.sqrt((length * length) + (width * width));
        System.out.println("Периметр прямоугольника равен: " + perimeter);
        System.out.println("Длина диагонали равна: " + diagonal);
    }

    public static void fourthExample(){
        Scanner scanner = new Scanner(System.in);
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
    }

    public static void fifthExample(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double num1 = scanner.nextDouble();
        System.out.print("Введите второе число: ");
        double num2 = scanner.nextDouble();
        System.out.print("Введите действие(*+/-): ");
        String operator = scanner.next();
        double ans = 0;
        boolean error = false;
        switch (operator) {
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
                error = true;
                System.out.println("Ошибка! Операция пока не поддерживается");
                break;
        }
        if (!error) {
            System.out.println(num1 + " " + operator + " " + num2 + " = " + ans);
        }
    }

    public static void main(String[] args) {
        firstExample();

        secondExamole();

        thirdExample();

        fourthExample();

        fifthExample();


    }
}
