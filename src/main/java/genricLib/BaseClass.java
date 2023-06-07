package genricLib;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public WebDriver driver;
	public PropertyFile p = new PropertyFile();
	
	public WebDriverUtilities driverutilies = new WebDriverUtilities();
	

	@BeforeMethod
	public void openApp() throws IOException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(p.getpropertyFileData("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	@AfterMethod
	public void closeApp(ITestResult result) throws IOException {
		int status = result.getStatus();

		String name = result.getName();
		if (status == 2) {
			Screenshot s = new Screenshot();
			s.getScreenshot(driver, name);
		}
		driver.quit();
	}

}
