package crossbrowsertest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class VerifyTitle {

	WebDriver driver;
	
	@Test
	@Parameters("browser")
	public void verifyTitle(String browserName)
	{
		if(browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("WebDriver.chrome.driver", "./drivers/chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();



		}
		/*else if(browserName.equalsIgnoreCase("ie"))
		{
			System.setProperty("WebDriver.ie.driver", "./drivers/chromedriver.exe");
			driver=new ChromeDriver();

		}*/
		
		driver.manage().window().maximize();	
		driver.get("http://www.learn-automation.com");
		System.out.println(driver.getTitle());
		driver.quit();

	}
	
}
