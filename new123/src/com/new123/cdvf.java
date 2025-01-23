package com.new123;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import java.io.File;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class cdvf {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		
//		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver-win64");
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://ultimateqa.com/automation");
		driver.findElement(By.xpath("//a[text()='Login automation']")).click();
		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		

		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user[email]")));
		
		//WebElement em = driver.findElement(By.id("user[email]"));
	
		Ele_Visible(10, driver, By.id("user[email]"));
		//em.sendKeys("unni123@gmail.com");
//		driver.findElement(By.id("user[email]")).sendKeys("unni123@gmail.com");
		driver.findElement(By.id("user[password]")).sendKeys("test12345678");
		
		driver.findElement(By.xpath("//button[normalize-space()='Sign in']")).click();
		
		Thread.sleep(3000);
		
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(screenshot, new File("screenshot.png"));
		
//		Thread.sleep(3000);
		
		driver.quit();

	}
	
	public static void Ele_Visible(int dur,WebDriver driver, By locator) {
		new WebDriverWait(driver, Duration.ofSeconds(dur)).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.visibilityOfElementLocated(locator))
		.sendKeys("unni123@gmail.com");;
		//element.sendKeys("unni123@gmail.com");
	}

}

//unni123@gmail.com
//test12345678