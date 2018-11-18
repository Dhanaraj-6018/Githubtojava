package Zohodealsmodule1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class DealsExecution {
	WebDriver driver;
	@Test
	public void module() throws Exception
	{
	Browser bs=new Browser();
	driver = bs.StartTesting();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Dealcrm deals = new Dealcrm(driver);
	deals.signIn();
	deals.clickOnDealsButton();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@class='newwhitebtn customPlusBtn ']")).click();
	Thread.sleep(2000);
	((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
	deals.createScenorio();
	deals.clickClosingDate();
	deals.clickStage();
	deals.clickType();
	((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
	deals.enterDescription();
	deals.clickSaveButton();
	deals.clickOnEditButton();
	deals.createScenorio();
	//deals.clickTextField();
	deals.clickSaveButton();
	Thread.sleep(2000);
	//deals.clickOnEditButton();
	//Thread.sleep(2000);
	//deals.clickSaveButton();
	//Thread.sleep(3000);
	deals.clickOnDealsButton();
	Thread.sleep(2000);
	deals.clickCheckBox();
	deals.massUpdation();
	Thread.sleep(4000);
	deals.signoutUser();
	Thread.sleep(3000);

}
}



