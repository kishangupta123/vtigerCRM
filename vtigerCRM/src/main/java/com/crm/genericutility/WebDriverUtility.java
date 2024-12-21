package com.crm.genericutility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author Kishan Kumar Gupta
 */

public class WebDriverUtility {
	/**
	 * Made Webdriver and class public so that it can be used throughout the project
	 */

	public WebDriver driver;
	public Actions actions;
	public Select select;

	/**
	 * This method is used to maximize the window
	 */
	public void maximizeWindow() {
		driver.manage().window().maximize();
	}

	/**
	 * This method is used to minimize the window
	 */
	public void minimizeWindow() {
		driver.manage().window().minimize();
	}

	/**
	 * This method is used to delete all the cookies.
	 */
	public void deleteAllCookies() {
		driver.manage().deleteAllCookies();
	}

	/**
	 * This method is used to add implicit wait for the webpage
	 */
	public void implicitWait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	/**
	 * This method will wait for 10 seconds for particular element to be visible
	 * 
	 * @param element
	 */
	public void explicitlyWaitForElementToVisible(WebElement element) {
		WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
		webDriverWait.until(ExpectedConditions.visibilityOf(element));
	}

	/**
	 * This method will wait for 10 seconds for particular element to be clickable
	 * 
	 * @param element
	 */
	public void explicitlyWaitForElementToBeClickable(WebElement element) {
		WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
		webDriverWait.until(ExpectedConditions.elementToBeClickable(element));
	}

	/**
	 * This method will full screen the window
	 */
	public void fullScreenWindow() {
		driver.manage().window().fullscreen();
	}

	/**
	 * This method will set the size of the window
	 * 
	 * @param width
	 * @param height
	 */
	public void setSizeOfWindow(int width, int height) {
		Dimension dimension = new Dimension(width, height);
		driver.manage().window().setSize(dimension);
	}

	/**
	 * This method will set the position of the window
	 * 
	 * @param xAxis
	 * @param yAxis
	 */
	public void setPositionOfWindow(int xAxis, int yAxis) {
		Point point = new Point(xAxis, yAxis);
		driver.manage().window().setPosition(point);
	}

	/**
	 * This method will handle drop down by using index
	 * 
	 * @param element
	 * @param index
	 */
	public void handleDropDownByIndex(WebElement element, int index) {
		select = new Select(element);
		select.selectByIndex(index);
	}

	/**
	 * This method will handle drop down by using value
	 * 
	 * @param element
	 * @param value
	 */
	public void handleDropDownByValue(WebElement element, String value) {
		select = new Select(element);
		select.selectByValue(value);
	}

	/**
	 * This method will handle drop down by using Visible text
	 * 
	 * @param element
	 * @param text
	 */
	public void handleDropDownByVisibleText(WebElement element, String visibleText) {
		select = new Select(element);
		select.selectByVisibleText(visibleText);
	}

	/**
	 * This method will perform mouse hover action on the particular web element
	 * 
	 * @param driver2
	 * 
	 * @param element
	 */
	public void mouseHoverAction(WebDriver driver, WebElement element) {
		actions = new Actions(driver);
		actions.moveToElement(element).click().perform();
	}

	/**
	 * This method will perform right click action any where on the web page
	 * 
	 */
	public void rightClickAtAnyWhereAction(WebDriver driver) {
		actions = new Actions(driver);
		actions.contextClick().perform();
	}

	/**
	 * This method will perform right click action on a particular web element
	 * 
	 * @param element
	 */
	public void rightClickOnElementAction(WebElement element) {
		actions = new Actions(driver);
		actions.contextClick(element).perform();
	}

	/**
	 * This method will perform double click action any where on the web page
	 * 
	 */
	public void doubleClickAtAnyWhereAction() {
		actions = new Actions(driver);
		actions.doubleClick().perform();
	}

	/**
	 * This method will perform double click action on a particular web element
	 * 
	 * @param element
	 */
	public void doubleClickOnElementAction(WebElement element) {
		actions = new Actions(driver);
		actions.doubleClick(element).perform();
	}

	/**
	 * This method will perform drag and drop action from source element to target
	 * element
	 * 
	 * @param source
	 * @param target
	 */
	public void dragAndDropAction(WebElement source, WebElement target) {
		actions = new Actions(driver);
		actions.dragAndDrop(source, target).perform();
	}

	/**
	 * This method will perform movement of cursor by offset and click
	 * 
	 * @param xOffset
	 * @param yOffset
	 */
	public void moveCursorAndClickByOffset(int xOffset, int yOffset) {
		actions = new Actions(driver);
		actions.moveByOffset(xOffset, yOffset).click().perform();
	}

