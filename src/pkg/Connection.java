package pkg;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Connection {
	public static void main(String[] args) throws IOException
	{
		URL u=new URL("https://www.google.com");
		HttpURLConnection h=(HttpURLConnection)u.openConnection();
		System.out.println(h.getResponseCode());
		
	}

}
