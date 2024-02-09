package miscelleanous;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MiscelleanousDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().deleteCookieNamed("replace With cookie name");

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
