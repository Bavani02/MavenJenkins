package abs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Note {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		RemoteWebDriver driver1 = new ChromeDriver();
		ChromeDriver driver2 = new ChromeDriver();
		//driver2.launchApp(id);
		driver.switchTo().alert();
		
		
	}

}
