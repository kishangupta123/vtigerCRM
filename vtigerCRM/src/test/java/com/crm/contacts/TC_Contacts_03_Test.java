package com.crm.contacts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.crm.genericutility.BaseClass;
import com.crm.genericutility.ListenerUtility;
import com.crm.objectRepositiory.ContactInfoPage;
import com.crm.objectRepositiory.ContactsPage;
import com.crm.objectRepositiory.CreateNewContactsPage;
import com.crm.objectRepositiory.HomePage;

/**
 * The main objective is to create a program to make sure that if provided only
 * the numeric data for all the text field, we will check if it is created or
 * not.
 */

@Listeners(ListenerUtility.class)
public class TC_Contacts_03_Test extends BaseClass {
	/**
	 * 
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	@Test(groups = "System")
	public void createNewContactWithNumericData() throws EncryptedDocumentException, IOException {
		String lastName = eutils.getStringDataFromExcel("ContactsTestData", 16, 3);

		double assitantPhone = eutils.getNumericDataFromExcel("ContactsTestData", 17, 3);
		String assistPhone = String.valueOf(assitantPhone);

		double officePhone = eutils.getNumericDataFromExcel("ContactsTestData", 18, 3);
		String offcPhone = String.valueOf(officePhone);

		double mobile = eutils.getNumericDataFromExcel("ContactsTestData", 19, 3);
		String mob = String.valueOf(mobile);

		double homePhone = eutils.getNumericDataFromExcel("ContactsTestData", 20, 3);
		String homPhone = String.valueOf(homePhone);
		double otherPhone = eutils.getNumericDataFromExcel("ContactsTestData", 21, 3);
		String othPhone = String.valueOf(otherPhone);
		test.log(Status.PASS, "Read data from excel file");

		// Created an instance for HOMEPAGE
		homepage = new HomePage(driver);
		// Clicked on the contact link 
		homepage.getContactsLink().click();
		// Message to be printed on the extent report
		test.log(Status.PASS, "Clicked on Contacts Link");

		// Created an instance for CONTACTPAGE
		contactpage = new ContactsPage(driver);
		// Clicked on CREATECONTACTLOOKUPICON
		contactpage.getCreateContactLookUpImage().click();
		// Message to be printed on the extent report
		test.log(Status.PASS, "Clicked on Contacts Lookup icon");

		// Created an instance for CREATENEWCONTACT
		newcontact = new CreateNewContactsPage(driver);
		// injecting data to the desired text field
		newcontact.getLastNameTextBox().sendKeys(lastName);
		newcontact.getAssistantPhoneTextBox().sendKeys(assistPhone);
		newcontact.getOfficePhoneTextBox().sendKeys(offcPhone);
		newcontact.getMobileTextBox().sendKeys(mob);
		newcontact.getHomephoneTextBox().sendKeys(homPhone);
		newcontact.getOtherphoneTextBox().sendKeys(othPhone);
		// Clicked on save button
		newcontact.getSaveButton().click();
		// Message to be printed on the extent report
		test.log(Status.PASS, "FIlled all the numeric related data and clicked on save button");
		
		contactinfo = new ContactInfoPage(driver);
		String captureHeader = contactinfo.captureContactHeader();
		
		// Checking if the captured text is containing same lastname or not
		Assert.assertTrue(captureHeader.contains(lastName), "capture header contains lastname");
		// Message to be printed on the extent report
		test.log(Status.PASS, "Contact with dropdown verified");	
	}
}
