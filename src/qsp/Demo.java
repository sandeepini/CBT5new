package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
	@Test
	public void testA() throws Exception {
//		URL r=new URL("http://localhost:4444/wb/hub");
//		DesiredCapabilities d=new DesiredCapabilities();
//		d.setBrowserName("chrome");
//		WebDriver driver=new RemoteWebDriver(r,d);
	//driver.quit();
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		Reporter.log("open the browser",true);
		WebDriver driver=new ChromeDriver();
		Reporter.log("enter the url",true);
		
		driver.get("http://www.google.com");
		Reporter.log("closing",true);
		
			driver.quit();
		
	}
}
