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

public class GeneralImplementor extends Functional{


	public GeneralImplementor(WebDriver driver, BFrameworkQueryObjects queryObjects){
		super(driver);
	}

	//(WebDriver webdriver, BFrameworkQueryObjects queryObjects)
	//public General enterid(WebElement sample1, String data){

	//Wrappers W1 = new GeneralFunction(driver);

	public GeneralImplementor login1(String sam1, String sam2, String sam3, String data1, String data2, BFrameworkQueryObjects queryObjects){
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

	public GeneralImplementor find_PDTP(String sTP1, String sTP2, String sTP2_D, String sTP3, BFrameworkQueryObjects queryObjects) {
		// Click Filter Button
		try {
			clickByXpath(sTP1);
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Enter PDTP
		try {
			enterByXpath(sTP2, sTP2_D);
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Click Apply
		try {
			clickByXpath(sTP3);
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
	}
	
	public GeneralImplementor accept_TP(String sTP1, String sTP2, String sTP2_D, String sTP3, BFrameworkQueryObjects queryObjects) {
		return this;
		
	}
	
	public GeneralImplementor serviceOption_TP(String sTP1, String sTP2, String sTP2_D, String sTP3, BFrameworkQueryObjects queryObjects) {
		return this;
		
	}
	public GeneralImplementor logout(String lO11, BFrameworkQueryObjects queryObjects) {
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