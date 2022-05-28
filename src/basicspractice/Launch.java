package basicspractice;

import org.openqa.selenium.chrome.ChromeDriver;

  public class Launch 
  {
  public static void main(String[] args) 
  {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Desktop\\selenium\\libs\\chromedriver.exe");
	ChromeDriver driver =new ChromeDriver();
	driver.get("https://www.google.com/");
		
  }	


  }

