package stepDef;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MergeLeadPage extends ProjectSpecificMethod {
	

	

	@When("Type the firstName in EditLead as (.*)")
	public void typefirstNameone(String firstName1) {
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys(firstName1);

	}

	@And("Cick on Find Leads")
	public void clickFindLeads() {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

	}

	@And("Click on First Result in Find Leads")
	public void clickOnFirstResult() {
		//driver.findElement(By.xpath("//a[@href='/crmsfa/control/viewLead?partyId=11166']")).click();
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a[1]")).click();
		String title1 = driver.getTitle();
		System.out.println(title1);
	}

	



	@When("Click Update the company Name as (.*)")
	public void updateCompanyName(String companyName1) {
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(companyName1);
	}

	@Then("Confirm the changed name appears")
	public void verifyChangedName() {
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println(text);
	}

}
