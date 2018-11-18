package com.project.withoutpagefactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Zohocrm {
	@Test
	public void dealsCRM() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Program\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://crm.zoho.com/crm/org676104565/tab/Home/begin");
		driver.manage().window().maximize();
		Thread.sleep(2000);
// Object creation 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Zoho zoho = new Zoho(driver);
		zoho.clickLogin();
		zoho.signIn("bankersaddaabcd@gmail.com", "Dhanaraj1!");
		driver.findElement(By.xpath("//a[text()='Deals']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='newwhitebtn customPlusBtn ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='textField']")).click();
		driver.findElement(By.xpath("//input[@class='textField']")).sendKeys("Plastics2");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='Crm_Potentials_ACCOUNTID']")).click();
		driver.findElement(By.xpath("//input[@id='Crm_Potentials_ACCOUNTID']")).sendKeys("Dhanarajraja");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()=' Type   ']")).click();
		driver.findElement(By.xpath("//span[text()='New Business']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()=' Next Step   ']")).click();
		driver.findElement(By.xpath("//input[@id='Crm_Potentials_NEXTSTEP']")).sendKeys("Testing ");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()=' Lead Source   ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Advertisement']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()=' Contact Name   ']")).click();
		driver.findElement(By.xpath("//input[@id='Crm_Potentials_CONTACTID']")).sendKeys("Rajaraj");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()=' Amount   ']")).click();
		driver.findElement(By.xpath("//input[@id='Crm_Potentials_AMOUNT']")).sendKeys("500000");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='Crm_Potentials_CLOSINGDATE']")).click();
		driver.findElement(By.xpath("//div//tr//td[text()='30']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='Crm_Potentials_STAGE_label']")).click();
		driver.findElement(By.xpath("//span[text()='Qualification']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()=' Campaign Source   ']")).click();
		driver.findElement(By.xpath("//input[@id='Crm_Potentials_CAMPAIGNID']")).sendKeys("Software Testing");
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
		driver.findElement(By.xpath("//div[text()=' Description   ']")).click();
		driver.findElement(By.xpath("//textarea[@id='Crm_Potentials_DESCRIPTION']")).sendKeys("Create a Deal module");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Save']")).click();
		// zoho.clickSaveButton();
		Thread.sleep(2000);
		zoho.clickOnEditButton();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Save']")).click();
		// zoho.clickSaveButton();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Deals']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='customCheckBox']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='newwhitebtn moredot_h2_35 showAct moredotparentBtn']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Mass Update']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@id='select2-muFlds-container']")).click();
		driver.findElement(By.xpath("//span[text()=' Amount']")).click();
		driver.findElement(By.xpath("//input[@id='txt_36']")).click();
		driver.findElement(By.xpath("//input[@id='txt_36']")).sendKeys("230000");
		driver.findElement(By.xpath("//input[@id='button__36']")).click();
	}
}
