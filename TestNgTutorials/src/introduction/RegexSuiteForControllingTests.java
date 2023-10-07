package introduction;

import org.testng.annotations.Test;

public class RegexSuiteForControllingTests {

	@Test
	public void runMe() {
		
		System.out.println("1. This is included from RegexSuiteForControllingTests.java\n");
	}
	
	@Test
	public void runMe2() {
		
		System.out.println("2. This is included from RegexSuiteForControllingTests.java\n");
	}
	
	@Test
	public void runMe3() {
		
		System.out.println("3. This is included from RegexSuiteForControllingTests.java\n");
	}
	
	@Test
	public void exclude() {
		
		System.out.println("This should be excluded from RegexSuiteForControllingTests.java");
	}
}
