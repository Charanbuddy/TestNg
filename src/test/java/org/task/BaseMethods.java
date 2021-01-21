package org.task;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.ScreenshotException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseMethods {

	public static WebDriver driver;

	public static Actions a;

	public static Robot b;

	public static Alert c;

	public static Thread d;

	public static TakesScreenshot f;

	public static Wait h;

	public static void loadBrowser() {// 1

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		

	}
	public static void fireFoxBrowser() {// 1

		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		

	}
	
	public static void ieBrowser() {// 1

		WebDriverManager.iedriver().setup();
		driver = new InternetExplorerDriver();
		

	}

	public static void launchUrl(String url) {// 2
		driver.get(url);
	}

	public static void maxwindow() {// 3
		driver.manage().window().maximize();
	}

	public static void quitBrowser() {// 4
		driver.close();
	}

	public static String pageTitle() {// 5
		String title = driver.getTitle();
		return title;
	}

	public static String pageUrl() {// 6
		String url = driver.getCurrentUrl();
		return url;
	}

	public static void findAndSend(WebElement element, String giveTxt) {

		element.sendKeys(giveTxt);

	}

	public static void enteringText(WebElement element, String text) {// 7
		element.sendKeys(text);
	}

	public static void click(WebElement element) {// 8
		// driver.findElement(By.xpath(element)).click();
		element.click();
	}

	public static void dragDrop(WebElement src, WebElement dest) {// 9
		a = new Actions(driver);
		a.dragAndDrop(src, dest).perform();
	}

	public static void rightClick(WebElement element) {// 10
		a.contextClick().perform();
	}

	public static void selectText(WebElement element, String txt) {// 11
		Select s = new Select(element);
		s.selectByVisibleText(txt);
	}

	public static String gettingAttr(WebElement element) {// 12
		String attrtxt = element.getAttribute("value");
		return attrtxt;
	}

	public static String gettingText(WebElement element) {// 13
		String gttext = element.getText();
		return gttext;
	}

	public static void cursorMovement(WebElement element) {// 14
		a = new Actions(driver);
		a.moveToElement(element).perform();
	}

	public static void mouseDoubleclick(WebElement element) {// 15
		a.doubleClick(element).perform();
	}

	public static void closeBrowser() {// 16
		driver.close();
	}

	public static void sAlert() {// 17
		c.dismiss();
	}

	public static void cAlert() {// 18
		c.accept();
	}

	public static void sleep(long ms) throws InterruptedException {// 19
		d.sleep(ms);
	}

	public static void switch1(String name) {// 20
		driver.switchTo().frame(name);
	}

	public static void switch2(WebElement element) {// 21
		driver.switchTo().frame(element);
	}

	public static void switch3(int indxvalue) {// 22
		driver.switchTo().frame(indxvalue);
	}

	public static void sltByVisibleTxt(WebElement element, String text2) {// 23
		Select e = new Select(element);
		e.selectByVisibleText(text2);
	}

//	public static void slctIndx(String path, int indxvalue) {// 24
//		Select e = new Select(element);
//		e.selectByIndex(indxvalue);
//	}
//
//	public static void slctByValue(String path, String value) {// 25
//		driver.findElement(By.xpath(path));
//		e.selectByValue(value);
//	}
//
//	public static void deSltByValue(String value1) {// 26
//		e.deselectByValue(value1);
//	}
//
//	public static void deSlctByVisibleTxt(String text3) {// 27
//		e.deselectByVisibleText(text3);
//	}
//
//	public static void deslctByIndx(int indxValue2) {// 28
//		e.deselectByIndex(indxValue2);
//	}
//
//	public static void deselectAll() {// 29
//		e.deselectAll();
//	}

	public static void keyPress() {// 30
		b.keyPress(KeyEvent.VK_SHIFT);

	}

	public static void Keyrelease() {// 31
		b.keyRelease(KeyEvent.VK_SHIFT);
	}

	public static void screeShot(String filename) throws IOException {// 32
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File des = new File(
				"D:\\desktop files\\Green Technologies\\Selenium Workouts\\Day7 - Task - Screenshots\\screenshots"
						+ filename + ".jpg");
		FileUtils.copyFile(source, des);
	}

	public static void alertPresent() {// 33
		WebDriverWait Wait = new WebDriverWait(driver, 10);
		Wait.until(ExpectedConditions.alertIsPresent());
	}

	public static void elementClicked(String id) {// 34
		WebDriverWait Wait = new WebDriverWait(driver, 10);
		Wait.until(ExpectedConditions.elementToBeClickable(By.id(id)));
	}

	public static void elementClicked1(String name) {// 35
		WebDriverWait Wait = new WebDriverWait(driver, 10);
		Wait.until(ExpectedConditions.elementToBeClickable(By.xpath(name)));
	}

	public static void elementSelected(String name) {// 36
		WebDriverWait Wait = new WebDriverWait(driver, 10);
		Wait.until(ExpectedConditions.elementToBeSelected(By.xpath(name)));
	}

	public static void elementSelected1(String name) {// 37
		WebDriverWait Wait = new WebDriverWait(driver, 10);
		Wait.until(ExpectedConditions.elementToBeSelected(By.id(name)));
	}

	public static void elementSelected2(String name) {// 37
		WebDriverWait Wait = new WebDriverWait(driver, 10);
		Wait.until(ExpectedConditions.elementToBeSelected(By.name(name)));
	}
	public static void visibilityOf(WebElement element) {// 38
		WebDriverWait Wait = new WebDriverWait(driver, 10);
		Wait.until(ExpectedConditions.visibilityOf(element));
	}

	public static void visibilityAllElements(WebElement elemenet) {// 39
		WebDriverWait Wait = new WebDriverWait(driver, 10);
		Wait.until(ExpectedConditions.visibilityOfAllElements(elemenet));
	}

	public static void visibilityLocatedByXpath(String xpath) {// 40
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(xpath)));

	}

	public static void visibilityLocatedByName(String name) {// 41
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(name)));

	}

	public static void visibilityLocatedById(String id) {// 42
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(id)));
	}
	


	public static String readFromExcel(int rowNo, int celNo) throws IOException {

		File file = new File("C:\\Users\\acer\\eclipse-workspace\\TestNg\\TestNg Excel\\TestNG Details.xlsx");
		FileInputStream fin = new FileInputStream(file);

		Workbook w = new XSSFWorkbook(fin);

		Sheet sheet = w.getSheet("Task05");

		Row row = sheet.getRow(rowNo);

		Cell cell = row.getCell(celNo);

		int cellType = cell.getCellType();
		
		String value = "";

		if (cellType == 1) {

			// cell value is stringtype
			value = cell.getStringCellValue();
		} else if (DateUtil.isCellDateFormatted(cell)) {
			// cell value is data type

			Date d = cell.getDateCellValue();

			SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy");

			value = s.format(d);

		} else {
			// cell value is Number

			double dd = cell.getNumericCellValue();

			// new datatype var=(newdattype)oldvar;

			long l = (long) dd;
			value = String.valueOf(l);

		}

		return value;

	} 

	public static void excelWrite(String folderPath, String sheetName, int rowNo, int CellNo, String Name)
			throws IOException {// 43

		File file = new File("C:\\Users\\acer\\eclipse-workspace\\Base\\Excel Folder\\" + folderPath);
		Workbook w = new XSSFWorkbook();
		Sheet sheet = w.createSheet(sheetName);
		Row r = sheet.createRow(rowNo);
		Cell c = r.createCell(CellNo);
		c.setCellValue(Name);
		FileOutputStream fout = new FileOutputStream(file);
		w.write(fout);
	}

	public static void excelUpdate(String filePath, String sheetName, int rowNo, int CellNo, String Text1, String Text2)
			throws IOException {// 44
		File file = new File(filePath);
		FileInputStream fin = new FileInputStream(file);

		Workbook w = new XSSFWorkbook(fin);

		Sheet sheet = w.getSheet(sheetName);

		Row r = sheet.getRow(rowNo);

		Cell c = r.getCell(CellNo);

		String value = c.getStringCellValue();

		if (value.equals(Text1)) {

			c.setCellValue(Text2);
		}

		FileOutputStream fout = new FileOutputStream(file);
		w.write(fout);
 
	}

	public static void xpathFinding(String name) {// 45

		WebElement s = driver.findElement(By.xpath(name));
	}

	public static void preOfElementLocated(String id, int Sec) {// 46
		WebDriverWait w = new WebDriverWait(driver, Sec);
		w.until(ExpectedConditions.presenceOfElementLocated(By.id("order_no")));

	}

	public static void scrollDown(WebElement element) {

		
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].scrollIntoView()", element);

	}
	
	public static void jsSendKeys(WebElement element, String txtInput) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','"+txtInput+"')", element);
	}

	public static void implicitwait() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	
}

