package model;

import java.math.BigDecimal;
import java.math.RoundingMode;

// Encapsulation and Polymorphism: model.AddOperation class
public class AddOperation implements Operation {
    @Override
    public BigDecimal perform(BigDecimal num1, BigDecimal num2) {
        return (num1.add(num2))
                .setScale(2, RoundingMode.UP);
    }
}
