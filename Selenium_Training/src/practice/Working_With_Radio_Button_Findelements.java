package practice;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_Radio_Button_Findelements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		List<WebElement> radio_button= driver.findElements(By.xpath("//input[@type=\"radio\"]"));
		
		for(WebElement radiobutton:radio_button) {
			radiobutton.click();
			Thread.sleep(1000);
		}
		
		for(int i=0;i< radio_button.size();i++) {
			if(radio_button.get(i).getAttribute("type").contains("radio")) {
				radio_button.get(i).click();
			}
				
		}
		
		driver.close();

	}

}
