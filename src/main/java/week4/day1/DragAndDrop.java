package week4.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

	public static void main(String[] args) {
		//WebDriverManager Setup
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		//Launch Browser		
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		//switch to frame
		driver.switchTo().frame(0);
		//find the element
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		//find the initial
		System.out.println(drag.getLocation());
		//drag and drop
		Actions builder=new Actions(driver);
		builder.dragAndDrop(drag, drop).perform();
		//verify the text
		System.out.println(drop.getText());




	}

}
