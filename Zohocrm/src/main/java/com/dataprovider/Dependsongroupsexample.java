package com.dataprovider;

import org.testng.annotations.*;

public class Dependsongroupsexample {

	@BeforeGroups("security")
	public void setUpSecurity() {
		System.out.println("setUpSecurity(1)");
	}

	@AfterGroups("security")
	public void tearDownSecurity() {
		System.out.println("tearDownSecurity(2)\n");
	}

	@BeforeGroups("database")
	public void setUpDatabase() {
		System.out.println("setUpDatabase(3)");
	}

	@AfterGroups("database")
	public void tearDownDatabase() {
		System.out.println("tearDownDatabase(4)\n");
	}

	@BeforeGroups(value = "ui")
	public void setUpUI() {
		System.out.println("setUpUI(5)");
	}

	@AfterGroups(value = "ui")
	public void tearDownUI() {
		System.out.println("tearDownUI(6)\n");
	}

	@Test(groups = "database")
	public void testInsert() {
		System.out.println("testInsert(7)");
	}

	@Test(groups = "database")
	public void testUpdate() {
		System.out.println("testUpdate(8)");
	}

	@Test(groups = "database")
	public void testDelete() {
		System.out.println("testDelete(9)");
	}

	@Test(groups = "security")
	public void accessHomePage() {
		System.out.println("accessHomePage(10)");
	}

	@Test(groups = "security")
	public void accessAdminPage() {
		System.out.println("accessAdminPage(11)");
		throw new RuntimeException();
	}

	@Test(groups = "ui")
	public void openConfirmationDialog() {
		System.out.println("openConfirmationDialog(12)");
	}

	@Test(groups = "ui")
	public void openFileDialog() {
		System.out.println("openFileDialog(13)");
	}

	@Test(dependsOnGroups = { "ui" })
	public void uiGroupDependentTest() {
		System.out.println("uiGroupDependentTest(14)");
	}

	@Test(dependsOnGroups = { "security", "database" })
	public void backendGroupDependentTest1() {
		System.out.println("backendGroupDependentTest1(15)");
	}

	@Test(dependsOnGroups = { "security", "database" }, alwaysRun = true)
	public void backendGroupDependentTest2() {
		System.out.println("backendGroupDependentTest2(16)");
	}

}
