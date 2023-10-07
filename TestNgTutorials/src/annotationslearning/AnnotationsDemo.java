package annotationslearning;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AnnotationsDemo {
	
	/* Suite: Collection of tests.
	 * Test: Collection of classes.
	 * Class: Collection of methods.
	 * Method: A single test method
	 */
	
	public AnnotationsDemo() {
		System.out.println("Constructor was called");
	}
	
	@Test
	public void Test1() {
		System.out.println("I am test 2 AnnotationsDemo.java\n");
	}
	
	@Test
	public void Test2() {
		System.out.println("I am test 2 AnnotationsDemo.java\n");
	}
	
	@BeforeMethod
	public void beforeEveryMethod() {
		System.out.println("I am before method, I will execute before every test method in the class AnnotationsDemo.java\n");
	}
	
	@AfterMethod
	public void afterEveryMethod() {
		System.out.println("I am after method, I will execute after every test method in the class AnnotationsDemo.java\n");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("I am before class, I will execute before the class AnnotationsDemo.java\n");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("I am after class, I will execute after the class AnnotationsDemo.java\n");
	}
	
	@BeforeTest
	public void beforeTheTestFolder() {
		System.out.println("I am before test, I will execute once before the test folder, AnnotationsDemo.java\n");
	}
	
	@AfterTest
	public void AfterTheTestFolder() {
		System.out.println("I am after test, I will execute once after the test folder AnnotationsDemo.java\n");
	}
	
	@BeforeSuite
	public void RunBeforeSuite() {
		System.out.println("I am before suite AnnotationsDemo.java\n");
	}
	
	@AfterSuite
	public void RunAfterSuite() {
		System.out.println("I am after suite AnnotationsDemo.java\n");
	}
	
	@Test(groups= {"Sanity"})
	public void sanityTest1() {
		System.out.println("Sanity Test1 from AnnotationsDemo.java");
	}
	
	@Test(groups= {"Sanity"})
	public void sanityTest2() {
		System.out.println("Sanity Test2 from AnnotationsDemo.java");
	}
	
	@Test(groups= {"Sanity"})
	public void sanityTest3() {
		System.out.println("Sanity Test3 from AnnotationsDemo.java");
	}
	
	@Parameters({"firstName", "lastName"})
	@Test
	public void MultipleParams(String firstName, String lastName) {
		
		System.out.println("printing values from the AnnotationsDemo.java");
		System.out.println("FirstName: " + firstName);
		System.out.println("lastName: " + lastName);
	}
}
