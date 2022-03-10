package practice_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Working_With_Alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		WebElement doubleclick= driver.findElement(By.xpath("//button[contains(text(),'Double')]"));
		Actions doubleclickact= new Actions(driver);
		doubleclickact.doubleClick(doubleclick).build().perform();
		Thread.sleep(1000);
		
		driver.switchTo().alert().accept();
		driver.quit();
	}

}
