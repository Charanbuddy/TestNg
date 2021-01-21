package org.task;

import java.io.IOException;
import java.util.Date;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;


public class TestNg14a extends BaseMethods {

	public TestNg14a() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//input[@id='identifierId']")
	private WebElement txtUserName;

	@FindBy(xpath="//div[@class='VfPpkd-RLmnJb']")
	private WebElement clkNext;
	
	@FindBy(xpath="//div[@class='VfPpkd-RLmnJb']")
	private WebElement moreWaysToSignIn;

	public WebElement getMoreWaysToSignIn() {
		return moreWaysToSignIn;
	}

	public WebElement getTxtUserName() {
		return txtUserName;
	}

	public WebElement getClkNext() {
		return clkNext;
	}
	
	


	}