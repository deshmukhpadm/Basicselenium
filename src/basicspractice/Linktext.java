package basicspractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linktext {
	
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Desktop\\selenium\\libs\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	WebElement label =driver.findElement(By.xpath(""));
	String labelText =label.getText();
	System.out.println(labelText);
	driver.findElement(By.xpath("")).sendKeys("Admin");
	driver.findElement(By.xpath("")).sendKeys("admin123");
	driver.findElement(By.linkText("")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("")).click();
	Thread.sleep(2000);
	driver.findElement(By.partialLinkText("")).click();
	
	
}
	
}






	
	
