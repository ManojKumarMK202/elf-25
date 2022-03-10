package practice_1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EndtoEnd_TC1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.findElement(By.name("q")).sendKeys("Mobile");
		driver.findElement(By.xpath("//input[@value=\"Search\"]")).click();
		
		driver.findElement(By.name("As")).click();
		
		//List<WebElement> category=driver.findElements(By.xpath("//select[@class='valid']"));//
		WebElement category= driver.findElement(By.xpath("//select[@id='Cid']"));
		Select selectcategory= new Select(category);
		selectcategory.selectByVisibleText("Computers >> Desktops");
//		for(WebElement selectcategory:category) {
//			if(selectcategory.getText().contains("Jewelry")) {
//				selectcategory.click();
//			}
//		}
		
		//List<WebElement> manufacturer= driver.findElements(By.xpath("//select[@id='Mid']"));
		WebElement manufacturer=driver.findElement(By.xpath("//select[@id='Mid']"));
		Select selectManufacture= new Select(manufacturer);
		selectManufacture.selectByVisibleText("Tricentis");
		
//		for(WebElement selectManufacture:manufacturer) {
//			if(selectManufacture.getText().contains("Tricentis")) {
//				selectManufacture.click();
//			}
//		}
		
		driver.findElement(By.id("Pf")).sendKeys("100");
		driver.findElement(By.id("Pt")).sendKeys("10000");
		driver.findElement(By.name("Sid")).click();
		driver.findElement(By.xpath("(//input[@type=\"submit\"])[2]")).click();

	}

}
