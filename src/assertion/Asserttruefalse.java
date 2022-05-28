package assertion;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Asserttruefalse {
	@Test
	public void m1()
	{
		Reporter.log("m1 method from basic 1 class",true);
		Reporter.log("step 1", true);
		Reporter.log("step 2", true);
		Reporter.log("step 3", true);
		Assert.assertNotEquals("abc", "abc");
		Reporter.log("step 4", true);
		Reporter.log("step 5", true);
		Reporter.log("step 6", true);
		
			
	}
	@Test
	public void m2()
	{
		Reporter.log("m2 method from basic 1 class",true);
		Reporter.log("step 1", true);
		Assert.assertNotEquals(false, true);
		Reporter.log("step 2", true);
		Reporter.log("step 3", true);
	}
	

}


