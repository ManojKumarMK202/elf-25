package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\admin\\eclipse-workspace\\Selenium_Training\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		driver.get("https:/www.amazon.com");
		driver.navigate().to("https://www.amazon.com");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
