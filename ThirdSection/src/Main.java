import sun.lwawt.macosx.CSystemTray;

import java.util.Scanner;


public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void firstExample() { //двузначные четные числа
        System.out.println("Задание 1");
        System.out.println("Вывод четных двухзначных чисел через пробел");
        for (int i = 10; i < 99; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("Вы увидели вывод");
    }

    public static void secondExample() {
        System.out.println("Задание 2");
        System.out.print("Ввeдите переменную x = ");
        int x = scanner.nextInt();
        System.out.print(x + 1 + " ");
        for (int i = 1; i < 17; i++) {
            x += 3;
            System.out.print(x + " ");
        }
        System.out.println();
        System.out.println("Ваш ряд!");
    }

    public static void thirdExample() {
        System.out.println("Задание 3");
        for (int i = 10; i < 100; i++) {
            int firstNumber = i / 10; //Десятки
            int secondNumber = i % 10; //Еденицы
            int num = firstNumber * secondNumber;
            if (num > 9 && num < 100) {
                System.out.print(firstNumber);
                System.out.print(secondNumber + " ");
            }
        }
        System.out.println("Все двузначные числа, произведения которых двузначное число!");
    }

    public static void fourthExample() {
        System.out.println("Задание 4");
        System.out.print("Введите число, числители которых вы хотите найти: ");
        int num = scanner.nextInt();
        int counter = 0;
        System.out.println("Делители числа " + num + " ");
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                counter += 1;
                System.out.print(i + " ");
            }
        }
        System.out.println("Количество делителей " + counter + " (без 1 и самого числа)");
    }

    public static void fifthExample() {
        System.out.println("Задание 5");
        int counter1 = 1;
        int counter2 = 1;
        int counter3 = 0;
        System.out.println("Числа Фибоначчи");
        System.out.print(counter1 + " ");
        System.out.print(counter2 + " ");
        for (int i = 1; i < 100; i++) {
            counter3 = counter1 + counter2;
            System.out.print(counter3 + " ");
            counter1 = counter2;
            counter2 = counter3;
        }
    }

    public static void sixthExample() {
        System.out.println("Задание 6");
        int mass;
        int diameter;
        boolean counter;
        for (int i = 1; i < 120; i++) {
            System.out.println("Введите данные для " + i + " шарика");
            System.out.print("Масса:");
            mass = scanner.nextInt();
            System.out.print("Диаметр: ");
            diameter = scanner.nextInt();
            counter = mass < 27 && mass > 21 && diameter > 70 && diameter < 79;
            String fi = (!counter) ? "Ваш шарик не подходит" : "Ваш шарик подходит";
            System.out.println(fi);
        }
    }

    public static void seventhExample() {
        System.out.println("Задание 7");
        int number1 = (int) (Math.random() * 900) + 100;
        int result1 = (number1 % 10) * ((number1 / 10) % 10) * (number1 / 100);
        int finalResult = 0;
        int count1 = 1;
        int finalCount = 0;
        for (int i = 1; i < 25; i++) {
            int number = (int) (Math.random() * 900) + 100;
            System.out.print(number + " ");
            int result2 = (number / 100) * ((number / 10) % 10) * (number % 10);
            if (result1 > result2) {
                finalResult = result1;
                finalCount = count1;
            } else {
                finalResult = result2;
                result1 = result2;
                finalCount = i + 1;
                count1 = i;
            }
        }
        System.out.println("Порядковый номер наибольшей суммы: " + finalCount);
    }

    public static void eighthExample() {
        System.out.println("Задание 8");
        int firstCount = 0;
        int secondCount = 0;
        int count = 0;
        for (int i = 1; i < 25; i++) {
            int number = (int) (Math.random() * 900) + 100;
            System.out.print(number + " ");
            firstCount = number;
            if (firstCount > secondCount) {
                count = firstCount;
                secondCount = firstCount;
            } else {
                count = secondCount;
            }
        }
        System.out.println();
        System.out.println("Самое большое число в списке - " + count);
    }

    public static void tenthExample() {
        System.out.println("Задание 10");
        int result = 10;
        int result1 = 11;
        int finalCount = 0;
        for (int i = 10; i < 100; i++) {
            int firstNumber = i / 10; //Десятки
            int secondNumber = i % 10; //Еденицы
            int num = firstNumber * secondNumber;
            if (num != 0) {
                if (i % num == 0) {
                    result = i;
                }
                if (result > result1) {
                    finalCount = result;
                    result1 = result;
                } else {
                    finalCount = result1;
                }
            }
        }
        System.out.println(finalCount);

    }

    public static void eleventhExample() {
        int resultMass = 0;
        int resultCounter = 0;
        for (int i = 1; i < 7; i++) {
            System.out.print("Введите массу " + i + "-го пассажира");
            int mass = scanner.nextInt();
            resultMass += mass;
            if (resultMass > 450) {
                resultCounter = i;
                System.out.println("Перегруз! Число людей в лифте " + resultCounter + " Масса людей: " + resultMass);
                break;
            }
            resultCounter = i;
        }
        System.out.println("Количество людей " + resultCounter + " Их общая масса: " + resultMass);
    }



    public static void main(String[] args) {
        //firstExample();
        System.out.println();
        //secondExample();
        System.out.println();
        //thirdExample();
        System.out.println();
        //fourthExample();
        System.out.println();
        //fifthExample();
        System.out.println();
        //sixthExample();
        System.out.println();
        //seventhExample();
        System.out.println();
        //eighthExample();
        System.out.println();
        //tenthExample();
        System.out.println();
        //eleventhExample();
    }
}