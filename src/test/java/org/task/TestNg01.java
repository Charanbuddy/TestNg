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

public class TestNg01 extends BaseMethods {

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

		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(readFromExcel(0, 0));
		driver.findElement(By.id("pass")).sendKeys(readFromExcel(0, 1));
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);

	}

	@Test
	public void tc2() throws InterruptedException, IOException {

		driver.get("https://www.facebook.com/");
		WebElement txtEmail = driver.findElement(By.id("email"));
		txtEmail.sendKeys(readFromExcel(1, 0));
		String emailAttribute = txtEmail.getAttribute("value");
		Assert.assertEquals(emailAttribute, "Ramkumar", "Check the given MailID");

		driver.findElement(By.id("pass")).sendKeys(readFromExcel(1, 1));
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
	}

	@Test
	public void tc3() throws InterruptedException, IOException {

		driver.get("https://www.facebook.com/");
		WebElement txtEmail = driver.findElement(By.id("email"));
		txtEmail.sendKeys(readFromExcel(2, 0));
		String a3 = txtEmail.getAttribute("value");
		Assert.assertEquals(a3, "Singaram", "Verify please");
		driver.findElement(By.id("pass")).sendKeys(readFromExcel(2, 1));
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);

	}

}
