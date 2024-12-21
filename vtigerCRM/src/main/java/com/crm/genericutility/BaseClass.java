package com.crm.genericutility;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.crm.objectRepositiory.CalendarPopUp;
import com.crm.objectRepositiory.ContactInfoPage;
import com.crm.objectRepositiory.ContactsPage;
import com.crm.objectRepositiory.CreateNewContactsPage;
import com.crm.objectRepositiory.CreateNewOrganizationPage;
import com.crm.objectRepositiory.HomePage;
import com.crm.objectRepositiory.LoginPage;
import com.crm.objectRepositiory.OrganizationInfoPage;
import com.crm.objectRepositiory.OrganizationPage;

/**
 * @author Kishan Kumar Gupta
 */
public class BaseClass {

	/**
	 * This is used to make global variable so that we can use it anywhere
	 * throughout the project
	 */
	public static ExtentReports extentReports;
	public static ExtentTest test;
	public ExtentTest stest;

	public WebDriver driver;
	public static WebDriver sdriver;

	public ExcelUtility eutils = new ExcelUtility();
	public FIleUtility futils = new FIleUtility();
	public JavaUtility jutils = new JavaUtility();
	public WebDriverUtility wutils = new WebDriverUtility();

	public LoginPage loginpage;
	public HomePage homepage;
	public ContactsPage contactpage;
	public CreateNewContactsPage newcontact;
	public CreateNewOrganizationPage createorganizationpage;
	public OrganizationPage organizationpage;
	public ContactInfoPage contactinfo;
	public OrganizationInfoPage organizationinfo;
	public CalendarPopUp calendarPopUp;

	@BeforeSuite
	public void reportConfig() {
		ExtentSparkReporter spark = new ExtentSparkReporter(
				"./HTML_Reports/ExtenReport_" + jutils.getJavaSystemTime() + ".html");
		extentReports = new ExtentReports();
		extentReports.attachReporter(spark);
	}

	@Parameters("Browser")
	@BeforeClass
	public void launchBrowser(@Optional("chrome") String browserName) throws IOException {
		if (browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else {
			Reporter.log("Invlaid browser required");
		}

		driver.manage().window().maximize();
		sdriver = driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get(futils.getDataFromProperty("url"));
	}
	
	
	@BeforeMethod
	public void login() throws IOException {
		loginpage = new LoginPage(driver);
		loginpage.getUserName().sendKeys(futils.getDataFromProperty("username"));
		loginpage.getUserPassword().sendKeys(futils.getDataFromProperty("password"));
		loginpage.getLoginButton().click();
	}
	
	@AfterMethod
	public void logout() {
		homepage = new HomePage(driver);
		wutils.mouseHoverAction(driver,homepage.getAdministratorImage());
//		homepage.getAdministratorImage().click();
		homepage.getSignoutLink().click();
		
	}

	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}

	@AfterSuite
	public void reportBackUp() {
		extentReports.flush();
	}
}
