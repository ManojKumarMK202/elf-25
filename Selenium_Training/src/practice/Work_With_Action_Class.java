package practice;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Work_With_Action_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//kick start the webdriver by giving input as path
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://myntra.com/");
		driver.manage().window().maximize();
		
		WebElement webelement_men=driver.findElement(By.xpath("//a[contains(@data-group,'men')]"));
		Actions action= new Actions(driver);
		action.moveToElement(webelement_men).build().perform();
		WebElement webelement_sweat= driver.findElement(By.linkText("Sweatshirts"));
		Actions action_sweat= new Actions(driver);
		action.moveToElement(webelement_sweat).click().build().perform();
		
		driver.close();
	}

}
