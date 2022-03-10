package SelPrac;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PracticeSeleniumSat {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		List<WebElement> radiobutton= driver.findElements(By.xpath("//input[@name=\"radioButton\"]"));
		for(WebElement buttonradio:radiobutton) {
			buttonradio.click();
		}
		//(//div[contains(text(),'India')])[2]
		driver.findElement(By.xpath("//input[@id=\"autocomplete\"]")).sendKeys("Ind");
		driver.findElement(By.xpath("(//div[contains(text(),'India')])[2]")).click();
		WebElement selectbox= driver.findElement(By.xpath("//select[@id=\"dropdown-class-example\"]"));
		Select selectchoice= new Select(selectbox);
		selectchoice.selectByVisibleText("Option3");
		
		List<WebElement> optioncheckbox= driver.findElements(By.xpath("//label/input[@type=\"checkbox\"]"));
		for(WebElement checkbox:optioncheckbox) {
			checkbox.click();
		}
		
		String parentwindow= driver.getWindowHandle();
		driver.findElement(By.xpath("//button[@id=\"openwindow\"]")).click();
		Set<String> childwindow=driver.getWindowHandles();
		//System.out.println(childwindow);
		for(String windowchild:childwindow) {
			driver.switchTo().window(windowchild);
			//System.out.println(driver.getTitle());
			if(driver.getTitle().contains("QA Click Academy")) {
				//driver.findElement(By.xpath("//button[text()='NO THANKS']")).click();
				//if you connect to lan it wont appear but if u connect to hotspot it will appear
				driver.findElement(By.linkText("Register")).click();
				driver.findElement(By.xpath("//input[@name=\"name\"]")).sendKeys("Manoj");
				driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("manoj@123");
				driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("123");
				driver.close();
			}
		}
		driver.switchTo().window(parentwindow);
		
		driver.findElement(By.xpath("//a[contains(text(),'Open Tab')]")).click();
		Set<String> childwindow1=driver.getWindowHandles();
		for(String window1child:childwindow1) {
			driver.switchTo().window(window1child);
			//System.out.println(driver.getTitle());
			if(driver.getTitle().contains("Rahul")) {
				driver.findElement(By.xpath("//a[@class=\"theme-btn\"]")).click();
				driver.findElement(By.xpath("//input[@id=\"user_name\"]")).sendKeys("Manoj");
				driver.close();
			}
		}
		driver.switchTo().window(parentwindow);
		
		driver.findElement(By.xpath("//input[@class=\"inputs\"]")).sendKeys("Manoj");
		driver.findElement(By.xpath("//input[@value=\"Alert\"]")).click();
		Alert alrthandle=driver.switchTo().alert();
		alrthandle.accept();
		driver.findElement(By.xpath("//input[@value=\"Confirm\"]")).click();
		alrthandle.accept();
		
		List<WebElement> boxelement=driver.findElements(By.xpath("//table[@name=\"courses\"]/tbody/tr"));
		List<WebElement> inboxelement=driver.findElements(By.xpath("//table[@name=\"courses\"]/tbody/tr[2]/td"));
		//System.out.println(boxelement.size());
		//System.out.println(inboxelement.size());
		for(int i=2;i<=boxelement.size();i++) {
			for(int j=2;j<=inboxelement.size();j++) {
				WebElement tablelement=driver.findElement(By.xpath("//table[@name=\"courses\"]/tbody/tr["+i+"]/td["+j+"]"));
				System.out.print(tablelement.getText()+'\t');
			}
			System.out.println();
		}
		////table[@name="courses"]/tbody/tr/th[2]
		////table[@name="courses"]/tbody/tr[1]/th[2,3]	
		
		WebElement displayhide= driver.findElement(By.xpath("//input[@id=\"displayed-text\"]"));
		displayhide.sendKeys("RRR");
		if(displayhide.isDisplayed()) {
			driver.findElement(By.xpath("//input[@id=\"hide-textbox\"]")).click();
		}
		else {
			driver.findElement(By.xpath("//input[@id=\"show-textbox\"]")).click();
		}
		
		//-(//table[@id="product"])[2]/tbody/tr/td
		//-(//table[@id="product"])[2]/tbody/tr[1]/td[4]
		List<WebElement> tableelements=driver.findElements(By.xpath("(//table[@id=\"product\"])[2]/tbody/tr/td[4]"));
		List<WebElement> fetchelements=driver.findElements(By.xpath("(//table[@id=\"product\"])[2]/tbody/tr[1]/td"));
		System.out.println(tableelements.size());
		System.out.println(fetchelements.size());
		for(int i=1;i<=tableelements.size();i++) {
			for(int j=1;j<=fetchelements.size();j++) {
				if(j==1||j==3||j==4) {
					WebElement elementfetch= driver.findElement(By.xpath("(//table[@id=\"product\"])[2]/tbody/tr["+i+"]/td["+j+"]"));
					System.out.print(elementfetch.getText()+'\t');
				}
			}
			System.out.println();
		}	
		
		WebElement mouseelement= driver.findElement(By.xpath("//button[@id=\"mousehover\"]"));
		Actions mousehover= new Actions(driver);
		mousehover.moveToElement(mouseelement).build().perform();
		WebElement elementmouse= driver.findElement(By.xpath("//a[contains(text(),'Reload')]"));
		Actions mousemove= new Actions(driver);
		mousemove.moveToElement(elementmouse).click().build().perform();
		
		
		driver.quit();
	}
	
}
