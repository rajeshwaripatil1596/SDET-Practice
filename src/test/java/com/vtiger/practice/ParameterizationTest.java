package com.vtiger.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParameterizationTest
{
	@Test 
	public void parameterizationTest()
	{
		 WebDriver driver=null;
		 String url=System.getProperty("url");
		 String browser=System.getProperty("browser");
		 switch(browser)
		 {
		 case "chrome":
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
				break;
			case "firefox":
				WebDriverManager.firefoxdriver().setup();
				driver=new FirefoxDriver();
				break;
			case "edge":
				WebDriverManager.edgedriver().setup();
				driver=new EdgeDriver();
				break;
			default:
				System.out.println("specify the correct browser");
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
				break;

		 }
		 driver.get(url);
		 driver.quit();
	}

}
