package model;

import java.math.BigDecimal;
import java.math.RoundingMode;

// Encapsulation and Polymorphism: model.PowerOperation class
public class PowerOperation implements Operation {
    @Override
    public BigDecimal perform(BigDecimal num1, BigDecimal num2) {
        return num1.pow(Integer.parseInt(num2.toString()))
                .setScale(2, RoundingMode.UP);
    }
}
