package basicspractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Contains {
	public static void main(String[] args) {
		
        System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Desktop\\selenium\\libs\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement googlepage = driver.findElement(By.tagName("body"));
		String googlePagetext = googlepage.getText();
		System.out.println(googlePagetext);
		WebElement searchField =driver.findElement(By.xpath(""));
		searchField.sendKeys("pune");
		
		
	}

}
