package com.testNG.concepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Listener.class)
public class ListenerTest {
	
	WebDriver driver;
	
    @BeforeTest
    public void setUp() {
    	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") +"\\src\\main\\resources\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/V4/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
    }
			
	@Test		
	public void Login()				
	{						
	    driver.findElement(By.name("uid")).sendKeys("mngr34926");							
	    driver.findElement(By.name("password")).sendKeys("amUpenu");							
	    driver.findElement(By.name("btnLogin")).click();	
	    String txt=driver.switchTo().alert().getText();
	    System.out.println(txt);
	    driver.switchTo().alert().accept();
	}
	
	@Test
	public void TestFail() {
		System.out.println("This method to test fail");
		Assert.assertTrue(false);
	}
	
	@AfterTest
	public void close() {
		driver.close();
	}

}
