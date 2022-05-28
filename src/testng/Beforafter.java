package testng;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Beforafter {
		/*@BeforeMethod
		public void m3()
		{
			Reporter.log("m3 : before method", true);
		}
		@AfterMethod
		public void m4()
		{
			Reporter.log("m4 : after method", true);
		}
		@Test
		public void m1()
		{
			Reporter.log("m1 method", true);
		}
		@Test
		public void m2()
		{
			Reporter.log("m2 method", true);
		}
		@Test
		public void a1()
		{
			Reporter.log("a1 method", true);
		}*/

@BeforeMethod
	public void m3()
	{
		Reporter.log("m3:before method", true);
	}
	@AfterMethod
	public void m4()
	{
		Reporter.log("m4:after method", true);
	}
	@Test
	public void m1()
	{
		Reporter.log("m2 method", true);
	}
	@Test
	public void a1()
	{
		Reporter.log("a1 method", true);
	
	}
	}


