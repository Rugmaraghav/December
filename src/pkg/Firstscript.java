package pkg;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;



public class Firstscript {

	public static void main(String[] args) {
		String exp="google";
	
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
	String actualtitle	 =driver.getTitle();
	System.out.println("actual title="+actualtitle);
//	if(actualtitle.equals(exp))
//	{
//		System.out.println("pass");
//	}
//	else
//	{
//		System.out.println("fail");
//	}
	
	
	Assert.assertEquals(exp,actualtitle);
	System.out.println("hello");
	//.quit();	
		

	}

}
