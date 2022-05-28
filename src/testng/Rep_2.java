package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Rep_2 {
	@Test(priority=1)
	public void m1()
	{
		System.out.println("basic of tstng");
		Reporter.log("testng reporter", true);
	}
	@Test(priority=1)
	public void m2()
	{
		System.out.println("this is m2");
		Reporter.log("this is m2", true);
	}

	
}
