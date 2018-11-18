package Zohodealsmodule1;


import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Browser {
	public WebDriver StartTesting() throws Exception {
		
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values.notifications", 2);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);
		System.setProperty("webdriver.chrome.driver", "C:\\Program\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://accounts.zoho.in/signin?servicename=ZohoCRM&signupurl=https://www.zoho.in/crm/signup.html?plan=enterprise");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		return driver;
}
}