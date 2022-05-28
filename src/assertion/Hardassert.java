package assertion;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Hardassert {
	@BeforeMethod
	public void pqr()
	{
		Reporter.log("Before method basic 1 class: pqr method", true);
	}
	@Test
	public void m1()
	{
		Reporter.log("m1 method from basic 1 class",true);
		Reporter.log("step 1", true);
		Reporter.log("step 2", true);
		Reporter.log("step 3", true);
	//	Assert.assertEquals("abc", "ab");
	//Assert.assertEquals("abc", "ab");
		Assert.assertEquals(0, 0);
		Reporter.log("step 4", true);
		Reporter.log("step 5", true);
		Reporter.log("step 6", true);
			
		
	}
	@Test
	public void m2()
	{
		Reporter.log("m2 method from basic 1 class",true);
		Reporter.log("step 1", true);
		Reporter.log("step 2", true);
		Reporter.log("step 3", true);
	}
	@AfterMethod
	public void pqr1()
	{
		Reporter.log("After method basic 1 class: pqr1 method", true);
	}
	@BeforeTest
	public void m5()
	{
		Reporter.log("Before test tag: m5 method",true);
	}
	@AfterTest
	public void m6()
	{
		Reporter.log("After test tag: m6 method",true);
	}


}


