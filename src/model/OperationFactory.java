package model;

public class OperationFactory {
    public Operation createOperation(String operator) {
        return switch (operator) {
            case "+" -> new AddOperation();
            case "-" -> new SubtractOperation();
            case "*" -> new MultiplyOperation();
            case "/" -> new DivideOperation();
            case "^" -> new PowerOperation();
            case "sqrt" -> new SquareRootOperation();
            case "sin", "cos", "tan" -> new TrigonometricOperation(operator);
            default -> throw new IllegalArgumentException("Invalid operator: " + operator);
        };
    }
}
