package test.java.net.javaguides.parameterized;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.avinash.java.net.javaguides.MathUtils;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValueSourceDemoTest {

    @ParameterizedTest
    @ValueSource(ints = {2, 3, 6, 8, 10})
    void isEvenTest(int number){
        MathUtils mathUtils = new MathUtils();
        assertTrue(mathUtils.isEvenCheck(number));
    }

    @ParameterizedTest
    @ValueSource(strings = {"Hello", "JUnit", "Parameterized", "Test"})
    void valueSourceTest(String parameter){
        assertNotNull(parameter);
    }
}
