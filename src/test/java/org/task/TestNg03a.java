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


public class TestNg03a extends BaseMethods {

	public TestNg03a() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//input[@id='firstName']")
	private WebElement txtFirstName;

	@FindBy(xpath = "//input[@id='lastName']")
	private WebElement txtLastName;

	@FindBy(xpath = "//input[@id='userEmail']")
	private WebElement txtEmailId;

	@FindBy(xpath = "(//label[@class='custom-control-label'])[1]")
	private WebElement clkGenderRadioBtn;

	@FindBy(xpath = "//input[@id='userNumber']")
	private WebElement txtMobileNum;

	@FindBy(xpath = "//input[@id='dateOfBirthInput']")
	private WebElement txtDate;

	@FindBy(xpath = "//div[@class='subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3']")
	private WebElement txtSubjects;

	@FindBy(xpath = "//div[@value='java,selenium']")
	private WebElement txtAttributeValue;

	@FindBy(xpath = "(//label[@class='custom-control-label'])[4]")
	private WebElement clkCheckSports;

	@FindBy(xpath = "(//label[@class='custom-control-label'])[5]")
	private WebElement clkCheckReading;

	@FindBy(xpath = "(//label[@class='custom-control-label'])[6]")
	private WebElement clkCheckMusic;

	@FindBy(xpath = "//textarea[@id='currentAddress']")
	private WebElement txtAddress;

	@FindBy(xpath = "//button[@id='submit']")
	private WebElement clkSubmit;

	public WebElement getTxtFirstName() {
		return txtFirstName;
	}

	public WebElement getTxtLastName() {
		return txtLastName;
	}

	public WebElement getTxtEmailId() {
		return txtEmailId;
	}

	public WebElement getClkGenderRadioBtn() {
		return clkGenderRadioBtn;
	}

	public WebElement getTxtMobileNum() {
		return txtMobileNum;
	}

	public WebElement getTxtDate() {
		return txtDate;
	}

	public WebElement getTxtSubjects() {
		return txtSubjects;
	}

	public WebElement getTxtAttributeValue() {
		return txtAttributeValue;
	}
	
	public WebElement getClkCheckSports() {
		return clkCheckSports;
	}

	public WebElement getClkCheckReading() {
		return clkCheckReading;
	}

	public WebElement getClkCheckMusic() {
		return clkCheckMusic;
	}

	public WebElement getTxtAddress() {
		return txtAddress;
	}

	public WebElement getClkSubmit() {
		return clkSubmit;
	}

}