package week6.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProjectSpecificMethods {
	ChromeDriver driver;
	WebDriverWait wait;
	@BeforeMethod
	public void setup() {
		WebDriverManager.chromedriver().setup();
		//launch the browser
		driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		//maximize the browser
		driver.manage().window().maximize();
		//Find the user and enter the user name
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		//find the password and enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//click on login button
		driver.findElement(By.className("decorativeSubmit")).click();
		WebElement logout =driver.findElement(By.className("decorativeSubmit"));
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
