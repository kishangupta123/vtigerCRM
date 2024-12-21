package com.crm.objectRepositiory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalendarPopUp{
	
	@FindBy(xpath = "(//td[@class='title'])")
	private WebElement currentMonthYear;
	
	@FindBy(xpath = "//td[text()='«']")
	private WebElement prevYearNav;
	
	@FindBy(xpath = "//td[text()='«']/following-sibling::td[1]")
	private WebElement prevMonthNav;
	
	@FindBy(xpath = "//td[text()='«']/following-sibling::td[2]")
	private WebElement todaysDate;
	
	@FindBy(xpath = "//td[text()='«']/following-sibling::td[3]")
	private WebElement nextMonthNav;
	
	@FindBy(xpath = "//td[text()='«']/following-sibling::td[4]")
	private WebElement nextYearNav;
	
	public CalendarPopUp(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	/**
	 * @return the currentMonthYear
	 */
	public WebElement getCurrentMonthYear() {
		return currentMonthYear;
	}

	/**
	 * @return the prevYearNav
	 */
	public WebElement getPrevYearNav() {
		return prevYearNav;
	}

	/**
	 * @return the prevMonthNav
	 */
	public WebElement getPrevMonthNav() {
		return prevMonthNav;
	}

	/**
	 * @return the todaysDate
	 */
	public WebElement getTodaysDate() {
		return todaysDate;
	}

	/**
	 * @return the nextMonthNav
	 */
	public WebElement getNextMonthNav() {
		return nextMonthNav;
	}

	/**
	 * @return the nextYearNav
	 */
	public WebElement getNextYearNav() {
		return nextYearNav;
	}
}
