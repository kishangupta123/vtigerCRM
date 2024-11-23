package com.crm.objectRepositiory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateOrganizationPage {

	@FindBy(xpath = "//input[@name='accountname']")
	private WebElement organizationName;

	@FindBy(xpath = "//input[contains(@name,'website')]")
	private WebElement website;

	@FindBy(xpath = "//input[@name='tickersymbol']")
	private WebElement tickerSymbol;

	@FindBy(xpath = "//img[@alt='Select']")
	private WebElement memberOf;

	@FindBy(id = "employees")
	private WebElement employees;

	@FindBy(id = "email2")
	private WebElement otherEmail;

	@FindBy(xpath = "//select[@name='industry']")
	private WebElement industryDropDown;

	@FindBy(xpath = "//select[@name='accounttype']")
	private WebElement typeDropDown;

	@FindBy(name = "emailoptout")
	private WebElement emailOptOutCheckBox;

	@FindBy(xpath = "//input[@name='phone']")
	private WebElement phoneTextField;
	
	@FindBy(xpath = "//input[@name='fax']")
	private WebElement faxTextField;
	
	@FindBy(xpath = "//input[@id='otherphone']")
	private WebElement otherPhoneTextField;
	
	@FindBy(xpath = "//input[contains(@id,'email1')]")
	private WebElement email1TextField;
	
	@FindBy(xpath = "//input[@name='ownership']")
	private WebElement ownerShipTextField;
	
	@FindBy(xpath = "//select[@name='rating']")
	private WebElement ratingDropDown;
	
	@FindBy(id = "siccode")
	private WebElement sicCodeTextField;
	
	@FindBy(name = "annual_revenue")
	private WebElement annualRevenueTextField;
	
	@FindBy(name = "notify_owner")
	private WebElement notifyOwnerCheckBox;
	
	@FindBy(name = "bill_street")
	private WebElement billingAdressTextBox;
	
	@FindBy(id = "bill_pobox")
	private WebElement billingPOBoxTextField;
	
	@FindBy(id = "bill_city")
	private WebElement billingCityTextField;
	
	@FindBy(id = "bill_state")
	private WebElement billingStateTextField;
	
	@FindBy(id = "bill_code")
	private WebElement billingPostalCodeTextField;
	
	@FindBy(id = "bill_country")
	private WebElement billingCountryTextField;
	
	@FindBy(name = "ship_street")
	private WebElement shippingAdressTextBox;
	
	@FindBy(id = "ship_pobox")
	private WebElement shippingPOBoxTextField;
	
	@FindBy(id = "ship_city")
	private WebElement shippingCityTextField;
	
	@FindBy(id = "ship_state")
	private WebElement shippingStateTextField;
	
	@FindBy(id = "ship_code")
	private WebElement shippingPostalCodeTextField;
	
	@FindBy(id = "ship_country")
	private WebElement shippingCountryTextField;
	
	@FindBy(name = "description")
	private WebElement descriptionTexBox;
	
	@FindBy(xpath = "(//*[contains(@value,'Save')])[2]")
	private WebElement saveButton;
	
	@FindBy(xpath = "(//input[contains(@value,'Cancel')])[2]")
	private WebElement cancelButton;
	
	public CreateOrganizationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	/**
	 * @return the organizationName
	 */
	public WebElement getOrganizationName() {
		return organizationName;
	}

	/**
	 * @return the website
	 */
	public WebElement getWebsite() {
		return website;
	}

	/**
	 * @return the tickerSymbol
	 */
	public WebElement getTickerSymbol() {
		return tickerSymbol;
	}

	/**
	 * @return the memberOf
	 */
	public WebElement getMemberOf() {
		return memberOf;
	}

	/**
	 * @return the employees
	 */
	public WebElement getEmployees() {
		return employees;
	}

	/**
	 * @return the otherEmail
	 */
	public WebElement getOtherEmail() {
		return otherEmail;
	}

	/**
	 * @return the industryDropDown
	 */
	public WebElement getIndustryDropDown() {
		return industryDropDown;
	}

	/**
	 * @return the typeDropDown
	 */
	public WebElement getTypeDropDown() {
		return typeDropDown;
	}

	/**
	 * @return the emailOptOutCheckBox
	 */
	public WebElement getEmailOptOutCheckBox() {
		return emailOptOutCheckBox;
	}

	/**
	 * @return the phoneTextField
	 */
	public WebElement getPhoneTextField() {
		return phoneTextField;
	}

	/**
	 * @return the faxTextField
	 */
	public WebElement getFaxTextField() {
		return faxTextField;
	}

	/**
	 * @return the otherPhoneTextField
	 */
	public WebElement getOtherPhoneTextField() {
		return otherPhoneTextField;
	}

	/**
	 * @return the email1TextField
	 */
	public WebElement getEmail1TextField() {
		return email1TextField;
	}

	/**
	 * @return the ownerShipTextField
	 */
	public WebElement getOwnerShipTextField() {
		return ownerShipTextField;
	}

	/**
	 * @return the ratingDropDown
	 */
	public WebElement getRatingDropDown() {
		return ratingDropDown;
	}

	/**
	 * @return the sicCodeTextField
	 */
	public WebElement getSicCodeTextField() {
		return sicCodeTextField;
	}

	/**
	 * @return the annualRevenueTextField
	 */
	public WebElement getAnnualRevenueTextField() {
		return annualRevenueTextField;
	}

	/**
	 * @return the notifyOwnerCheckBox
	 */
	public WebElement getNotifyOwnerCheckBox() {
		return notifyOwnerCheckBox;
	}

	/**
	 * @return the billingAdressTextBox
	 */
	public WebElement getBillingAdressTextBox() {
		return billingAdressTextBox;
	}

	/**
	 * @return the billingPOBoxTextField
	 */
	public WebElement getBillingPOBoxTextField() {
		return billingPOBoxTextField;
	}

	/**
	 * @return the billingCityTextField
	 */
	public WebElement getBillingCityTextField() {
		return billingCityTextField;
	}

	/**
	 * @return the billingStateTextField
	 */
	public WebElement getBillingStateTextField() {
		return billingStateTextField;
	}

	/**
	 * @return the billingPostalCodeTextField
	 */
	public WebElement getBillingPostalCodeTextField() {
		return billingPostalCodeTextField;
	}

	/**
	 * @return the billingCountryTextField
	 */
	public WebElement getBillingCountryTextField() {
		return billingCountryTextField;
	}

	/**
	 * @return the shippingAdressTextBox
	 */
	public WebElement getShippingAdressTextBox() {
		return shippingAdressTextBox;
	}

	/**
	 * @return the shippingPOBoxTextField
	 */
	public WebElement getShippingPOBoxTextField() {
		return shippingPOBoxTextField;
	}

	/**
	 * @return the shippingCityTextField
	 */
	public WebElement getShippingCityTextField() {
		return shippingCityTextField;
	}

	/**
	 * @return the shippingStateTextField
	 */
	public WebElement getShippingStateTextField() {
		return shippingStateTextField;
	}

	/**
	 * @return the shippingPostalCodeTextField
	 */
	public WebElement getShippingPostalCodeTextField() {
		return shippingPostalCodeTextField;
	}

	/**
	 * @return the shippingCountryTextField
	 */
	public WebElement getShippingCountryTextField() {
		return shippingCountryTextField;
	}

	/**
	 * @return the descriptionTexBox
	 */
	public WebElement getDescriptionTexBox() {
		return descriptionTexBox;
	}

	/**
	 * @return the saveButton
	 */
	public WebElement getSaveButton() {
		return saveButton;
	}

	/**
	 * @return the cancelButton
	 */
	public WebElement getCancelButton() {
		return cancelButton;
	}
}
