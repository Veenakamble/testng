package config;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login {
	WebDriver driver;
	@Test(invocationCount = 3)
	public void validationlogin()
	{
		driver=new ChromeDriver();
		driver.get("http://primusbank.qedgetech.com/");
		driver.findElement(By.name("txtuId")).sendKeys("Admin");
		driver.findElement(By.name("txtPword")).sendKeys("Admin");
		driver.findElement(By.name("login")).click();
		driver.close();
	}

}
