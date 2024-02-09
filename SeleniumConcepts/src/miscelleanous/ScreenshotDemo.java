package miscelleanous;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotDemo {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://chromedriver.chromium.org/capabilities");
		driver.manage().window().maximize();

		try {
			
			File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("D://ss.png"));
			System.out.println("screenshot taken");
			
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
