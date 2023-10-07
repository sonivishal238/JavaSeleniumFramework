package introduction;
import org.testng.annotations.Test;

public class Attribute_TimeoutTest {

	@Test(timeOut = 4000) // wait for 4 seconds before failing
	public void a() {
		
		System.out.println("Running a from DependsOnDemo.java");
	}
}
