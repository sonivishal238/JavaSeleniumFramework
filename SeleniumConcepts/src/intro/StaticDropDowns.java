package intro;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class StaticDropDowns {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		List<WebElement> checkBoxes = driver.findElements(By.cssSelector("input[id*='checkBoxOption']"));
		System.out.println("Count of the checkbox is: " + checkBoxes.size());

		WebElement firstcheckbox = checkBoxes.get(0);
		firstcheckbox.click();
		Assert.assertTrue(firstcheckbox.isSelected());
		firstcheckbox.click();

		Assert.assertFalse(firstcheckbox.isSelected());
		driver.quit();

	}
}
