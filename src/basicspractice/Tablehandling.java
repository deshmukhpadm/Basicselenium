package basicspractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tablehandling {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Desktop\\selenium\\libs\\chromedriver.exe" );
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.w3schools.com/html/html_tables.asp");
	String name = driver.findElement(By.xpath("//table[@id='customers']//tr[2]//td[1]")).getText();
	System.out.println(name);
	for(int i=2;i<=7;i++)
		
	{	
		for(int j=1;j<=3;j++)//column
		{
			
			String tableData = driver.findElement(By.xpath("//table[@id='customers']//tr["+i+"]//td["+j+"]")).getText();
			System.out.print(tableData+"    ");
			
		}
		System.out.println();
		
	}
	
}

}

