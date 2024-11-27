package com.crm.organisation;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.crm.genericutility.BaseClass;
import com.crm.genericutility.ListenerUtility;
import com.crm.objectRepositiory.CreateNewOrganizationPage;
import com.crm.objectRepositiory.HomePage;
import com.crm.objectRepositiory.OrganizationInfoPage;
import com.crm.objectRepositiory.OrganizationPage;

@Listeners(ListenerUtility.class)
public class TC_Organizations_01_Test extends BaseClass {
	/**
	 * 
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
		
	@Test(groups = "smoke")
	public void createOrganization() throws EncryptedDocumentException, IOException {
		// created object for home page
		homepage = new HomePage(driver);
		// clicked on organization link present on the home page.
		homepage.getOrganizationsLink().click();
		// The same message will be printed on extentReports
		test.log(Status.PASS, "Clicked on organizations link");
		
		// created an object for Organization page 
		organizationpage = new OrganizationPage(driver);
		// clicked on Createorganization icon 
		organizationpage.getCreateOrganizations().click();
		test.log(Status.PASS, "Clicked on new Organizations");
		
		// created on object for newOrganization page
		createorganizationpage = new CreateNewOrganizationPage(driver);
		// checking if actual page is displayed or not
		Assert.assertTrue(createorganizationpage.getOrganizationName().isDisplayed(), "Create organization page is not displayed");
		// fetched data from excel file and stored in a local variable name
		String orgnaizationName = eutils.getStringDataFromExcel("OrganizationTestData", 1, 3) + jutils.getRandomNumber();
		// in the lastname textfield sent the desired data
		createorganizationpage.getOrganizationName().sendKeys(orgnaizationName);
		// clicked on save button
		createorganizationpage.getSaveButton().click();
		test.log(Status.PASS, "Clicked on save button");
		
		// created an object for organizationinfo page
		organizationinfo = new OrganizationInfoPage(driver);
		// captured organizationHeader in string format
		String organiztionHeader = organizationinfo.getOrganizationHeaderText().getText();
		// verifying if expected and actual output is same or not
		Assert.assertTrue(organiztionHeader.contains(orgnaizationName), "Organization name contains desired name");
		Reporter.log("Organization page created");
	}
}
