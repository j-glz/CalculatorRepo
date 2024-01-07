package model;

import java.math.BigDecimal;
import java.math.RoundingMode;

// Encapsulation and Polymorphism: model.SubtractOperation class
public class SubtractOperation implements Operation {
    @Override
    public BigDecimal perform(BigDecimal num1, BigDecimal num2) {
        return (num1.subtract(num2))
                .setScale(2, RoundingMode.UP);
    }
}
