package basicspractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathusingtextvalue {
public static void main(String[] args) {
	
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Desktop\\selenium\\libs\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com");
	driver.findElement(By.xpath("")).sendKeys("Admin");
	driver.findElement(By.xpath("")).sendKeys("admin123");
	driver.findElement(By.xpath("")).click();
	driver.findElement(By.xpath("")).click();
	
	
		

}

}




