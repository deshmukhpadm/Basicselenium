package zerodha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Login {
	static WebDriver driver;
	@Test
	public void LoginFunctionalityZerodha()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Desktop\\selenium\\libs\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("LGD943");
	    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("shree@1234");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		WebDriverWait wait=new WebDriverWait(driver, 10);
	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='PIN']")));
	    
	}
	@Test
	public void verifyPinFunctinality()
	{

		    driver.findElement(By.xpath("//input[@id='pin']")).sendKeys("123456");
			driver.findElement(By.xpath("//button[@class='button-orange wide']")).click();

	}
	}


