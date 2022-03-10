package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_Class_Methods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("file:///D:/SeleniumPrac/demo.html");
		driver.manage().window().maximize();
		WebElement  std_cars=driver.findElement(By.xpath("//select[@id=\"standard_cars\"]"));
//		//address of the web element
//		Point p= std_cars.getLocation();
//		System.out.println(p.getX()+" "+p.getY());
		Select cars_type= new Select(std_cars);
//		cars_type.selectByIndex(5);
//		Thread.sleep(2000);
//		cars_type.selectByValue("hda");
//		Thread.sleep(2000);
//		cars_type.selectByVisibleText("Audi");
//		Thread.sleep(2000);
//		//driver.quit();
		List<WebElement> list= cars_type.getOptions();
		for(int i=0;i<list.size();i++) {
			if(list.get(i).isEnabled()) {
				cars_type.selectByIndex(i);
			}
			
		}
		for(int i=0;i<list.size();i++) {
			cars_type.selectByValue("");
		}
		for(int i=0;i<list.size();i++) {
			cars_type.selectByVisibleText("");
		}
		
	}

}

