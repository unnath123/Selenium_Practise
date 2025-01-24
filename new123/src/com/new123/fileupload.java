package com.new123;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;

public class fileupload {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.ilovepdf.com/pdf_to_word");
		Thread.sleep(2000);
		
		//driver.findElement(By.id("html5_1ii9qgcsr1etm1ui71j8c1prp7mt4")).sendKeys("C:\\Users\\unnat\\Downloads\\groupB.pdf");
		
        
//        
//        WebElement div_upload = driver.findElement(By.id("html5_1ii9qgcsr1etm1ui71j8c1prp7mt4_container"));
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].style.display='block';", div_upload);
        
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        WebElement uploadInput = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("html5_1ii9qgcsr1etm1ui71j8c1prp7mt4")));
//        uploadInput.sendKeys("C:\\Users\\unnat\\Downloads\\groupB.pdf");
		
		
		//driver.findElement(By.xpath("//input[@id='html5_1ii9tg57c4va15fh1uhq1f9610o84']")).sendKeys("C:\\Users\\unnat\\Downloads\\groupB.pdf");

		 driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\unnat\\Downloads\\groupB.pdf");
	
		
		 Thread.sleep(5000);
		
		driver.quit();
	}

}
