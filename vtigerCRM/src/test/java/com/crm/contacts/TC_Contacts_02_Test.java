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
 * the string data for all the text field, we will check if it is created or
 * not.
 */

@Listeners(ListenerUtility.class)
public class TC_Contacts_02_Test extends BaseClass {
	/**
	 * 
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	@Test(groups = "System")
	public void createNewAccountWithStringDetails() throws EncryptedDocumentException, IOException {
		String firstName = eutils.getStringDataFromExcel("ContactsTestData", 4, 3);
		String lastName = eutils.getStringDataFromExcel("ContactsTestData", 5, 3);
		String title = eutils.getStringDataFromExcel("ContactsTestData", 6, 3);
		String department = eutils.getStringDataFromExcel("ContactsTestData", 7, 3);
		String email = eutils.getStringDataFromExcel("ContactsTestData", 8, 3);
		String assistant = eutils.getStringDataFromExcel("ContactsTestData", 9, 3);
		String secondaryEmail = eutils.getStringDataFromExcel("ContactsTestData", 11, 3);
		test.log(Status.PASS, "Read data from Excel");

		// Created an instance for HOMEPAGE
		homepage = new HomePage(driver);
		// Clicked on the contact link 
		homepage.getContactsLink().click();
		// Message to be printed on the extent report
		test.log(Status.PASS, "Clicked on contact link");

		// Created an instance for CONTACTPAGE
		contactpage = new ContactsPage(driver);
		// Clicked on CREATECONTACTLOOKUPICON
		contactpage.getCreateContactLookUpImage().click();
		// Message to be printed on the extent report
		test.log(Status.PASS, "Clicked on Contacts lookup icon");

		// Created an instance for CREATENEWCONTACT
		newcontact = new CreateNewContactsPage(driver);
		// injecting data to the desired text field
		newcontact.getFirstNameTextBox().sendKeys(firstName);
		newcontact.getLastNameTextBox().sendKeys(lastName);
		newcontact.getTitleTextBox().sendKeys(title);
		newcontact.getDepartmentTextBox().sendKeys(department);
		newcontact.getEmailTextBox().sendKeys(email);
		newcontact.getAssistantTextBox().sendKeys(assistant);
		newcontact.getSecondaryEmailTextBox().sendKeys(secondaryEmail);
		// Clicked on save button
		newcontact.getSaveButton().click();
		// Message to be printed on the extent report
		test.log(Status.PASS, "Filled all the string related data and clicked on save button");

		contactinfo = new ContactInfoPage(driver);
		String captureHeader = contactinfo.captureContactHeader();

		// Checking if the captured text is containing same lastname or not
		Assert.assertTrue(captureHeader.contains(lastName), "capture header contains lastname");
		// Message to be printed on the extent report
		test.log(Status.PASS, "Contact with dropdown verified");
	}
}
