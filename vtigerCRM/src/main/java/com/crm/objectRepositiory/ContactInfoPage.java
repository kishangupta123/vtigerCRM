package com.crm.objectRepositiory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactInfoPage {
	
	@FindBy(className = "dvHeaderText")
	private WebElement contactHeaderText;
	
	@FindBy(xpath = "//td[@class='dvtCellInfo']")
	private WebElement lastName;
	
	@FindBy(xpath = "//td[contains(@id,'First Name')]")
	private WebElement firstName;
	
	@FindBy(xpath = "//td[contains(@id,'Organization Name')]")
	private WebElement organizationName;
	
	/**
	 * @return the leadSource
	 */
	public WebElement getLeadSource() {
		return leadSource;
	}

	@FindBy(xpath = "//td[contains(@id,'Lead Source')]")
	private WebElement leadSource;
	
	@FindBy(xpath = "//td[contains(@id,'Title')]")
	private WebElement title;
	
	@FindBy(xpath = "//td[contains(@id,'Department')]")
	private WebElement department;
	
	@FindBy(xpath = "//td[contains(@id,'Email')]")
	private WebElement email;
	
	@FindBy(xpath = "//td[@id='mouseArea_Assistant']")
	private WebElement assistant;
	
	@FindBy(xpath = "//td[contains(@id,'Assistant Phone')]")
	private WebElement assistantPhone;
	
	@FindBy(xpath = "//td[contains(@id,'Office Phone')]")
	private WebElement officePhone;
	
	public ContactInfoPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//getter method
	public WebElement getContactHeaderText() {
		return contactHeaderText;
	}
	
	
	
	/**
	 * @return the lastName
	 */
	public WebElement getLastName() {
		return lastName;
	}

	/**
	 * @return the firstName
	 */
	public WebElement getFirstName() {
		return firstName;
	}

	/**
	 * @return the organizationName
	 */
	public WebElement getOrganizationName() {
		return organizationName;
	}

	/**
	 * @return the title
	 */
	public WebElement getTitle() {
		return title;
	}

	/**
	 * @return the department
	 */
	public WebElement getDepartment() {
		return department;
	}

	/**
	 * @return the email
	 */
	public WebElement getEmail() {
		return email;
	}

	/**
	 * @return the assistant
	 */
	public WebElement getAssistant() {
		return assistant;
	}

	/**
	 * @return the assistantPhone
	 */
	public WebElement getAssistantPhone() {
		return assistantPhone;
	}

	/**
	 * @return the officePhone
	 */
	public WebElement getOfficePhone() {
		return officePhone;
	}

	//Business Library - Generic Method related to Project
	/**
	 * This method will capture header text and return it to caller method
	 * @return
	 */
	public String captureContactHeader()
	{
		String contactHeader = contactHeaderText.getText();
		
		return contactHeader;
	}
}
