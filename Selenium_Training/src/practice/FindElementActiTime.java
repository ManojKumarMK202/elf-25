package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementActiTime {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		 
		driver.get("https://www.actitime.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span)[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Reach out to be assisted by a product specialist")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[tabindex=\"1\"]")).sendKeys("manu");;
		Thread.sleep(3000);
		driver.close();

	}

}
 		