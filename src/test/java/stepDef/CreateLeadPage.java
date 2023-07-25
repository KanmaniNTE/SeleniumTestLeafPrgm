package stepDef;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CreateLeadPage extends ProjectSpecificMethod {
	
	@When("Type the companyName as (.*)$")
	public void typeCompanyName(String companyName) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);

	}
	@When("Type the firstName as (.*)$")
	public void typeFirstName(String firstName) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);

	}
	@When("Type the lastName as (.*)$")
	public void typeLAstName(String lastName) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);

	}
	@And("Click the create leads Button")
	public void clickCreateLeadButton() {
		driver.findElement(By.className("smallSubmit")).click();
	}
	

	}


