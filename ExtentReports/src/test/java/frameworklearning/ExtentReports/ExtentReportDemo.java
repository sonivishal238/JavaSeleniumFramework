package frameworklearning.ExtentReports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportDemo {
	
	ExtentReports extent;
	
	@BeforeMethod
	public void config() {
		// Important classes:ExtentReport, ExtentSparkReporter
		
		String reportPath = System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(reportPath);
		reporter.config().setReportName("Web automation results");
		reporter.config().setDocumentTitle("Extent report learning");
		
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("tester", "Vishal Soni");
	}
	
	
	@Test
	public void initialDemo() {
		
		ExtentTest test = extent.createTest("initialDemo");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		
		// Explicitly failing the test.
		test.fail("result do not match");
		extent.flush();
		driver.quit();
	}
}
