package pkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
ChromeDriver driver;
	
	@Before
	public void setUp()
	{
	
		 driver=new ChromeDriver();
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void dropdown()
	{
//		WebElement day=driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[1]"));
//		Select s=new Select(day);
//		s.selectByValue("02");)
		
		String buttontext=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[2]")).getAttribute("value");
		
		String exp="check availability";
		if(buttontext.equals(exp))
		{
			
		}
		
	
	}
	@After
	public void tearDown()
	{
		//driver.quit();
	}

}
