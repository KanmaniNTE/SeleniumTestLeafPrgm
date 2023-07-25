package week6.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLeadthree extends ProjectSpecificMethodsthree {
	@DataProvider
	public void fetechdata() {
		String[][] data = new String[3][2];

		// data set1
		data[0][0] = "Wipro";
		data[0][1] = "Kanmani";
		data[0][2] = "NTE";

		// dataset2:
		data[1][0] = "Wipro";
		data[1][1] = "Kanmani";
		data[1][2] = "NTE";

	}

	@Test()
	public void createleadone() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Wipro");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Kanmani");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("NTE");
		// WebElement dropDown =
		// driver.findElement(By.id("createLeadForm_dataSourceId"));
		// Select select = new Select(dropDown);

		WebElement State = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select select = new Select(State);
		select.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
		String title = driver.getTitle();
		System.out.println(title);
		if (title.equals("View Lead | opentaps CRM")) {
			System.out.println("Lead Created Successfully");

		}

	}
}