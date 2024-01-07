package model;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

// Encapsulation and Polymorphism: model.SquareRootOperation class
public class SquareRootOperation implements Operation {
    @Override
    public BigDecimal perform(BigDecimal num1, BigDecimal num2) {
        if (num1.compareTo(BigDecimal.ZERO) >= 0) {
            return (num1.sqrt(MathContext.DECIMAL128))
                    .setScale(2, RoundingMode.UP);
        } else {
            throw new ArithmeticException("Square root of a negative number is not allowed.");
        }
    }
}
