package test;

import model.*;
import org.junit.jupiter.api.Test;
import service.Calculator;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    void testAddition() {
        Operation addOperation = new AddOperation();
        double result = addOperation.perform(5, 3);
        assertEquals(8, result, 0.001);
    }

    @Test
    void testSubtraction() {
        Operation subtractOperation = new SubtractOperation();
        double result = subtractOperation.perform(5, 3);
        assertEquals(2, result, 0.001);
    }

    @Test
    void testMultiplication() {
        Operation multiplyOperation = new MultiplyOperation();
        double result = multiplyOperation.perform(5, 3);
        assertEquals(15, result, 0.001);
    }

    @Test
    void testDivision() {
        Operation divideOperation = new DivideOperation();
        double result = divideOperation.perform(6, 3);
        assertEquals(2, result, 0.001);
    }

    @Test
    void testDivisionByZero() {
        Operation divideOperation = new DivideOperation();
        assertThrows(ArithmeticException.class, () -> divideOperation.perform(5, 0));
    }

    @Test
    void testPower() {
        Operation powerOperation = new PowerOperation();
        double result = powerOperation.perform(2, 3);
        assertEquals(8, result, 0.001);
    }

    @Test
    void testSquareRoot() {
        Operation sqrtOperation = new SquareRootOperation();
        double result = sqrtOperation.perform(25, 0);
        assertEquals(5, result, 0.001);
    }

    @Test
    void testSquareRootOfNegativeNumber() {
        Operation sqrtOperation = new SquareRootOperation();
        assertThrows(ArithmeticException.class, () -> sqrtOperation.perform(-25, 0));
    }

    @Test
    void testTrigonometricSin() {
        Operation sinOperation = new TrigonometricOperation("sin");
        double result = sinOperation.perform(30, 0);
        assertEquals(0.5, result, 0.001);
    }

    @Test
    void testInvalidTrigonometricOperation() {
        Operation invalidOperation = new TrigonometricOperation("invalid");
        assertThrows(IllegalArgumentException.class, () -> invalidOperation.perform(30, 0));
    }
}