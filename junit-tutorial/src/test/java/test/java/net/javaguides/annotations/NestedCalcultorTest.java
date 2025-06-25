package test.java.net.javaguides.annotations;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import com.avinash.java.net.javaguides.Calculator;

@DisplayName(value="Testing the NestedCalcultorTest Class")
public class NestedCalcultorTest {

	private static Calculator calc;
	
	@BeforeAll
	static void setUpForAllTest() {
		calc = new Calculator();
		System.out.println("Setup was done successfully for all test methods");
	}
	
	@AfterAll
	static void tearUpForAllTest() {
		calc = null;
		System.out.println("Cleaning was done successfully after all test methods");
	}
	
	@Nested
	class AddFunctionalityTest{
		
		 	@Test
	        public void testAddPositiveNumbers(){
	            assertEquals(7, calc.add(3, 4));
	        }

	        @Test
	        public void testAddPositiveAndNegativeNumbers(){
	            assertEquals(1, calc.add(4, -3));
	        }

	        @Test
	        public void testAddNegativeNumbers(){
	            assertEquals(-7, calc.add(-4, -3));
	        }

	}
	
	@Nested
	class SubtractFunctionalityTest{
		
			@Test
	        public void testSubPositiveNumbers(){
	            assertEquals(26, calc.subtract(30, 4));
	        }

	        @Test
	        public void testSubPositiveAndNegativeNumbers(){
	            assertEquals(7, calc.subtract(4, -3));
	        }

	        @Test
	        public void testSubNegativeNumbers(){
	            assertEquals(-1, calc.subtract(-4, -3));
	        }

	}
}
