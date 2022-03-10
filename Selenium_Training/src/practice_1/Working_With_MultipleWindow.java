package practice_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_MultipleWindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		String parent_window= driver.getWindowHandle();
		
		Set<String> child_window= driver.getWindowHandles();
		System.out.println(child_window);
//		for(String window: child_window) {
//			driver.switchTo().window(window);
//			System.out.println(driver.getTitle());
//			driver.close();
//		} for parent
		
		List<String> childwin= new ArrayList(child_window);
		
		for(int i=1;i<childwin.size();i++) {
			driver.switchTo().window(childwin.get(i));
			driver.close();
		}
		
		
		//driver.switchTo().window(parent_window);
		//driver.close();
	}

}
