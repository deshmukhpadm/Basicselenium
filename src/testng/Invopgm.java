package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Invopgm {
	/*@Test(priority=-1)
	public void xyz()
	{
		Reporter.log("This is xyz method", true);
	}
	@Test(priority=-1,invocationCount=3)
	public void m1()
	{
		Reporter.log("This is m1 method", true);
	}	
	@Test	(priority=-2,enabled=false)	//default priority is 0
	public void m2()
	{
		Reporter.log("This is m2 method", true);
	}	
	@Test(priority=-6,enabled=false)
	public void abc()
	{
		Reporter.log("This is abc method", true);
	}*/

@Test(priority=-1)
public void xyz()
{
	Reporter.log("this is xyz method", true);
}
@Test(priority=-1,invocationCount=3)
public void m1()
{
	Reporter.log("this m1 method", true);
}
@Test(priority=-2,enabled=false)
public void m2()
{
	Reporter.log("this is m2 method", true);
}
@Test(priority=-6,enabled=false)
public void abc()
{
	Reporter.log("this is abc method", true);
}
}
