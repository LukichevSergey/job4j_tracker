package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public double add(double first, double second) {
        return first + second;
    }

    public double add(double first, double second, double third) {
        return first + second + third;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static int minus(int num) {
        return num - x;
    }

    public int divide(int num) {
        return num / x;
    }

    public int sumAllOperation(int num) {
        return sum(num) + multiply(num) + minus(num) + divide(num);
    }

    public static void main(String[] args) {
        System.out.println(sum(5));

        Calculator calculator = new Calculator();
        int rsl = calculator.multiply(5);
        System.out.println(rsl);

        System.out.println(minus(5));

        System.out.println(calculator.divide(5));

        System.out.println(calculator.sumAllOperation(5));
    }
}
