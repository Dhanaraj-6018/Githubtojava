package com.proj.library;

import org.openqa.selenium.WebDriver;

public class Library {

	private WebDriver driver;

	public Library(WebDriver driver) {
		this.driver = driver;
	}

	public void MaximizeBrowser() {
		driver.manage().window().maximize();
	}

	public void CloseBrowser() {
		driver.close();
	}

}
