package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumSetup {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
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
		
		String attribute = logout.getAttribute("Value");
		System.out.println(attribute);
		if(attribute.equalsIgnoreCase("Logout")) {
			System.out.println("Successfully logged in");
		}
		
		
	}

}
