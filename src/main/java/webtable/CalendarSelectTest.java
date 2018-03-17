package webtable;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CalendarSelectTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.freecrm.com");

		driver.findElementByName("username").sendKeys("naveenk");
		driver.findElementByName("password").sendKeys("test@123");
		driver.findElementByXPath("//input[@type='submit']").click();

		driver.findElementsByLinkText("Calendar")

		driver.switchTo().frame("mainpanel");

		String date="18-September-2017";
		String dateArr[]=date.split("-");
		String day=dateArr[0];
		String month=dateArr[1];
		String year=dateArr[2];

		Select select=new Select(driver.findElementByName("slctMonth"));
		select.selectByVisibleText(month);

		Select select1=new Select(driver.findElementByName("slctYear"));
		select.selectByVisibleText(year);

		//*[@id='crmcalendar']/table/tbody/tr[2]/td/table/tbody/tr[2]/td[1]
		//*[@id='crmcalendar']/table/tbody/tr[2]/td/table/tbody/tr[2]/td[2]	
		//*[@id='crmcalendar']/table/tbody/tr[2]/td/table/tbody/tr[2]/td[6]

		String beforeXpath="//*[@id='crmcalendar']/table/tbody/tr[2]/td/table/tbody/tr[";
		String afterXpath="]/td[";

		final int totaldays=7;

		//(Row-column)2-1 2-2 2-3 2-4 2-5 2-6 2-7
		//3-2 3-2 3-3 3-4 3-5 3-6 3-7
		boolean flag=false;
		String dayVal="null";
		for (int rowNum=2; rowNum<=7; rowNum++)
		{
			for(int colNum=1;colNum<=totaldays; colNum++)
			{
				try {
					dayVal=driver.findElementByXPath(beforeXpath+rowNum+afterXpath+colNum+"]").getText();
				} catch (NoSuchElementException  e) {
					System.out.println("Please enter a correct date value");
					flag = false;
					break;

				}
				System.out.println(dayVal);

				if(dayVal.equals(day))
				{
					driver.findElementByXPath(beforeXpath+rowNum+afterXpath+colNum+"]").click();
					flag=true;
					break;
				}
			}
			if(flag){
				break;

			}
		}
	}


}


