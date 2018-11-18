package com.project.pagewebelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Pageele {

	public void deals() throws Exception {
		
		WebDriver driver = null;

		driver.findElement(By.xpath("//a[text()='Deals']")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//lyte-yield[text()='Create a Deal']")).click();

		// driver.findElement(By.xpath("//button[@class='newwhitebtn customPlusBtn
		// ']")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@class='textField']")).click();

		driver.findElement(By.xpath("//input[@class='textField']")).sendKeys("Plastics");

		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@id='Crm_Potentials_ACCOUNTID']")).click();

		driver.findElement(By.xpath("//input[@id='Crm_Potentials_ACCOUNTID']")).sendKeys("Dhanaraj");

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

		Thread.sleep(3000);

		driver.findElement(By.xpath("//div[text()=' Contact Name   ']")).click();

		driver.findElement(By.xpath("//input[@id='Crm_Potentials_CONTACTID']")).sendKeys("Raja");

		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[text()=' Amount   ']")).click();

		driver.findElement(By.xpath("//input[@id='Crm_Potentials_AMOUNT']")).sendKeys("500000");

		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@id='Crm_Potentials_CLOSINGDATE']")).click();

		driver.findElement(By.xpath("//div//tr//td[text()='23']")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[@id='Crm_Potentials_STAGE_label']")).click();

		driver.findElement(By.xpath("//span[text()='Qualification']")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//div[text()=' Campaign Source   ']")).click();

		driver.findElement(By.xpath("//input[@id='Crm_Potentials_CAMPAIGNID']")).sendKeys("Software");

		Thread.sleep(3000);

		driver.findElement(By.xpath("//div[text()=' Description   ']")).click();

		driver.findElement(By.xpath("//textarea[@id='Crm_Potentials_DESCRIPTION']")).sendKeys("Create a Deal module");

		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@value='Save']")).click();

	}
}
