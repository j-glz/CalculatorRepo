package model;

// Encapsulation and Polymorphism: model.TrigonometricOperation class
class TrigonometricOperation implements Operation {
    private final String operation;

    public TrigonometricOperation(String operation) {
        this.operation = operation;
    }

    @Override
    public double perform(double num1, double num2) {
        double angle = Math.toRadians(num1);

        switch (operation.toLowerCase()) {
            case "sin":
                return Math.sin(angle);
            case "cos":
                return Math.cos(angle);
            case "tan":
                return Math.tan(angle);
            default:
                throw new IllegalArgumentException("Invalid trigonometric operation: " + operation);
        }
    }
}
