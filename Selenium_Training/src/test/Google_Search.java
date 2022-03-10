package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Search {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\eclipse-workspace\\Selenium_Training\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https:/www.google.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("window11");
		Thread.sleep(1000);
		driver.findElement(By.className("gNO89b")).click();
		driver.quit();

	}

}
