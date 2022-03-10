package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Webshop_Css {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
				"C:\\\\Users\\\\admin\\\\eclipse-workspace\\\\Selenium_Training\\\\Drivers\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input[id='small-searchterms']")).sendKeys("Computer");
		driver.findElement(By.cssSelector("input[type='submit']")).click();

	}

}
