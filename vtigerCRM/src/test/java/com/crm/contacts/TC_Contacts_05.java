package com.crm.contacts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.genericutility.BaseClass;
import com.crm.genericutility.ListenerUtility;
import com.crm.objectRepositiory.ContactInfoPage;
import com.crm.objectRepositiory.ContactsPage;
import com.crm.objectRepositiory.CreateNewContactsPage;
import com.crm.objectRepositiory.CreateOrganizationPage;
import com.crm.objectRepositiory.HomePage;

@Listeners(ListenerUtility.class)
public class TC_Contacts_05 extends BaseClass {

	@Test
	public void createNewContactWithDropDown() throws EncryptedDocumentException, IOException {
		String prefix = eutils.getStringDataFromExcel("ContactsTestData", 31, 3);
		String lastName = eutils.getStringDataFromExcel("ContactsTestData", 32, 3);
		String leadSource = eutils.getStringDataFromExcel("ContactsTestData", 33, 3);
		Reporter.log("Read data from excel file");
		
		homepage = new HomePage(driver);
		homepage.getContactsLink().click();
		Reporter.log("Clicked on Contacts Link");
		
		
		contactpage = new ContactsPage(driver);
		contactpage.getCreateContactLookUpImage().click();
		Reporter.log("Clicked on Create Contact Look up icon");
		

		newcontact = new CreateNewContactsPage(driver);
		newcontact.createNewContactsWithDropDown(lastName, leadSource, prefix);
		Reporter.log("Contact with dropdown list have been created");
		
		
		contactinfo = new ContactInfoPage(driver);
		String captureHeader = contactinfo.captureContactHeader();
		
		Assert.assertTrue(captureHeader.contains(lastName), "capture header contains lastname");
		Reporter.log("Contact with dropdown verified");
//		System.out.println(prefix);
//		System.out.println(lastName);
//		System.out.println(leadSource);
		
		
	}
}
