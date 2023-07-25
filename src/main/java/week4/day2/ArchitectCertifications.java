package week4.day2;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.sukgu.Shadow;

public class ArchitectCertifications {
public static void main(String[] args) throws InterruptedException {
		
		// call WDM
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		//launch URL
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		// Login with Provided Credentials
		driver.findElement(By.id("username")).sendKeys("kannu@testleaf.sandbox");
		driver.findElement(By.id("password")).sendKeys("Kanmani@31");
		driver.findElement(By.id("Login")).click();
		
		//click on the learn more option in the Mobile publisher
		 driver.findElement(By.xpath("//button[@title='Learn More']")).click();
		//Switch to the next window using Window handles
		 Set<String>WindowHandles=driver.getWindowHandles();
		 List<String>lstWindowHandles=new ArrayList<String>(WindowHandles);
		 String secondWindowHandles=lstWindowHandles.get(1);
		 driver.switchTo().window(secondWindowHandles);
		      
		 //click on the confirm button in the redirecting page
		 driver.findElement(By.xpath("//button[text()='Confirm']")).click();
		 Thread.sleep(2000);
		//Click on Learnings 
		 Shadow sha =new Shadow(driver);
		 Thread.sleep(10000); 
		 WebElement ele=sha.findElementByXPath("//span[text()='Learning']");
		 ele.click();
		 Thread.sleep(10000);
		 //mouse over to Learning on Trail head
		 WebElement ele1= sha.findElementByXPath("//span[text()='Learning on Trailhead']");
		 //ele1.click();
		 driver.executeScript("arguments[0].click();", ele1);
		      Thread.sleep(10000);
		  //Select SalesForce Certification Under Learnings   
		 WebElement ele2= sha.findElementByXPath("//a[text()='Salesforce Certification']");
		 //ele2.click();
		 driver.executeScript("arguments[0].click();", ele2);
		 Thread.sleep(10000); 
		 //  Choose Your Role as Sales force Architect      
        Actions builder=new Actions(driver);
        builder.moveToElement(driver.findElement(By.xpath("(//img[@class='roleMenu-item_img'])[2]"))).perform();
         driver.findElement(By.xpath("(//img[@class='roleMenu-item_img'])[2]")).click();
		 Thread.sleep(4000); 
		//Get the Text(Summary) of Sales force Architect
		 WebElement name=driver.findElement(By.xpath("//div[(@class='cert-site_text slds-text-align--center Lh(1.5) Fz(16px) slds-container--center slds-p-bottom--large')]"));
		 System.out.println(name.getText());
			 Thread.sleep(4000);
          //(//img[@class='roleMenu-item_img'])[2]
         //(//div[(@class='roleMenu-item_text')])[2]']
		//Get the List of Sales force Architect Certifications Available
		List<WebElement> lst = driver.findElements(By.className("credentials-card_title"));
       System.out.println('\n'+"SALESFORCE ARCHITECT CERTIFICATES " );
			 for(int i=0;i<lst.size();i++)
			 {
				 System.out.println(lst.get(i).getText());
			 }
		 //Click on Application Architect
		 driver.findElement(By.xpath("//a[text()='Application Architect']")).click();
		 //Get the List of Certifications available
		 List<WebElement> lst1 = driver.findElements(By.className("credentials-card_title"));
		 System.out.println('\n'+"APPLICATION CERTIFICATE ");
			 for(int i=0;i<lst1.size();i++)
			 {
				 System.out.println(lst1.get(i).getText());
			 }
}
}
