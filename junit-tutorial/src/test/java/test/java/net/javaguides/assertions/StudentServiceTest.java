package test.java.net.javaguides.assertions;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.avinash.java.net.javaguides.Student;
import com.avinash.java.net.javaguides.StudentNotFoundException;
import com.avinash.java.net.javaguides.StudentService;

@DisplayName(value="Testing the StudentServiceTest Class")
public class StudentServiceTest {
	
	private static StudentService studentService;
	
	@BeforeAll
	static void setUp() {
		studentService = new StudentService();
		System.out.println("Setup was done successfully");
	}

	@Test
	@DisplayName(value="Testing the getStudentsTest()")
	@Disabled
	void getStudentsTest() {
		List<Student> students = studentService.getStudents();
		Student student = new Student(1, "Avinash", "IT-Software Department");
		students.add(student);
		
		//assertTrue(!students.isEmpty());
		
		//assertTrue(()->students.isEmpty());
		
		//assertTrue(students.isEmpty(), "List of student is not empty");
		
		//assertTrue(students.isEmpty(), ()-> "List of student is not empty : "+students);
		
		//assertTrue(()->students.isEmpty(), "List of student is not empty : "+students);
		
		//assertTrue(()->students.isEmpty(), ()-> "List of student is not empty : "+students);
	}
	
	@DisplayName(value="Testing the getStudentsTestUsingAssertFalse()")
	@Test
	@Disabled
	void getStudentsTestUsingAssertFalse() {
		List<Student> students = studentService.getStudents();
		Student student = new Student(1, "Avinash Verma", "Java Developer");
		students.add(student);
		
		//assertFalse(students.isEmpty());
		
		//assertFalse(()->students.isEmpty());
		
		//assertFalse(students.isEmpty(), "List of student is not empty");
		
		//assertFalse(students.isEmpty(), ()-> "List of student is not empty : "+students);
		
		//assertFalse(()-> students.isEmpty(), "List of student is not empty : "+students);
		
		//assertFalse(()->students.isEmpty(), ()-> "List of student is not empty : "+students);
	
	}
	
	@DisplayName(value= "Testing the getStudentByIdTest()")
	@Test
	@Disabled
	public void getStudentByIdTest() {
		
		List<Student> students = studentService.getStudents();
		Student student = new Student(1, "Avinash Verma", "CS Department");
		students.add(student);
		
		Student student2 = studentService.getStudentById(12);
		
		//assertNull(student2);
		
		//assertNull(student2, "Student is Found : "+student2);
		
		//assertNull(student2, ()-> "Student is Found : "+student2);
	}
	
	@DisplayName(value="Testing the getStudentByIdTestAssertNotNull()")
	@Test
	@Disabled
	public void getStudentByIdTestAssertNotNull() {
		List<Student> students = studentService.getStudents();
		Student student = new Student(1,"Avinash Verma","CS Department");
		students.add(student);
		
		Student student2 = studentService.getStudentById(1);
		
		//assertNotNull(student2);
		
		//assertNotNull(student2, "Student is null : "+student2);
		
		//assertNotNull(student2, ()-> "Student is null : "+student2);
		
		
	}
	
	@DisplayName(value="Testing the getStudentByIdTestAssertEquals()")
	@Test
	@Disabled
	public void getStudentByIdTestAssertEquals() {
		List<Student> students = studentService.getStudents();
		Student student = new Student(1,"Avinash","Java");
		students.add(student);
		
		Student student2 = studentService.getStudentById(1);
		
		//assertEquals(1, student2.getId());
		
		//assertEquals(student, student2);
		
		//assertEquals(student.getName(),student2.getName());
		
		//assertEquals("Avinash", student2.getName());
	}
	
	@DisplayName(value = "Testing the getStudentByNameAssertNotEquals()")
	@Test
	@Disabled
	public void getStudentByNameAssertNotEquals() {
		List<Student> students = studentService.getStudents();
		Student student = new Student(1,"Avinash","Java");
		students.add(student);
		
		Student student2 = studentService.getStudentByName("Avinash");
		
		//assertNotEquals("Baba", student2.getName());
		
		//assertNotEquals(student, student2);
		
		//assertNotEquals(2, student2.getId());
		
		
	}
	
