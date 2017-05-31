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
public class Activation_Dispatcher{

	public WebDriver driver;

		//* next method for dispatcher
	public void activDisp(WebDriver webdriver, BFrameworkQueryObjects queryObjects) throws Exception{
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
			String LOGIN1 = queryObjects.getObject("username").get(Locators.ID);
			String LOGIN2 = queryObjects.getObject("password").get(Locators.ID);
			String LOGIN3 = queryObjects.getObject("login").get(Locators.ID);
			//*************************TP Planning***********************************************/
			String TPP1 = queryObjects.getObject("TP_Planning").get(Locators.XPATH);
			String TPP2 = queryObjects.getObject("Planung Startten").get(Locators.XPATH);
			String TPP3 = queryObjects.getObject("Filterbutton").get(Locators.XPATH);
			String TPP4 = queryObjects.getObject("Filterinput").get(Locators.XPATH);
			String TPP5 = queryObjects.getObject("ÜbernehmenButton").get(Locators.XPATH);
			String TPP6 = queryObjects.getObject("Check_Box").get(Locators.XPATH);
			String TPP7 = queryObjects.getObject("Submit_btn").get(Locators.ID);
			String TPP8 = queryObjects.getObject("Fixed_Planning").get(Locators.ID);
			String TPP9 = queryObjects.getObject("RadioButton").get(Locators.XPATH);
			String TPP10 = queryObjects.getObject("Implementierer").get(Locators.ID);
//			String TPP11 = queryObjects.getObject("Submit_btn").get(Locators.ID);
//			String TPP12 = queryObjects.getObject("Close_tab").get(Locators.XPATH);
			//*************************Logout **************************************************/
			String LO11 = queryObjects.getObject("Log_Out").get(Locators.XPATH);
			//*************************Test Data***********************************************/
			String Username_D = queryObjects.getTestData("User_Name");
			String Password_D = queryObjects.getTestData("Password");
			String TPP4_D = queryObjects.getTestData("PDTP_No");
			String TPP10_D = queryObjects.getTestData("SelectImplementer");
			//**********************************************************************************/
			
			new GeneralDispatcher(webdriver, queryObjects)
			.login1(LOGIN1, LOGIN2, LOGIN3, Username_D, Password_D, queryObjects)
			.TPPlanning(TPP1, TPP2, TPP3, TPP4, TPP4_D, TPP5, TPP6, TPP7, TPP8, TPP9, TPP10, TPP10_D)
			//.TPPlanning(TPP1, TPP2, TPP3, TPP4, TPP4_D, TPP5, TPP6, TPP7)TPP10, TPP10_D, TPP11, TPP12
			.logout(LO11, queryObjects);
			
		}
		catch (Exception e) 
		{
			queryObjects.logStatus(driver, LogStatus.FAIL, "Login -> web element", e.getLocalizedMessage(), e);
		}
	}



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
