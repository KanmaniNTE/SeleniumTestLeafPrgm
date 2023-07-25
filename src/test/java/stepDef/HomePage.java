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

public class HomePage extends ProjectSpecificMethod {
	
	@Given("Click CRMSFA Link")
	public void clickCRMSFA() {
		driver.findElement(By.linkText("CRM/SFA")).click();
	}


}
