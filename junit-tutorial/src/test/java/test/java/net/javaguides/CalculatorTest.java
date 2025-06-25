package test.java.net.javaguides;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.avinash.java.net.javaguides.Calculator;

class CalculatorTest {
	
	Calculator calc = new Calculator();

	@Test
	public void addTest() {
		//Calculator calc = new Calculator();
		int actualResult = calc.add(1, 3);
		assertEquals(4, actualResult);
	}
	
	@Test
	public void subTest() {
		//Calculator calc = new Calculator();
		int actualResult = calc.subtract(10, 4);
		assertEquals(6,actualResult);
	}
	
	@Test
	public void multiplyTest() {
		//Calculator calc = new Calculator();
		int actualResult = calc.multiply(4, 5);
		assertEquals(20, actualResult);
	}
	
	@Test
	public void divideTest() {
		//Calculator calc = new Calculator();
		int actualResult = calc.divide(10, 3);
		assertEquals(3,actualResult);
	}
	
}
