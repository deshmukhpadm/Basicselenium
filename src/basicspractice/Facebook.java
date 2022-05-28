package basicspractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook {
static WebDriver driver;
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Desktop\\selenium\\libs\\chromedriver.exe");
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\DELL\\Desktop\\API\\geckodriver.exe");
	String Browser = "Chrome";
	if(Browser.equalsIgnoreCase("Chrome"))
	{
		driver =new ChromeDriver();
		
	}
	else
	{
		driver = new FirefoxDriver();
		
	}
	driver.manage().window();
	driver.get("https://www.google.com/");
	String title = driver.getTitle();
	System.out.println(title);
	if(title.contains("Google"))
	{
		System.out.println("test case passed");
	}
	else
	{
		System.out.println("fail");
	}
	String url = driver.getCurrentUrl();
	System.out.println(url);
	Thread.sleep(2000);
    driver.get("https://opensource-demo.orangehrmlive.com/")	;
    Thread.sleep(2000);
    driver.navigate().back();
    Thread.sleep(2000);
    driver.navigate().refresh();
    Thread.sleep(2000);
    driver.navigate().forward();
    Thread.sleep(2000);
    driver.navigate().to("https://www.facebook.com/");
    
    
	
	
}
}
