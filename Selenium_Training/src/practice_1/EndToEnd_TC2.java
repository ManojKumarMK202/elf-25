package practice_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EndToEnd_TC2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		String firstname="manoj";
		String lastname="kumar";
		String email="manojhonda691@gmail.com";
		String password="7829228202manu";
		
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.xpath("//input[@value=\"M\"]")).click();
		driver.findElement(By.xpath("//input[@name=\"FirstName\"]")).sendKeys(firstname);
		driver.findElement(By.xpath("//input[@name=\"LastName\"]")).sendKeys(lastname);
		driver.findElement(By.xpath("//input[@name=\"Email\"]")).sendKeys(email);
		driver.findElement(By.xpath("//input[@name=\"Password\"]")).sendKeys(password);
		driver.findElement(By.xpath("//input[@name=\"ConfirmPassword\"]")).sendKeys(password);
		driver.findElement(By.xpath("//input[@name=\"register-button\"]")).click();
		
		driver.findElement(By.xpath("//a[@class=\"ico-login\"]")).click();
		driver.findElement(By.xpath("//input[@class=\"email\"]")).sendKeys(email);
		driver.findElement(By.xpath("//input[@class=\"password\"]")).sendKeys(password);
		driver.findElement(By.xpath("(//input[@type=\"submit\"])[2]")).click();
		
		WebElement validate= driver.findElement(By.xpath("(//a)[2][@class='account']"));
		if(validate.getText().equalsIgnoreCase(email)) {
			System.out.println("validation successful");
		}
		driver.quit();
	}

}
