package Demo1;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test2 {
	
	@Test(groups= {"Smoke"})
	public void Demo1()
	{
		System.out.println("Hello Sarah");
	}

	@BeforeTest
	public void prerequisite() 
	{
		System.out.println("I will execute test");
	}
}