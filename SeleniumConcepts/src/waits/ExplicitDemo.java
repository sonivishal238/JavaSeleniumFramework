//package waits;
//
//import java.time.Duration;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Wait;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;
//
//public class ExplicitDemo {
//
//	public static void main(String[] args) {
//
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
//		driver.manage().window().maximize();
//
//		try {
//
//			List<String> itemNames = new ArrayList<String>() {
//				{
//					add("Brocolli");
//					add("Cucumber");
//				}
//			};
//
//			addItems(driver, itemNames);
//			driver.findElement(By.cssSelector("img[alt='Cart']")).click();
//			driver.findElement(By.xpath("//button[contains(text(), 'PROCEED TO CHECKOUT')]")).click();
//
//			// Applying the explicit wait
//			Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//			wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promocode")));
//
//			driver.findElement(By.cssSelector("input.promocode")).sendKeys("rahulshettyacademy");
//			driver.findElement(By.cssSelector("button.promobtn")).click();
//
//			wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
//			Assert.assertTrue(driver.findElement(By.className("promoInfo")).getText().equals("Code applied ..!"));
//
//		} catch (Exception ex) {
//			
//			System.out.println("Throwing exception... " + ex.getMessage());
//		}
//
//		finally {
//
//			System.out.println("Quitting driver...");
//			driver.close();
//			driver.quit();
//		}
//
//	}
//
//	public static void addItems(WebDriver driver, List<String> itemNames) {
//		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
//
//		for (int i = 0; i < products.size(); i++) {
//			String name = products.get(i).getText().split("-")[0].trim();
//
//			if (itemNames.contains(name)) {
//				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
//			}
//		}
//
//	}
//}
