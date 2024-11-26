package com.crm.objectRepositiory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationInfoPage {
	
	@FindBy(className = "dvHeaderText")
	private WebElement organizationHeaderText;
	
	public OrganizationInfoPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	/**
	 * @return the organizationHeaderText
	 */
	public WebElement getOrganizationHeaderText() {
		return organizationHeaderText;
	}
	
	//Business Library - Generic Method related to Project
		/**
		 * This method will capture header text and return it to caller method
		 * @return
		 */
		public String captureContactHeader()
		{
			String contactHeader = organizationHeaderText.getText();
			
			return contactHeader;
		}
}
