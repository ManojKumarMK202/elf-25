package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Offline_Page1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\admin\\\\eclipse-workspace\\\\Selenium_Training\\\\Drivers\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("file:///D:/movie/Entry.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//input)[1]")).sendKeys("Manoj");
		driver.findElement(By.xpath("(//input)[2]")).sendKeys("kumar");
		driver.findElement(By.xpath("(//input)[3]")).sendKeys("tyss");
		driver.findElement(By.xpath("(//input)[4]")).sendKeys("Mandya");
		
	}

}
