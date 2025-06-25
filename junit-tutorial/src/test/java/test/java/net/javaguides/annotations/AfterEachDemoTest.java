package test.java.net.javaguides.annotations;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.avinash.java.net.javaguides.Calculator;

@DisplayName(value="Doing the testing of AfterEachDemoTest class")
public class AfterEachDemoTest {
	
	Calculator calc;

	@BeforeEach
	void setUp() {
		calc = new Calculator();
		System.out.println("Done the setup for testing");
	}
	
	@AfterEach
	void tearUp() {
		calc = null;
		System.out.println("Cleaning the setup after testing");
	}
	
	@DisplayName(value="Testing the add functionality")
	@Test
	void testAdd() {
		int actualResult = calc.add(10, 20);
		assertEquals(30, actualResult);
		System.out.println("Testing completed successfully of testAdd()");
	}
	
	@DisplayName(value="Testing the sub functionality")
	@Test
	void subtractTest() {
		int actualResult = calc.subtract(10, 10);
		assertEquals(0,actualResult);
		System.out.println("Testing completed successfully of subtractTest()");
	}
	
	@DisplayName(value="Testing the multiply functionality")
	@Test
	void multiplyTest() {
		int actualResult = calc.multiply(10, 30);
		assertEquals(300,actualResult);
		System.out.println("Testing completed successfully of multiplyTest()");
	}
	
	@DisplayName(value="Testing the divide functionality")
	@Test
	void divideTest() {
		int actualResult = calc.divide(10, 3);
		assertEquals(3, actualResult);
		System.out.println("Testing completed successfully of divideTest()");
	}
}
