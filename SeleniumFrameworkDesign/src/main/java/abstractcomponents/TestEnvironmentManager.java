package abstractcomponents;

public class TestEnvironmentManager {

	public static String testEnvironment;
	
	static {
		testEnvironment = System.getProperty("environment") != null ? System.getProperty("environment") : "qa";
		System.out.println("test environment is: "+ testEnvironment);
	}
}
