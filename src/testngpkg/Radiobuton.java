package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Radiobuton {
ChromeDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
	}
	
	@BeforeMethod
	public void urlloading()
	{
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
		
	}
	@Test
	public void radio()
	{
		WebElement radiobutton=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]/input[1]"));
	Boolean b=	radiobutton.isSelected();
	if(b)
	{
		System.out.println("rado button is selected");
	}
	else
	{
		System.out.println("not selected");
	}
		
	}
	@Test
	public void logo()
	{
		WebElement logo=driver.findElement(By.xpath("//*[@id=\"wrapper\"]/table[1]/tbody/tr[1]/td[1]/img"));
		Boolean logo1=logo.isDisplayed();
		if(logo1)
		{
			System.out.println("logo is displayed");
		}
		else
		{
			System.out.println("logo is not displayed");
		}
	}

}
