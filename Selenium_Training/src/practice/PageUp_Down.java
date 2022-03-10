package practice;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PageUp_Down {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		Actions pageupdown= new Actions(driver);
		pageupdown.sendKeys(Keys.PAGE_DOWN).build().perform();
		//pageupdown.keyDown(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(1000);
		pageupdown.sendKeys(Keys.F5);
		pageupdown.sendKeys(Keys.PAGE_UP).build().perform();
		//pageupdown.keyDown(Keys.PAGE_UP).build().perform(); it wont work
		Thread.sleep(1000);
		driver.quit();
	}

}
