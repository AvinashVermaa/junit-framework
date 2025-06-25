package test.java.net.javaguides.annotations;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.avinash.java.net.javaguides.Calculator;

@DisplayName(value="Testing for all the methods present in the AfterAllDemoTest class")
public class AfterAllDemoTest {

	private static Calculator calc;
	
	@BeforeAll
	static void setUpForAllTest() {
		calc = new Calculator();
		System.out.println("Setup was completed for all test methods");
	}
	
	@AfterAll
	static void tearUpForAllTest() {
		calc = null;
		System.out.println("Cleaning was completed after all test method invocation");
	}
	
	@DisplayName(value="Testing for the add functionality")
	@Test
	void testAdd() {
		int actualResult = calc.add(10, 40);
		assertEquals(50, actualResult);
		System.out.println("Testing completed successfully for the testAdd()");
	}
	
	@DisplayName(value="Testing for the sub functionality")
	@Test
	void subtractTest() {
		int actualResult = calc.subtract(100,40);
		assertEquals(60, actualResult);
		System.out.println("Testing completed successfully for the subtractTest()");
	}
	
	@DisplayName(value="Testing for the multiply functionality")
	@Test
	void mulitplyTest() {
		int actualResult = calc.multiply(10, 10);
		assertEquals(100, actualResult);
		System.out.println("Testing completed successfully for the multiplyTest()");
	}
	
	@DisplayName(value="Testing for the divide functionality")
	@Test
	void divideTest() {
		int actualResult = calc.divide(100, 3);
		assertEquals(33, actualResult);
		System.out.println("Testing completed successfully for the divideTest()");
	}
	
}
