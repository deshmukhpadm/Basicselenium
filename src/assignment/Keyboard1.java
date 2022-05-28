package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard1 {
public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Desktop\\selenium\\libs\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
driver.get("https://www.google.com/");
Actions act=new Actions(driver);
driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("pune");

act.doubleClick(driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"))).perform();
//act.keyDown(Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL).perform();
Thread.sleep(2000);
driver.findElement(By.xpath("//a[@class='gb_A']")).click();
WebElement frame = driver.findElement(By.xpath("//iframe[@role='presentation']"));
driver.switchTo().frame(1);
driver.findElement(By.xpath("//*[text()='Maps']")).click();
Thread.sleep(2000);

driver.navigate().back();
Thread.sleep(2000);
driver.findElement(By.xpath("//a[@class='gb_A']")).click();

driver.switchTo().frame(1);
driver.findElement(By.xpath("//*[text()='YouTube']")).click();

//driver.findElement(By.xpath("//input[@autofocus='autofocus']"));
//act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();






}
}
