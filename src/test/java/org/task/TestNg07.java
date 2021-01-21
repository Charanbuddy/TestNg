package org.task;

import java.io.IOException;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNg07 extends BaseMethods {

	@Parameters("browser")
	@Test
	private void tc1(String browserName) throws IOException {

		if (browserName.contains("chrome")) {
			loadBrowser();
		} else if (browserName.contains("firefox")) {
			fireFoxBrowser();
		} else {
			ieBrowser();
		}

		launchUrl("https://www.flipkart.com/account/login");
		maxwindow();
		TestNg04a s = new TestNg04a();
		implicitwait();
		jsSendKeys(s.getTxtUserName(), "ertyj");
		String st1 = gettingAttr(s.getTxtUserName());
		System.out.println(st1);
		jsSendKeys(s.getTxtPassword(), "6723872h");
		String st2 = gettingAttr(s.getTxtPassword());
		System.out.println(st2);
		click(s.getClkSubmit());
	}

}
