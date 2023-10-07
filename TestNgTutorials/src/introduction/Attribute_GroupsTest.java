package introduction;

import org.testng.annotations.Test;

public class Attribute_GroupsTest {

	@Test(groups= {"Smoke"})
	public void smokeTest1() {
		System.out.println("Smoke Test1 from GroupsTest.java");
	}
	
	@Test(groups= {"Smoke"})
	public void smokeTest2() {
		System.out.println("Smoke Test2 from GroupsTest.java");
	}
	
	@Test(groups= {"Smoke"})
	public void smokeTest3() {
		System.out.println("Smoke Test3 from GroupsTest.java");
	}
}
