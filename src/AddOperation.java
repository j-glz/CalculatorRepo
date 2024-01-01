// Encapsulation and Polymorphism: AddOperation class
class AddOperation implements Operation {
    @Override
    public double perform(double num1, double num2) {
        return num1 + num2;
    }
}
