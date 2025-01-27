package com.new123;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendars {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.makemytrip.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
		Thread.sleep(2000);
		driver.findElement(By.className("commonModal__close")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for='departure']")).click();
		
		List<WebElement> elements = driver.findElements(By.className("DayPicker-Caption"));
		
		int index=1;
		
//		for(WebElement element : elements) {
//			WebElement MonthDiv = element.findElement(By.tagName("div"));
//			if(MonthDiv.getText() == "February") {
//				
//			}
//			else {
//				index++;
//			}
//		}
		
		System.out.println(driver.findElement(By.xpath("//div[@class='DayPicker-Month'][2]//div[@class='DayPicker-Body']")).getText());
		driver.findElement(By.xpath("//div[@class='DayPicker-Month'][2]//div[@class='DayPicker-Body']//p[text()='2']")).click();
		
		Thread.sleep(5000);
		
		driver.quit();
	}

	
}
