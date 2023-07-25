package week4.day2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollDown {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		//Load Redbus https://www.redbus.in/
		driver.get("https://www.redbus.in/");
		//Maximise the window
		driver.manage().window().maximize();
		WebElement bottomline =driver.findElement(By.xpath("//h6[text()='Top Operators']"));
		Actions scrlDown =new Actions(driver);
		scrlDown.scrollToElement(bottomline).perform();
		//take a snapshot
		File soure =driver.getScreenshotAs(OutputType.FILE);
		//save it to local driv
		File dest =new File("./Snapshot/redbus.png");
		FileUtils.copyFile(soure, dest);
		
	}

}
