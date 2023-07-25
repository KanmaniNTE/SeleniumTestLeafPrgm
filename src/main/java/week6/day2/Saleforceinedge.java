package week6.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Saleforceinedge extends ProjSpecifMethod {
	@BeforeTest
	public void setData() {
		 excelFileName = "New_Individual";
		 browserName = "edge";
		
	}
	@Test(dataProvider="fetch")
	public  void Individuals(String question, String details) throws InterruptedException {
		//Setup Webdriver Manager
		
		//click on dot icon
		driver.findElement(By.className("slds-icon-waffle")).click();
		//click on view all
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		//Type Individuals on the Search box
		driver.findElement(By.xpath("//input[@placeholder='Search apps or items...']")).sendKeys("Individuals");
		//clcik on Individuals
		driver.findElement(By.xpath("//p[@class='slds-truncate']")).click();
		//click on new
		driver.findElement(By.xpath("//div[@title='New']")).click();
		String salu ="Ms.";
		driver.findElement(By.xpath("//a[@class='select']")).click();
		//findElement(By.xpath("//a[@text()='"+salu+"']")).click();
		driver.findElement(By.xpath("(//a[@role='menuitemradio'])[3]")).click();
		//Type Last Name 
		String lastname ="NTE";
		driver.findElement(By.xpath("//input[contains(@class,'lastName compoundBLRadius')]")).sendKeys(lastname);
		//click on save
		driver.findElement(By.xpath("//button[@title='Save']//span[1]")).click();
		Thread.sleep(8000);
		//Click on the App Launcher
		driver.findElement(By.className("slds-icon-waffle")).click();
		//Click View All
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		//Type Customers on the Search box
		driver.findElement(By.xpath("//input[@placeholder='Search apps or items...']")).sendKeys("Customers");
		Thread.sleep(8000);
		driver.findElement(By.xpath("//p[@class='slds-truncate']/mark")).click();
		Thread.sleep(8000);
		//Click New
		//driver.findElement(By.xpath("(//a[@role='button']//div)[3]")).click();
		//driver.findElement(By.xpath("(//div[@title='New'])")).click();

		//driver.findElement(By.xpath("//a[@data-aura-class='forceActionLink']//div[1]")).click();
       
        
	}

}
