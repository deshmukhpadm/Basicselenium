package basicspractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectcls_1 {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Desktop\\selenium\\libs\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://selenium08.blogspot.com/2019/11/dropdown.html");
	WebElement countryDropDown = driver.findElement(By.xpath("//select[@name='country']"));
	Select sc=new Select(countryDropDown);
	sc.selectByVisibleText("India");
	sc.selectByVisibleText("Hong Kong");
sc.selectByValue("IN");
	sc.deselectByIndex(6);
/*	WebElement dropdownMonth = driver.findElement(By.xpath("//select [@multiple name='Month']"));
	Select sc1=new Select (dropdownMonth);
	sc1.selectByVisibleText("January");
	sc1.selectByVisibleText("April");
	sc1.selectByVisibleText("May");
//	sc1.deselectAll();
	//System.out.println(sc.isMultiple());
//	System.out.println(sc1.isMultiple());*/
	
	
	
	
}

	
	
}

