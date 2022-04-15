package com.boqdan59;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите два числа");
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        System.out.println("введите операцию");
        String operation = scanner.next();

        Calculator calculator = new Calculator();
        int result = calculator.process(operation, first, second);
        System.out.println("ответ: " + result);
    }

    private int process(String operation, int first, int second) throws Exception {
        switch (operation) {
            case "+":
                return sum(first, second);
            case "-":
                return subtract(first, second);
            case "*":
                return multiply(first,second);
        }
        throw new Exception("такой операции нет");
    }

    private int subtract(int first, int second) {
        return first - second;
    }

    private int sum(int first, int second) {
        return first + second;
    }

    private int multiply(int first, int second) {
        return first * second;
    }
}