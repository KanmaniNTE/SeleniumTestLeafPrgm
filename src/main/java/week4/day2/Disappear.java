package week4.day2;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Disappear {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		// Step 3: Load the URL
		driver.get("http://www.leafground.com/pages/disapper.html");
		// Step 4: Maximise the window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement alrt = driver.findElement(By.xpath("//button[@id='btn']"));
		//wait
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.invisibilityOf(alrt));
		
		//String mess=alrt.getText();
		//System.out.println(mess);
		//verify the text
		WebElement text = driver.findElement(By.xpath("//button[@id='btn']/following-sibling::p[1]"));
        System.out.println(text.getText());
	}

}
