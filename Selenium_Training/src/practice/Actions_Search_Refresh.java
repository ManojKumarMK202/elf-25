package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Search_Refresh {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement search= driver.findElement(By.className("desktop-searchBar"));
		//search.sendKeys("shoes");
		Actions actionsearch= new Actions(driver);
		actionsearch.moveToElement(search).keyDown(Keys.SHIFT).sendKeys("shoes").keyUp(Keys.SHIFT).build().perform();
		Thread.sleep(1000);
		//actionsearch.keyDown(Keys.F5).keyUp(Keys.F5).build().perform();
		actionsearch.sendKeys(Keys.F5);
		Thread.sleep(1000);
		
		driver.quit();

	}

}
