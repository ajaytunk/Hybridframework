package com.hybridFrameWork.uistore;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AmazonLandingPageUi {
	
	public static WebDriver driver;
	public Properties prop;
	protected By protitle =	By.cssSelector("span.a-size-large.product-title-word-break");
	protected By cli=By.id("configuration_1");
	protected By price=By.id("priceblock_dealprice");
	protected By noofllinks=By.tagName("a");
	protected By imglink=By.cssSelector("img#landingImage");

}
