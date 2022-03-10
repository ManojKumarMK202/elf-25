package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Select_Check_Box {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/SeleniumPrac/demo.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		List<WebElement> check_box= driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));
		
		for(WebElement checkbox:check_box) {
			if(checkbox.getAttribute("name").contains("download")) {
				checkbox.click();
				Thread.sleep(1000);
			}
		}
	//	driver.quit();
	}

}
