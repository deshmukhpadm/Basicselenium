package basics;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.SearchContext;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Launch {
	static WebDriver driver;
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Desktop\\selenium\\libs\\chromedriver.exe" );
  System.setProperty("webdriver.gecko.driver","C:\\Users\\DELL\\Desktop\\API\\geckodriver.exe");

	
	//driver.get("https://www.google.com/search?channel=trow5&client=firefox-b-d&q=google");
	String Browser="firefox";
	//RemoteWebDriver driver;
	if(Browser.equalsIgnoreCase("chrome"))
	{
	driver =new ChromeDriver ();//
	}
	else
	{
		driver=new FirefoxDriver();
	}
	
	//RemoteWebDriver driver1 = null;
	driver.get("https://www.google.com/");
	
}}





  


