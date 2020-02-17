package com.qa.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoLaunchBrowser {

	
	@Test
  public void fun() throws Exception{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sauravp\\Desktop\\Official\\Java\\HomeDir\\chromedriver_win32\\chromedriver.exe");
	  // Initialize browser
		WebDriver driver=new ChromeDriver();

	  // Open Google
	  driver.get("http://www.google.com");

	  driver.close();
  }
}
