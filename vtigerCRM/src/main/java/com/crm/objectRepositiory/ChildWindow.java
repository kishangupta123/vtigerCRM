package com.crm.objectRepositiory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChildWindow {
@FindBy(xpath  = "//a[contains(.,'Amazon')]")
private WebElement organizationName;

@FindBy(xpath = "//td[contains(@id,'mouseArea_Organization Name')]")
private WebElement orgName;

public ChildWindow(WebDriver driver) {
	PageFactory.initElements(driver, this);
	
}

/**
 * @return the organizationName
 */
public WebElement getOrganizationName() {
	return organizationName;
}

/**
 * @return the orgName
 */
public WebElement getOrgName() {
	return orgName;
}


}
