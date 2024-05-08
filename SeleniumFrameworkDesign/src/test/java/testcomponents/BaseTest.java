package testcomponents;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import abstractcomponents.WebDriverFactory;
import pageobjects.LandingPage;

public class BaseTest {

	public WebDriver driver;
	public LandingPage landingPage;
	
	public String getScreenshot(String testCaseName, WebDriver driver) throws IOException {
		String path =  System.getProperty("user.dir")+"\\reports\\"+testCaseName+".png";
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File file = new File(path);
		FileUtils.copyFile(source, file);
		
		return path;
	}
	
	@BeforeMethod(alwaysRun = true)
	public LandingPage LaunchApplication() throws IOException {
		driver = WebDriverFactory.InitializeDriver();
		landingPage = new LandingPage(driver);
		landingPage.goTo();
		
		return landingPage;
	}
	
	@AfterMethod(alwaysRun = true)
	public void Dispose() {
		System.out.println("Quitting driver....");
		driver.quit();
	}
	
	public List<HashMap<String, String>> getJsonDataToMap(String path) throws IOException {

		// read json to string
		String jsonContent = FileUtils.readFileToString(
				new File(path), StandardCharsets.UTF_8);

		// string to hash map Jackson databind
		ObjectMapper mapper = new ObjectMapper();
		List<HashMap<String, String>> data = mapper.readValue(jsonContent, new TypeReference<List<HashMap<String, String>>>() {
		});

		return data;
	}
}
