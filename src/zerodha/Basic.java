package zerodha;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Basic {
	
static WebDriver driver;
@Test
public void LoginFunctionalityZerodha()

	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Desktop\\selenium\\libs\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");

}
@AfterMethod
public void closeBrowser()
{
	//Reporter.log("Step3: closing our browser",true);
	driver.close();
}

}