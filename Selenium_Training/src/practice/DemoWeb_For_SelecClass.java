package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoWeb_For_SelecClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.findElement(By.partialLinkText("Books")).click();
		Thread.sleep(1000);
		
		WebElement products_orderby=driver.findElement(By.xpath("//select[@id=\"products-orderby\"]"));
		Select order_products= new Select(products_orderby);
		order_products.selectByIndex(3);
		Thread.sleep(2000);
		
		WebElement display= driver.findElement(By.xpath("//select[@id=\"products-pagesize\"]"));
		Select pagesize= new Select(display);
		pagesize.selectByVisibleText("12");
		Thread.sleep(2000);
		
		WebElement view_as= driver.findElement(By.name("products-viewmode"));
		Select view_mode= new Select(view_as);
		//view_mode.selectByValue("http://demowebshop.tricentis.com/books?viewmode=list"); donot works
		view_mode.selectByVisibleText("List");
		Thread.sleep(2000);
		
		driver.quit();
	}

}
