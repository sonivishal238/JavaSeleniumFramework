package miscelleanous;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class HandleBrokenUrlDemo {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		try {
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			driver.manage().window().maximize();

			// Java methods to call the URL's and getting the status code

			// Step-1 It is to get all urls tied up to the links using selenium
			List<WebElement> links = driver.findElements(By.cssSelector("li[class='gf-li'] a"));

			SoftAssert a = new SoftAssert();

			for (WebElement link : links)

			{

				String url = link.getAttribute("href");

				// step-2 if status code >= 400 then the URL is broken
				HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
				conn.setRequestMethod("HEAD");
				conn.connect();

				int respCode = conn.getResponseCode();
				System.out.println(respCode);

				a.assertTrue(respCode < 400, "The link with Text" + link.getText() + " is broken with code" + respCode);

			}

			a.assertAll();

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
