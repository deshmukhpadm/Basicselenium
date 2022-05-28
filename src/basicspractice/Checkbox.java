package basicspractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {
public static void main(String[] args)
    {

	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Desktop\\selenium\\libs\\chromedriver.exe");
	ChromeDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
	driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
	driver.findElement(By.xpath("//input[@name='Submit']")).click();
	driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']")).click();
	List<WebElement> CheckBoxes = driver.findElements(By.xpath("//table[@class='table hover']//td//input"));
	for(WebElement a:CheckBoxes)
	{	
		a.click();
	}
    }
    }
		
