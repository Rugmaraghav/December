package pkg;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkcount {
	
	
ChromeDriver driver;
	
	@Before
	public void setUp()
	{
	
		 driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
	}
	@Test
	public void linkcount()
	{
		List<WebElement> linklist=driver.findElements(By.tagName("a"));
		System.out.println("total no of links="+linklist.size());
		for(WebElement li:linklist)
		{
			String url=li.getAttribute("href");
			verify(url);
			
			
		}
		
		
		
		
	}
	private void verify(String url) {
		
		try {
			URL u=new URL(url);
			HttpURLConnection con=(HttpURLConnection)u.openConnection();
			con.connect();
			con.setConnectTimeout(4000);
			if(con.getResponseCode()==200)
			{
				System.out.println("success:response code=200"+url);
			}
			else if(con.getResponseCode()==404)
			{
				System.out.println("brokenlink:response=404"+url);
			}
			
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	
		
	}

}
