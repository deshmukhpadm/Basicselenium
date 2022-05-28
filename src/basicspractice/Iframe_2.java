package basicspractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe_2 {
public static void main(String[] args) {
	

	
    System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Desktop\\selenium\\libs\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com");
    WebElement frame = driver.findElement(By.xpath());
	driver.switchTo().frame(frame);
	WebElement draggable = driver.findElement(By.xpath(null));
	String text = draggable.getText();
	System.out.println();

    }}
	

	
	
	

