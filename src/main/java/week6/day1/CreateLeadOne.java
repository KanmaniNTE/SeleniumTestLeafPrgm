package week6.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLeadOne extends ProjectSpecificMethods {
	@Test(invocationCount = 2,timeOut = 35000)
	public  void createleadone() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Wipro");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Kanmani");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("NTE");
		//WebElement dropDown = driver.findElement(By.id("createLeadForm_dataSourceId"));
		//Select select = new Select(dropDown);
		//select.selectByVisibleText("Public Relations");
		//select.selectByVisible
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Kannu");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Automation Test Engineer");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("nte.kanmani31@gmail.com");
		WebElement State = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select select = new Select(State);
		select.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
		String title = driver.getTitle();
		System.out.println(title);
		if(title.equals("View Lead | opentaps CRM")) {
			System.out.println("Lead Created Successfully");

		}

	}
}