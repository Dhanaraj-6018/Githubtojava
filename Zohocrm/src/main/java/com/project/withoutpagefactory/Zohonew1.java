package com.project.withoutpagefactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Zohonew1 {

	@Test
	public void dealsCRM() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Program\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://crm.zoho.com/crm/org676104565/tab/Home/begin");
		driver.manage().window().maximize();
		Thread.sleep(2000);
// Object creation 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Zohonew zoho1 = new Zohonew(driver);
		zoho1.clickLogin();
		zoho1.signIn(, "Dhanaraj1!");
		zoho1.clickOnDealsButton();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='newwhitebtn customPlusBtn ']")).click();
		Thread.sleep(2000);
		zoho1.enterDealName();
		zoho1.enterAccountName();
		zoho1.clickType();
		zoho1.clickNextStep();
		zoho1.enterContactName();
		zoho1.enterAmount();
		zoho1.clickClosingDate();
		zoho1.clickStage();
		zoho1.enterCampaignSource();
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
		zoho1.enterDescription();
		zoho1.clickSaveButton();
		zoho1.clickOnEditButton();
		zoho1.clickSaveButton();
		Thread.sleep(3000);
		zoho1.clickOnDealsButton();
		Thread.sleep(2000);
		zoho1.clickCheckBox();
		zoho1.massUpdation();
		Thread.sleep(4000);
		zoho1.signoutUser();
		Thread.sleep(3000);

	}
}
