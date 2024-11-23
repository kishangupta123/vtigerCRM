package com.crm.objectRepositiory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	
	@FindBy(linkText = "Calendar")
	private WebElement calendarLink;
	
	@FindBy(linkText = "Leads")
	private WebElement leadsLink;
	
	@FindBy(linkText = "Organizations")
	private WebElement organizationsLink;
	
	@FindBy(linkText = "Contacts")
	private WebElement contactsLink;
	
	@FindBy(linkText = "Opportunities")
	private WebElement opportunitiesLink;
	
	@FindBy(linkText = "Products")
	private WebElement productsLink;
	
	@FindBy(linkText = "Documents")
	private WebElement documentsLink;
	
	@FindBy(linkText = "Email")
	private WebElement emailLink;
	
	@FindBy(linkText = "Trouble Tickets")
	private WebElement troubleTicketsLink;
	
	@FindBy(linkText = "Dashboard")
	private WebElement dashboardLink;
	
	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
	private WebElement administratorImage;
	
	@FindBy(linkText = "Sign Out")
	private WebElement signoutLink;
	
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	/**
	 * @return the calendarLink
	 */
	public WebElement getCalendarLink() {
		return calendarLink;
	}

	/**
	 * @return the leadsLink
	 */
	public WebElement getLeadsLink() {
		return leadsLink;
	}

	/**
	 * @return the organizationsLink
	 */
	public WebElement getOrganizationsLink() {
		return organizationsLink;
	}

	/**
	 * @return the contactsLink
	 */
	public WebElement getContactsLink() {
		return contactsLink;
	}

	/**
	 * @return the opportunitiesLink
	 */
	public WebElement getOpportunitiesLink() {
		return opportunitiesLink;
	}

	/**
	 * @return the productsLink
	 */
	public WebElement getProductsLink() {
		return productsLink;
	}

	/**
	 * @return the documentsLink
	 */
	public WebElement getDocumentsLink() {
		return documentsLink;
	}

	/**
	 * @return the emailLink
	 */
	public WebElement getEmailLink() {
		return emailLink;
	}

	/**
	 * @return the troubleTicketsLink
	 */
	public WebElement getTroubleTicketsLink() {
		return troubleTicketsLink;
	}

	/**
	 * @return the dashboardLink
	 */
	public WebElement getDashboardLink() {
		return dashboardLink;
	}

	/**
	 * @return the administratorImage
	 */
	public WebElement getAdministratorImage() {
		return administratorImage;
	}

	/**
	 * @return the signoutLink
	 */
	public WebElement getSignoutLink() {
		return signoutLink;
	}
}
