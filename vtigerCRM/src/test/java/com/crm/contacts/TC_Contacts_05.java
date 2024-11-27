package com.crm.contacts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.genericutility.BaseClass;
import com.crm.genericutility.ListenerUtility;
import com.crm.objectRepositiory.ContactsPage;
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
		
		

//		System.out.println(prefix);
//		System.out.println(lastName);
//		System.out.println(leadSource);
		
		
	}
}
