package com.new123;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class actions {
	@Test
	public void testingTest() {
		System.out.println("working");
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Thread.sleep(3000);
		//MouseHover
		Actions action =new Actions(driver);
    	WebElement ele = driver.findElement(By.xpath("//div[text()='Add-ons']"));
		action.moveToElement(driver.findElement(By.xpath("//div[text()='Add-ons']"))).perform();
		
		//DragAndDrop
//		action.clickAndHold("Element - Click on A")
//		.moveToElement("Element - Drag")
//		.release("drop").build().perform();
		
		Thread.sleep(3000);
		
		driver.quit();
	}

}
