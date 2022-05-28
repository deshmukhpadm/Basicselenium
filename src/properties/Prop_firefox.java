package properties;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Prop_firefox {
	
static WebDriver driver;
public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Desktop\\selenium\\libs\\chromedriver.exe" );
	  System.setProperty("webdriver.gecko.driver","C:\\Users\\DELL\\Desktop\\API\\geckodriver.exe");
		String Browser="firefox";
		if(Browser.equalsIgnoreCase("chrome"))
		{
		//driver=new ChromeDriver();
	
		}
		else
		{
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
	 driver.get("https://www.google.com/");
	driver.get("https://opensource-demo.orangehrmlive.com");
	driver.findElement(By.xpath("//input[@name='txtUsername' and  @type='text']")).sendKeys(XLSXHandling.xlsxRead("TestData", 0, 0, 0).toString());
	driver.findElement(By.xpath("//*[@name='txtPassword']")).sendKeys("admin123");
	WebElement loginBtn = driver.findElement(By.xpath("//*[contains(@id,'btn')]"));
	loginBtn.click();
	driver.findElement(By.xpath("//a[@href=\"/index.php/leave/assignLeave\"]//img")).click();
	List<WebElement> options = driver.findElements(By.xpath("//select[@name='assignleave[txtLeaveType]']//option"));
	for(WebElement option:options)
	{
		String text = option.getText();
		System.out.println(text);
		if(text.equalsIgnoreCase("CAN - Personal"))
		{
			option.click();
		}}}}
