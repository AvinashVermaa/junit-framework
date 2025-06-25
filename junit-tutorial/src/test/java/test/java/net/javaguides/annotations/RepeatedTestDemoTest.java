package test.java.net.javaguides.annotations;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

import com.avinash.java.net.javaguides.Calculator;

public class RepeatedTestDemoTest {

    @BeforeEach
    void setUp(){
        System.out.println("setUp method is calling ..");
    }

    @AfterEach
    void tearDown(){
        System.out.println("tearDown method is calling ..");
    }

    @BeforeAll
    static void setUpBeforeClass(){
        System.out.println("setUpBeforeClass method is calling ..");
    }

    @AfterAll
    static void tearDownAfterClass(){
        System.out.println("tearDownAfterClass method is calling ..");
    }

    @RepeatedTest(value = 5, name = RepeatedTest.LONG_DISPLAY_NAME)
    @DisplayName("Test Addition Repeatedly")
    public void addTest(){
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.add(2, 3));
        System.out.println("addTest method is calling ..");
    }
}
