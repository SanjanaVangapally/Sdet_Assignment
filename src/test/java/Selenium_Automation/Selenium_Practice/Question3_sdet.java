package Selenium_Automation.Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Question3_sdet {
	@Test
	public void SetUP()throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com/");
		String google = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/img")).getText();
		// System.out.println(google);
		if (google != null)
			System.out.println("Google Image is found");
		else
			System.out.println("Google Image is not found");
		WebElement search = driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
		if (search != null)
			System.out.println("Search Box is present");
		else
			System.out.println("Search Box is not present");

		WebElement button1 = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]"));
		String verifybtn1 = button1.getAttribute("value");
		System.out.println(verifybtn1);
		if (verifybtn1.equals("Google Search"))
			System.out.println("Correct Text is present on Button1");
		else
			System.out.println("Incorrect Text on Button1");

		WebElement button2 = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[2]"));
		String verifybtn2 = button2.getAttribute("value");
		System.out.println(verifybtn2);
		if (verifybtn2.equals("I'm Feeling Lucky"))
			System.out.println("Correct Text is present on Button2");
		else
			System.out.println("Incorrect Text on Button2");

		Thread.sleep(2000);

		driver.quit();
		}
}
