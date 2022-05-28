package waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit {
	public static void main(String[] args) throws InterruptedException {
		
	
    System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Desktop\\selenium\\libs\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	//driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	driver .manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("selenium");
	//Thread.sleep(2000);
//	driver.findElement(By.xpath("//b[text()=' webdriver']")).click();
	
driver.findElement(By.xpath("//span[text()='pune']")).click();
	
}	

}
