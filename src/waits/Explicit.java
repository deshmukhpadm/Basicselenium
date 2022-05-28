package waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit {
public static void main(String[] args) {

	 System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Desktop\\selenium\\libs\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();

	driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
	driver.findElement(By.xpath("//button[@id=\'alert']")).click();
	WebDriverWait wait=new WebDriverWait(driver, 10);

	wait.until(ExpectedConditions.alertIsPresent());
	driver.switchTo().alert().accept();
}

}

