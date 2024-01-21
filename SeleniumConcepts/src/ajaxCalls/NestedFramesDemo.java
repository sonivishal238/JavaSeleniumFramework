package ajaxCalls;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFramesDemo {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		driver.manage().window().maximize();
		
		try {
			
			WebElement topFrame = driver.findElement(By.cssSelector("frame[name=frame-top]"));
			driver.switchTo().frame(topFrame);
			WebElement middle = driver.findElement(By.cssSelector("frame[name=frame-middle]"));
			driver.switchTo().frame(middle);
			System.out.println(driver.findElement(By.id("content")).getText());
			
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
