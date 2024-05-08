package abstractcomponents;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestConfigManager {

	public static String browserName;
	public static String baseUrl;

	static {

		browserName = SetSystemPropertyValue(System.getProperty("user.dir") + "\\src\\main\\java\\resources\\GlobalData.properties",
				"browser");
		System.out.println("browser is: " + browserName);
		
		baseUrl = SetSystemPropertyValue(System.getProperty("user.dir") + "\\src\\main\\java\\resources\\"
				+ TestEnvironmentManager.testEnvironment + "_prop.properties", "baseUrl");
		System.out.println("base url is: " + baseUrl);
	}

	private static String SetSystemPropertyValue(String path, String key) {
		Properties properties = new Properties();
		String value = null;
		
		try {
			FileInputStream stream = new FileInputStream(path);
			properties.load(stream);
			
			// If the key is coming from environment variable/system property then take it from there else read from properties file
			value = System.getProperty(key) != null ? System.getProperty(key) : properties.getProperty(key);
		} catch (IOException e) {
			e.printStackTrace();
		}

		return value;
	}
}
