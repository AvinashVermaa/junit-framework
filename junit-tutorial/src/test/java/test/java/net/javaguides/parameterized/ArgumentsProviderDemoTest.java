package test.java.net.javaguides.parameterized;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;

import com.avinash.java.net.javaguides.MathUtils;

public class ArgumentsProviderDemoTest {

	  @ParameterizedTest
	    @ArgumentsSource(FactorialArgumentsProvider.class)
	    void factorialTest(int number, int expected){
	        MathUtils mathUtils = new MathUtils();
	        assertEquals(expected, mathUtils.factorial(number));
	    }
}
