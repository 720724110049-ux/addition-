package com.example;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Java Math Solver ===");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Modulus");

        System.out.print("Choose operation (1-5): ");
        int choice = scanner.nextInt();

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        double result;

        switch (choice) {
            case 1:
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;

            case 2:
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;

            case 3:
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;

            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Cannot divide by zero");
                }
                break;

            case 5:
                result = num1 % num2;
                System.out.println("Result: " + result);
                break;

            default:
                System.out.println("Invalid operation");
        }

        scanner.close();
    }
}