package test.java.net.javaguides.annotations;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.avinash.java.net.javaguides.Calculator;

@DisplayName(value="Testing the BeforeEachDemoTest Class All Test Methods")
public class BeforeEachDemoTest {

	private Calculator calc;
	
	@BeforeEach
	void setUp() {
		calc = new Calculator();
		System.out.println("Setup code was done");
	}
	
	@Test
	@DisplayName(value = "Testing the add functionality")
	void testAdd() {
		int actualResult = calc.add(10, 20);
		assertEquals(30, actualResult);
		System.out.println("Testing done successfully of testAdd() : ");
	}
	
	@DisplayName(value="Testing the sub functionality")
	@Test
	void subtractTest() {
		int actualResult = calc.subtract(10, 3);
		assertEquals(7, actualResult);
		System.out.println("Testing done successfully of subtractTest()");
	}
	
	@DisplayName(value="Testing the multiply functionality")
	@Test
	void multiplyTest() {
		int actualResult = calc.multiply(10, 3);
		assertEquals(30, actualResult);
		System.out.println("Testing done successfully of multiplyTest()");
	}
	
	@DisplayName(value="Testing the divide functionality")
	@Test
	void divideTest() {
		int actualResult = calc.divide(20, 4);
		assertEquals(5,actualResult);
		System.out.println("Testing done successfully of divideTest()");
	}
}
