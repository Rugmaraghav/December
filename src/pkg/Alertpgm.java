package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpgm {
ChromeDriver driver;
	
	@Before
	public void setUp()
	{
	
		 driver=new ChromeDriver();
		driver.get("file:///E:/Rugma/selenium%20notes/alert.html");
		
	}
	@Test
	public void alertp()
	{
		driver.findElement(By.xpath("/html/body/input[1]")).click();
		Alert a=driver.switchTo().alert();
		String alerttext=a.getText();
		if(alerttext.equals("hello iam an alertbox"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		a.accept();
		
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("abc");
	}

}
