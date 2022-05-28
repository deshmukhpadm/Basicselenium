package basicspractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Selectcls_2 {
public static void main(String[] args) throws InterruptedException {
	
System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Desktop\\selenium\\libs\\chromedriver.exe");
ChromeOptions options=new ChromeOptions();
options.addArguments("--start-maximize");
options.addArguments("--incognito");
options.addArguments("disable-notifications");
options.addArguments("--headless");
WebDriver driver =new ChromeDriver(options);;
driver.get("https://opensource-demo.orangehrmlive.com/");
driver.manage().window().maximize();
WebElement userName = driver .findElement(By.id(""));
userName.sendKeys("Admin");
driver.findElement(By.id("")).sendKeys("");
driver.findElement(By.name("")).click();
driver.findElement(By.xpath("")).click();
WebElement assignLeave = driver.findElement(By.id(""));
Select sc=new Select(assignLeave);
sc.selectByVisibleText("US - Personal");
Thread.sleep(2000);
sc.selectByValue("6");
Thread.sleep(2000);
sc.deselectByIndex(0);
List<WebElement> leaveOption = sc.getOptions();
for(WebElement a:leaveOption)
{
	System.out.println(a.getText());
}
System.out.println(sc.isMultiple());
	
}












	
	
	
}
