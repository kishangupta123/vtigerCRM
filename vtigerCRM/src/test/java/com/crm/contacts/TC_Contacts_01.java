package com.crm.contacts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.crm.genericutility.BaseClass;
import com.crm.genericutility.ListenerUtility;
import com.crm.objectRepositiory.ContactInfoPage;
import com.crm.objectRepositiory.ContactsPage;
import com.crm.objectRepositiory.CreateNewContactsPage;
import com.crm.objectRepositiory.HomePage;

@Listeners(ListenerUtility.class)
public class TC_Contacts_01 extends BaseClass{
	/**
	 * 
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	@Test
	public void createContact() throws EncryptedDocumentException, IOException {
		// created object for home page
		homepage = new HomePage(driver);
		// clicked on contacts link present on the home page.
		homepage.getContactsLink().click();
		// The same message will be printed on extentReports
		test.log(Status.PASS, "Clicked on contacts link");
		
		// created an object for Contact page 
		contactpage = new ContactsPage(driver);
		// clicked on CreateContact icon 
		contactpage.getCreateContactLookUpImage().click();
		test.log(Status.PASS, "Clicked on create new Contacts...");
		
		// created on object for newcontact page
		newcontact = new CreateNewContactsPage(driver);
		// fetched data from excel file and stored in a local variable name
		String name = eutils.getStringDataFromExcel("ContactsTestData", 1, 3);
		// in the lastname textfield sent the desired data
		newcontact.getLastNameTextBox().sendKeys(name);
		// clicked on save button
		newcontact.getSaveButton().click();
		test.log(Status.PASS, "Clicked on save button");
		
		// created an object for contactinfo page
		contactinfo = new ContactInfoPage(driver);
		// captured contactHeader in string format
		String contactHeader = contactinfo.captureContactHeader();
		// verifying if expected and actual output is same or not
		Assert.assertTrue(contactHeader.contains(name), "Contact Header contains Last Name");
		test.log(Status.PASS, "User is able to create contact");
	}
}
