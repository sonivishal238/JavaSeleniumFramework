package waits;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitDemo {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();

		try {

			List<String> itemNames = new ArrayList<String>() {
				{
					add("Brocolli");
					add("Cucumber");
				}
			};

			addItems(driver, itemNames);
			driver.findElement(By.cssSelector("img[alt='Cart']")).click();
			driver.findElement(By.xpath("//button[contains(text(), 'PROCEED TO CHECKOUT')]")).click();

			// Applying the fluent wait
			Wait<WebDriver> wait = new FluentWait<>(driver)
					.withTimeout(Duration.ofSeconds(10))
					.pollingEvery(Duration.ofMillis(200))
					.ignoring(ElementNotInteractableException.class);
			
			wait.until(d -> {
				
				try {
					return d.findElement(By.cssSelector("input.promoCode"));
				}catch(Exception ex) {
					return false;
				}
			});

			driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
			driver.findElement(By.cssSelector("button.promoBtn")).click();

			wait.until(d -> {
				try {
					return d.findElement(By.cssSelector("span.promoInfo"));
				}catch(Exception ex) {
					return false;
				}
			});
			
			// Soft assertion, equivalent to the fluent assertions in c#
//			SoftAssert softAssert = new SoftAssert();
//			softAssert.assertTrue(driver.findElement(By.className("promoInfo")).getText().equals("Code applied ..!"));


		} catch (Exception ex) {
			
			throw ex;
		}

		finally {

			System.out.println("Quitting driver...");
			driver.close();
			driver.quit();
		}

	}

	public static void addItems(WebDriver driver, List<String> itemNames) {
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < products.size(); i++) {
			String name = products.get(i).getText().split("-")[0].trim();

			if (itemNames.contains(name)) {
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
			}
		}

	}
}
