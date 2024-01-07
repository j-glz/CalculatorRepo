package model;

import java.math.BigDecimal;
import java.math.RoundingMode;

// Encapsulation and Polymorphism: model.MultiplyOperation class
public class MultiplyOperation implements Operation {
    @Override
    public BigDecimal perform(BigDecimal num1, BigDecimal num2) {
        return (num1.multiply(num2)).setScale(2, RoundingMode.UP);
    }
}
