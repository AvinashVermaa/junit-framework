package test.java.net.javaguides.annotations;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.avinash.java.net.javaguides.Factorial;

@DisplayName(value = "Testing the FactorialDemoTest Class")
public class FactorialDemoTest {

	@DisplayName(value="Testing the Factorail Functionality")
	@Test
	void testFatorial() {
		Factorial factorial = new Factorial();
		int actualResult = factorial.factorial(5);
		assertEquals(120, actualResult);
		System.out.println("Testing completed successfully");
	}
}
