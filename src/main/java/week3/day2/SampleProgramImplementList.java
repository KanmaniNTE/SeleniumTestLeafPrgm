package week3.day2;



import java.util.List;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleProgramImplementList {

	public static void main(String[] args) throws InterruptedException {
		//Launching the URL - https://www.ajio.com/
				WebDriverManager.chromedriver().setup();
				ChromeDriver driver = new ChromeDriver();
				driver.get("https://www.ajio.com/");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

				//search "bags" in Search box and press enter
				driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("bags",Keys.ENTER);
				Thread.sleep(2000);
				//Click Men under Gender
				driver.findElement(By.xpath("//label[contains (text(), 'Men')]")).click();
				Thread.sleep(2000);
				//Click Fashion Bags under Category
				driver.findElement(By.xpath("//label[contains (text(), 'Fashion Bags')]")).click();
				//Get and print the total number of items displayed
				String str = driver.findElement(By.xpath("//div[@class='length']")).getText();
				System.out.println("Total number of items : " + str);
				//Get the list of brands loaded and print the list
				List<WebElement> brandList = driver.findElements(By.className("brand"));
				int listCount = brandList.size();
				System.out.println("The number of brands available : " + listCount);
				System.out.println();
				System.out.println("BRAND NAMES");
				System.out.println();
				for (WebElement webElement : brandList) {
					String b1 = webElement.getText();
					System.out.println(b1);
				}
				//Get the list of names of the bags and print
				List<WebElement> nameList = driver.findElements(By.className("nameCls"));
				int nameCount = nameList.size();
				System.out.println();
				System.out.println("The number of differnet name of bags available : " + nameCount);
				System.out.println();
				System.out.println("NAME OF BAGS");
				System.out.println();
				for (WebElement webElement1 : nameList) {
					String name = webElement1.getText();
					System.out.println(name);

				}


	}

}
