package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LaunchPage extends BasePage{
	
	//WebDriver driver;
	
	public LaunchPage(WebDriver driver)
	{
		super(driver);
		//this.driver=driver;
		//PageFactory.initElements(driver, LaunchPage.class);
		PageFactory.initElements(driver, this);
	}
	
	public void gotoLaunchPage()
	{
		driver.get("https://adactinhotelapp.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	

}
