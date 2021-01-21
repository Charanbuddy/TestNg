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
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNg14 extends BaseMethods {

	@BeforeClass
	public static void tc0() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		maxwindow();
	}

	@Parameters({ "username", "password" })
	@Test
	public void tc1(String email, String pass) throws InterruptedException, IOException {
		driver.get("https://mail.google.com/");
		maxwindow();
		implicitwait();
		TestNg14a s = new TestNg14a();

		findAndSend(s.getTxtUserName(), email);
		click(s.getClkNext());
		findAndSend(s.getMoreWaysToSignIn(), pass);

	}

}
