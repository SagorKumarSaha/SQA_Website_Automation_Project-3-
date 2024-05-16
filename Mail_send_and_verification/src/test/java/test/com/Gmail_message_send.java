package test.com;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;


public class Gmail_message_send extends DRIVER{
	
	@SuppressWarnings("deprecation")
	@Test(priority=1)
	public void gmail_signin() throws InterruptedException {
		
		driver.get("https://www.google.com/gmail/about/");
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//sign in button
		driver.findElement(By.linkText("Sign in")).click();
		Thread.sleep(2000);
		
		//email field
		driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys(".............");//enter your mail
		Thread.sleep(1000);
		
		//next button
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
		Thread.sleep(2000);
		
		//password field
		driver.findElement(By.name("Passwd")).click();
		Thread.sleep(500);
		driver.findElement(By.name("Passwd")).sendKeys("......."); //enter your email's password
		Thread.sleep(1000);
		
		//next button
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button/span")).click();
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		
		
	}
	
	@Test(priority=2)
	public void gmail_send_message() throws InterruptedException, FindFailed {
		Thread.sleep(1500);		
		
		//click the compose button
		driver.findElement(By.xpath("/html/body/div[8]/div[3]/div/div[2]/div[2]/div[1]/div[1]/div/div")).click();
		Thread.sleep(2000);
		
		//enter email
		driver.findElement(By.id(":sq")).click();
		Thread.sleep(500);
		driver.findElement(By.id(":sq")).sendKeys(".........",Keys.ENTER);//enter another email
		Thread.sleep(1000);
		
		//enter subject
		driver.findElement(By.name("subjectbox")).click();
		Thread.sleep(500);
		driver.findElement(By.name("subjectbox")).sendKeys("testing purpose");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("/html/body/div[20]/div[2]/div[3]/button[2]")).click();
		Thread.sleep(1000);
		
		//enter body
		driver.findElement(By.id(":qd")).click();
		Thread.sleep(500);
		driver.findElement(By.id(":qd")).sendKeys("Hi i am sending this mail for automation testing.");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\":b\"]/div/div/div[2]/div")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\":qr\"]/div")).click();
		Thread.sleep(1500);
		
		//upload file using sikuli
		String imagePath = "C:\\Users\\USER\\Desktop\\upload using sikuli automation\\";
		String inputFilePath = "C:\\Users\\USER\\Desktop\\upload using sikuli automation\\image\\";
		Screen s = new Screen();
		Pattern textbox = new Pattern(imagePath + "1.PNG");
		Pattern open = new Pattern(imagePath + "op.PNG");
		s.wait(textbox, 20);
		s.type(textbox, inputFilePath + "api.pdf");
		s.click(open);
		
		Thread.sleep(10000);
		
		driver.findElement(By.id(":ou")).click();
		Thread.sleep(2000);
	}
	
	

}
