package practice_1;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Close1st_Child {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		//String parent_window= driver.getWindowHandle();
		
		Set<String> child_window= driver.getWindowHandles();
		System.out.println(child_window);
		
		
		for(String window: child_window) {
			driver.switchTo().window(window);
			if (driver.getTitle().equalsIgnoreCase("Cognizant")) {
				driver.close();
			}

			
		}
		//driver.close();
		//driver.quit();
	}

}
