package basicspractice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getwindowhandle {



	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Desktop\\selenium\\libs\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		String parentID = driver.getWindowHandle();
		System.out.println(parentID);
	driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']")).click();
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on Facebook']")).click();
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on twitter']")).click();

		 Set<String> windowIDs = driver.getWindowHandles();
		System.out.println(windowIDs);
		Object[] windowIdArray = windowIDs.toArray();
		String[] str=new String[windowIDs.size()];
		for(int i=0;i<str.length;i++)
		{	

		
			str[i]=windowIdArray[i].toString();
			System.out.println(str);
		}
		driver.switchTo().window(str[2]);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("xyz");
		driver.switchTo().window(parentID);
		driver.findElement(By.linkText("Forgot your password?")).click();
//		int[] arr=new int[5];
//		int j=10;
//		for(int i=0;i<arr.length;i++)
//		{
//			arr[i]=j++;//loop1 : i=0: arr[0]=j=10
			//loop2 : i=1: arr[1]=j=11
//			System.out.println(arr[i]);
//		}
		
		
		//driver.switchTo().wi


	}}