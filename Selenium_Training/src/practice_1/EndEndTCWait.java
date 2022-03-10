package practice_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EndEndTCWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
		WebDriverWait wait= new WebDriverWait(driver,20);
		//Thread.sleep(1000);
		
		WebElement registerlink=driver.findElement(By.linkText("Register"));
		wait.until(ExpectedConditions.elementToBeClickable(registerlink));
		registerlink.click();
		
		String firstname="Manoj";
		String lastname="Kumar";
		String email="manojhonda691@gmail.com";
		String password= "7829228202manu";
		String confirmpassword="7829228202manu";
		driver.findElement(By.name("Gender")).click();
		driver.findElement(By.name("FirstName")).sendKeys(firstname);
		driver.findElement(By.name("LastName")).sendKeys(lastname);
		driver.findElement(By.name("Email")).sendKeys(email);
		driver.findElement(By.name("Password")).sendKeys(password);
		driver.findElement(By.name("ConfirmPassword")).sendKeys(confirmpassword);
		//Thread.sleep(1000);
		WebElement registerbutton= driver.findElement(By.xpath("//input[@value=\"Register\"]"));
		wait.until(ExpectedConditions.elementToBeClickable(registerbutton));
		registerbutton.click();
		
		WebElement loginlink=driver.findElement(By.className("ico-login"));
		wait.until(ExpectedConditions.elementToBeClickable(loginlink));
		loginlink.click();
		
		driver.findElement(By.xpath("//input[@autofocus=\"autofocus\"]")).sendKeys(email);
		driver.findElement(By.xpath("//input[@class=\"password\"]")).sendKeys(password);
		
		WebElement loginbutton= driver.findElement(By.xpath("(//input[@type=\"submit\"])[2]"));
		wait.until(ExpectedConditions.elementToBeClickable(loginbutton));
		loginbutton.click();
		
		driver.close();

	}

}
