package Selenium_Automation.Selenium_Practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Question4_sdet {
	@Test
	public void SetUp() throws AWTException, InterruptedException{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com/");
		driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("W3Schools");
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div/div[1]/div/a/h3")).click();
		Thread.sleep(2000);
		String url=driver.getCurrentUrl();
		if (url.equals("https://www.w3schools.com/")) {
			System.out.println("Exact URL Found");
		}
		else {
			System.out.println("Not Found");
		}
		driver.close();
		
	}
	
}
