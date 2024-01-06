package model;

// Encapsulation and Polymorphism: model.DivideOperation class
class DivideOperation implements Operation {
    @Override
    public double perform(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
    }
}
