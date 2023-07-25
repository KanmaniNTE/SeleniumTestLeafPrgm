package week6.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProjectSpecificMethodstwo {
	RemoteWebDriver driver;
	WebDriverWait wait;
	@Parameters({"url","username","password"})
	@BeforeMethod
	public void setup(String url,String username,String password) {
		WebDriverManager.chromedriver().setup();
		//launch the browser
		driver = new ChromeDriver();
		driver.get(url);
		//maximize the browser
		driver.manage().window().maximize();
		//Find the user and enter the user name
		driver.findElement(By.id("username")).sendKeys(username);
		//find the password and enter the password
		driver.findElement(By.id("password")).sendKeys(password);
		//click on login button
		driver.findElement(By.className("decorativeSubmit")).click();
		WebElement logout =driver.findElement(By.className("decorativeSubmit"));
	}
	@AfterMethod
	public void tearDown() {
		
	}

}
