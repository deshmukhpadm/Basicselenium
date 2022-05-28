package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Enablpgm {
	@Test(priority=-1)
	public void xyz()
	{
		Reporter.log("This is xyz method", true);
	}
	@Test(priority=-1)
	public void m1()
	{
		Reporter.log("This is m1 method", true);
	}	
	@Test	(priority=-2,enabled=true)	
	public void m2()
	{
		Reporter.log("This is m2 method", true);
	}
	@Test(priority=-6,enabled=false)
	public void abc()
	{
		Reporter.log("This is abc method", true);
	}
	
}

