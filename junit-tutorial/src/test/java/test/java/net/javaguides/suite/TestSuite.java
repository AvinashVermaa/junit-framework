package test.java.net.javaguides.suite;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

@Suite
//@SelectClasses({ClassATest.class, ClassBTest.class, ClassCTest.class})
@SelectPackages({"test.java.net.javaguides.annotations", "test.java.net.javaguides.suite"})
public class TestSuite {
}