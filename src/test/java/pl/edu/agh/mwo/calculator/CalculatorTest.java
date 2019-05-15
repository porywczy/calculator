package pl.edu.agh.mwo.calculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void testSum() {

        Calculator calc = new Calculator();
        assertEquals(12, calc.sum(5,7));

    }

    @Test
    public void testSubtract() {

        Calculator calc = new Calculator();
        assertEquals(5, calc.subtract(7,2));

    }

    @Test
    public void testMultiply() {

        Calculator calc = new Calculator();
        assertEquals(6, calc.multiply(2,3));

    }

    @Test
    public void testDivide() {

        Calculator calc = new Calculator();
        assertEquals(2, calc.divide(6,3), 0.01);

    }

    @Test(expected = Exception.class)
    public void testDivideByZero() {

        Calculator calc = new Calculator();
        calc.divide(6,0);

    }

    @Test
    public void testAvg() {

        Calculator calc = new Calculator();
        assertEquals(5, calc.avg(6,4, 3, 7), 0.01);

    }

}
