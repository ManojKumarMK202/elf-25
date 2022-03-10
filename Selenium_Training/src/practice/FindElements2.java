package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements2 {

	public static void main(String[] args) {
		//List<WebElement> elements= 
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.findElement(By.partialLinkText("Books")).click();
		List<WebElement> elements= driver.findElements(By.xpath("//input[@ value='Add to cart']"));
		
		System.out.println("no of add to cart button "+elements.size());
		for(WebElement we: elements) {
			//if() {}
		}
		
		
		driver.close();
	}

}
