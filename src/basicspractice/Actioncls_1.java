package basicspractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actioncls_1 {
public static void main(String[] args) {
   
	
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Desktop\\selenium\\libs\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://jqueryui.com/draggable/");
	Actions act=new Actions(driver);
	WebElement resizable = driver.findElement(By.linkText("Resizable"));
	act.moveToElement(resizable).perform();


	
	
    driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
WebElement draggable1 = driver.findElement(By.xpath("//p[text()= 'Drag me around']"));
act.clickAndHold(draggable1).moveByOffset(400, 0).release().perform();
	
	
	
	
}
}
