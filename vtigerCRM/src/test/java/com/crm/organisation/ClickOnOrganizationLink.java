package com.crm.organisation;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.crm.genericutility.BaseClass;
import com.crm.genericutility.ListenerUtility;
import com.crm.objectRepositiory.HomePage;

@Listeners(ListenerUtility.class)
public class ClickOnOrganizationLink extends BaseClass {
	
	/**
	 * 
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */

	@Test
	public void clickOnOrganizationLink() throws EncryptedDocumentException, IOException {
		// Created object for homepage
		homepage = new HomePage(driver);
		// fetched data from excel sheet and stored it in a variable named expectedTitle
		String expectedTitle = eutils.getStringDataFromExcel("Sheet1", 2, 0);
		
		// clicked on organization link
		homepage.getOrganizationsLink().click();
		test.log(Status.PASS, "Clicked on organization link");
		
		// adding assert condition to check whether fetched and expected title both are equal or not.
		Assert.assertEquals(driver.getTitle(), expectedTitle , "Organizations page not displayed...");
		// if passed the same message will be displayed in the extent report.
		test.log(Status.PASS, "Organizations page displayed");
	}
}
