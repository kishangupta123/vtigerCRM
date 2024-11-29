package com.crm.contacts;

import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.crm.genericutility.BaseClass;
import com.crm.genericutility.ListenerUtility;
import com.crm.objectRepositiory.ContactsPage;
import com.crm.objectRepositiory.CreateNewContactsPage;
import com.crm.objectRepositiory.HomePage;

@Listeners(ListenerUtility.class)
public class TC_Contacts_06_Test extends BaseClass{
	@Test
	public void createContactWithCheckBoxAndBirthdayDetails() throws EncryptedDocumentException, IOException {
		String lastName = eutils.getStringDataFromExcel("ContactsTestData", 37, 3);
		String birthday = eutils.getStringDataFromExcel("ContactsTestData", 38, 3);
		test.log(Status.PASS, "Read data from Excel file");
		
		homepage = new HomePage(driver);
		homepage.getContactsLink().click();
		test.log(Status.PASS, "Clicked on contact link");
		
		contactpage = new ContactsPage(driver);
		contactpage.getCreateContactLookUpImage().click();
		test.log(Status.PASS, "Clicked on create contact lookup icon");
		
		newcontact = new CreateNewContactsPage(driver);
		newcontact.getLastNameTextBox().sendKeys(lastName);
		newcontact.getBirthdayFieldTextBox().sendKeys(birthday);
	}
}
