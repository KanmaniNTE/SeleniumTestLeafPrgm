package week4.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;
public class Explicit {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		// Step 3: Load the URL
		driver.get("http://www.leafground.com/pages/Window.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//wait for 5 sec
		driver.findElement(By.xpath("//button[text()='Wait for 5 seconds']")).click();
		//explicit wait
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.numberOfWindowsToBe(3));

		//window handle
		String windowHandle=driver.getWindowHandle();
		System.out.println(windowHandle);






	}

}
