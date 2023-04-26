package pkg;

import java.time.Duration;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wapplyser {
ChromeDriver driver;
	
	@Before
	public void setUp()
	{
	
		 driver=new ChromeDriver();
		driver.get("https://www.wappalyzer.com/");
	}
	@Test
	public void linkcount() throws Exception
	{
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div/div[1]/header/div/div/div/div[2]/button[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"list-item-50\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div/div[2]/div[2]/div/div[2]/div[1]/div[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div/div[2]/div[1]/div[2]/div[3]/div/div/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div/div[2]/div/div[2]/form/div[1]/div[1]/div[1]/div/div[1]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"input-370\"]")).sendKeys("java");
		
		
		
	}


}
