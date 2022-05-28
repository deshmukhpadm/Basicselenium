package testng;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Basics {
@Test
public void m1()
{
	System.out.println("m1 method");
	Reporter.log("Testng Reporter",true);
}
@Test
public void m2()
{
	System.out.println("m2 method");
	Reporter.log("this is m2 method", true);
}
@Test
public void m3()
{
	System.out.println("m3 method");
	Reporter.log("this is m3 method",true);
	Assert.fail();
}
}
