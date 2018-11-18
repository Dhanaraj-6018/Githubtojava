package com.project.withoutpagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Zoho {

      WebDriver driver;

	Zoho(WebDriver driver) {

		this.driver = driver;
	}

	By login = By.partialLinkText("LOGIN");
	By userName = By.id("lid");
	By passWord = By.id("pwd");
	By signin = By.id("signin_submit");
	By editbutton = By.id("editRecordbtn");
	By saveButton = By.id("savePotentialsBtn");

//Type login

	public void clickLogin() {
		driver.findElement(login).click();
	}

//Type username	

	public void typeEmailAddress(String emailAddress) {
		driver.findElement(userName).sendKeys(emailAddress);
	}

// Type password
	public void typePassword(String password) {
		driver.findElement(passWord).sendKeys(password);
	}

// Click on sign in button
	public void clickOnSignInButton() {
		driver.findElement(signin).click();
	}

// Single method to sign in
	public void signIn(String emailAddress, String password) {
		typeEmailAddress(emailAddress);
		typePassword(password);
		clickOnSignInButton();
	}
// Lick Edit button
	public void clickOnEditButton() {

		driver.findElement(editbutton).click();
		}
	
	public void clickSaveButton() {
		driver.findElement(saveButton).click();
	}
}