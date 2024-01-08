package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class DriverIntro {

	public static void main(String[] args) {

		// Two ways of using driver.exe files:
		// 1. Old. need to have the chromedriver.exe file
		// System.setProperty("webdriver.chrome.driver",
		// "D:\\VishalSoniLearning\\JavaSelenium\\chromedriver.exe");

		// 2. Selenium Manager (introduced in Selenium 4)
		// WebDriver driver = new ChromeDriver();
		// WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();

//		driver.get("https://facebook.com/");
//		System.out.println(driver.getTitle());
		
		driver.get("https://www.rahulshettyacademy.com/angularpractice");
		driver.findElement(By.cssSelector("label+input[name=name]")).sendKeys("name");
		driver.findElement(By.cssSelector("label+input[name=email]")).sendKeys("email@mail.com");
		driver.findElement(By.cssSelector("input[type=password]")).sendKeys("password");
		driver.findElement(By.id("exampleCheck1")).click();
		
		Select genderSelectionDropdown = new Select(driver.findElement(By.id("exampleFormControlSelect1")));
		genderSelectionDropdown.selectByVisibleText("Male");
		
		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.cssSelector("input[type='date']")).sendKeys("05-01-2024");
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		String text = driver.findElement(By.cssSelector("div.alert-success")).getText();
		
		Assert.assertTrue(text.contains("The Form has been submitted successfully!"));
		System.out.println("Test passed");
		
		driver.close();
		driver.quit();
	}

}
