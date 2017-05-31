package components;
//import java.util.Map;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.remote.RemoteWebDriver;

import com.framework.selenium.bean.BFrameworkQueryObjects;
import com.relevantcodes.extentreports.LogStatus;
import com.framework.selenium.bean.ByMSafe;
import com.framework.selenium.events.MphasisDriver;
import com.msafe.enumIdentifier.Locators;


import wrappers.Functional;
//import wrappers.Wrappers;

public class GeneralDispatcher extends Functional{


	public GeneralDispatcher(WebDriver driver, BFrameworkQueryObjects queryObjects){
		super(driver);
	}

	//(WebDriver webdriver, BFrameworkQueryObjects queryObjects)
	//public General enterid(WebElement sample1, String data){

	//Wrappers W1 = new GeneralFunction(driver);

	public GeneralDispatcher login1(String sam1, String sam2, String sam3, String data1, String data2, BFrameworkQueryObjects queryObjects){
		try {
			enterById(sam1, data1);
			Thread.sleep(2000);
			queryObjects.logStatus(driver, LogStatus.PASS, "Login Screen -> User Name success", "UserName", null );
		} catch (InterruptedException e1) {
			//e1.printStackTrace();
			queryObjects.logStatus(driver, LogStatus.FAIL, "Login -> Disaptcher failure success", e1.getLocalizedMessage(), e1 );
		}

		try {
			enterById(sam2, data2);
			Thread.sleep(2000);
			queryObjects.logStatus(driver, LogStatus.PASS, "Login Screen -> Password success", "Password", null );
		} catch (InterruptedException e1) {
			//e1.printStackTrace();
			queryObjects.logStatus(driver, LogStatus.FAIL, "Login -> Disaptcher failure success", e1.getLocalizedMessage(), e1 );
		}

		try {
			clickById(sam3);
			Thread.sleep(5000);
			queryObjects.logStatus(driver, LogStatus.PASS, "Login -> Disaptcher success", sam3, null );
		} catch (InterruptedException e1) {
			//e1.printStackTrace();
			queryObjects.logStatus(driver, LogStatus.FAIL, "Login -> Disaptcher failure success", e1.getLocalizedMessage(), e1 );
		}
		return this;
	}

	public GeneralDispatcher TPPlanning(String tPP1, String tPP2, String tPP3, String tPP4, String tPP4_D, String tPP5, String tPP6, String tPP7,
			String tPP8, String tPP9, String tPP10, String tPP10_D) { //String tPP10, String tPP10_D, String tPP11, String tPP12
		try {
			this.driver.switchTo().frame("PWGadget0Ifr");
			clickByXpath(tPP1);
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			clickByXpath(tPP2);
			Thread.sleep(3000);
			this.driver.switchTo().defaultContent();
		    driver.switchTo().frame("PWGadget2Ifr");
		    //Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			clickByXpath(tPP3);
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			enterByXpath(tPP4, tPP4_D);
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			clickByXpath(tPP5);
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			clickByXpath(tPP6);
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			clickById(tPP7);
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			clickById(tPP8);
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			this.driver.switchTo().defaultContent();
		    this.driver.switchTo().frame("PWGadget2Ifr");
			actionClickByXpath(tPP9);
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			selectValueTextById(tPP10, tPP10_D);
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
//		
//		try {
//			clickById(tPP11);
//			Thread.sleep(3000);
//			this.driver.switchTo().defaultContent();
//			Thread.sleep(5000);
//		} catch (InterruptedException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
//		
//		try {
//			clickByXpath(tPP12);
//			Thread.sleep(50000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		return this;
	}

	public GeneralDispatcher logout(String lO11, BFrameworkQueryObjects queryObjects) {
		try {
			clickByXpath(lO11);
			Thread.sleep(2000);
			queryObjects.logStatus(driver, LogStatus.PASS, "Logout -> Logout success", lO11, null );
		} catch (InterruptedException e) {
			//e.printStackTrace();
			queryObjects.logStatus(driver, LogStatus.FAIL, "Logout -> Logout Failure", e.getLocalizedMessage(), e );
		}
		driver.close();
		return this;

	}


}