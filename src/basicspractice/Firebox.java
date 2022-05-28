package basicspractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firebox {
	static WebDriver driver;
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Desktop\\selenium\\libs\\chromedriver.exe");
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\DELL\\Desktop\\API\\geckodriver.exe");
	String Browser="firefox";
	if(Browser.equalsIgnoreCase("Chrome"))
	{
	   driver = new ChromeDriver();
		
	}
	else
	{
		driver =new FirefoxDriver();
		
	}
	driver.get("https://www.google.com/");
}
}
