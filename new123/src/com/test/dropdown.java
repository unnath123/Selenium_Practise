package com.test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class dropdown {
	public static void main(String[] args) {
	     System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver-win64\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver = new ChromeDriver();
	     
	     driver.get("https://ultimateqa.com/automation#");
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     
	     System.out.println("Hello"); 
	     driver.findElement(By.xpath("//a[text()='Education']")).click();
	     
	     WebElement list = driver.findElement(By.xpath("//ul[@class='sub-menu']"));
	     
	     WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//	     wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.tagName("li")));
	     wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//ul[@class='sub-menu']/li")));
	     
	     
	     List<WebElement> allliTags = list.findElements(By.tagName("li"));
	   
	     
	     for(WebElement item: allliTags) {
	    	 System.out.println(item.getText());
	     }
	     System.out.println("Hello1"); 
	     driver.quit();
	}
}
