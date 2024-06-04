package Demo1;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1 {
	
	@AfterTest
	public void lastexecution()
	{
		System.out.println("I will execute last");
	}
	@Test
	public void Demo()
	{
		System.out.println("hello TestNG");
		Assert.assertTrue(false);
	}
	@BeforeMethod
	public void bfMethod()
	{
		System.out.println("I am execute before method");
	}
	@AfterSuite
	public void afSuite()
	{
		System.out.println("I am last Suite");
	}
	@Test(groups= {"Smoke"})
	public void SecondTest()
	{
		System.out.println("Hello Karima, what are you  feeling todat!");
	}

}
