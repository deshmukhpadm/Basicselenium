package excell;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.io.FileHandler;

 public class Excellornghrmm {
 public static void main(String[] args) throws IOException {
	
	

	System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Desktop\\selenium\\libs\\chromedriver.exe");
	ChromeDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/");

	/*TakesScreenshot tksr = (TakesScreenshot)driver;
	File source = tksr.getScreenshotAs(OutputType.FILE);
	File target =new File("C:\\Users\\DELL\\Documents\\Screenshot\\failedMessage.png");
	FileHandler.copy(source, target);*/

   File src =new File("C:\\Users\\DELL\\Desktop\\Book1.xlsx");
    FileInputStream fis=new FileInputStream(src);
    XSSFWorkbook wb=new XSSFWorkbook(fis);
     XSSFSheet sh = wb.getSheetAt(0);
    XSSFCell testDataUserName = sh.getRow(0).getCell(0);
    XSSFCell testDataPAssword = sh.getRow(0).getCell(1);
    driver.findElement(By.id("txtUsername")).sendKeys(testDataUserName.toString());
    driver.findElement(By.id("txtPassword")).sendKeys(testDataPAssword.toString());

	
}
}
