package com.webpageAutomation.qa.pages;



import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.webpageAutomation.qa.base.TestBase;


public class Homepage extends TestBase{
	@FindBy(how=How.ID,using="twotabsearchtextbox")
	WebElement searchTextbox;
	@FindBy(how=How.XPATH,using="//input[@type='submit'][@class='nav-input']")
	WebElement searchSymbol;
	@FindBy(xpath="//i[@class='a-icon a-icon-checkbox'][1]")
	WebElement xpathsofcustomselect1;
	@FindBy(xpath="(//i[@class='a-icon a-icon-checkbox'])[2]")
	WebElement xpathsofcustomselect2;
	@FindBy(xpath="(//i[@class='a-icon a-icon-checkbox'])[3]")
	WebElement xpathsofcustomselect3;
	@FindBy(xpath="(//i[@class='a-icon a-icon-checkbox'])[4]")
	WebElement xpathsofcustomselect4;
	@FindBy(how=How.CSS,using="#low-price")
	WebElement lowPricetextbox;
	@FindBy(how=How.CSS,using="#high-price")
	WebElement HighPriceTextbox;
	@FindBy(how=How.CSS,using="#a-autoid-1")
	WebElement goButton;
	@FindBy(xpath="//img[@class='s-image'][@data-image-index='11']")
	WebElement ShoeSelected;
	@FindBy(xpath="//span[@id='submit.add-to-cart']")     //select[@id='native_dropdown_selected_size_name']
	WebElement addtoCartButton;
	@FindBy(xpath="//select[@id='native_dropdown_selected_size_name']")     
	WebElement SizeSelect;
	public JavascriptExecutor js;

	public Homepage()  {
		PageFactory.initElements(driver, this);
	}
	public void selectProduct() throws InterruptedException
	{   
		js =  (JavascriptExecutor)driver;
		searchTextbox.sendKeys("nike sports shoes for men");
		searchSymbol.click();
		driver.manage().timeouts.implicitlyWait(20,TimeUnit.SECONDS);
		xpathsofcustomselect1.click();
		driver.manage().timeouts.implicitlyWait(20,TimeUnit.SECONDS);
		xpathsofcustomselect2.click();
		driver.manage().timeouts.implicitlyWait(20,TimeUnit.SECONDS);
		xpathsofcustomselect3.click();
		driver.manage().timeouts.implicitlyWait(20,TimeUnit.SECONDS);
		xpathsofcustomselect4.click();
		driver.manage().timeouts.implicitlyWait(20,TimeUnit.SECONDS);
		lowPricetextbox.sendKeys("1000");
		driver.manage().timeouts.implicitlyWait(20,TimeUnit.SECONDS);
		HighPriceTextbox.sendKeys("2500");
		goButton.click();
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(3000);
		ShoeSelected.click();
	

}
}
