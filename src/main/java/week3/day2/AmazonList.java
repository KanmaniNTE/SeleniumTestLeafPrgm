package week3.day2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonList {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://amazon.in");
		//maximize the browser
		driver.manage().window().maximize();
		//type phones in website
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Phones",Keys.ENTER);
		//list of webelements
		List<WebElement> allPhoneElements = driver.findElements(By.className("a-price-whole"));
		List<Integer> phonePrices = new ArrayList<Integer>();
		for (int i = 0; i < allPhoneElements.size(); i++) {
			System.out.println(allPhoneElements.get(i).getText());
			String PriceString = allPhoneElements.get(i).getText().replace(",", "");
			int price = Integer.parseInt(PriceString);
			//allPhoneElements.add(price);
			phonePrices.add(price);
					
			}
		Collections.sort(phonePrices);
		System.out.println("Low Price Mobile: "+phonePrices.get(0));
	
	}
}