	@Test
    public void getStudentNamesByDepartmentTestUsingAssertArrayEquals(){

        StudentService studentService = new StudentService();

        Student student = new Student(1, "Ramesh", "Science");
        Student student1 = new Student(2, "Umesh", "Science");
        Student student2 = new Student(3, "Ram", "Arts");
        studentService.addStudent(student);
        studentService.addStudent(student1);
        studentService.addStudent(student2);

        String[] actualArray = studentService.getStudentNamesByDepartment("Science");
        String[] expectedArray = {"Ramesh", "Umesh"};

       // assertArrayEquals(expectedArray, actualArray);

       // assertArrayEquals(expectedArray, actualArray, "Student names are not equal");

        // assertArrayEquals(expectedArray, actualArray, () -> "Student names are not equal");

        Integer[] actualStudentIds = studentService.getStudentIdsByDepartment("Science");
        Integer[] expectedStudentIds = {1, 2};

        //assertArrayEquals(expectedStudentIds, actualStudentIds);

       // assertArrayEquals(expectedStudentIds, actualStudentIds, "Student Ids are not equal");

        assertArrayEquals(expectedStudentIds, actualStudentIds, () -> "Student Ids are not equal");
    }

    @Test
    public void getStudentNameListByDepartmentTestUsingAssertIterableEquals(){

        StudentService studentService = new StudentService();

        Student student = new Student(1, "Ramesh", "Science");
        Student student1 = new Student(2, "Umesh", "Science");
        Student student2 = new Student(3, "Ram", "Arts");
        studentService.addStudent(student);
        studentService.addStudent(student1);
        studentService.addStudent(student2);

        List<String> actualStudentNameList = studentService.getStudentNameListByDepartment("Science");
        List<String> expectedStudentNameList = Arrays.asList("Ramesh", "Umesh", "Ram");

       // assertIterableEquals(expectedStudentNameList, actualStudentNameList);

       // assertIterableEquals(expectedStudentNameList, actualStudentNameList, "Student name list is not equal");


        // assertIterableEquals(expectedStudentNameList, actualStudentNameList, () -> "Student name list is not equal");

        List<Integer> actualStudentIdList = Arrays.asList(1, 2);
        List<Integer> expectedStudentIdList = studentService.getStudentIdListByDepartment("Science");

       // assertIterableEquals(expectedStudentIdList, actualStudentIdList);

        //assertIterableEquals(expectedStudentIdList, actualStudentIdList, "Student id list is not equal");

        assertIterableEquals(expectedStudentIdList, actualStudentIdList, () -> "Student id list is not equal");

    }

    @Test
    public void getStudentByNameTestUsingAssertThrows(){

        StudentService studentService = new StudentService();

        Student student = new Student(1, "Ramesh", "Science");
        studentService.addStudent(student);

//        assertThrows(StudentNotFoundException.class, () -> {
//            studentService.getStudentByName("Umesh");
//        });

//        assertThrows(StudentNotFoundException.class, () -> {
//            studentService.getStudentByName("Ramesh");
//        }, "StudentNotFoundException should be thrown. But, it wasn't");

        assertThrows(RuntimeException.class, () -> {
            studentService.getStudentByName("Umesh");
        }, () -> "StudentNotFoundException should be thrown. But, it wasn't");
    }

    @Test
    public void getStudentByNameTestUsingAssertThrowsExactly(){

        StudentService studentService = new StudentService();

        Student student = new Student(1, "Ramesh", "Science");
        studentService.addStudent(student);

//        assertThrowsExactly(StudentNotFoundException.class, () -> {
//            studentService.getStudentByName("Umesh");
//        });

//        assertThrowsExactly(NullPointerException.class, () -> {
//            studentService.getStudentByName("Umesh");
//        }, "StudentNotFoundException should be thrown. But, it wasn't");

//        assertThrowsExactly(StudentNotFoundException.class, () -> {
//            studentService.getStudentByName("Ramesh");
//        }, () -> "StudentNotFoundException should be thrown. But, it wasn't");

        StudentNotFoundException exception = assertThrowsExactly(StudentNotFoundException.class, () -> {
            studentService.getStudentByName("Umesh");
        }, () -> "StudentNotFoundException should be thrown. But, it wasn't");

        assertEquals("Student not found with name: Umesh", exception.getMessage());

    }
}
