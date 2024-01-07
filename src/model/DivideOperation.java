package model;

import java.math.BigDecimal;
import java.math.RoundingMode;

// Encapsulation and Polymorphism: model.DivideOperation class
public class DivideOperation implements Operation {
    @Override
    public BigDecimal perform(BigDecimal num1, BigDecimal num2) {
        if (num2.compareTo(BigDecimal.ZERO) != 0) {
            return (num1.divide(num2))
                    .setScale(2, RoundingMode.UP);
        } else {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
    }
}
