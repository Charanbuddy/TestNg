package org.task;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNg06 extends BaseMethods {

	@Parameters("browser")
	@Test
	private void tc1(String browserName) {
		
		if (browserName.contains("chrome")) {
			loadBrowser();
		}else if (browserName.contains("firefox")) {
			fireFoxBrowser();
		}else {
			ieBrowser();
		}

		launchUrl("http://www.greenstechnologys.com/");
		maxwindow();
	}

	
		
	}

