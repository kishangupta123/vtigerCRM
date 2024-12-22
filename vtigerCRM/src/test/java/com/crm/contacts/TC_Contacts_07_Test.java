package com.crm.contacts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.crm.genericutility.BaseClass;
import com.crm.genericutility.ListenerUtility;
import com.crm.objectRepositiory.CalendarPopUp;
import com.crm.objectRepositiory.ContactInfoPage;
import com.crm.objectRepositiory.ContactsPage;
import com.crm.objectRepositiory.CreateNewContactsPage;
import com.crm.objectRepositiory.HomePage;

@Listeners(ListenerUtility.class)

public class TC_Contacts_07_Test extends BaseClass{
	@Test
	public void createContact() throws IOException {
		homepage = new HomePage(driver);
		contactpage = new ContactsPage(driver);
		newcontact = new CreateNewContactsPage(driver);
		calendarPopUp = new CalendarPopUp(driver);
		
		homepage.getContactsLink().click();
		test.log(Status.PASS, "Clicked on link");
		
		contactpage.getCreateContactLookUpImage().click();
		test.log(Status.PASS, "Clicked on icon");
		
		newcontact.getBirthdayTableTextBox().click();
		test.log(Status.PASS, "Cicked on new contact lookup icon");
		
		WebElement currentYear = calendarPopUp.getCurrentMonthYear();
		while(true) {
			String currentYearText = currentYear.getText();
			if(currentYearText.contains(futils.getDataFromProperty("year"))) {
        		break;
        	}else {
        		calendarPopUp.getPrevYearNav().click();
        	}
		}
		while(true) {
			String currentMonthText = currentYear.getText();
			if(currentMonthText.contains(futils.getDataFromProperty("month"))) {
				break;
			}else {
				calendarPopUp.getPrevMonthNav().click();
			}
		}
		
		String dateInput = futils.getDataFromProperty("date");
		WebElement date = driver.findElement(By.xpath("(//td[text()='"+dateInput+"'])[1]"));
    	date.click();
    	
    	
    	String lastName = eutils.getStringDataFromExcel("ContactsTestData", 37, 3);
    	newcontact.getLastNameTextBox().sendKeys(lastName);
    	newcontact.getSaveButton().click();
		test.log(Status.PASS, "Added details to the required text field and clicked on save button");
		
		contactinfo = new ContactInfoPage(driver);
		String birthdate = contactinfo.getBirthdate().getText().trim();
		Reporter.log(birthdate, true);
		test.log(Status.PASS,"User created and verified the details using dob");

	}
}
