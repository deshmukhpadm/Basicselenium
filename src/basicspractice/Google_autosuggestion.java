package basicspractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_autosuggestion {
	public static void main(String[] args) throws InterruptedException  {
		
	
	{
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\DELL\\\\Desktop\\\\selenium\\\\libs\\\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("pune");
			Thread.sleep(2000);
		 List<WebElement> autoSuggestions = driver.findElements(By.xpath("(//ul[@jsname='bw4e9b' ])[1]//li"));
		 int numberOfAutoSuggestions = autoSuggestions.size();
		 System.out.println(numberOfAutoSuggestions);
		 for(WebElement a:autoSuggestions)
		 {
			 System.out.println(a.getText());
			String text = a.getText();
			if(text.contains("news"))
			{
				a.click();
			}
		 }
	}}}
		

	
