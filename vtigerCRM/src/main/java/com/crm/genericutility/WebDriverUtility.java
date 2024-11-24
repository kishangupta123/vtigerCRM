package com.crm.genericutility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author Kishan Kumar Gupta
 */

public class WebDriverUtility {
	/**
	 * Made Webdriver and Actions class public so that it can be used throughout the
	 * project
	 */
	public WebDriver driver;
	public Actions action;

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
	 * This method is used to add explicit wait for the webpage
	 */
	public void explicitWait() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	}
	
	public void launchBrowser() {
		driver.get(null);
	}
	
}
