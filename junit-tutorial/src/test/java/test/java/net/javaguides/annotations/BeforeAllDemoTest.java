package test.java.net.javaguides.annotations;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.avinash.java.net.javaguides.Calculator;

@DisplayName(value="Testing the BeforeAllDemoTest Class")
public class BeforeAllDemoTest {

	private static Calculator calc;
	
	@BeforeAll
	static void setUpForAllTest() {
		calc = new Calculator();
		System.out.println("Setup was done for all the test method present in this class");
	}
	
	@DisplayName(value="Testing the add functionality")
	@Test
	void testAdd() {
		int actualResult = calc.add(10, 10);
		assertEquals(20, actualResult);
		System.out.println("Testing completed for testAdd() successfully");
	}
	
	@Test
	@DisplayName(value="Testing the sub functionality")
	void subtractTest() {
		int actualResult = calc.subtract(19, 9);
		assertEquals(10, actualResult);
		System.out.println("Testing completed successfully for subtractTest()");
	}
	
	@DisplayName(value="Testing the multiply functionality")
	@Test
	void multiplyTest() {
		int actualResult = calc.multiply(19, 3);
		assertEquals(57, actualResult);
		System.out.println("Testing completed successfully for multiplyTest()");
	}
	
	@DisplayName(value="Testing the divide functionality")
	@Test
	void divideTest() {
		int actualResult = calc.divide(100, 4);
		assertEquals(25, actualResult);
		System.out.println("Testing completed successfully for divideTest()");
	}
	
	
}
