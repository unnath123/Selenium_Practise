package com.new123;

import java.time.Duration;
import java.util.ArrayList;
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
		
		driver.findElement(By.xpath("//label[@for='departure']")).click();
		
		String Month = "February";
		int date = 22;
		
		
		
		List<WebElement> elements = driver.findElements(By.xpath("//div[@class='DayPicker-Month']"));
//		System.out.println(elements.get(1).getText());
//		DateSelect(elements.get(1), date);
		System.out.println(elements.get(0));
		System.out.println(elements.get(1));
		
		
		for(WebElement element : elements) {
			if((element.getText()).contains(Month)) {
				System.out.println("hurray");
				DateSelect(element, date);
				break;
			}
			else {
				System.out.println("Click next button");
			}
			
		}
		
		//WebElement ele1 = driver.findElement(By.xpath("//div[@class='DayPicker-Months']/div[1]"));

//		if(ele1.findElement(By.className("DayPicker-Caption")).getText() == Month) {
//			DateSelect(ele1, date);
//			System.out.println("first");
//		}
//		else {
//			System.out.println("second");
//			WebElement ele2 = driver.findElement(By.xpath("//div[@class='DayPicker-Months']/div[2]"));
//			//System.out.println(ele2.findElement(By.className("DayPicker-Caption")).getText());
//			DateSelect(ele2, date);
//		}
//		
				
	
//		
//		System.out.println(driver.findElement(By.xpath("//div[@class='DayPicker-Month'][2]//div[@class='DayPicker-Body']")).getText());
//		driver.findElement(By.xpath("//div[@class='DayPicker-Month'][2]//div[@class='DayPicker-Body']//p[text()='2']")).click();
		
		Thread.sleep(5000);
		  
//		driver.quit();
	}
	
	public static void DateSelect(WebElement element, int date) {
		System.out.println("third");
//		System.out.println(element.findElement(By.xpath("//div[@class='DayPicker-Day'][contains(@aria-label,'Feb 20 2025')]")).getText());
		element.findElement(By.xpath("//div[@class='DayPicker-Day']//p[text()='"+ date +"']")).click();
		
	}
	
	

	
}
