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

public class TestNg02 extends BaseMethods {

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

	@Test
	public void tc1() throws InterruptedException, IOException {

		driver.get("https://www.redbus.in/");
		WebElement cursorMvmnt = driver.findElement(By.xpath("//div[@id='signin-block']"));
		cursorMovement(cursorMvmnt);
		click(cursorMvmnt);
		WebElement clkSingin = driver.findElement(By.xpath("//li[@id='signInLink']"));
		click(clkSingin);
		Thread.sleep(3000);

		WebElement frame = driver.findElement(By.xpath("//iframe[@class='modalIframe']"));
		driver.switchTo().frame(frame);
		WebElement txtMobile = driver.findElement(By.xpath("//input[@id='mobileNoInp']"));
		txtMobile.sendKeys(readFromExcel(0, 0));
		Assert.assertEquals("Check the Phone Number", "9600176552", readFromExcel(0, 0));

	}

}
