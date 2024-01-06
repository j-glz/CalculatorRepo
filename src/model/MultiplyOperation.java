package model;

// Encapsulation and Polymorphism: model.MultiplyOperation class
public class MultiplyOperation implements Operation {
    @Override
    public double perform(double num1, double num2) {
        return num1 * num2;
    }
}
