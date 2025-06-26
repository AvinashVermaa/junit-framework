package test.java.net.javaguides.parameterized;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import com.avinash.java.net.javaguides.Days;
import com.avinash.java.net.javaguides.MathUtils;

public class EnumSourceDemoTest {

	 @ParameterizedTest
	    @EnumSource(value = Days.class, names = {"SUNDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY"})
	    void isWeekdayTest(Days day){
	        MathUtils mathUtils = new MathUtils();
	        assertTrue(mathUtils.isWeekday(day));
	    }
}
