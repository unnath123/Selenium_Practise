package com.test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectDrpDwn {
	public static void main(String[] args) throws InterruptedException {
	     System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver-win64\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver = new ChromeDriver();
	     
	     driver.get("https://testautomationpractice.blogspot.com/");
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     
	     WebElement drpdwn = driver.findElement(By.id("country"));
	     Select drp = new Select(drpdwn);
	     
	     List<WebElement> options = drp.getOptions();
	     
	     List<String> original = new ArrayList<>();
	     
	     for(WebElement item : options) {
	    	 original.add(item.getText());
	    	 System.out.println(item.getText());
	    	 if((item.getText()).equals("India")){
	    		 item.click();
	    	 }
	     }
	     
	     List<String> sortedList = new ArrayList<>();
	     Collections.sort(sortedList);
	     
	     if(sortedList.equals(original)) {
	    	 System.out.println("Sorted");
	     }
	     else {
	    	 System.out.println("Not Sorted");
	     }
	     Thread.sleep(5000);
	     driver.quit();
	     }
}
