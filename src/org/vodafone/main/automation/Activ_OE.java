package org.vodafone.main.automation;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.framework.selenium.bean.BFrameworkQueryObjects;
import com.framework.selenium.bean.ByMSafe;
import com.framework.selenium.events.MphasisDriver;
import com.msafe.enumIdentifier.Locators;
import com.relevantcodes.extentreports.LogStatus;

import components.GeneralDispatcher;
import components.GeneralFunction;
import wrappers.Wrappers;



//public class Activ_OE extends General{
public class Activ_OE{

	public WebDriver driver;

	public void activOE(WebDriver webdriver, BFrameworkQueryObjects queryObjects) throws Exception{
		try {
			//this.driver = driver;
			webdriver.manage().deleteAllCookies();
			Thread.sleep(1000);
			convertFirefoxDriver(webdriver);
			this.driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			this.driver.navigate().to(queryObjects.getTestData("URL"));
			this.driver.manage().window().maximize();
			Thread.sleep(4000);
			//*************************TEST OBJECTS***********************************************/
			//*************************Login***********************************************/
			String Login1 = queryObjects.getObject("username").get(Locators.ID);
			String Login2 = queryObjects.getObject("password").get(Locators.ID);
			String Login3 = queryObjects.getObject("login").get(Locators.ID);
			//*************************Order ID***********************************************/
			String ORD1 = queryObjects.getObject("New_btn").get(Locators.CSS_PATH);
			String ORD2 = queryObjects.getObject("Manuelle").get(Locators.ID);
			String ORD3 = queryObjects.getObject("PDO").get(Locators.ID);
			String ORD4 = queryObjects.getObject("Refresh").get(Locators.XPATH);
			String ORD5 = queryObjects.getObject("Radio_Button").get(Locators.XPATH);
			String ORD6 = queryObjects.getObject("Submit_btn").get(Locators.ID);
			//*************************TP Type***********************************************/
			String TP1 = queryObjects.getObject("Technical_Product").get(Locators.ID);
			String TP2 = queryObjects.getObject("TP_Type").get(Locators.ID);
			String TP3 = queryObjects.getObject("Submit_btn").get(Locators.ID);
			//*************************Kerninformationen***********************************************/
			String KI1 = queryObjects.getObject("Order_Sub_Type").get(Locators.ID);
			String KI2 = queryObjects.getObject("Access_Type").get(Locators.ID);
			String KI3 = queryObjects.getObject("Bandwidth").get(Locators.ID);
			String KI4 = queryObjects.getObject("Technical_SLA").get(Locators.ID);
			//*************************Lokation*******************************************************/
			String LO1 = queryObjects.getObject("Single_Location").get(Locators.XPATH);
			String LO2 = queryObjects.getObject("Commercial_Law_Name").get(Locators.ID);
			String LO3 = queryObjects.getObject("House_Number").get(Locators.ID);
			String LO4 = queryObjects.getObject("City").get(Locators.ID);
			String LO5 = queryObjects.getObject("Street").get(Locators.ID);
			String LO6 = queryObjects.getObject("Post_Code").get(Locators.ID);
			//*************************Produktkonfiguration***********************************************/
			String PC1 = queryObjects.getObject("Product_Configuration").get(Locators.XPATH);
			String PC2 = queryObjects.getObject("Ansprechpartner").get(Locators.XPATH);
			String PC3 = queryObjects.getObject("Anrede").get(Locators.XPATH);
			String PC4 = queryObjects.getObject("Nachname").get(Locators.XPATH);
			String PC5 = queryObjects.getObject("Firma").get(Locators.XPATH);
			String PC6 = queryObjects.getObject("Telefon").get(Locators.XPATH);
			String PC7 = queryObjects.getObject("Email").get(Locators.XPATH);
			String PC8 = queryObjects.getObject("Msubmit").get(Locators.ID);
			String PCL1 = queryObjects.getObject("Lokationsinformationen").get(Locators.XPATH);
			String PCL2 = queryObjects.getObject("LageTAE").get(Locators.ID);
			String PCL3 = queryObjects.getObject("ProductSubmit").get(Locators.ID);
			String PCL4 = queryObjects.getObject("InternalCPlink").get(Locators.XPATH);
			//			//*************************Bearbeiten***************************************************/
			String BB1 = queryObjects.getObject("Bearbeiten").get(Locators.XPATH);
			String BB2 = queryObjects.getObject("C_Number").get(Locators.ID);
			String BB3 = queryObjects.getObject("C_Name").get(Locators.ID);
			String BB4 = queryObjects.getObject("Cpdate").get(Locators.ID);
			String BB6 = queryObjects.getObject("CP_Save").get(Locators.CSS_PATH);
			String BB7 = queryObjects.getObject("CP_Close").get(Locators.CSS_PATH);
			String BB8 = queryObjects.getObject("Submit_btn").get(Locators.ID);
			String BB9 = queryObjects.getObject("Closetab").get(Locators.XPATH);
			//*************************Logout **************************************************/
			String LO11 = queryObjects.getObject("Log_Out").get(Locators.XPATH);
			//			String LOG2 = queryObjects.getObject("Log_Out").get(Locators.XPATH);
			//*************************Test Data***********************************************/
			String Username_D = queryObjects.getTestData("User_Name");
			String Password_D = queryObjects.getTestData("Password");
			String ORD_D1 = queryObjects.getTestData("PDO_ID");
			String TP_D = queryObjects.getTestData("TP");
			String TPType_D = queryObjects.getTestData("TP-Type");
			String KI1_D = queryObjects.getTestData("Sub_Type");
			String KI2_D = queryObjects.getTestData("Access");
			String KI3_D = queryObjects.getTestData("Bandwidth");
			String KI4_D = queryObjects.getTestData("SLA");
			String LO2_D = queryObjects.getTestData("Commercial_Law_Name");
			String LO3_D = queryObjects.getTestData("House_Number");
			String LO4_D = queryObjects.getTestData("City");
			String LO5_D = queryObjects.getTestData("Street");
			String LO6_D = queryObjects.getTestData("Post_Code");
			String PC3_D = queryObjects.getTestData("Anrede");
			String PC4_D = queryObjects.getTestData("FirstName");
			String PC5_D = queryObjects.getTestData("LastName");
			String PC6_D = queryObjects.getTestData("Phone");
			String PC7_D = queryObjects.getTestData("Email");
			String PCL2_D = queryObjects.getTestData("Raum_LageTAE");
			String BB2_D = queryObjects.getTestData("Cname");
			String BB3_D = queryObjects.getTestData("Cnumber");
			//*********************************************************************************/
			//Wrappers w1 = new GeneralFunction(driver);
			//w1.switchToLastWindow();


			new GeneralFunction(driver, queryObjects)
			.login1(Login1, Login2, Login3, Username_D, Password_D, queryObjects)
			.selectOrderID(ORD1, ORD2, ORD3, ORD4, ORD5, ORD6, ORD_D1)
			.selectTP(TP1, TP2, TP3, TP_D, TPType_D)
			.EnterKerninformationen(KI1, KI2, KI3, KI4, KI1_D, KI2_D, KI3_D, KI4_D)
			.Lokation(LO1, LO2, LO3, LO4, LO5, LO6, LO2_D, LO3_D, LO4_D, LO5_D, LO6_D)
			.Produktkonfiguration(PC1, PC2, PC3, PC4, PC5, PC6, PC7, PC3_D, PC4_D, PC5_D, PC6_D, PC7_D, PC8)
			.Produktkonfi1(PCL1, PCL2, PCL2_D, PCL3, PCL4)
			.Bearbeiten(BB1, BB2, BB3, BB2_D, BB3_D, BB4, BB6, BB7, BB8, BB9)
			.logout(LO11);
		}

		catch (Exception e) 
		{
			queryObjects.logStatus(driver, LogStatus.FAIL, "Login -> web element", e.getLocalizedMessage(), e);
		}
	}

