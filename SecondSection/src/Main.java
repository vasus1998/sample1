import java.util.Scanner;

public class Main {

    public static void firstExample() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите переменную: avg = ");
        double avg = scanner.nextDouble();
        if (avg == 100){
            System.out.println("Молодец!");
        } else {
            System.out.println("А вот на этот случай действий у меня нет(((");
        }
        System.out.print("Введите переменную: mark = ");
        double mark = scanner.nextDouble();
        if (mark < 60){
            mark = mark * 0.1;
            System.out.println("Щас увеличим");
        } else {
            System.out.println("Она и так большая " + mark);
        }
        System.out.print("Введите переменную: one = ");
        double one = scanner.nextDouble();
        System.out.print("Введите переменную: two = ");
        double two = scanner.nextDouble();
        if (one > two){
            System.out.println(one + " Больше");
        } else{
            System.out.println(two + " Больше");
        }
        System.out.print("Введите переменную: num = ");
        double num = scanner.nextDouble();
        if (num > 0){
            System.out.println("Положительное");
        } else if (num < 0) {
            System.out.println("Отрицательное");
        } else {
            System.out.println("Нуль");
        }
        System.out.print("Введите переменную: ugol = ");
        double ugol = scanner.nextDouble();
        System.out.print("Введите переменную: ugol1 = ");
        double ugol1 = scanner.nextDouble();
        System.out.print("Введите переменную: ugol2 = ");
        double ugol2 = scanner.nextDouble();
        double result = ugol1 + ugol + ugol2;
        if (result == 180) {
            System.out.println("Это углы одного треугольника");
        } else {
            System.out.println("Это не углы одного треугольника");
        }
    }

    public static void secondExample() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first number: ");
        double firstNumber = scanner.nextDouble();
        System.out.print("Input second number");
        double secondNumber = scanner.nextDouble();
        if (firstNumber == secondNumber) {
            System.out.println("Equal");
        } else {
            System.out.println("Not equal");
        }
    }

    public static void thirdExample() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите переменную: ");
        double number = scanner.nextDouble();
        if (number < 0){
            number = Math.abs(number);
            System.out.println(number);
        } else {
            System.out.println("0");
        }
    }

    public static void fourthExample(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите переменную 1 : ");
        double firstNumber = scanner.nextDouble();
        System.out.print("Введите переменную 2 : ");
        double secondNumber = scanner.nextDouble();
        double big = 0;
        double small = 0;
        if (firstNumber > secondNumber){
            big = firstNumber;
            small = secondNumber;
        } else if (secondNumber > firstNumber){
            big = secondNumber;
            small = firstNumber;
        } else{
            System.out.println(firstNumber + " " + secondNumber);
        }
        System.out.println("По возрастанию: " + small + " " + big);
        System.out.println("По убыванию: " + big + " " + small);
    }

    public static void fifthExample(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите переменную : ");
        double num = scanner.nextDouble();
        if (num < 0){
            System.out.println("Квадрат введенного числа: " + num*num);
        } else {
            System.out.println("Ошибка!");
        }
    }

    public static void sixthExample(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите двузначное число : ");
        int number = scanner.nextInt();
        int secondNumber = number % 10;
        int firstNumber = number / 10;
        if (firstNumber > secondNumber){
            System.out.println("Значения десяток больше значения едениц");
        } else if (firstNumber < secondNumber){
            System.out.println("Значения едениц больше значения десяток");
        } else {
            System.out.println("Значения десяток и значения едениц равны");
        }
    }

    public static void seventhExample(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите трехзначное число : ");
        int number = scanner.nextInt();
        int thirdNumber = number % 10;
        int secondNumber = (number / 10) % 10;
        int firstNumber = number / 100;
        int result;
        if (number > 500){
            result = thirdNumber * 100 + secondNumber * 10 + firstNumber;
        } else {
            result = firstNumber * 100 + firstNumber * 10 + secondNumber;
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        firstExample();
        secondExample();
        thirdExample();
        fourthExample();
        fifthExample();
        sixthExample();
        seventhExample();
    }
}
