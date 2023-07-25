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

public class ViewLeadPage extends ProjectSpecificMethod {
	
	@And("Click on Edit Button")
	public void clickEditButton() {
		driver.findElement(By.linkText("Edit")).click();

	}
	@And("Click on Delete Button")
	public void clickDeleteButton() {
		driver.findElement(By.linkText("Delete")).click();

	}


}
