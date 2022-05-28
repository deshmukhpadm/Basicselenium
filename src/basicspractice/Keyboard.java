package basicspractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard {
public static void main(String[] args) throws InterruptedException {
	

	//act.click(driver.findElement(By.xpath("//span[text()='Female']"))).perform();
	//act.sendKeys(Keys.TAB).sendKeys("7").sendKeys(Keys.TAB).sendKeys("Feb").sendKeys(Keys.TAB).sendKeys("2014").perform();*/
		
	
    System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Desktop\\selenium\\libs\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://mbasic.facebook.com/reg/?cid=103&refsrc=deprecated&_rdr");
	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("abc");
	Actions act=new Actions(driver);
	act.keyDown(Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL).perform();
	Thread.sleep(2000);
	act.sendKeys(Keys.TAB).keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
	Thread.sleep(2000);
	act.sendKeys(Keys.TAB).keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
	act.sendKeys(Keys.TAB).perform();
	
	



}}
	
	
	
	
	
