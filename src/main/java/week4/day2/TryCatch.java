package week4.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TryCatch {

	public static void main(String[] args) throws InterruptedException {
		//Launch the browser
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
				driver.findElement(By.linkText("CRM/SFA")).click();
				driver.findElement(By.linkText("Leads")).click();
				//driver.findElement(By.linkText("Create Lead")).click();
				driver.findElement(By.linkText("Find Leads")).click();
				//give input
				driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Kanmani");
				driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
				
			   try {
				   Thread.sleep(3000);
				   WebElement lead = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]"));
				lead.click();
			} catch (Exception e) {
				System.out.println("Exception handled");
			
			}
			   
			   

	}
 }
