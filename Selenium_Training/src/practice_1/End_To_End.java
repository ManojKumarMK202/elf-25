package practice_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class End_To_End {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.findElement(By.linkText("Register")).click();
//		WebElement radio_button= driver.findElement(By.xpath("(//div[@class=\"inputs\"])[1]"));////div[@class="inputs"][4]
//		Actions click_act= new Actions(driver);
//		click_act.
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
		Thread.sleep(1000);
		////div[contains(text(),' Your registration ')]
		
		WebElement button=driver.findElement(By.xpath("//input[@value=\"Register\"]"));
		
		if(button.isEnabled()) {
			button.click();
			Thread.sleep(1000);
			//for new user
			WebElement new_user=driver.findElement(By.xpath("//div[contains(text(),' Your registration ')]"));
			String newuser= new_user.getText();
			if(newuser.equalsIgnoreCase("\r\n"
					+ "            Your registration completed\r\n"
					+ "        ")) {
				driver.findElement(By.className("ico-logout")).click();
				
			}
			
			//existing user
			if(driver.findElement(By.xpath("//li[contains(text(),'The specified email')]")).isDisplayed()) {
				driver.findElement(By.className("ico-login")).click();
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("//input[@autofocus=\"autofocus\"]")).sendKeys(email);
				driver.findElement(By.xpath("//input[@class=\"password\"]")).sendKeys(password);
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("(//input[@type=\"submit\"])[2]")).click();
				Thread.sleep(1000);
			}
			
		}
		else {
			System.out.println(button.getText()+"is not enabled");
		}
		
		
		
		Thread.sleep(1000);
		
//		driver.findElement(By.className("ico-login")).click();
//		Thread.sleep(1000);
//		
//		driver.findElement(By.xpath("//input[@autofocus=\"autofocus\"]")).sendKeys(email);
//		driver.findElement(By.xpath("//input[@class=\"password\"]")).sendKeys(password);
//		Thread.sleep(1000);
//		
//		driver.findElement(By.xpath("(//input[@type=\"submit\"])[2]")).click();
//		Thread.sleep(1000);
//		
		driver.quit();
	}

}
