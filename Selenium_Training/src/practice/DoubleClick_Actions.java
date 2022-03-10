package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick_Actions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		WebElement button= driver.findElement(By.xpath("//button[@ondblclick=\"myFunction()\"]"));//
		Actions doubleclickact= new Actions(driver);
		
		Thread.sleep(1000);
		doubleclickact.doubleClick(button).build().perform();
		//doubleclickact.moveToElement(driver.findElement(By.xpath("//button[@ondblclick=\"myFunction()\"]")))
		Thread.sleep(1000);
		// either one of them perform because we are not handling the alert action
		
		WebElement rightbutton= driver.findElement(By.xpath("//span[contains(text(),'right')]"));
		Actions rightclickact= new Actions(driver);
		rightclickact.contextClick(rightbutton).build().perform();
		Thread.sleep(1000);
		
		driver.quit();

	}

}
