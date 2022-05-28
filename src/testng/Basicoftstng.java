package testng;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Basicoftstng {
	@BeforeClass
	public void xyz()
	{
		Reporter.log("Before class : xyz",true);
	}
	@BeforeMethod
	public void abc()
	{
		Reporter.log("Before method : abc",true);
	}

	@Test
	public void m1()
	{
		Reporter.log("this is m1 method", true);
	}
	@Test
	public void m2()
	{
		Reporter.log("this is m2 method", true);
	}
	@AfterMethod
	public void abc1()
	{
		Reporter.log("after method : abc1",true);
	}
	@AfterClass
	public void xyz1()
	{
		Reporter.log("After class : xyz1",true);
	}
}


