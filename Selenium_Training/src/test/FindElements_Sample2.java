package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements_Sample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		//System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		
		List<WebElement> elements= driver.findElements(By.xpath("//li"));
//		for (int i = 0; i < elements.size(); i++) {
//			//String str= elements.get(i).getText();
//			System.out.println(elements.get(i).getAttribute("href"));
//		}
		for(WebElement we: elements) {
			System.out.println(we.getAttribute("ass"));
		}
		
		driver.close();

	}

}
