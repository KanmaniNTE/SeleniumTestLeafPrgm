package week4.day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundAlert {

	public static void main(String[] args) {
		//WebDriverManager Setup
				WebDriverManager.chromedriver().setup();
				ChromeDriver driver=new ChromeDriver();
				//Launch Browser		
				driver.manage().window().maximize();
				driver.get("http://www.leafground.com/pages/Alert.html");
				driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
				Alert alert = driver.switchTo().alert();
				alert.accept();
				String text=driver.findElement(By.id("result1")).getText();
				System.out.println(text);

	}

}
