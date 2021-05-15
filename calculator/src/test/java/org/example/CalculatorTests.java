package org.example;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTests {

    @Test
    public void it_should_add_two_numbers() {
        // Arrange
        Calculator calculator = new Calculator();

        //Act
        Integer result = calculator.add(5,5);

        Assert.assertTrue(result == 10);
    }

    @Test
    public void it_should_subtract_two_nubers() {
        Calculator calculator = new Calculator();

        Integer result = calculator.subtract(10, 5);

        Assert.assertTrue(result == 5);
    }
}
