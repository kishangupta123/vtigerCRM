package com.crm.objectRepositiory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationPage {
	
	@FindBy(xpath = "//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement createOrganizations;
	
	@FindBy(xpath = "//img[@src='themes/softed/images/btnL3Search.gif']")
	private WebElement searchOrganizations;
	
	@FindBy(xpath = "//img[@src='themes/softed/images/btnL3Calendar.gif']")
	private WebElement openCalendars;
	
	@FindBy(xpath = "//img[@src='themes/softed/images/btnL3Clock.gif']")
	private WebElement showWorlClock;
	
	@FindBy(xpath = "//img[@src='themes/softed/images/btnL3Calc.gif']")
	private WebElement openCalculator;
	
	@FindBy(xpath = "//img[@title='Last Viewed']")
	private WebElement lastViewed;
	
	@FindBy(xpath = "//img[@title='Import Organizations']")
	private WebElement importOrganizations;
	
	@FindBy(xpath = "//img[@title='Export Organizations']")
	private WebElement exportOrganizations;
	
	@FindBy(xpath = "//img[@title='Find Duplicates']")
	private WebElement findDuplicates;
	
	@FindBy(xpath = "//img[@title='Organizations Settings']")
	private WebElement organizationsSettings;
	
	@FindBy(id = "bas_searchfield")
	private WebElement industryDropdown;
	
	@FindBy(xpath = "(//input[contains(@value,'Search Now')])[1]")
	private WebElement searchNowButton;
	
	public OrganizationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	/**
	 * @return the createOrganizations
	 */
	public WebElement getCreateOrganizations() {
		return createOrganizations;
	}

	/**
	 * @return the searchOrganizations
	 */
	public WebElement getSearchOrganizations() {
		return searchOrganizations;
	}

	/**
	 * @return the openCalendars
	 */
	public WebElement getOpenCalendars() {
		return openCalendars;
	}

	/**
	 * @return the showWorlClock
	 */
	public WebElement getShowWorlClock() {
		return showWorlClock;
	}

	/**
	 * @return the openCalculator
	 */
	public WebElement getOpenCalculator() {
		return openCalculator;
	}

	/**
	 * @return the lastViewed
	 */
	public WebElement getLastViewed() {
		return lastViewed;
	}

	/**
	 * @return the importOrganizations
	 */
	public WebElement getImportOrganizations() {
		return importOrganizations;
	}

	/**
	 * @return the exportOrganizations
	 */
	public WebElement getExportOrganizations() {
		return exportOrganizations;
	}

	/**
	 * @return the findDuplicates
	 */
	public WebElement getFindDuplicates() {
		return findDuplicates;
	}

	/**
	 * @return the organizationsSettings
	 */
	public WebElement getOrganizationsSettings() {
		return organizationsSettings;
	}

	/**
	 * @return the industryDropdown
	 */
	public WebElement getIndustryDropdown() {
		return industryDropdown;
	}

	/**
	 * @return the searchNowButton
	 */
	public WebElement getSearchNowButton() {
		return searchNowButton;
	}
	
	
}
