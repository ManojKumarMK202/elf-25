package practice_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Working_With_Wait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
		WebDriverWait wait= new WebDriverWait(driver,20);
		//instead of thread.sleep use webdriverwait
		WebElement register= driver.findElement(By.linkText("Register"));
		
		wait.until(ExpectedConditions.elementToBeClickable(register));
		register.click();
		driver.close();
	}

}
