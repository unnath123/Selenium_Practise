package com.new123;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://bstackdemo.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		List<WebElement> list = driver.findElements(By.tagName("a"));
		
		for(WebElement link: list) {
			String url = link.getAttribute("href");
			
			if(url != null && !url.isEmpty()) {
				verifyUrl(url);
			}
		}
		

	}
	
	public static void verifyUrl(String url) throws IOException {
		try {
			URL link = new URL(url);
			HttpURLConnection httpURLConnection = (HttpURLConnection) link.openConnection() ;
			httpURLConnection.connect();
			
			int resCode = httpURLConnection.getResponseCode();
			
			if(resCode >= 400) {
				System.out.println("Broken link "+link);
			}
			else {
				System.out.println("Link is working fine "+link);
			}
		}
		catch (MalformedURLException e) {
            System.out.println("Invalid URL: " + url);
        } catch (IOException e) {
            System.out.println("Error Checking Link: " + url + " - " + e.getMessage());
        }
	
		
	}

}