	/**
	 * This method will perform movement of scroll down for 500 units
	 * 
	 * @param driver
	 */
	public void scrollDownActions(WebDriver driver) {
		JavascriptExecutor javaScriptExecutor = (JavascriptExecutor) driver;
		javaScriptExecutor.executeScript("window.ScrollBy(0,500);", "");
	}

	/**
	 * This method will perform movement of scroll up for 500 units
	 * 
	 * @param driver
	 */
	public void scrollUpActions(WebDriver driver) {
		JavascriptExecutor javaScriptExecutor = (JavascriptExecutor) driver;
		javaScriptExecutor.executeScript("window.ScrollBy(0,-500);", "");
	}

	/**
	 * This method will perform movement of scroll down until a particular web
	 * element
	 * 
	 * @param driver
	 * @param element
	 */
	public void scrollDownUntilElement(WebDriver driver, WebElement element) {
		JavascriptExecutor javaScriptExecutor = (JavascriptExecutor) driver;
		javaScriptExecutor.executeScript("argument[0].scrollIntoView();", element);
	}

	/**
	 * This method will accept the alert popup
	 * 
	 * @param driver
	 */
	public void acceptAlertPopUp(WebDriver driver) {
		driver.switchTo().alert().accept();
	}

	/**
	 * This method will dismiss the alert popup
	 * 
	 * @param driver
	 */
	public void dismissAlertPopUp(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}

	/**
	 * This method will capture the text of alert popup and return to caller method
	 * 
	 * @param driver
	 * @return alertPopUpText
	 */
	public String getTextOfAlertPopUp(WebDriver driver) {
		String alertPopUpText = driver.switchTo().alert().getText();
		return alertPopUpText;
	}

	/**
	 * This method will send data into alert popup
	 * 
	 * @param driver
	 * @param text
	 */
	public void sendTextInAlertPopUp(WebDriver driver, String text) {
		driver.switchTo().alert().sendKeys(text);
	}

	/**
	 * This method will handle frame by using index
	 * 
	 * @param driver
	 * @param index
	 */
	public void handleFrameByIndex(WebDriver driver, int frameIndex) {
		driver.switchTo().frame(frameIndex);
	}

	/**
	 * This method will handle frame by using name or Id
	 * 
	 * @param driver
	 * @param nameOrId
	 */
	public void handleFrameByNameOrId(WebDriver driver, String frameNameOrId) {
		driver.switchTo().frame(frameNameOrId);
	}

	/**
	 * This method will handle frame by using frameElement
	 * 
	 * @param driver
	 * @param frameElement
	 */
	public void handleFrameByElement(WebDriver driver, WebElement frameElement) {
		driver.switchTo().frame(frameElement);
	}

	/**
	 * This method will switch to immediate parent frame
	 * 
	 * @param driver
	 */
	public void switchToParentFrame(WebDriver driver) {
		driver.switchTo().parentFrame();
	}

	/**
	 * This method will switch to default or main page
	 * 
	 * @param driver
	 */
	public void switchToDefaultContentFrame(WebDriver driver) {
		driver.switchTo().defaultContent();
	}

	/**
	 * This method will help to switch the control from one window to another window
	 * 
	 * @param driver
	 * @param partialWindowName
	 */
	public void switchToWindows(WebDriver driver, String partialWindowName) {
		Set<String> allWindowIDs = driver.getWindowHandles();

		for (String IDs : allWindowIDs) {
			String actualTitle = driver.switchTo().window(IDs).getTitle();

			if (actualTitle.contains(partialWindowName)) {
				break;
			}
		}
	}

	/**
	 * This method will take screenshot of the webpage and store it in the desired
	 * location
	 * 
	 * @throws IOException
	 */
	public void takesScreenShot() throws IOException {
		String date = LocalDateTime.now().toString().replace(":", "-");
		TakesScreenshot ts = (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./vtigerCRM/screenshots" + date + ".png");
		org.openqa.selenium.io.FileHandler.copy(temp, dest);
	}

	/**
	 * This method will take screenshot of a web element and store it in specified
	 * filepath
	 * 
	 * @throws IOException
	 */
	public void takeElementScreenShot() throws IOException {
		String date = LocalDateTime.now().toString().replace(":", "-");
		WebElement element = driver.findElement(By.className(null));
		File temp = element.getScreenshotAs(OutputType.FILE);
		File dest = new File("./vtigerCRM/screenshots" + date + ".png");
		FileHandler.copy(temp, dest);
	}
}
