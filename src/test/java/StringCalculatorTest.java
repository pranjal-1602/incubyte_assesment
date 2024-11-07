package test.java;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import main.java.StringCalculator;

public class StringCalculatorTest {
	@Test
    public void testAdd_EmptyString_ReturnsZero() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(0, calculator.add(""), "Empty string should return 0");
    }
	
	@Test
	public void testAdd_SingleNumber_ReturnsSameNumber() {
	    StringCalculator calculator = new StringCalculator();
	    assertEquals(1, calculator.add("1"), "Single number should return the number itself");
	}
}
