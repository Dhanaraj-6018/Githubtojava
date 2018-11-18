package Deals.Zohocrm;

import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Zohonew {

	public WebDriver driver;

	Zohonew(WebDriver driver) {

		this.driver = driver;
	}

	By login = By.partialLinkText("LOGIN");
	By userName = By.id("lid");
	By passWord = By.id("pwd");
	By signin = By.id("signin_submit");
	By editbutton = By.id("editRecordbtn");
	By saveButton = By.id("savePotentialsBtn");
	By deals = By.xpath("//a[text()='Deals']");
	By dealName = By.xpath("//input[@class='textField']");
	By accountName = By.xpath("//input[@id='Crm_Potentials_ACCOUNTID']");
	By type = By.xpath("//div[text()=' Type   ']");
	By businessType = By.xpath("//span[text()='New Business']");
	By nextStep = By.id("Crm_Potentials_NEXTSTEP");
	By leadSource = By.xpath("//div[text()=' Lead Source   ']");
	By clickLeadMenu = By.xpath("//span[text()='Advertisement']");
	By contactName = By.id("Crm_Potentials_CONTACTID");
	By amount = By.id("Crm_Potentials_AMOUNT");
	By closingDate = By.id("Crm_Potentials_CLOSINGDATE");
	By clickDate = By.xpath("//div//tr//td[text()='30']");
	By stage = By.id("Crm_Potentials_STAGE_label");
	By stageSelection = By.xpath("//span[text()='Qualification']");
	By campaignSource = By.id("Crm_Potentials_CAMPAIGNID");
	By Description = By.id("Crm_Potentials_DESCRIPTION");
	By checkbox = By.xpath("//span[@class='customCheckBox']");
	By clickDots = By.xpath("//span[@class='newwhitebtn moredot_h2_35 showAct moredotparentBtn']");
	By massUpdate = By.xpath("//a[text()='Mass Update']");
	By selectMassUpdate = By.id("select2-muFlds-container");
	By clickMassUpdateField = By.xpath("//span[text()=' Amount']");
	By massUpdateamount = By.id("txt_36");
	By clickUpdate = By.id("button__36");

	By clickUser = By.id("topdivuserphoto_3611445000000181021");
	By signout = By.xpath("//a[text()='Sign Out']");

// Click login

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
	/**
	 * 
	 * @param emailAddress
	 * @param password
	 * @throws IOException
	 */
	public void signIn() throws IOException {
		File file = new File("C:\\Users\\elcot\\Desktop\\Dealsexcel.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet1 = wb.getSheetAt(0);
		String user = sheet1.getRow(1).getCell(0).getStringCellValue();
		String pass = sheet1.getRow(1).getCell(1).getStringCellValue();
		typeEmailAddress(user);
		typePassword(pass);
		clickOnSignInButton();
	}

//Click deals
	public void clickOnDealsButton() {
		driver.findElement(deals).click();
	}

//Enter Deal name
	public void enterDealName() {
		// File file=new File("C:\\Users\\elcot\\Desktop\\Dealsexcel.xlsx");
		// FileInputStream fis=new FileInputStream(file);
		// XSSFWorkbook wb=new XSSFWorkbook(fis);
		// XSSFSheet sheet1=wb.getSheetAt(1);
		// int rowcount=sheet1.getLastRowNum();
		// System.out.println("Total rows are" + (rowcount+1));
		// for(int i=0;i<rowcount;i++)
		//
		// String str1[]=
		// {"dealName","accountName","nextStep","contactName","amount","campaignSource","Description"};

		// for(int i=0;i<str1.length;i++)
		// {
		// int j=0;
		// String data1=sheet1.getRow(j).getCell(1).getStringCellValue();
		// String a = arr[i];
		driver.findElement(dealName).sendKeys("Testing");
		// j++;
		// }
		/*
		 * String data1=sheet1.getRow(0).getCell(1).getStringCellValue();
		 * driver.findElement(dealName).sendKeys(data1); String
		 * data2=sheet1.getRow(1).getCell(1).getStringCellValue();
		 * driver.findElement(accountName).sendKeys(data2); String
		 * data3=sheet1.getRow(2).getCell(1).getStringCellValue();
		 * driver.findElement(nextStep).sendKeys("Testing");
		 * driver.findElement(contactName).sendKeys("Raja");
		 */

	}

//Enter Accountname
	public void enterAccountName() {
		clear(accountName);
		driver.findElement(accountName).sendKeys("Sundar");
	}

	// clickType
	public void clickType() {
		driver.findElement(type).click();
		driver.findElement(businessType).click();
	}

	// Enter Nextstep
	public void enterNextStep() {
		clear(nextStep);
		driver.findElement(nextStep).sendKeys("Testing");
	}

	public void clickNextStep() {
		driver.findElement(leadSource).click();
		driver.findElement(clickLeadMenu).click();
	}

	// Enter Contact Name
	public void enterContactName() {
		clear(contactName);
		driver.findElement(contactName).sendKeys("Raja");
	}

	// Enter amount
	public void enterAmount() {
		clear(amount);
		driver.findElement(amount).sendKeys("5500000");
	}

	// Click closingDate
	public void clickClosingDate() {
		driver.findElement(closingDate).click();
		driver.findElement(clickDate).click();
	}

	// Select Stage
	public void clickStage() {
		driver.findElement(stage).click();
		driver.findElement(stageSelection).click();
	}

//Enter Campaign source
	public void enterCampaignSource() {
		clear(campaignSource);
		driver.findElement(campaignSource).sendKeys("Software Testing");
	}

//Enter Description
	public void enterDescription() {
		clear(Description);
		driver.findElement(Description).sendKeys("Create a Deals Module");
	}

	// Click checkbox
	public void clickCheckBox() {
		driver.findElement(checkbox).click();
		driver.findElement(clickDots).click();

	}

	// Mass update
	public void massUpdation() {
		driver.findElement(massUpdate).click();
		driver.findElement(selectMassUpdate).click();
		driver.findElement(clickMassUpdateField).click();
		driver.findElement(massUpdateamount).sendKeys("10000000");
		driver.findElement(clickUpdate).click();

	}

	// User Signout
	public void signoutUser() {
		driver.findElement(clickUser).click();
		driver.findElement(signout).click();
	}

//Click Edit button
	public void clickOnEditButton() {

		driver.findElement(editbutton).click();
	}

//Click savebutton	
	public void clickSaveButton() {
		driver.findElement(saveButton).click();
	}

	public void clear(By Element) {
		driver.findElement(Element).clear();
	}
}