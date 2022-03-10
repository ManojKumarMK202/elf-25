package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebshop_Xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
				"C:\\\\Users\\\\admin\\\\eclipse-workspace\\\\Selenium_Training\\\\Drivers\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[3]/form/input[@type=\"text\"]"))
		.sendKeys("computers");
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[3]/form/input[2][@type=\"submit\"]"))
		.click();

	}

}
