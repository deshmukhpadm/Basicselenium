package basicspractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript_1 {
public static void main(String[] args) throws InterruptedException {
	
	
	
	
	
	

System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Desktop\\selenium\\libs\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://opensource-demo.orangehrmlive.com/");
Thread.sleep(2000);
JavascriptExecutor js = (JavascriptExecutor)driver;
js.executeScript("window.scrollBy(0,600)");
Thread.sleep(2000);
js.executeScript("window.scrollBy(0,-600)");
WebElement forgotPasswordLink = driver.findElement(By.linkText("Forgot your password?"));
js.executeScript("arguments[0].click();", forgotPasswordLink);
js.executeScript("alert('welcome');");
	
}}