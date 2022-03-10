package practice_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Working_MultipleWindow_Demoshop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
//		Actions pagedwn= new Actions(driver);
//		pagedwn.sendKeys(Keys.PAGE_DOWN).build().perform();
		
		driver.findElement(By.xpath("//a[text()='Facebook']")).click();
		Thread.sleep(2000);
		String demoshop= driver.getWindowHandle();
//		
		Set<String> demochild= driver.getWindowHandles();
		System.out.println(demochild);
//		List<String> childwindow= new ArrayList<String>(demochild);
//		
//		for(int i=1;i<childwindow.size();i++) {
//			driver.switchTo().window(childwindow.get(i));
//			driver.close();
//		}
		for(String childwindow:demochild) {
			driver.switchTo().window(childwindow);
			System.out.println(driver.getTitle());
			if(driver.getTitle().equalsIgnoreCase("NopCommerce - Home | Facebook")) {
				driver.findElement(By.id("email")).sendKeys("manu");
				Thread.sleep(1000);
				driver.findElement(By.id("pass")).sendKeys("789");
				driver.close();
			}
		}
		driver.switchTo().window(demoshop);
		driver.findElement(By.name("q")).sendKeys("nowmobo");
		driver.findElement(By.xpath("//input[@value=\"Search\"]")).click();
		driver.quit();
	}
}
