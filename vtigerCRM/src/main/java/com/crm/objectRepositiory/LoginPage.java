package com.crm.objectRepositiory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * @author Kishan Kumar Gupta
 */

public class LoginPage {
	@FindBy(name="user_name")
	private WebElement userName;
	
	@FindBy(name="user_password")
	private WebElement userPassword;
	
	@FindBy(id="submitButton")
	private WebElement loginButton;
	
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


	/**
	 * @return the userName
	 */
	public WebElement getUserName() {
		return userName;
	}


	/**
	 * @return the userPassword
	 */
	public WebElement getUserPassword() {
		return userPassword;
	}


	/**
	 * @return the loginButton
	 */
	public WebElement getLoginButton() {
		return loginButton;
	}
	
	
}
