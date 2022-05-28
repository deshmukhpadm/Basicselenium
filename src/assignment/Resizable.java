package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resizable {
	public static void main(String[] args) throws InterruptedException {
		

	
    System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Desktop\\selenium\\libs\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://jqueryui.com/resizable/");
	 driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
	WebElement draggable = driver.findElement(By.xpath("//div[@style='z-index: 90;' and contains(@class,'ui-resizable-handle ui-resizable-se')]"));
    Actions act=new Actions(driver);
    act.dragAndDropBy(draggable, 100, 10).perform();

// WebElement resizable =driver.findElement(By.linkText("Resizable"));
// act.click(resizable).perform();
// driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
// driver.findElement(By.xpath("//div[@style='z-index: 90;' and contains(@class,'ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se')]"));
//act.clickAndHold().release().perform();
 //Thread.sleep(2000);
// act.dragAndDropBy(resizable, 100, 10)
 
 
	

	

}
}