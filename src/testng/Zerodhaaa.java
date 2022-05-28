package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Zerodhaaa {
	static WebDriver driver;
	@BeforeMethod
	public void launchURL()
	{
		System.setProperty("webdriver.chrome.driver", "F:\\\\ClassNotes\\\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
	}
	@Test
	public void verifyLogInWithValidCredential() throws InterruptedException
	{	
		
		//d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("LGD943");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("shree@1234");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}
	@Test
	public void verifyLogInWithInValidCredential() throws InterruptedException
	{
		
		//d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("LGD9423");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("shree@1234");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}

}


