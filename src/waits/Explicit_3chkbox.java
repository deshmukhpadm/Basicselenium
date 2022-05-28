package waits;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_3chkbox {
public static void main(String[] args) {
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Desktop\\selenium\\libs\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
   driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
	driver.findElement(By.id("checkbox")).click();
	WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
	WebDriverWait wait=new WebDriverWait(driver, 20);
	wait.until(ExpectedConditions.elementToBeSelected(By.xpath("//input[@type='checkbox']")));
	System.out.println(checkbox.isSelected());
	
	
	
	FluentWait<WebDriver> wait1=new FluentWait<WebDriver>(driver)
			.withTimeout(20, TimeUnit.SECONDS)
			.pollingEvery(250, TimeUnit.MICROSECONDS)
			.ignoring(NoSuchElementException.class);
	wait1.until(ExpectedConditions.elementToBeSelected(checkbox));
	//System.out.println(checkbox.isSelected());

	

	
}

		
}



