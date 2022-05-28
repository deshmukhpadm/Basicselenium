package testng;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Beforclssaftcls {
	@BeforeMethod
	public void m3()
	{
		Reporter.log("m3 : before method", true);
	}
	@AfterMethod
	public void m4()
	{
		Reporter.log("m4 : after method", true);
	}
	@BeforeClass
	public void c1()
	{
		Reporter.log("c1: before class", true);
	}
	@AfterClass
	public void c2()
	{
		Reporter.log("c2: after class", true);
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
	}
}
