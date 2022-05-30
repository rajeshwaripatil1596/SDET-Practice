package com.vtiger.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest 
{
	@Test
	public void loginTest()
	{
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("http://localhost:8888/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("admin");
	driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("root");
	driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
	driver.quit();
	
	}
	
}
