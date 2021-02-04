package com.testNG.concepts;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersAnnotation {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") +"\\src\\main\\resources\\chromedriver.exe");
		driver=new ChromeDriver();
	
	}
	
	@Test
	@Parameters({"url","email"})
	public void login(String url,String email){
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		WebElement gmailEle=driver.findElement(By.linkText("Gmail"));
		gmailEle.click();
		/*
		 * WebElement signIn=driver.findElement(By.
		 * xpath("//li[@class='h-c-header__cta-li g-mail-nav-links--mobile  link--last']/a[text()[normalize-space()='Sign in']]"
		 * )); String parentHandle=driver.getWindowHandle(); signIn.click(); Set<String>
		 * handles=driver.getWindowHandles(); Iterator<String> it=handles.iterator();
		 * while(it.hasNext()) { String childHandle=it.next();
		 * driver.switchTo().window(childHandle); }
		 * driver.findElement(By.id("identifierId")).sendKeys(email);
		 */
		
		
		
	}
	
	@AfterMethod
	public void closeConnections() {
		driver.close();
	}

}
