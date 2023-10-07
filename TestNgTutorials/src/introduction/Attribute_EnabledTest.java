package introduction;

import org.testng.annotations.Test;

public class Attribute_EnabledTest {


	// This is equivalent to skipping a test
	@Test(enabled = false)
	public void a() {
		
		System.out.println("I will be skipped");
	}
	
	@Test
	public void b() {
		System.out.println("Running b from Attribute_EnabledTest.java");
	}
	
	@Test
	public void c() {
		System.out.println("Running c from Attribute_EnabledTest.java");
	}

}
