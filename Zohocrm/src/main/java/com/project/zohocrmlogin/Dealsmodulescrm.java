package com.project.zohocrmlogin;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.proj.library.Library;
import com.project.Pagefac.Pagefactory;
import com.project.browserdriver.Baseclass2;
import com.project.pagewebelements.Pageele;

public class Dealsmodulescrm {
	WebDriver driver;
	Pagefactory pf;
	Pageele page;
	Library li;

	@BeforeMethod
	public void launch() throws Exception {

		Baseclass2.StartTest();
	}

	@Test
	public void pagefactory() throws Exception {
		pf = new Pagefactory(driver);
		pf.user("sivapzugal@gmail.com", "sivaSN*90");
		page = new Pageele();
		page.deals();

	}

	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}

}
