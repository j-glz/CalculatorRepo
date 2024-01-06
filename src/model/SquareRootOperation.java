package model;

// Encapsulation and Polymorphism: model.SquareRootOperation class
public class SquareRootOperation implements Operation {
    @Override
    public double perform(double num1, double num2) {
        if (num1 >= 0) {
            return Math.sqrt(num1);
        } else {
            throw new ArithmeticException("Square root of a negative number is not allowed.");
        }
    }
}
