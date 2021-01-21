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

public class TestNg11 extends BaseMethods {

	@BeforeClass

	private void launchBrowser() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		maxwindow();

	}

	@BeforeClass(groups = "regression")
	public void startTime() {
		Date date = new Date();
		System.out.println(date);
	}

	@AfterClass(groups = "regression")
	public void endTime() {
		Date date = new Date();
		System.out.println(date);
	}

	@Test(groups = { "smoke", "sanity" })
	public void tc1() throws InterruptedException, IOException {

		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(readFromExcel(0, 0));
		driver.findElement(By.id("pass")).sendKeys(readFromExcel(0, 1));
		driver.findElement(By.name("login")).click();

	}
}
