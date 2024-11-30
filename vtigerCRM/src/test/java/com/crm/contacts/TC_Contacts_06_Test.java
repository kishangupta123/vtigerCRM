package com.crm.contacts;

import java.io.IOException;
import java.time.LocalDateTime;

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
public class TC_Contacts_06_Test extends BaseClass {
	@Test
	public void createContactWithCheckBoxAndBirthdayDetails() throws EncryptedDocumentException, IOException {
		String lastName = eutils.getStringDataFromExcel("ContactsTestData", 37, 3);
		LocalDateTime birthday = eutils.getDateFromExcel("ContactsTestData", 38, 3);
		int date = birthday.getDayOfMonth();
		int month = birthday.getMonthValue();
		int year = birthday.getYear();
		
		String actualbirthdate = year + "-0" + month + "-" + date;
		test.log(Status.PASS, "Read data from Excel file");

		homepage = new HomePage(driver);
		homepage.getContactsLink().click();
		test.log(Status.PASS, "Clicked on contact link"); 

		contactpage = new ContactsPage(driver);
		contactpage.getCreateContactLookUpImage().click();
		test.log(Status.PASS, "Clicked on create contact lookup icon");

		newcontact = new CreateNewContactsPage(driver);
		newcontact.getLastNameTextBox().sendKeys(lastName);
		newcontact.getBirthdayFieldTextBox().sendKeys(actualbirthdate);
		newcontact.getSaveButton().click();
		test.log(Status.PASS, "Added details to the required text field and clicked on save button");
		
		contactinfo = new ContactInfoPage(driver);
		String birthdate = contactinfo.getBirthdate().getText().trim();
		System.out.println(actualbirthdate);
		System.out.println(birthdate);
		Assert.assertTrue(birthdate.contentEquals(actualbirthdate), "Bithdate verified");
		test.log(Status.PASS,"User created and verified the details using dob");
	}
}
