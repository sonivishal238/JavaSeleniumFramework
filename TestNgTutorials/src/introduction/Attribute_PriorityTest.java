package introduction;
import org.testng.annotations.Test;

public class Attribute_PriorityTest {

	@Test(dependsOnMethods = {"b"})
	public void a() {
		
		System.out.println("Running a from DependsOnDemo.java");
	}
	
	@Test(dependsOnMethods = {"c"})
	public void b() {
		System.out.println("Running b from DependsOnDemo.java");
	}
	
	@Test
	public void c() {
		System.out.println("Running c from DependsOnDemo.java");
	}

}
