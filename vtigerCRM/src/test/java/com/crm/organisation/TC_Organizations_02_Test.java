package com.crm.organisation;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.crm.genericutility.BaseClass;
import com.crm.genericutility.ListenerUtility;
import com.crm.objectRepositiory.CreateNewOrganizationPage;
import com.crm.objectRepositiory.HomePage;
import com.crm.objectRepositiory.OrganizationInfoPage;
import com.crm.objectRepositiory.OrganizationPage;

@Listeners(ListenerUtility.class)
public class TC_Organizations_02_Test extends BaseClass {
	@Test
	public void createNewOrganizationWithDropDown() throws EncryptedDocumentException, IOException {
		String organizationName = eutils.getStringDataFromExcel("OrganizationTestData", 5, 3);
		String industry = eutils.getStringDataFromExcel("OrganizationTestData", 6, 3);
		String type = eutils.getStringDataFromExcel("OrganizationTestData", 7, 3);
		String rating = eutils.getStringDataFromExcel("OrganizationTestData", 8, 3);
		test.log(Status.PASS, "Read data from excel file");
		
		homepage = new HomePage(driver);
		homepage.getOrganizationsLink().click();
		test.log(Status.PASS, "Clicked on Organization Link");
		
		organizationpage = new OrganizationPage(driver);
		organizationpage.getCreateOrganizations().click();
		test.log(Status.PASS, "Clicked on create Organization lookup icon");
		
		createorganizationpage = new CreateNewOrganizationPage(driver);
		createorganizationpage.createNewOrganizationsWithDropDown(organizationName + jutils.getRandomNumber(), industry, type, rating);
		test.log(Status.PASS, "Organiaztions with dropdown list have been created");
	
		organizationinfo = new OrganizationInfoPage(driver);
		String organizationHeader = organizationinfo.captureContactHeader();
		
		Assert.assertTrue(organizationHeader.contains(organizationName), "captured header contains organization name");
		test.log(Status.PASS, "Organization with dropdown has been created...");
	}
}
