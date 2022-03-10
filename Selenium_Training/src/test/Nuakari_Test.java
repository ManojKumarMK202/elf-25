package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nuakari_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\eclipse-workspace\\Selenium_Training\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.naukri.com");
		String title=driver.getTitle();//String return type
		System.out.println(title);
		//driver.manage().window().maximize();
		driver.navigate().refresh();
		
		//driver.close();
		
		driver.quit();

	}

}
