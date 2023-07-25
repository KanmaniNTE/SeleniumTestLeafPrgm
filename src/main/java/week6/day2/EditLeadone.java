package week6.day2;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLeadone extends ProjectSpecificMethodstwo {
	@DataProvider(name="create")
	public String[][] fetechdata() throws IOException {
		
		String[][] data=ReadDataex.readData("CreateLead");		
		return data;
	}
    @Test(dataProvider ="create")
	public  void testeditlead(String name,String firstname, String lastname) {
		
    	//driver.findElement(By.linkText("Create Lead")).click();
    	driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(name);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastname);
		driver.findElement(By.className("smallSubmit")).click();
	
		
		
}
}
