package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		List<WebElement> elements= driver.findElements(By.xpath("//span"));
		List<WebElement> elements1=driver.findElements(By.xpath("//img"));
		List<WebElement> elements2= driver.findElements(By.xpath("//a"));
		List<WebElement> elements3= driver.findElements(By.xpath("//li"));
		System.out.println("no of elements of li  "+elements3.size());
		System.out.println("===================================================");
		int count=0;
		int count1=0;
		int count2=0;
		
		for(WebElement we: elements) {
			System.out.println(we.getText());
//			System.out.println("------------------------------------------------------------------------");
//			System.out.println(we.getAttribute("value"));
//			System.out.println("------------------------------------------------------------------------");
//			System.out.println(we.getAttribute("title"));
			count1++;
		}
		System.out.println(count1);
		System.out.println("------------------------------------------------------------------------");
		
		for(WebElement we: elements1) {
			System.out.println(we.getAttribute("img"));
			count++;
		}
		System.out.println(count);
		System.out.println("------------------------------------------------------------------------");
		
		for(WebElement we: elements2) {
			System.out.println(we.getAttribute("title"));
			count2++;
		}
		System.out.println(count2);
		System.out.println("===================================================================================");
		
//		for(WebElement we: elements3) {
//			System.out.println(we.getAttribute("tagname"));
//		}
		
		driver.close();

	}
}
