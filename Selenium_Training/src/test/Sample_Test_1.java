package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample_Test_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\admin\\eclipse-workspace\\Selenium_Training\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//to manipulate to a url
		driver.get("https://www.google.co.in");//return type- void
		//driver.get("https://www.instagram.com");
		
		// to maximize the window of browser
		driver.manage().window().maximize();
		
		//to refresh the window page
		driver.navigate().refresh();
		
	}

}
