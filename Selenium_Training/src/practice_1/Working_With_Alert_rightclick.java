package practice_1;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Working_With_Alert_rightclick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		//Thread.sleep(1000);
		
		WebDriverWait wait= new WebDriverWait(driver,20);
//		wait.until(ExpectedConditions.elementToBeClickable(null));
		
		WebElement rightclick= driver.findElement(By.xpath("//span[contains(text(),'right')]"));
		Actions rightclickact= new Actions(driver);
		wait.until(ExpectedConditions.elementToBeClickable(rightclick));
		rightclickact.contextClick(rightclick).build().perform();
		//Thread.sleep(1000);
		
		
		
//		WebElement edit= driver.findElement(By.xpath("//span[contains(text(),'Edit')]"));
//		edit.click();
//		Alert alert= driver.switchTo().alert();
//		Thread.sleep(1000);
//		System.out.println(alert.getText());
//		if(alert.getText().contains("edit")) {
//			alert.accept();
//			Thread.sleep(1000);
//		}
		List<WebElement> rightclickbox= driver.findElements(By.xpath("//li[contains(@class,\"context-menu-item context-menu-icon context-menu\")]"));
		//System.out.println(rightclickbox);
		for(int i=0;i<rightclickbox.size();i++) {
			List<WebElement> boxclick=driver.findElements(By.xpath("//li[contains(@class,\"context-menu-item context-menu-icon context-menu\")]"));
			//boxclick.get(i).click();
			//Thread.sleep(1000);
			wait.until(ExpectedConditions.elementToBeClickable(boxclick.get(i)));
			boxclick.get(i).click();
			
			Alert alert= driver.switchTo().alert();
			System.out.println(alert.getText());
			alert.accept();
			Thread.sleep(1000);
			WebElement rightclick1= driver.findElement(By.xpath("//span[contains(text(),'right')]"));
			Actions rightclickact1= new Actions(driver);
			rightclickact1.contextClick(rightclick).build().perform();
			
		}
		
		//if() {}  (//li[contains(@class,'context')])[]
		//Thread.sleep(1000);
		driver.quit(); //li[contains(@class,"context-menu-item context-menu-icon context-menu")]
	}

}
