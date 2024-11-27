package com.crm.contacts;

import java.io.IOException;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.crm.genericutility.BaseClass;
import com.crm.genericutility.ListenerUtility;
import com.crm.objectRepositiory.ChildWindow;
import com.crm.objectRepositiory.ContactInfoPage;
import com.crm.objectRepositiory.ContactsPage;
import com.crm.objectRepositiory.CreateNewContactsPage;
import com.crm.objectRepositiory.HomePage;

@Listeners(ListenerUtility.class)

public class TC_Contacts_04_Test extends BaseClass {
	@Test
	public void handleChildWindow() throws EncryptedDocumentException, IOException {
		String lastName = eutils.getStringDataFromExcel("ContactsTestData", 25, 3);
		String organizationName = eutils.getStringDataFromExcel("ContactsTestData", 26, 3);
		String reportTo = eutils.getStringDataFromExcel("ContactsTestData", 27, 3);

		homepage = new HomePage(driver);
		homepage.getContactsLink().click();
		test.log(Status.PASS, "Clicked on contact link");

		contactpage = new ContactsPage(driver);
		contactpage.getCreateContactLookUpImage().click();
		test.log(Status.PASS, "Clicked on create contact link");

		newcontact = new CreateNewContactsPage(driver);
		newcontact.getLastNameTextBox().sendKeys(lastName);
		// Get parent Window Handle
		String parentWindowHandle = driver.getWindowHandle();
		newcontact.getOrganizationLookUpImage().click();
		test.log(Status.PASS, "Clicked on organization lookup icon");

		// Get all window handles
		Set<String> windowHandles = driver.getWindowHandles();

		// Switch to the child window
		for (String handle : windowHandles) {
			if (!handle.equals(parentWindowHandle)) {
				driver.switchTo().window(handle);
				break;
			}
		}
//		driver.findElement(By.linkText("Amazon61")).click();
		ChildWindow ch = new ChildWindow(driver);
		ch.getOrganizationName().click();
		test.log(Status.PASS, "Clicked on Amazon61 link in child window");

		driver.switchTo().window(parentWindowHandle);
		test.log(Status.PASS, "Switched back to parent handle");

		newcontact.getSaveButton().click();
		
		String organizationname = ch.getOrgName().getText();
		Assert.assertNotNull(organizationname);
		
		test.log(Status.PASS, "Contact is creatred with organization page " + organizationname);

		// created an object for contactinfo page
		contactinfo = new ContactInfoPage(driver);
		// captured contactHeader in string format
		String contactHeader = contactinfo.captureContactHeader();
		// verifying if expected and actual output is same or not
		Assert.assertTrue(contactHeader.contains(lastName), "Contact Header contains Last Name");
		test.log(Status.PASS, "User is able to create contact");
	}
}
