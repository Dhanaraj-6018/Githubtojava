package com.project.Pagefac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Pagefactory {

	WebDriver driver;
	String name = null;

	// using with pagefactory

	public Pagefactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, Pagefactory.class);
	}

//	@FindBy(className = "signin") 
//    private WebElement signin;

	// @FindBy(how=How.XPATH, using="//a[text()='LOGIN']")
	// WebElement signin;

	@FindBy(name = "lid")
	WebElement userName;

	@FindBy(name = "pwd")
	WebElement password;

	@FindBy(id = "signin_submit")
	WebElement submit;

	public void user(String usr, String pwd) {
		// signin.click();
		userName.sendKeys(usr);
		password.sendKeys(pwd);
		submit.click();
	}

}
