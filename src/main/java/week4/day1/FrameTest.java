package week4.day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameTest {

	public static void main(String[] args) {
		//WebDriverManager Setup
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		//Launch Browser		
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		//switch to frame
		driver.switchTo().frame(0);
		//Click on try it
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		//switch to alert
		Alert alert=driver.switchTo().alert();
		//dismiss the alert
		alert.dismiss();
		//Get the cancel message
		String str =driver.findElement(By.id("demo")).getText();
		System.out.println(str);

	}

}
