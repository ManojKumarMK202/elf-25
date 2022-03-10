package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dependent_Locator_1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/SeleniumPrac/demo.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		List <WebElement> os=driver.findElements(By.xpath("//table[4][@name='os']/tbody/tr/td"));
//		for(int j=2;j<=os.size();j++) {
//			for(int i=1;i<=os.size();i++) {
//				os=driver.findElements(By.xpath("//table[4][@name='os']/tbody/tr["+j+"]/td["+i+"]"));
//				System.out.println(os.get(i).getText());
//			}
//		}
		List <WebElement> os_version=null;
		for(int i=0;i<os.size();i++) {
			if(i%3!=0) {
				os_version=driver.findElements(By.xpath("//table[4][@name='os']/tbody/tr/td["+i+"]"));
				for(WebElement osversion:os_version) {
					System.out.println(osversion.getText());
				}
			}
		}
		driver.quit();
	}

}
