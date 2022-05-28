package properties;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prpperty_1 {
public static void main(String[] args) throws IOException {
/*	System.setProperty("webdriver.chrome.driver","C:\\Users\\shahaji\\Desktop\\chromedriver.exe" );
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	Properties prop=new Properties();
	//FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"//TestData//config.properties");
	prop.load(fis);
	String urlValue = prop.getProperty("url");
	System.out.println(urlValue);
	driver.get(prop.getProperty("url"));
	driver.findElement(By.id("txtUsername")).sendKeys(prop.getProperty("userName"));
	driver.findElement(By.id("txtPassword")).sendKeys(prop.getProperty("passWord"));*/
	

	System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Desktop\\selenium\\libs\\chromedriver.exe");
	ChromeDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	Properties prop=new Properties();
	FileInputStream fis =new FileInputStream(System.getProperty("user.dir")+"//TestData//config.properties");
	prop.load(fis);
	String urlValue = prop.getProperty("url");
	System.out.println(urlValue);
	driver.get(prop.getProperty("url"));
	driver.findElement(By.id("txtUsername")).sendKeys(prop.getProperty("userName"));
	driver.findElement(By.id("txtPassword")).sendKeys(prop.getProperty("passWord"));
	}
}
