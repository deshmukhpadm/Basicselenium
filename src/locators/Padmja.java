package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class Padmja {
	public static void main(String[] args)  {
		
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Desktop\\selenium\\libs\\chromedriver.exe" );
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	
	//WebElement searchField=driver.findElement(By.xpath("//*[@class='gLFyf gsfi']"));
	WebElement searchField=driver.findElement(By.xpath("//*[contains(@class,'gLFyf gs')]"));

	searchField.sendKeys("pune");
	}
	}










