package week2.day2;
import java.time.Duration;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class ZoomCarTable {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.zoomcar.com/in/bangalore");
		// manage timeout -> findElement(s)
			//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// manage timeout -> findElement(s)
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		//maximize the browser
		driver.manage().window().maximize();
		//3) Click on Pickup City -> class : placeholder
				driver.findElement(By.className("placeholder")).click();
				
				// 4) Click the fist suggested pick up location 
				     // xpath -> //h3[text()='Suggested Pick Up Locations']/following::div[1]/div
				driver.findElement(By.xpath("(//h3[text()='Suggested Pick Up Locations']/following::div)[2]")).click();
				driver.findElement(By.xpath("//span[@class='field-date start-time']")).click();
				driver.findElement(By.xpath("//td[contains(text(),'21')]")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//td[contains(text(),'21')]")).click();
				driver.findElement(By.xpath("//button[contains(text(),'Continue')]")).click();
				driver.findElement(By.xpath("//button[contains(text(),'Find cars')]")).click();
				String price = driver.findElement(By.xpath("//h3[text()='Maruti Swift Dzire']/following::div[contains(@class,'price')]")).getText();
				System.out.println(price);
	}
}
				 
	