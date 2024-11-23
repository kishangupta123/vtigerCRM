package com.crm.objectRepositiory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewContactsPage{
	
	@FindBy(name = "salutationtype")
	private WebElement prefixDropDown;
	
	@FindBy(name = "firstname")
	private WebElement firstNameTextBox;
	
	@FindBy(name = "lastname")
	private WebElement lastNameTextBox;
	
	@FindBy(xpath = "//input[@name='account_name']/following-sibling::img[@title='Select']")
	private WebElement organizationLookUpImage;
	
	@FindBy(id = "search_txt")
	private WebElement organizationsSearchTextBox;
	
	@FindBy(name = "search")
	private WebElement organizationSearchButton;
	
	@FindBy(name = "leadsource")
	private WebElement leadsourceDropDown;
	
	@FindBy(id="title")
	private WebElement titleTextBox;
	
	@FindBy(id="department")
	private WebElement departmentTextBox;
	
	@FindBy(id="email")
	private WebElement emailTextBox;
	
	@FindBy(id="assistant")
	private WebElement assistantTextBox;
	
	@FindBy(id="assistantphone")
	private WebElement assistantPhoneTextBox;
	
	@FindBy(name="emailoptout")
	private WebElement emailoptoutCheckBox;
	
	@FindBy(name="reference")
	private WebElement referenceCheckBox;
	
	@FindBy(name="notify_owner")
	private WebElement notify_ownerCheckBox;
	
	@FindBy(id="phone")
	private WebElement officePhoneTextBox;
	
	@FindBy(id="mobile")
	private WebElement mobileTextBox;
	
	@FindBy(id="homephone")
	private WebElement homephoneTextBox;
	
	@FindBy(id="otherphone")
	private WebElement otherphoneTextBox;
	
	@FindBy(id="fax")
	private WebElement faxTextBox;
	
	@FindBy(id="jscal_trigger_birthday")
	private WebElement birthdayTableTextBox;
	
	@FindBy(id="jscal_field_birthday")
	private WebElement birthdayFieldTextBox;
	
	@FindBy(xpath = "//input[@name='contact_name']/following-sibling::img[@title='Select']")
	private WebElement reportsToLookUpImage;
	
	@FindBy(id="search_txt")
	private WebElement reportsToContactsSearchTextBox;
	
	@FindBy(name="search")
	private WebElement reportsToContactsSearchButton;
	
	@FindBy(id="secondaryemail")
	private WebElement secondaryEmailTextBox;
	
	@FindBy(name="donotcall")
	private WebElement donotcallCheckBox;
	
	@FindBy(xpath = "//input[@title='Save [Alt+S]']")
	private WebElement saveButton;
	
	//Constructor
	
	public CreateNewContactsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Getters methods
	
	public WebElement getPrefixDropDown() {
		return prefixDropDown;
	}
	
	public WebElement getFirstNameTextBox() {
		return firstNameTextBox;
	}

	public WebElement getLastNameTextBox() {
		return lastNameTextBox;
	}

	public WebElement getOrganizationLookUpImage() {
		return organizationLookUpImage;
	}

	public WebElement getOrganizationsSearchTextBox() {
		return organizationsSearchTextBox;
	}

	public WebElement getOrganizationSearchButton() {
		return organizationSearchButton;
	}

	public WebElement getLeadsourceDropDown() {
		return leadsourceDropDown;
	}

	public WebElement getTitleTextBox() {
		return titleTextBox;
	}

	public WebElement getDepartmentTextBox() {
		return departmentTextBox;
	}

	public WebElement getEmailTextBox() {
		return emailTextBox;
	}

	public WebElement getAssistantTextBox() {
		return assistantTextBox;
	}

	public WebElement getAssistantPhoneTextBox() {
		return assistantPhoneTextBox;
	}

	public WebElement getEmailoptoutCheckBox() {
		return emailoptoutCheckBox;
	}

	public WebElement getReferenceCheckBox() {
		return referenceCheckBox;
	}

	public WebElement getNotify_ownerCheckBox() {
		return notify_ownerCheckBox;
	}

	public WebElement getOfficePhoneTextBox() {
		return officePhoneTextBox;
	}

	public WebElement getMobileTextBox() {
		return mobileTextBox;
	}

	public WebElement getHomephoneTextBox() {
		return homephoneTextBox;
	}

	public WebElement getOtherphoneTextBox() {
		return otherphoneTextBox;
	}

	public WebElement getFaxTextBox() {
		return faxTextBox;
	}

	public WebElement getBirthdayTableTextBox() {
		return birthdayTableTextBox;
	}

	public WebElement getBirthdayFieldTextBox() {
		return birthdayFieldTextBox;
	}

	public WebElement getReportsToLookUpImage() {
		return reportsToLookUpImage;
	}

	public WebElement getReportsToContactsSearchTextBox() {
		return reportsToContactsSearchTextBox;
	}

	public WebElement getReportsToContactsSearchButton() {
		return reportsToContactsSearchButton;
	}

	public WebElement getSecondaryEmailTextBox() {
		return secondaryEmailTextBox;
	}

	public WebElement getDonotcallCheckBox() {
		return donotcallCheckBox;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}
}
