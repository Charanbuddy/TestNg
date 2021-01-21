package org.sample2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgSample {

	@BeforeClass
	private void launchBrowser() {
		System.out.println("Launch Browser");
	}

	@AfterClass
	private void closeBrowser() {
		System.out.println("Close Browser");
	}

	@BeforeMethod
	private void startTime() {
		System.out.println("Test Case Starts");
	}

	@AfterMethod
	private void endTime() {
		System.out.println("Test Case Ends");
	}

	@Test
	private void tc1() {
		System.out.println("Test1");
	}

	@Test
	private void tc3() {
		System.out.println("Test3");

	}

	@Test
	private void tc2() {
		System.out.println("Test2");

	}

}
