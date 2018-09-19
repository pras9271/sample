package jquery;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SendKeysAction;
import org.testng.annotations.Test;

public class datepicker {
	
	@Test
	public void datepicker() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", ".//drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(text(),'Datepicker')]")).click();
		
		WebElement elem = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(elem);
		Thread.sleep(5000);
		
		driver.findElement(By.id("datepicker")).sendKeys("06/01/1992");
		Thread.sleep(5000);
		
		Actions act = new Actions(driver);
		WebElement demo = driver.findElement(By.cssSelector("#ui-datepicker-div > table > tbody > tr:nth-child(1) > td.ui-datepicker-current-day > a"));
		act.moveToElement(demo).build().perform();
		demo.click();
		
		System.out.println("completed");
		
	}

}
