package model;

import java.math.BigDecimal;
import java.math.RoundingMode;

// Encapsulation and Polymorphism: model.TrigonometricOperation class
public class TrigonometricOperation implements Operation {
    private final String operation;

    public TrigonometricOperation(String operation) {
        this.operation = operation;
    }

    @Override
    public BigDecimal perform(BigDecimal num1, BigDecimal num2) {
      double angleInRadians = Math.toRadians(num1.doubleValue());

        return switch (operation.toLowerCase()) {
            case "sin" -> BigDecimal.valueOf(Math.sin(angleInRadians));
            case "cos" -> BigDecimal.valueOf(Math.cos(angleInRadians));
            case "tan" -> BigDecimal.valueOf(Math.tan(angleInRadians));
            default -> throw new IllegalArgumentException("Invalid trigonometric operation: " + operation);
        };
    }
}
