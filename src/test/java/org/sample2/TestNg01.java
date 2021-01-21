package org.sample2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNg01 extends BaseMethods {

	@BeforeClass
	private void launchBrowser() {
		chrome();
		
	}

	@Test
	private void userName() {
		launchUrl("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("charanbuddy@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("123516549");
		driver.findElement(By.name("login")).click();

	}



}
