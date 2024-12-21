package com.crm.contacts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.crm.genericutility.BaseClass;
import com.crm.genericutility.ListenerUtility;
import com.crm.objectRepositiory.CalendarPopUp;
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
	}
}
