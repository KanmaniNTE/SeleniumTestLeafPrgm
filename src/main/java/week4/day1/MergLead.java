package week4.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MergLead {

	public static void main(String[] args) throws InterruptedException {
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
		//click on MergLead
		driver.findElement(By.linkText("Merge Leads")).click();
		//click on From Lead to go new window
		driver.findElement(By.xpath("//span[text()='From Lead']/following::img[1]")).click();
		//switch to new window
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
		//second window handle
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println("How many Handles? "+windowHandles.size());
		//get the second window handle from set
		List<String> lstWindowHandles =new ArrayList<String>(windowHandles);
		String secondWindowHandle =lstWindowHandles.get(1);
		System.out.println("Second Window "+secondWindowHandle);
		//move control to second window
		driver.switchTo().window(secondWindowHandle);
		//enter first name
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Kanmani");
		//click on fine lead
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
		//select the firstlead
		//driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")).click();
		//driver.findElement(By.linkText("11166")).click();
		//driver.findElement(By.xpath("//a[@class='linktext']")).click();
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
		//driver.switchTo().window(windowHandle);
		//String firstwinTitle = driver.getTitle();
		//System.out.println(firstwinTitle);
		
	}

}
