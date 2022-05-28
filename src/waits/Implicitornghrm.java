package waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicitornghrm {

		
public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Desktop\\selenium\\libs\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/");

	driver .manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
WebElement userName = driver.findElement(By.id("txtUsername"));
userName.sendKeys("Admin");
driver.findElement(By.id("txtPassword")).sendKeys("admin123");
driver.findElement(By.name("Submit")).click();
driver.findElement(By.xpath("//a[@id='welcome']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//a[@href='/index.php/auth/logout']")).click();
}
}
