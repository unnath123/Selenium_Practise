package com.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class actionTestNG {
    WebDriver driver;
    
    @BeforeClass
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void testingTest() {
        System.out.println("working");
    }

    @Test
    public void mouseHoverTest() throws InterruptedException {
        driver.get("https://www.spicejet.com/");
        Thread.sleep(2000);
        
        // Mouse Hover
        Actions action = new Actions(driver);
        WebElement addonsMenu = driver.findElement(By.xpath("//div[text()='Add-ons']"));
        action.moveToElement(addonsMenu).perform();
        
        Thread.sleep(2000);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
