package miscelleanous;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class WindowScrollingDemo {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();

		try {

			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("window.scroll(0, 600)");
			jse.executeScript("document.querySelector(\".tableFixHead\").scrollTop=5000");
			
			List<WebElement> values = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
			
			int sum = 0;
			
			for(int i = 0; i < values.size(); i++) {
				sum += Integer.parseInt(values.get(i).getText());
			}
			
			String totalAmountText = driver.findElement(By.cssSelector("div.totalAmount")).getText();
			String[] split = totalAmountText.split(":");
			int price = Integer.parseInt(split[split.length - 1].trim());
			System.out.println("Sum = "+ sum);
			System.out.println("Regex price =" + price);
			Assert.assertTrue(sum == price);
			
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
