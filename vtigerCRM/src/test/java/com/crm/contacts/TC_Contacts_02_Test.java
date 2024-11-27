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

@Listeners(ListenerUtility.class)
public class TC_Contacts_02_Test extends BaseClass{
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
		
		homepage = new HomePage(driver);
		homepage.getContactsLink().click();
		test.log(Status.PASS, "Clicked on contact link");
		
		contactpage = new ContactsPage(driver);
		contactpage.getCreateContactLookUpImage().click();
		test.log(Status.PASS, "Clicked on Contacts lookup icon");
		
		newcontact = new CreateNewContactsPage(driver);
		newcontact.getFirstNameTextBox().sendKeys(firstName);
		newcontact.getLastNameTextBox().sendKeys(lastName);
		newcontact.getTitleTextBox().sendKeys(title);
		newcontact.getDepartmentTextBox().sendKeys(department);
		newcontact.getEmailTextBox().sendKeys(email);
		newcontact.getAssistantTextBox().sendKeys(assistant);
		newcontact.getSecondaryEmailTextBox().sendKeys(secondaryEmail);
		newcontact.getSaveButton().click();
		test.log(Status.PASS, "Filled all the string related data and clicked on save button");
		
		contactinfo = new ContactInfoPage(driver);
		String captureHeader = contactinfo.captureContactHeader();
		
		Assert.assertTrue(captureHeader.contains(lastName), "capture header contains lastname");
		test.log(Status.PASS, "Contact with dropdown verified");	
	}
}
