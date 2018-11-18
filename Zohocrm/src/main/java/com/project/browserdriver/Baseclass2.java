package com.project.browserdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass2 {

	public static WebDriver StartTest() {

		System.setProperty("webdriver.chrome.driver", "C:\\Program\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://accounts.zoho.com/signin?servicename=ZohoCRM&signupurl=https://www.zoho.com/crm/signup.html?plan=enterprise");
		return driver;

	}

}
