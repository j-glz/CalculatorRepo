package service;

import model.Calculator;
import model.Operation;

import java.math.BigDecimal;
import java.util.Scanner;

public class CalculatorCLI {
    Calculator calculator;
    Scanner scanner;

    public CalculatorCLI(Calculator calculator) {
        this.calculator = calculator;
        scanner = new Scanner(System.in);
    }

    public void runCalculator() {
        boolean exit = false;

        while (!exit) {
            try {
                BigDecimal num1 = getOperand("Enter the first number: ");
                String operator = getOperator();
                BigDecimal num2 = getOperand("Enter the second number: ");

                Operation operation = calculator.getOperationFactory().createOperation(operator);
                BigDecimal result = operation.perform(num1, num2);

                System.out.println("Result: " + result);
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }

            exit = !continueCalculation();
        }

        System.out.println("Calculator closed.");
        scanner.close();
    }

    private BigDecimal getOperand(String prompt) {
        System.out.print(prompt);
        return BigDecimal.valueOf(Double.parseDouble(scanner.next()));
    }

    private String getOperator() {
        System.out.print("Enter an operator (+, -, *, /, ^, sqrt, sin, cos, tan): ");
        return scanner.next();
    }

    private boolean continueCalculation() {
        System.out.print("Do you want to perform another calculation? (yes/no): ");
        String continueInput = scanner.next().toLowerCase();
        return continueInput.equals("yes") || continueInput.equals("y");
    }
}
