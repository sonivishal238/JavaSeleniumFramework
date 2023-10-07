package introduction;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameteringTest {

	@Parameters({"URL"})
	@Test
	public void test1(String urlName) {
		System.out.println("Printing the URL:" + urlName);
	}
	
	@Parameters({"firstName", "lastName"})
	@Test
	public void test2(String firstName, String lastName) {
		
		System.out.println("printing values from the ParameteringTest.java");
		System.out.println("FirstName: " + firstName);
		System.out.println("lastName: " + lastName + "\n");
	}
}

