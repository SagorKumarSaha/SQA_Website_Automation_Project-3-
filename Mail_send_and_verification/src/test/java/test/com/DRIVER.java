
package test.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;


public class DRIVER {

	public  WebDriver driver;
	public static WebElement element;
		
	@BeforeSuite
	public void setDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\USER\\\\Desktop\\\\All drivers for selenium\\\\chromedriver-win64\\\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	//@AfterSuite
	/*public void close() {
		driver.close();
	}*/
		
}

