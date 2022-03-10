package practice_1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Working_With_Implicitguru99 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		
		WebElement rightclick= driver.findElement(By.xpath("//span[contains(text(),'right')]"));
		Actions rightclickact= new Actions(driver);
		rightclickact.contextClick(rightclick).build().perform();
		
		List<WebElement> rightclickbox= driver.findElements(By.xpath("//li[contains(@class,\"context-menu-item context-menu-icon context-menu\")]"));
		for(int i=0;i<rightclickbox.size();i++) {
			List<WebElement> boxclick=driver.findElements(By.xpath("//li[contains(@class,\"context-menu-item context-menu-icon context-menu\")]"));
			boxclick.get(i).click();
			
			Alert alert= driver.switchTo().alert();
			System.out.println(alert.getText());
			alert.accept();
			
			WebElement rightclick1= driver.findElement(By.xpath("//span[contains(text(),'right')]"));
			Actions rightclickact1= new Actions(driver);
			rightclickact1.contextClick(rightclick).build().perform();
		}
		driver.quit();
	}

}
