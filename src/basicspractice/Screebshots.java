package basicspractice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screebshots {
	public static void main(String[] args) throws IOException {
		
	
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Desktop\\selenium\\libs\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		String expectedMessage ="Username And PAssword doesn't match";
		String actualMessage = driver.findElement(By.xpath("//span[@id='spanMessage']")).getText();
		if (expectedMessage.equalsIgnoreCase(actualMessage))
		{
			System.out.println("Test cased passed");
		}
		else
		{
			TakesScreenshot tksr = (TakesScreenshot)driver;
			File source = tksr.getScreenshotAs(OutputType.FILE);
			File target =new File("C:\\Users\\DELL\\Documents\\Screenshot\\failedMessage.png");
			FileHandler.copy(source, target);
		
		}}}
	
		
		
		
		
		
		
		
		
		


	
	
	
	
	
	
	
	