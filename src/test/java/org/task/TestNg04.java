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

public class TestNg04 extends BaseMethods {

	@BeforeClass

	public static void launchBrowser() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		maxwindow();
	}

	@Test
	public void tc1() throws InterruptedException, IOException {
		driver.get("https://www.flipkart.com/account/login");
		TestNg04a s = new TestNg04a();

		findAndSend(s.getTxtUserName(), readFromExcel(0, 0));
		findAndSend(s.getTxtPassword(), readFromExcel(1, 0));
		Assert.assertEquals( "Ch@r@n2304", readFromExcel(1, 0),"check the password");
		click(s.getClkSubmit());

	}

}
