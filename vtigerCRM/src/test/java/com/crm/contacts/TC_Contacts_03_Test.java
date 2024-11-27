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

		homepage = new HomePage(driver);
		homepage.getContactsLink().click();
		test.log(Status.PASS, "Clicked on Contacts Link");

		contactpage = new ContactsPage(driver);
		contactpage.getCreateContactLookUpImage().click();
		test.log(Status.PASS, "Clicked on Contacts Lookup icon");

		newcontact = new CreateNewContactsPage(driver);
		newcontact.getLastNameTextBox().sendKeys(lastName);
		newcontact.getAssistantPhoneTextBox().sendKeys(assistPhone);
		newcontact.getOfficePhoneTextBox().sendKeys(offcPhone);
		newcontact.getMobileTextBox().sendKeys(mob);
		newcontact.getHomephoneTextBox().sendKeys(homPhone);
		newcontact.getOtherphoneTextBox().sendKeys(othPhone);
		newcontact.getSaveButton().click();
		test.log(Status.PASS, "FIlled all the numeric related data and clicked on save button");
		
		contactinfo = new ContactInfoPage(driver);
		String captureHeader = contactinfo.captureContactHeader();
		
		Assert.assertTrue(captureHeader.contains(lastName), "capture header contains lastname");
		test.log(Status.PASS, "Contact with dropdown verified");	
	}
}
