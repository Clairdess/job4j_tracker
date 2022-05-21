package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public int minus(int a) {
        return x - a;
    }

    public int divide(int a) {
        return a / x;
    }

    public int sumAllOperation(int a) {
        Calculator temp = new Calculator();
        return sum(a) + temp.divide(a) + temp.minus(a) + temp.multiply(a);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int tempInt = 123;
        Calculator.sum(tempInt);
        calculator.multiply(tempInt);
        calculator.divide(tempInt);
        calculator.minus(tempInt);
        calculator.sumAllOperation(tempInt);
    }
}