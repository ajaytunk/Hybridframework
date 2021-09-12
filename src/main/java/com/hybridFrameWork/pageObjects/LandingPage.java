package com.hybridFrameWork.pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hybridFrameWork.uistore.AmazonLandingPageUi;

public class LandingPage extends AmazonLandingPageUi {
	
public static 	WebDriver driver;

public LandingPage(WebDriver driver) {

	 LandingPage.driver=driver;

}


public WebElement title()
{
	return driver.findElement(protitle);
}

public WebElement clicking()
{
	return driver.findElement(cli);
}
public WebElement price()
{
	return driver.findElement(price);
}
public List<WebElement> links()
{
	return driver.findElements(noofllinks);
}
public WebElement srclink()
{
	return driver.findElement(imglink);
}



}
