package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_Radio_Button {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		//driver.findElement(By.linkText("Poor")).click();
		WebElement radio_button=driver.findElement(By.xpath("//input[@id=\"pollanswers-3\"]"));
	    radio_button.click();
		Thread.sleep(1000);
		WebElement vote_button= driver.findElement(By.xpath("//input[@value=\"Vote\"]"));
		if(radio_button.isSelected()) {
			 System.out.println("radio button is clicked");
			//System.out.println(vote_button.isEnabled()+" is enabled");
			vote_button.click();
			System.out.println(vote_button.getText());
		}
		else {
			System.out.println(radio_button+" is disabled");
		}
		driver.quit();
		
	}

}
