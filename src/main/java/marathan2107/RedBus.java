package marathan2107;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedBus {

	public static void main(String[] args) throws InterruptedException {
		/*Testcase 2 (RedBus)
01) Launch Firefox / Chrome
02) Load https://www.redbus.in/
03) Type "Chennai" in the FROM text box
04) Type "Bangalore" in the TO text box
05) Select tomorrow's date in the Date field
06) Click Search Buses
07) Print the number of buses shown as results (104 Buses found)
08) Choose SLEEPER in the left menu 
09) Print the name of the second resulting bus 
10) Click the VIEW SEATS of that bus
11) Take screenshot and close browser
*/
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		//Load Redbus https://www.redbus.in/
		driver.get("https://www.redbus.in/");
		//Type "Chennai" in the FROM text box
		driver.findElement(By.id("src")).clear();
		driver.findElement(By.id("src")).sendKeys("Chennai",Keys.ENTER);
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//li[@data-no='1']")).click();
		//driver.findElement(By.xpath("//li[text()='Chennai']")).click();
		//Type "Bangalore" in the TO text box
		driver.findElement(By.id("dest")).clear();
		driver.findElement(By.id("dest")).sendKeys("Bangalore",Keys.ENTER);
		Thread.sleep(3000);
		//Select tomorrow's date in the Date field
		driver.findElement(By.id("onward_cal")).sendKeys("values to send");
		driver.findElement(By.xpath("//td[@class='current day']/following::td")).click();
		//Click Search Buses
		//driver.findElement(By.id("search_btn")).click();
		//driver.findElement(By.xpath("//button[@class='fl button']")).click();
		driver.findElement(By.cssSelector("button#search_btn")).click();
	}

}
