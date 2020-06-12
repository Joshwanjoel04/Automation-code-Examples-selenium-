package com.webpageAutomation.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.webpageAutomation.qa.util.TestUtil;



public class TestBase {
	public static WebDriver driver;
	public static String directory;
	public static Properties prop;

	public TestBase() {
		directory = System.getProperty("user.dir");

		try {
			
			prop = new Properties();
//			FileInputStream ip = new FileInputStream(
//					System.getProperty("user.dir")+ "\\src\\main\\java\\com\\webpageAutomation\\qa\\config\\config.properties");
			FileInputStream ip = new FileInputStream("D:\\Selenium Softwares\\selenium_Work_Space\\WebApplicationAutomation\\src\\main\\java\\com\\webpageAutomation\\qa\\config\\config.properties");

			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void initialization() {
		String browserName = prop.getProperty("browser");
		if (browserName.equals("chrome")) {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");
			

			System.setProperty("webdriver.chrome.driver","D:\\Selenium Softwares\\selenium_Work_Space\\WebApplicationAutomation\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver(options);

		} else if (browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", directory + "\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();

		} else if (browserName.equals("Internet Exporer")) {
			System.setProperty("webdriver.", directory + "\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();

		}

		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
	}


}
