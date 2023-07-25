package week6.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesforceNew extends ProjSpecifMethod {
	@BeforeTest
	public void setData() {
		 excelFileName = "Chatter_Questions";
		 browserName = "Chrome";
		
	}
	@Test(dataProvider="fetch")
	public  void Customer() throws InterruptedException {
		//Setup Webdriver Manager
		//Setup the edgedriver
       
		//ChromeDriver driver = new ChromeDriver();
		//Launch Browser
		
		//click on dot icon
		driver.findElement(By.className("slds-icon-waffle")).click();
		//click on view all
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		//click on Content
		driver.findElement(By.xpath("//input[@placeholder='Search apps or items...']")).sendKeys("Content");
		//click on content result
		driver.findElement(By.xpath("//mark[text()='Content']")).click();
		//Click on chatter box
		//driver.findElement(By.xpath("//span[text()='Chatter']")).click();
		//driver.findElement(By.xpath("(//a[@draggable='false']//span)[2]")).click();
		WebElement chatter = driver.findElement(By.xpath("//span[text()='Chatter']"));
		driver.executeScript("arguments[0].click();", chatter);
		//get title
		Thread.sleep(8000);
		String title = driver.getTitle();
		System.out.println(title);
		if(title.equalsIgnoreCase("Chatter Home | Salesforce")){
			System.out.println("The title is Chatter");
		}else {
			System.out.println("The title is Not Chatter");
		}
		//Click Question tab
		driver.findElement(By.xpath("(//span[@class='title'])[3]")).click();
		//Type Question with data
		String Quest ="What is your org Name?";
		driver.findElement(By.tagName("textarea")).sendKeys(Quest);
		//Type Details with data
		String Detl ="My org name is Testleaf";
		driver.findElement(By.xpath("//div[@contenteditable='true']//p[1]")).sendKeys(Detl);
		//Click on Ask button
		driver.findElement(By.xpath("//button[contains(@class,'slds-button slds-button_brand')]")).click();
        //confirm the question appears
		//driver.findElement(By.xpath("(//span[@class='uiOutputText'])[3]")).getText();
		WebElement Questname = driver.findElement(By.xpath("(//span[@class='uiOutputText'])[3]"));
		String text = Questname.getText();
		System.out.println(text);
		if(text.equalsIgnoreCase(Quest)) {
			System.out.println("Question is Correct");
		}else {
			System.out.println("Question Mismatched");
		}

	}

}
