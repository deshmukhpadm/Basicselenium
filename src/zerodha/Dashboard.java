package zerodha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Dashboard {
static WebDriver driver;
@Test
public void Dashboardfunctionality()
{
	driver.findElement(By.xpath("//span[text()='Dashboard']")).click();
}

}
