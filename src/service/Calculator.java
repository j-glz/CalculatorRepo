package service;

import model.*;

import java.util.Scanner;

public class Calculator {
    private final Scanner scanner;
    private final OperationFactory operationFactory;

    public Calculator() {
        this.scanner = new Scanner(System.in);
        this.operationFactory = new OperationFactory();
    }

    public void runCalculator() {
        boolean exit = false;

        while (!exit) {
            try {
                double num1 = getOperand("Enter the first number: ");
                String operator = getOperator();
                double num2 = getOperand("Enter the second number: ");

                Operation operation = operationFactory.createOperation(operator);
                double result = operation.perform(num1, num2);

                System.out.println("Result: " + result);
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }

            exit = !continueCalculation();
        }

        System.out.println("Calculator closed.");
        scanner.close();
    }

    private double getOperand(String prompt) {
        System.out.print(prompt);
        return scanner.nextDouble();
    }

    private String getOperator() {
        System.out.print("Enter an operator (+, -, *, /, ^, sqrt, sin, cos, tan): ");
        return scanner.next();
    }

    private boolean continueCalculation() {
        System.out.print("Do you want to perform another calculation? (yes/no): ");
        String continueInput = scanner.next().toLowerCase();
        return continueInput.equals("yes");
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.runCalculator();
    }
}
