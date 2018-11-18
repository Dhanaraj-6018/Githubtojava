package Zohodealsmodule1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Dealcrm {

	public WebDriver driver;

	Dealcrm(WebDriver driver) {

		this.driver = driver;
	}

	// By login = By.partialLinkText("LOGIN");
	By userName = By.id("lid");
	By passWord = By.id("pwd");
	By signin = By.id("signin_submit");
	By editbutton = By.id("editRecordbtn");
	By saveButton = By.xpath("//input[@id='savePotentialsBtn']");
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
		driver.findElement(userName).sendKeys(user);
		driver.findElement(passWord).sendKeys(pass);
		driver.findElement(signin).click();

	}

//Create button
	public void createScenorio() throws IOException {
		File file = new File("C:\\Users\\elcot\\Desktop\\Dealsexcel.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet1 = wb.getSheetAt(1);
		for (int i = 0; i < 6; i++) {
			String create = sheet1.getRow(i).getCell(0).getStringCellValue();
			XSSFCell cel = sheet1.getRow(i).getCell(1);
			cel.setCellType(cel.CELL_TYPE_STRING);
			String create1 = sheet1.getRow(i).getCell(1).getStringCellValue();
			driver.findElement(By.xpath("//div[contains(@id,'" + create + "')]//input")).sendKeys(create1);
		}

	}
	
//new 
	public void createScenorio1() throws IOException, Exception {
		File file = new File("C:\\Users\\elcot\\Desktop\\Dealsexcel.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet1 = wb.getSheetAt(1);
		for (int i = 0; i < 6; i++) {
			String create = sheet1.getRow(i).getCell(0).getStringCellValue();
			XSSFCell cel = sheet1.getRow(i).getCell(2);
			cel.setCellType(cel.CELL_TYPE_STRING);
			String create1 = sheet1.getRow(i).getCell(2).getStringCellValue();
			driver.findElement(By.xpath("//div[contains(@id,'" + create + "')]//input")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//div[contains(@id,'" + create + "')]//input")).clear();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//div[contains(@id,'" + create + "')]//input")).sendKeys(create1);
		}

	}

//Click deals
	public void clickOnDealsButton() {
		driver.findElement(deals).click();
	}

//click option
	public void clickTextField() throws IOException, Exception {
		File file = new File("C:\\Users\\elcot\\Desktop\\Dealsexcel.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet1 = wb.getSheetAt(1);
		for (int i = 0; i < 7; i++) {
			String create2 = sheet1.getRow(i).getCell(0).getStringCellValue();
			XSSFCell cel1 = sheet1.getRow(i).getCell(2);
			cel1.setCellType(cel1.CELL_TYPE_STRING);
			String create3 = sheet1.getRow(i).getCell(2).getStringCellValue();
			int co = 0;
			while(co <=2)
			try {
			driver.findElement(By.xpath("(//div[contains(@id,'" + create2 + "')]//input)[last()]")).click();
			Thread.sleep(2000);
			break;
			}
			catch(Exception e) {
				Actions act = new Actions(driver);
				act.sendKeys(Keys.ARROW_DOWN).build().perform();
				act.sendKeys(Keys.ENTER).build().perform();
				Thread.sleep(500);
			}
			//((JavascriptExecutor) driver).executeScript("window.scrollTo(0,0)");
			driver.findElement(By.xpath("(//div[contains(@id,'" + create2 + "')]//input)[last()]")).clear();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//div[contains(@id,'" + create2 + "')]//input)[last()]")).sendKeys(create3);
			//((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
		}
	
	}

// clickType
	public void clickType() {
		driver.findElement(type).click();
		driver.findElement(businessType).click();
	}

	public void clickNextStep() {
		driver.findElement(leadSource).click();
		driver.findElement(clickLeadMenu).click();
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

//Enter Description
	public void enterDescription() {
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

	public void clear(String create1) {
		driver.findElement(By.xpath(create1)).clear();
	}

}
