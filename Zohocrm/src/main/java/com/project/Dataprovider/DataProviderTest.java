package com.project.Dataprovider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class DataProviderTest {
		 
         		
	 
	  @DataProvider(name = "Authentication")
	 
	  public  Object[][] credentials() {
	 
	        return new Object[][] { { "dhanarajvlsidesign", "vlsidesign" }, { "bankersaddaabcd", "bankersadda" }};
	 
	  }
	 
	  // Here we are calling the Data Provider object with its Name
	 
	 
	  
	  @Test(dataProvider = "Authentication")
	 
	  public void test(String sUsername, String sPassword) throws Exception {
	 
		  System.setProperty("webdriver.chrome.driver", "C:\\Program\\chromedriver_win32\\chromedriver.exe");
		  
		  WebDriver driver = new ChromeDriver();
	 
	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	      driver.get("https://accounts.google.com/signin/v2/identifier?service=orkut&lp=1&hl=en&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
	 
	      //driver.findElement(By.xpath(".//*[@id='account']/a")).click();
	 
	      driver.findElement(By.id("identifierId")).sendKeys(sUsername);
	      
	      driver.findElement(By.xpath("//span[text()='Next']")).click();
	      
	      Thread.sleep(2000);
	      
	      driver.findElement(By.xpath("//input[@type='password']")).sendKeys(sPassword);
	      
	      driver.findElement(By.xpath("//span[text()='Next']")).click();
	      
	      Thread.sleep(5000);
	
	  }
	  
	  
}


