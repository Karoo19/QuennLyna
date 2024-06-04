package Demo1;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test3 {

	@Parameters({"URL", "APIkey/username"})
	@Test(dataProvider="getData")
	public void WebloginHomeLoan(String urlname, String key)
	{
		System.out.println("WeblogincarLoan");
		System.out.println(urlname);
		System.out.println(key);
	}
	
	@Test(enabled=false)
public void MobileLoginHomeloan1()
	{
		System.out.println("MobileLoginHomeloan");
	}
	@Test
	public void MobileLoginHomeloan2()
	{
		System.out.println("MobileLoginHomeloan");
	}
	
	@Test
	public void MobileLoginHomeloan3()
	{
		System.out.println("MobileLoginHomeloan");
			
	}
	@BeforeSuite
	public void bfSuite()
	{
		System.out.println("I am first Suite");
	}
	@Test(groups= {"Smoke"})
	public void MobileLoginHomeloan4()
	{
		System.out.println("MobileLoginHomeloan");
	}
	
	@Test(dependsOnMethods= {"WebloginHomeLoan2", "MobileLoginHomeloan1"})
	public void webloginApicarLoan()
	{
		System.out.println("webloginApicarLoan");
	}
	@DataProvider
	public void getData()
	{
		//1st combination - username password - good credit history
		//2nd username password - no credit history
		//3rd Fraudelent credit history
		
		Object[][] data= new Object[3][2];
		//1st set
		data[0][0] ="firstsetusername";
		data[0][1]= "password";
		
		//2nd set
		data[1][0]= "secondsetusername";
		data[1][1]="secondpassword";
		
		//3rd set
		data[2][0]="thirdsetusername";
		data[2][1]="thirdpassword";
		
		
		
	}
	
	
}
