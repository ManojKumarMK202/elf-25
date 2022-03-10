package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google1st_Link {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
				"C:\\\\Users\\\\admin\\\\eclipse-workspace\\\\Selenium_Training\\\\Drivers\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https:/www.google.co.in");
		driver.manage().window().maximize();
		//driver.navigate().refresh();
		driver.findElement(By.cssSelector("input[title='Search']")).sendKeys("How to learn selenium");
		Thread.sleep(1000);
		driver.findElement(By.name("btnK")).click();
		
		driver.findElement(By.partialLinkText("Selenium Automation testing from")).click();
	}

}
//