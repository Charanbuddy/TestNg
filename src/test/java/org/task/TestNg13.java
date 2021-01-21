package org.task;

import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNg13 extends BaseMethods {

	@Test(groups = "sanity", priority = -1)
	public static void tc0() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		maxwindow();
	}

	public TestNg03a s;

	@Test(groups = "sanity", priority = 0)
	public void tc1() throws InterruptedException, IOException {
		driver.get("https://demoqa.com/automation-practice-form");
		implicitwait();
	}

	@Test(groups = "sanity", priority = 1)
	public void tc2() throws IOException {
		s = new TestNg03a();
		findAndSend(s.getTxtFirstName(), readFromExcel(0, 0));
	}

	@Test(groups = "sanity", priority = 3)
	public void tc3() throws IOException {
		s = new TestNg03a();
		findAndSend(s.getTxtLastName(), readFromExcel(0, 1));
	}

	@Test(groups = "sanity", priority = 4, retryAnalyzer = TestNg13a.class)
	public void tc4() throws IOException {
		s = new TestNg03a();
		Assert.assertEquals("charanbuddy@gmail.com", "charanbuddy2gmail.com", "check the Email Id");
		findAndSend(s.getTxtEmailId(), readFromExcel(1, 0));
	}

	@Test(groups = "sanity", priority = 5)
	public void tc5() throws IOException {
		s = new TestNg03a();
		click(s.getClkGenderRadioBtn());
	}

	@Test(groups = "sanity", priority = 6)
	public void tc6() throws IOException {
		s = new TestNg03a();
		findAndSend(s.getTxtMobileNum(), readFromExcel(2, 0));
	}

	@Test(groups = { "sanity", "smoke" }, priority = 7)
	public void tc7() throws IOException {
		s = new TestNg03a();
		jsSendKeys(s.getTxtSubjects(), readFromExcel(4, 0));
	}

	@Test(groups = "regression")
	public void tc8() throws IOException {
		s = new TestNg03a();
		click(s.getClkCheckSports());
	}

	@Test(groups = "regression")
	public void tc9() throws IOException {
		s = new TestNg03a();
		click(s.getClkCheckReading());
	}

	@Test(groups = "smoke", priority = 8)
	public void tc10() throws IOException {
		s = new TestNg03a();
		click(s.getClkCheckMusic());
	}

	@Test(groups = "smoke", priority = 9)
	public void tc11() throws IOException {
		s = new TestNg03a();
		findAndSend(s.getTxtAddress(), readFromExcel(5, 0));
	}

	@Test(groups = "smoke", priority = 10)
	public void tc12() throws IOException {
		s = new TestNg03a();
		click(s.getClkSubmit());
	}
}
