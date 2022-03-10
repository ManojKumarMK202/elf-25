package prac;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("file:///D:/SeleniumPrac/iframe.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		
		//driver.switchTo().frame("frame1");//switch by -name attribute
		//driver.switchTo().frame("FR1");//switch by-id
		
		WebElement web= driver.findElement(By.id("FR1"));
		driver.switchTo().frame(web);//switch by-webelement
		
		driver.findElement(By.xpath("//a[text()='No Thanks']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'BUSINESS')]")).click();
		
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[text()='Google']")).click();
		driver.quit();
	}

}
