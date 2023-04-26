package testngpkg;

import org.testng.annotations.Test;

public class TestngGrouping {
	
	
	@Test(groups = {"smoke","sanity"})
	public void test1()
	{
		System.out.println("test1");
	}

	@Test(groups = {"smoke"})
	public void test2()
	{
		System.out.println("test2");
	}

	@Test(groups = {"regerssion"})
	public void test3()
	{
		System.out.println("test3");
	}

	@Test(groups = {"regerssion"})
	public void test4()
	{
		System.out.println("test4");
	}

}
