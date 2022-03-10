package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Offline_Page2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\admin\\\\eclipse-workspace\\\\Selenium_Training\\\\Drivers\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("file:///D:/movie/Login.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//input)[1][@type='username']")).sendKeys("Manoj");
		driver.findElement(By.xpath("(//input)[2][@type='password']")).sendKeys("Kumar");
		driver.findElement(By.xpath("(//button)[text()='login']")).click();

	}

}
