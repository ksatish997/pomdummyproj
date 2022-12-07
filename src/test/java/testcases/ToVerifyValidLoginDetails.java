package testcases;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.BasePage;
import pages.LaunchPage;
import pages.LoginPage;

public class ToVerifyValidLoginDetails {
	
	@Test
	public void toVerifyValidLoginDetailsTest()
	{
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		
		LaunchPage launchPage=new LaunchPage(driver);
		
		//LaunchPage launchPage=PageFactory.initElements(driver, LaunchPage.class);
		
		
		launchPage.gotoLaunchPage();
		
		LoginPage loginPage=new LoginPage(driver);
		
		//LoginPage loginPage=PageFactory.initElements(driver, LoginPage.class);
		
		
		loginPage.enterUserName();
		
		loginPage.enterPassword();
		
		loginPage.clickLogin();
		
		
	}

}
