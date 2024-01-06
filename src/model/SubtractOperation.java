package model;

// Encapsulation and Polymorphism: model.SubtractOperation class
class SubtractOperation implements Operation {
    @Override
    public double perform(double num1, double num2) {
        return num1 - num2;
    }
}
