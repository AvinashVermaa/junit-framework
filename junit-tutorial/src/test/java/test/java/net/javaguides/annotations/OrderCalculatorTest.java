package test.java.net.javaguides.annotations;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import com.avinash.java.net.javaguides.Calculator;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OrderCalculatorTest {

    @Order(1)
    @Test
    void testAdd(){
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.add(2,3));
    }

    @Order(2)
    @Test
    void testSubtract(){
        Calculator calculator = new Calculator();
        assertEquals(1, calculator.subtract(3,2));
    }

    @Order(3)
    @Test
    void testMultiply(){
        Calculator calculator = new Calculator();
        assertEquals(6, calculator.multiply(3,2));
    }

    @Order(4)
    @Test
    void testDivide(){
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.divide(4,2));
    }
}