package basics;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Firefox {
public static void main(String[] args) throws InterruptedException {
	  System.setProperty("webdriver.gecko.driver","C:\\Users\\DELL\\Desktop\\API\\geckodriver.exe");	
		String Browser="firefox";
		RemoteWebDriver driver;
		if(Browser.equalsIgnoreCase("chrome"))
		{
		driver =new ChromeDriver ();
		}
		else
		{
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		String title =driver.getTitle();
		System.out.println(title);
		if(title.contains("google"))
		{
			System.out.println("test case passed");
		}
		else
		{
			System.out.println("fail");
		}
		String url=driver.getCurrentUrl();
		System.out.println(url);
		driver.navigate().to("https://www.facebook.com/");

		Thread.sleep(2000);
		//driver.get()
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		//driver.navigate().to("https://www.facebook.com/");
		
		
	
		
		
		
		
		
		
		
	}

}
