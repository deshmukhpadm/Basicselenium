package assertion;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Softassert {
	@Test
	public void m1()
	{
		SoftAssert sa=new SoftAssert();
		Reporter.log("Step1 m1", true);
		Reporter.log("Step2 m1", true);
		Reporter.log("Step3 m1", true);

		sa.assertEquals(10, 12);
		Reporter.log("Step4 m1", true);
		Reporter.log("Step5 m1", true);
		sa.assertAll();

		
		
	}
	@Test
	public void m2()
	{
		SoftAssert sa1=new SoftAssert();
		Reporter.log("Step1", true);
		Reporter.log("Step2", true);
		Reporter.log("Step3", true);
		sa1.assertEquals(10, 10);
		Reporter.log("Step4", true);
		Reporter.log("Step5", true);
		sa1.assertAll();
	}
	


}
