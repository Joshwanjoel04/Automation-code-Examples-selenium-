package com.webpageAutomation.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.webpageAutomation.qa.base.TestBase;
import com.webpageAutomation.qa.pages.Homepage;
/*
 Author :joshwan Joel Fernandes
 * 
 * 
 */
public class HomePageTest  extends TestBase{
	Homepage homepage;

	public HomePageTest() {
		super();
		
	}
	@BeforeMethod
	public void setup()
	{
		initialization();
		homepage=new Homepage();
	
		
	}
	@Test
	public void selectItemfromList() throws Exception
	{
		homepage.selectProduct();
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	

}
