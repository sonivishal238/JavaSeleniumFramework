package ajaxCalls;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/loginpagePractise");
		driver.manage().window().maximize();
		
		try {
			
			driver.findElement(By.className("blinkingText")).click();
			Set<String> windowHandle = driver.getWindowHandles();
			Iterator<String> it = windowHandle.iterator();
			
			String oldWIndow = it.next();
			String newWondow = it.next();
			
			driver.switchTo().window(newWondow);
			String emailId = driver.findElement(By.cssSelector("strong a")).getText();
			System.out.println("email id is: " + emailId);
			driver.switchTo().window(oldWIndow);
			driver.findElement(By.id("username")).sendKeys(emailId);
			
			Thread.sleep(2000);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		finally {
			System.out.println("Quitting driver");
			driver.quit();
		}

	}

}
