// Encapsulation and Polymorphism: MultiplyOperation class
class MultiplyOperation implements Operation {
    @Override
    public double perform(double num1, double num2) {
        return num1 * num2;
    }
}
