package stepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MyLeadsPage extends ProjectSpecificMethod {
	
	@When("Click create lead link")
	public void clickCreateLink() {
		driver.findElement(By.linkText("Create Lead")).click();
	}
	
	@When("Click Find lead link")
	public void clickFindLead() {
		driver.findElement(By.linkText("Find Leads")).click();
	}
  
	@When("Click Find lead link")
	public void clickMergeLead() {
		driver.findElement(By.linkText("Merge Leads")).click();
	}

}
