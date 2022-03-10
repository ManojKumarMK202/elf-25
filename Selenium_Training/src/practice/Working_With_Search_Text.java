package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_Search_Text {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.name("q")).sendKeys("Computers");
		WebElement search_textfield=driver.findElement(By.name("q"));
		search_textfield.sendKeys("Computers");
		Thread.sleep(1000);
//		System.out.println(driver.findElement(By.name("q")).getText());// empty
//		System.out.println(driver.findElement(By.name("q")).getAttribute("id"));// small items
		System.out.println(search_textfield.getText());
		System.out.println(search_textfield.getAttribute("id"));
//		driver.findElement(By.name("q")).clear();
		search_textfield.clear();
		Thread.sleep(1000);
//		driver.findElement(By.name("q")).sendKeys("nowMobile");
		search_textfield.sendKeys("nowMobile");
//		System.out.println(driver.findElement(By.name("q")).getText());// empty
//		System.out.println(driver.findElement(By.name("q")).getAttribute("value"));// nowmobile
		System.out.println(search_textfield.getText());
		System.out.println(search_textfield.getAttribute("value"));
		//boolean value = driver.findElement(By.xpath("//input[@type=\"submit\"]")).isEnabled();
		WebElement search_button=driver.findElement(By.xpath("//input[@type=\"submit\"]"));
		if (search_button.isEnabled()) {
			System.out.println(search_button.isEnabled());
			search_button.click();
			String result = driver.findElement(By.xpath("//strong[@class=\"result\"]")).getText();
			System.out.println("The result of search is =" + result);
		} else {
			String buttonres = search_button.getAttribute("class");
			System.out.println(buttonres + "= is disabled");
		}
		Thread.sleep(1000);
		driver.quit();
	}

}
