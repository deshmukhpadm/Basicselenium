package basicspractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe_1 {
public static void main(String[] args) throws InterruptedException {
	
	

    System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Desktop\\selenium\\libs\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
    String parentID =driver.getWindowHandle();
    driver.findElement(By.xpath("//a[@class='gb_A']")).click();
    WebElement frame =driver.findElement(By.xpath(parentID));
    driver.switchTo().frame("//iframe[@role='presentation']");
    driver.findElement(By.xpath("//span[@class='MrEfLc']")).click();
    Thread.sleep(2000);
    driver.navigate().back();
    driver.findElement(By.xpath("//input[@class='gLFy fgsfi']")).sendKeys("pune");

	
	
	
}
}
