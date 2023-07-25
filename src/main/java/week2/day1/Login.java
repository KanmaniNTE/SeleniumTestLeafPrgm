package week2.day1;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		String Property =System.getProperty("webdriver.chrome.driver");
		System.out.println(Property);
	}

}
