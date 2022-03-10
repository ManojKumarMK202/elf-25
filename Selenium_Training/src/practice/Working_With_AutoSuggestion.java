package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_AutoSuggestion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://myntra.com/");
		driver.manage().window().maximize();
		driver.findElement(By.className("desktop-searchBar")).sendKeys("puma fer");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[@data-count=\"111\"]")).click();
		Thread.sleep(1000);
		driver.close();

	}

}
