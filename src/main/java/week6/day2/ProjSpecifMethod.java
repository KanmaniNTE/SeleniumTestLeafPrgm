package week6.day2;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProjSpecifMethod {
	
		RemoteWebDriver driver;
		String browserName="Chrome";
		String excelFileName;
		
		@Parameters({"url", "username", "password"})
		@BeforeMethod
		public void setUp(String url, String username, String password) {
			// TODO Auto-generated method stub
			
			if (browserName.equals("Chrome")) {			
				//Setup the chromedriver
				WebDriverManager.chromedriver().setup();
				
				ChromeOptions chromeOpt = new ChromeOptions();
				chromeOpt.addArguments("--disable-notifications");
				
				//Launch the browser
				driver = new ChromeDriver(chromeOpt);			
			} else if (browserName.equals("edge")) {
				//Setup the edgedriver
				WebDriverManager.edgedriver().setup();
				
				EdgeOptions edgeOpt = new EdgeOptions();
				edgeOpt.addArguments("--disable-notifications");
				
				//Launch the browser
				driver = new EdgeDriver(edgeOpt);
			}
		
			
			//Open salesforce
			driver.get(url);
			
			//Maximise the browser
			driver.manage().window().maximize();
			
			//implicitwait
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			// Enter the username as " ramkumar.ramaiah@testleaf.com "
			driver.findElement(By.id("username")).sendKeys(username);
			
			// Enter the password as " Password$123 "
			driver.findElement(By.id("password")).sendKeys(password);
			
			// click on the login button
			driver.findElement(By.id("Login")).click();
			

		}
		
		@AfterMethod
		public void tearOut() {
		//Close the browser (Do not log out)
		driver.quit();
		}
		
		@DataProvider(name="fetch")
		public String[][] fetchData() throws IOException {
			
			String[][] readData = ReadDataex.readData(excelFileName);
			return readData;
		}

	}
		

