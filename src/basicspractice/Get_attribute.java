package basicspractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_attribute {
      	public static void main(String[] args) 
			
	 {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Desktop\\selenium\\libs\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		WebElement label=driver.findElement(By.xpath("//span[contains(text(),'( Username :')]"));
		String attributeValue =label.getAttribute("style");
		System.out.println(attributeValue);
		if(attributeValue.contains("red"))
		{
			System.out.println("test case passed");
	}
		else
		{
			System.out.println("failed");
		}
		WebElement userName = driver.findElement(By.xpath("//input[@name='txtUsername']"));
		String idAttributeValue = userName.getAttribute("type");
		System.out.println(idAttributeValue);
	
	
	
	
}
	
	
	
	
	
	
	
	
}
