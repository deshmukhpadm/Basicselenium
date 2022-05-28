package basicspractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class X_pathlogical {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Desktop\\selenium\\libs\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.findElement(By.xpath("//input[@type='text' and @name='txtUsername']")).sendKeys("Admin");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
	driver.findElement(By.xpath("//a[text()='Forgot your password']")).click();
	driver.findElement(By.xpath("//input[@class='cancel']")).click();
	//driver.findElement(By.xpath("")).click();
	
}
}
