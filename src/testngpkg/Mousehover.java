package testngpkg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Mousehover {
EdgeDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver=new EdgeDriver();
	}
	
	@BeforeMethod
	public void urlloading()
	{
		driver.get("http://www.ebay.com");
		
	}
	
	@Test
	public void mousehvr()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement electronics=driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/a"));
		Actions act=new Actions(driver);
		act.moveToElement(electronics);
		act.perform();
		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/div[2]/div[1]/nav[1]/ul/li[1]/a")).click();
		
		
		
		
		
	}
	

}
