package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Mail {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\eclipse-workspace\\Selenium_Training\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https:/www.google.co.in");
		driver.manage().window().maximize();
//		Thread.sleep(1000);
		driver.findElement(By.linkText("Gmail")).click();
		
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.id("identifierId")).sendKeys("manojhonda691@gmail.com");
		driver.findElement(By.className("VfPpkd-vQzf8d")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("VfPpkd-vQzf8d")).click();
		    
	}

}
