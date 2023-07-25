package week4.day2;
import java.time.Duration;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.sukgu.Shadow;

public class AdminCertificate {

	public static void main(String[] args) throws IOException, InterruptedException {
		//Setup Webdriver Manager
		WebDriverManager.chromedriver().setup();
		//disable notification
		ChromeOptions options =new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		//Launch Browser"
		driver.get("https://login.salesforce.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		//Login into application
		driver.findElement(By.id("username")).sendKeys("kannu@testleaf.sandbox");
		driver.findElement(By.id("password")).sendKeys("Kanmani@31");
		driver.findElement(By.id("Login")).click(); 
		//String windowHandle = driver.getWindowHandle();
		//Click on Learn More link in Mobile Publisher
		driver.findElement(By.xpath("(//span[@class=' label bBody'])[2]")).click();
		//handle the window
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> salesForceHandle = new ArrayList<String>(windowHandles);
		String nextPage=salesForceHandle.get(1);
		driver.switchTo().window(nextPage);
		//click on the confirm button in the redirecting page
		driver.findElement(By.xpath("(//div[@class='dialog']//button)[2]")).click();
		//Click on resource
		Shadow dom = new Shadow(driver);
		WebElement resource = dom.findElementByXPath("//span[text()='Learning']");
		resource.click();	


		//Mouse hover on learning on trailhead
		WebElement trailHead = dom.findElementByXPath("//span[text()='Learning on Trailhead']");
		Actions builder = new Actions(driver);
		builder.moveToElement(trailHead).perform();
		//builder.click();

		//Click on Salesforce certifications
		Thread.sleep(30);
		WebElement salesForce = dom.findElementByXPath("//a[text()='Salesforce Certification']");
		builder.moveToElement(salesForce).perform();
		salesForce.click();

		//Click Certification Administrator
		WebElement Certification = driver.findElement(By.linkText("Administrator"));
		builder.scrollToElement(Certification).perform();



		WebElement advancedAdministrator = driver.findElement(By.linkText("Advanced Administrator"));
		builder.scrollToElement(advancedAdministrator).perform();
		String text = advancedAdministrator.getText();
		if(text.equals("Advanced Administrator")) {
			System.out.println("Certifications available");
		}


		//Take screenshot
		File source = driver.getScreenshotAs(org.openqa.selenium.OutputType.FILE);

		//save it to local dir
		File dest = new File("./Snapshot/salesadmin.png");
		FileUtils.copyFile(source, dest);






	}

}
