package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Working_WithPrinting_Sort {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/SeleniumPrac/demo.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement select_car= driver.findElement(By.xpath("//select[@id=\"standard_cars\"]"));
		Select type_car= new Select(select_car);
		List<WebElement>list_cars=type_car.getOptions();
		
		System.out.println(list_cars.size());
		
		for(WebElement cars_list:list_cars) {
			System.out.println(cars_list.getText());
		}
		driver.quit();
	}

}
