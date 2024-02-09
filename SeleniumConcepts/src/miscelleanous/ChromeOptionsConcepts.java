package miscelleanous;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptionsConcepts {

	public static void main(String[] args) {
		// 1. Code to ignore the certificates
		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		
		// 2. Setting proxy
		Proxy proxy = new Proxy();
		proxy.setHttpProxy("replace with actual proxy");
		options.setCapability("proxy", proxy);

		// 3.popup blocking
		options.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking"));
		
		// 4. changing the default download directory
		Map<String, Object> prefes = new HashMap<String, Object>();
		prefes.put("download.default_directory", "/directory/path");
		options.setExperimentalOption("prefs", prefes);
		
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();

		try {

			Thread.sleep(3000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		finally {
			System.out.println("Quitting driver");
			driver.quit();
		}
	}
}
