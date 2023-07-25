package stepDef;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ProjectSpecificMethod extends AbstractTestNGCucumberTests {
	public static ChromeDriver driver;
	public int i=1;
	@BeforeMethod
	public void init() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();

	}

	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}

}
