package com.new123;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSexecutor {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.ilovepdf.com/pdf_to_word");
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		WebElement element = driver.findElement(By.cssSelector("a[id='pickfiles']"));
		
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		//js.executeScript("arguments[0].style.border= '3px solid black'; arguments[0].style.padding='5px'", element);
		
		js.executeScript("arguments[0].style.outline = '3px solid black'; arguments[0].style.outlineOffset = '10px';", element);

		
		Thread.sleep(5000);
		
		driver.quit();

	}

}
