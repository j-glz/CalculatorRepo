package model;

import java.math.BigDecimal;

// Encapsulation and Data Abstraction: model.Operation interface
public interface Operation {
    BigDecimal perform(BigDecimal num1, BigDecimal num2);
}
