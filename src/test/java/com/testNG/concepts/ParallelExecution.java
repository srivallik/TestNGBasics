package com.testNG.concepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelExecution {
	
	public WebDriver driver;
	public WebDriver driver2;
	public WebDriver driver3;
	@Test
	public void session1() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") +"\\src\\main\\resources\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/V4/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.findElement(By.name("uid")).sendKeys("Driver 1");
		
	}
	
	@Test
	public void session2() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") +"\\src\\main\\resources\\chromedriver.exe");
		driver2=new ChromeDriver();
		driver2.get("http://demo.guru99.com/V4/");
		driver2.manage().window().maximize();
		driver2.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver2.findElement(By.name("uid")).sendKeys("Driver 2");
		
	}
	
	@Test
	public void session3() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") +"\\src\\main\\resources\\chromedriver.exe");
		driver3=new ChromeDriver();
		driver3.get("http://demo.guru99.com/V4/");
		driver3.manage().window().maximize();
		driver3.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver3.findElement(By.name("uid")).sendKeys("Driver 3");
		
	}

}
