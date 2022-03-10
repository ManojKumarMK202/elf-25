package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo_WebShop_Items {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.partialLinkText("Books")).click();
		Thread.sleep(1000);
		
		WebElement sort_by= driver.findElement(By.xpath("//select[@id=\"products-orderby\"]"));
		Select list_sortby= new Select(sort_by);
		
		List<WebElement>store_list=list_sortby.getOptions();
		
		for(int i=0;i<store_list.size();i++) {
//			WebElement sort_by_new= driver.findElement(By.xpath("//select[@id=\"products-orderby\"]"));
//			Select list_sortby_new= new Select(sort_by);
//			if(store_list.get(i).getText().equalsIgnoreCase("Name: Z to A")) {
//				System.out.println(i);
//			}
			System.out.println(store_list.get(i).getText()+" "+'\t'+i);
			//Thread.sleep(1000);
		}
		driver.quit();
	}

}
