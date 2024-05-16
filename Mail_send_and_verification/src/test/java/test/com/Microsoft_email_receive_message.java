package test.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class Microsoft_email_receive_message extends DRIVER{
	
	@SuppressWarnings("deprecation")
	@Test(priority=1)
	public void mail_signin() throws InterruptedException {
		
		driver.get("https://www.microsoft.com/en-us/microsoft-365/outlook/email-and-calendar-software-microsoft-outlook?deeplink=%2fowa%2f&sdf=0");
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//signin button
		driver.findElement(By.xpath("//*[@id=\"mectrl_main_trigger\"]/div")).click();
		Thread.sleep(2000);
		
		//email field
		driver.findElement(By.name("loginfmt")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("loginfmt")).sendKeys("........",Keys.ENTER);//enter email
		Thread.sleep(1000);
		
		//password field
		driver.findElement(By.id("i0118")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("i0118")).sendKeys("......",Keys.ENTER);//enter password
		Thread.sleep(2000);
		
		driver.findElement(By.id("declineButton")).click();
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"AQAABjrEOcEBAAAGtm2uoQAAAAA=\"]/div/div/div[2]/div[2]/div[1]/div[1]/span")).click();
		Thread.sleep(2000);
		
		String s = driver.findElement(By.xpath("//*[@id=\"UniqueMessageBody\"]")).getText();
		
		//String s1 = driver.findElement(By.xpath("//*[@id=\"ConversationReadingPaneContainer\"]/div/div/div[1]/div/div/div/div/div/div/div")).getText();
		
		if(s.equalsIgnoreCase("testing purpose") == true) {
			System.out.println("Test passed...");
		}else {
			System.out.println("Test failed...");
		}
	}

}
