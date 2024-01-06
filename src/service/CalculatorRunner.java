package service;

import model.Calculator;

public class CalculatorRunner {
    public static void main(String[] args) {
        CalculatorCLI calculatorCLI = new CalculatorCLI(new Calculator());
        calculatorCLI.runCalculator();
    }
}
