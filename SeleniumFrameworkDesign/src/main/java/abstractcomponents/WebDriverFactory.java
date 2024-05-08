package abstractcomponents;

import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {

	public static WebDriver InitializeDriver() {

		WebDriver driver = null;
		
		if(TestConfigManager.browserName.contains("chrome")) {			
			ChromeOptions options = new ChromeOptions();

			if(TestConfigManager.browserName.contains("headless")) {
				options.addArguments("--headless=new");
			}
			driver = new ChromeDriver(options);
			driver.manage().window().setSize(new Dimension(1440, 900));
		}
		
		else if(TestConfigManager.browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
		
		else if(TestConfigManager.browserName.equalsIgnoreCase("edge")){
			driver = new EdgeDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		return driver;
	}
}
