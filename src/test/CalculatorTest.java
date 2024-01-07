package test;

import model.*;
import org.junit.jupiter.api.Test;
import model.Calculator;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    void testAddition() {
        Operation addOperation = new AddOperation();
        BigDecimal result = addOperation.perform(BigDecimal.valueOf(5), BigDecimal.valueOf(3))
                .setScale(0);
        assertEquals(BigDecimal.valueOf(8), result);
    }

    @Test
    void testSubtraction() {
        Operation subtractOperation = new SubtractOperation();
        BigDecimal result = subtractOperation.perform(BigDecimal.valueOf(5), BigDecimal.valueOf(3))
                .setScale(0);
        assertEquals(BigDecimal.valueOf(2), result);
    }

    @Test
    void testMultiplication() {
        Operation multiplyOperation = new MultiplyOperation();
        BigDecimal result = multiplyOperation.perform(BigDecimal.valueOf(5), BigDecimal.valueOf(3))
                .setScale(0);
        assertEquals(BigDecimal.valueOf(15), result);
    }

    @Test
    void testDivision() {
        Operation divideOperation = new DivideOperation();
        BigDecimal result = divideOperation.perform(BigDecimal.valueOf(6), BigDecimal.valueOf(3))
                .setScale(0);
        assertEquals(BigDecimal.valueOf(2), result);
    }

    @Test
    void testDivisionByZero() {
        Operation divideOperation = new DivideOperation();
        assertThrows(ArithmeticException.class, () -> divideOperation.perform(BigDecimal.valueOf(5), BigDecimal.ZERO));
    }

    @Test
    void testPower() {
        Operation powerOperation = new PowerOperation();
        BigDecimal result = powerOperation.perform(BigDecimal.valueOf(2), BigDecimal.valueOf(3))
                .setScale(0);
        assertEquals(BigDecimal.valueOf(8), result);
    }

    @Test
    void testSquareRoot() {
        Operation sqrtOperation = new SquareRootOperation();
        BigDecimal result = sqrtOperation.perform(BigDecimal.valueOf(25), BigDecimal.valueOf(0))
                .setScale(1, RoundingMode.UP);
        assertEquals(BigDecimal.valueOf(5.0), result);
    }

    @Test
    void testSquareRootOfNegativeNumber() {
        Operation sqrtOperation = new SquareRootOperation();
        assertThrows(ArithmeticException.class, () -> sqrtOperation.perform(BigDecimal.valueOf(-25), BigDecimal.ZERO));
    }

    @Test
    void testTrigonometricSin() {
        Operation sinOperation = new TrigonometricOperation("sin");
        BigDecimal result = sinOperation.perform(BigDecimal.valueOf(30), BigDecimal.valueOf(0))
                .setScale(1, RoundingMode.UP);
        assertEquals(BigDecimal.valueOf(0.5), result);
    }

    @Test
    void testInvalidTrigonometricOperation() {
        Operation invalidOperation = new TrigonometricOperation("invalid");
        assertThrows(IllegalArgumentException.class, () -> invalidOperation.perform(BigDecimal.valueOf(30), BigDecimal.ZERO));
    }
}