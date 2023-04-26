package pkg;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshotpgm {
	
	
ChromeDriver driver;
	
	@Before
	public void setUp()
	{
	
		 driver=new ChromeDriver();
		driver.get("https://www.google.com");
	}
	
	@Test
	public void titleverification() throws IOException
	{	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	File src	=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 
	FileHandler.copy(src,new File("E://error1.png"));
	
	WebElement search=driver.findElement(By.name("q"));
	File src1=search.getScreenshotAs(OutputType.FILE);
	FileHandler.copy(src1,new File("./Screenshot//error.png"));
	
		
	}
	
	

}
