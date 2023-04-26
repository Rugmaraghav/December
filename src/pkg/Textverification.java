package pkg;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Textverification {
ChromeDriver driver;
	
	@Before
	public void setUp()
	{
		 ChromeOptions ops = new ChromeOptions();
         ops.addArguments("--disable-notifications");
		 driver=new ChromeDriver(ops);
		driver.get("https://www.irctc.co.in/nget/profile/user-registration");
	}
	
	@Test
	public void textverify()
	{
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"ui-tabpanel-0\"]/div/div[5]/p-dropdown/div")).click();
		WebElement drop=driver.findElement(By.xpath("//*[@id=\"ui-tabpanel-0\"]/div/div[5]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[1]"));
		
				drop.click();
				
				//drop.sendKeys("abc@gmail.com");
	//.sendKeys("sftw5w");
		//driver.findElement(By.name("login")).click();
		
		
		 
	}
	
	
	@After
	public void tearDown()
	{
		//driver.quit();
	}
	

}
