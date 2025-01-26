package com.new123;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadPropFile {
	public static void main(String[] args) throws IOException {
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream("C:\\Users\\unnat\\git\\Selenium_Practise\\new123\\config.properties");
		
		prop.load(ip);
		
		System.out.println(prop.getProperty("NAME"));
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get(prop.getProperty("URL"));
		
	}

}
