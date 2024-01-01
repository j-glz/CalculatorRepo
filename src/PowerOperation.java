// Encapsulation and Polymorphism: PowerOperation class
class PowerOperation implements Operation {
    @Override
    public double perform(double num1, double num2) {
        return Math.pow(num1, num2);
    }
}