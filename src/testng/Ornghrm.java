package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ornghrm {
	static WebDriver driver;
@Test(priority=1)
public void VerifyLoginFunctionality()
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Desktop\\selenium\\libs\\chromedriver.exe");
    driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("admin");
	driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
	driver.findElement(By.xpath("//input[@type='submit']")).click();

}
@Test(priority=2)
public void verifyAssignLeaveTab()
{
	driver.findElement(By.xpath("//span[text()='Assign Leave']")).click();
	
}
}

