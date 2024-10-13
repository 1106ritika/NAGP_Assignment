package NAGP_DevTestOps.NAGP_DevTestOps;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CalculatorTest {
	private Calculator calculator;

    @BeforeClass
    public void setUp() {
        // Initialize the Calculator instance before running tests
        calculator = new Calculator();
    }

    @Test(description = "Test addition of two positive integers.")
    public void testAdd() {
        int result = calculator.add(10, 5);
        Assert.assertEquals(result, 15, "10 + 5 should equal 15");
    }

    @Test(description = "Test subtraction resulting in a positive number.")
    public void testSubtractPositiveResult() {
        int result = calculator.subtract(10, 5);
        Assert.assertEquals(result, 5, "10 - 5 should equal 5");
    }

    @Test(description = "Test subtraction resulting in a negative number.")
    public void testSubtractNegativeResult() {
        int result = calculator.subtract(5, 10);
        Assert.assertEquals(result, -5, "5 - 10 should equal -5");
    }

    @Test(description = "Test multiplication of two integers.")
    public void testMultiply() {
        int result = calculator.multiply(4, 5);
        Assert.assertEquals(result, 20, "4 * 5 should equal 20");
    }

    @Test(description = "Test division of two integers.")
    public void testDivide() {
        double result = calculator.divide(10, 2);
        Assert.assertEquals(result, 5.0, "10 / 2 should equal 5.0");
    }

    @Test(description = "Test division by zero should throw IllegalArgumentException.", expectedExceptions = IllegalArgumentException.class)
    public void testDivideByZero() {
        calculator.divide(10, 0);
    }
}