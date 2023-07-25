package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		/*http://leaftaps.com/opentaps/control/main
		 
		Delete Lead:
		1	Launch the browser
		2	Enter the username
		3	Enter the password
		4	Click Login
		5	Click crm/sfa link
		6	Click Leads link
		7	Click Find leads
		8	Click on Phone
		9	Enter phone number
		10	Click find leads button
		11	Capture lead ID of First Resulting lead
		12	Click First Resulting lead
		13	Click Delete
		14	Click Find leads
		15	Enter captured lead ID
		16	Click find leads button
		17	Verify message "No records to display" in the Lead List. This message confirms the successful deletion
		18	Close the browser (Do not log out)
*/
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
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.name("phoneNumber")).sendKeys("88");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
		String LeadId = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		System.out.println(LeadId);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Delete")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.name("id")).sendKeys(LeadId);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		String text = driver.findElement(By.className("x-paging-info")).getText();
		//String text = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
		System.out.println(text);
		if(text.contains("No records to display")) {
			System.out.println("Text Matched");
		}else {
			System.out.println("Text is not Matched");
		}
		driver.close();
	}

}
