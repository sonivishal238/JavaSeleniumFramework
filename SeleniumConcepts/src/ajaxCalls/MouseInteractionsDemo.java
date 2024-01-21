package ajaxCalls;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseInteractionsDemo {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

		try {
			Actions action = new Actions(driver);
			WebElement move = driver.findElement(By.id("nav-link-accountList-nav-line-1"));

			action.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT)
					.sendKeys("hello") // 1. send keys in capital letters
					.doubleClick() // select the text
					.build().perform();

			// Right clicking on move element found above
			action.moveToElement(move).contextClick().build().perform();

			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}

		finally {
			System.out.println("Quitting driver");
			driver.quit();
		}

	}

}