	//* next method for dispatcher
//	public void activDisp(WebDriver webdriver, BFrameworkQueryObjects queryObjects) throws Exception{
//		try {
//			//this.driver = driver;
//			webdriver.manage().deleteAllCookies();
//			Thread.sleep(1000);
//			convertFirefoxDriver(webdriver);
//			this.driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
//			this.driver.navigate().to(queryObjects.getTestData("URL"));
//			this.driver.manage().window().maximize();
//			Thread.sleep(4000);
//			//*************************TEST OBJECTS***********************************************/
//			//*************************Login***********************************************/
//			String LOGIN1 = queryObjects.getObject("username").get(Locators.ID);
//			String LOGIN2 = queryObjects.getObject("password").get(Locators.ID);
//			String LOGIN3 = queryObjects.getObject("login").get(Locators.ID);
//			//*************************Logout **************************************************/
//			String LO11 = queryObjects.getObject("Log_Out").get(Locators.XPATH);
//			//*************************Test Data***********************************************/
//			String Username_D = queryObjects.getTestData("User_Name");
//			String Password_D = queryObjects.getTestData("Password");
//			
//			new GeneralDispatcher(webdriver, queryObjects)
//			.login1(LOGIN1, LOGIN2, LOGIN3, Username_D, Password_D, queryObjects)
//			.logout(LO11, queryObjects);
//			
//		}
//		catch (Exception e) 
//		{
//			queryObjects.logStatus(driver, LogStatus.FAIL, "Login -> web element", e.getLocalizedMessage(), e);
//		}
//	}

	private void convertFirefoxDriver(WebDriver driver)
			throws ClassCastException 
	{
		if (((MphasisDriver) driver).getDriver() instanceof InternetExplorerDriver)
		{
			this.driver = (InternetExplorerDriver) ((MphasisDriver) driver) .getDriver();
			System.out.println("inside If Mphasis driver"+driver);
		}
		else
			throw new ClassCastException(
					"Not able to cast driver to seetest mobile driver");

	}

}
