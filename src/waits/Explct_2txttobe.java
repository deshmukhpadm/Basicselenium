package waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explct_2txttobe {
public static void main(String[] args) {
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Desktop\\selenium\\libs\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
    driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
	driver.findElement(By.xpath("////button[@id='populate-text']")).click();
	WebElement textWebElement = driver.findElement(By.xpath("//h2[@id='h2']"));
	WebDriverWait wait=new WebDriverWait(driver, 20);
	wait.until(ExpectedConditions.textToBePresentInElement(textWebElement, "Selenium Webdriver"));
	String text = driver.findElement(By.xpath("//h2[@id='h2']")).getText();
	System.out.println(text);
	
} 

}

