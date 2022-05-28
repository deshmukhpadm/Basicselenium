package basicspractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Desktop\\selenium\\libs\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/");
//	WebElement userName = driver.findElement(By.id("txtUsername"));
//	userName.sendKeys("Admin");
	WebElement userName = driver.findElement(By.name("txtUsername"));
	userName.sendKeys("Admin");
	userName.clear();
	
	
}
}