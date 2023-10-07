package introduction;

import org.testng.annotations.Test;

public class IncludeOnlyDemo {

	@Test
	public void includeMe() {
		
		System.out.println("This is included from IncludeOnlyDemo.java\n");
	}
	
	@Test
	public void DoNotIncludeMe() {
		
		System.out.println("This should be excluded from IncludeOnlyDemo.java");
	}

}
