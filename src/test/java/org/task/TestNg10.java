package org.task;

import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNg10 extends BaseMethods {

	@BeforeClass

	private void launchBrowser() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		maxwindow();

	}

	@BeforeClass
	public void startTime() {
		Date date = new Date();
		System.out.println(date);
	}

	@AfterClass
	public void endTime() {
		Date date = new Date();
		System.out.println(date);
	}

	@Test (retryAnalyzer = TestNg10a.class)
	public void tc1() throws InterruptedException, IOException {

		driver.get("https://demoqa.com/automation-practice-form");
		
		TestNg05a s = new TestNg05a();

		findAndSend(s.getTxtFirstName(), readFromExcel(0, 0));
		findAndSend(s.getTxtLastName(), readFromExcel(0, 1));
		Assert.assertEquals("kumar", readFromExcel(0, 1), "Check the Second Name");
		findAndSend(s.getTxtEmailId(), readFromExcel(1, 0));
		Assert.assertEquals( "charanbuddy2gmail.com", readFromExcel(1, 0),"Check the given Email");
		click(s.getClkGenderRadioBtn());
		findAndSend(s.getTxtMobileNum(), readFromExcel(2, 0));
		jsSendKeys(s.getTxtSubjects(), readFromExcel(4, 0));
		String ta = gettingAttr(s.getTxtAttributeValue());
		System.out.println(ta);
		click(s.getClkCheckSports());
		click(s.getClkCheckReading());
		click(s.getClkCheckMusic());
		findAndSend(s.getTxtAddress(), readFromExcel(5, 0));
		click(s.getClkSubmit());
	}
}
