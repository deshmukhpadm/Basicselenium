package assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assernull {
	@Test
	public void m1()
	{
		String ss="abc";
		Assert.assertNull(ss);//fail
		
		
		
		
	}	
	@Test
	public void m2()
	{
		String ss="abc";
		Assert.assertNotNull(ss);//pass
		
	}
	

}


