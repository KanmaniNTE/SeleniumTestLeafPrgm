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

public class MyHomePage extends ProjectSpecificMethod {
	
	@And("Click on Leads Tab")
	public void clickLeadsTab() {
		driver.findElement(By.linkText("Leads")).click();
	}

}
