package practice_1;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WorkingWithGuru99wait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		WebDriverWait wait= new WebDriverWait(driver,20);
		
		
		List<WebElement> listbox= driver.findElements(By.xpath("//ul[@class='dropdown-menu']//a"));
		System.out.println(listbox.size());
	//	System.out.println(listbox.get(1).getText());

		for(WebElement e: listbox) {
//			WebElement listelement=driver.findElement(By.xpath("(//ul[@class='dropdown-menu']/li/a)["+i+"]"));
//			System.out.println(listelement.getText());
		//	List<WebElement> listbox1= driver.findElements(By.xpath("//ul[@class=\"dropdown-menu\"]/li"));
			System.out.println(e.getText());
		}
		
		////ul[@class='dropdown-menu']/li[1]/a
		//(//ul[@class='dropdown-menu']/li/a)[]
		
//		driver.switchTo().alert().accept();
		driver.close();
		
		////a[contains(text(),'Delete')]
//		driver.findElement(By.xpath("//a[@class=\"dropdown-toggle\"]")).click();
//		driver.findElement(By.xpath("//a[contains(text(),'Delete')]")).click();
//		driver.findElement(By.xpath("//input[@name=\"cusid\"]")).sendKeys("1111");
//		driver.findElement(By.xpath("//input[@name=\"submit\"]")).click();
//
//		Alert alertclick= driver.switchTo().alert();
//		wait.until(ExpectedConditions.alertIsPresent());
//		alertclick.accept();
//		wait.until(ExpectedConditions.alertIsPresent());
//		alertclick.accept();
	}

}
