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
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNg15 extends BaseMethods {

	@DataProvider(name="Authentication")
	public Object[][] credentials(){
		return new Object[][] {
			{"charanbuddy@gmail.com","1234567890"}	
			
		};
		}

	@BeforeClass
	public static void tc0() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		maxwindow();
	}

	@Test(dataProvider="Authentication")
	public void tc1(String email, String pass) {
		driver.get("https://mail.google.com/");
		maxwindow();
		implicitwait();
		TestNg14a s = new TestNg14a();

		findAndSend(s.getTxtUserName(), email);
		click(s.getClkNext());
		findAndSend(s.getMoreWaysToSignIn(), pass);

	}

}
