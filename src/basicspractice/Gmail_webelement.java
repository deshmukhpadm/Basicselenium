package basicspractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail_webelement {


	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Desktop\\selenium\\libs\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.google.com/");
WebElement gmail = driver.findElement(By.xpath("(//a[@class='gb_d'])[1]"));
String gmailLink = gmail.getAttribute("href");
System.out.println(gmailLink);
WebElement firstElement= driver.findElement(By.xpath("//a[@href]"));
List<WebElement> Elements =driver.findElements(By.xpath("//a[@href]"));
for(WebElement a:Elements)
{
	String text =a.getText();
	if(text.contains("Gmail"))
	{
		System.out.println(a.getAttribute("href"));
		a.click();
	}
}
	}}
	
	
	
	

