package basicspractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerthandling {
public static void main(String[] args) throws InterruptedException {
	



	System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Desktop\\selenium\\libs\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
    driver.get("https://selenium08.blogspot.com/2019/07/alert-test.html");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//input[@id='simple']")).click();
   Thread.sleep(2000);
   driver.switchTo().alert().accept();
   driver.findElement(By.xpath("//button[@id='confirm']")).click();
   Thread.sleep(2000);
   String textOnAlert = driver.switchTo().alert().getText();
   System.out.println(textOnAlert);
   driver.switchTo().alert().dismiss();
   driver.findElement(By.xpath("//button[@id='prompt']")).click();
   Thread.sleep(2000);
   driver.switchTo().alert().dismiss();
   
   
   
		
	
}
}
