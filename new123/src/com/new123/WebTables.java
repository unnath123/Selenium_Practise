package com.new123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//https://trends.builtwith.com/websitelist/Responsive-Tables
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://trends.builtwith.com/websitelist/Responsive-Tables");
		
		WebElement element  = driver.findElement(By.xpath("//td[contains(text(), 'newsletter.someecards')]/preceding-sibling::td[@class='pr-1']"));
		//   //tbody/tr[i]/td[j];
		//System.out.println(element.getText());
		element.click();

	}

}
