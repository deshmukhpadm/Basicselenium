package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Seleniumm {
public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Desktop\\selenium\\libs\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
driver.get("https://www.google.com/");
Actions act=new Actions(driver);
driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("selenium");
Thread.sleep(2000);

//act.doubleClick(driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"))).perform();
act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();


}
}