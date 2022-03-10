package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkWith_Action_Demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		WebElement element_Computers=driver.findElement(By.xpath("(//a[contains(text(),'Computers')])[1]"));
		Actions action_computer= new Actions(driver);
		action_computer.moveToElement(element_Computers).build().perform();
		
		WebElement element_notebook= driver.findElement(By.xpath("(//a[@href=\"/notebooks\"])[1]"));
		Actions action_notebook= new Actions(driver);
		//action_notebook.moveToElement(element_notebook).click().build().perform();
		
		WebElement element_electronics= driver.findElement(By.xpath("(//a[contains(text(),'Electronics')])[1]"));
		Actions action_electronics= new Actions(driver);
		action_electronics.moveToElement(element_electronics).build().perform();
		
		WebElement element_cell= driver.findElement(By.xpath("(//a[contains(text(),'Cell')])[1]"));
		Actions action_cell= new Actions(driver);
		action_cell.moveToElement(element_cell).click().build().perform();
		driver.quit();
	}

}
