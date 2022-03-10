package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkWith_MonsterJob {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.monsterindia.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		WebElement element_jobsearch=driver.findElement(By.xpath("(//a[contains(@class,\"main-nav-link\")])[1]"));
		Actions action_jobsearch= new Actions(driver);
		action_jobsearch.moveToElement(element_jobsearch).build().perform();
		
		WebElement element_searchskill=driver.findElement(By.xpath("(//a[@href=\"javascript:void(0);\"])[2]"));
		Actions action_jobsearchskill= new Actions(driver);
		action_jobsearchskill.moveToElement(element_searchskill).build().perform();
		
		WebElement element_javajobs= driver.findElement(By.xpath("(//a[contains(@href,\"https://www.monsterindia.com/search/java-jobs\")])[1]"));
		Actions actions_javajob= new Actions(driver);
		actions_javajob.moveToElement(element_javajobs).click().build().perform();
		
		driver.quit();
	}

}
