package com.crm.objectRepositiory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsPage {

	@FindBy(xpath = "//img[contains(@alt,'Create Contact...')]")
	private WebElement createContactLookUpImage;

	public ContactsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	/**
	 * @return the createContactLookUpImage
	 */
	public WebElement getCreateContactLookUpImage() {
		return createContactLookUpImage;
	}

	
}
