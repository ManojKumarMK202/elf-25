package prac;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframehtml {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("file:///D:/SeleniumPrac/iframe.html");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Thread.sleep(1000);
		
		//driver.switchTo().frame(1);
		driver.switchTo().frame(driver.findElement(By.id("FR2")));
		driver.findElement(By.xpath("//span[@class=\"bars\"]")).click();
		driver.findElement(By.xpath("//a[text()='Stories']")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[text()='Google']")).click();
		
		
		//driver.quit();
		driver.close();
	}
}
