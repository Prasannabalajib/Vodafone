package components;
//import java.util.Map;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import com.framework.selenium.bean.BFrameworkQueryObjects;
import com.relevantcodes.extentreports.LogStatus;
import com.framework.selenium.bean.ByMSafe;
import com.framework.selenium.events.MphasisDriver;
import com.msafe.enumIdentifier.Locators;

import wrappers.Functional;


public class GeneralFunction extends Functional{

	
	public GeneralFunction(WebDriver driver, BFrameworkQueryObjects queryObjects){
		super(driver);
		//this.driver = driver;
	}

	//(WebDriver webdriver, BFrameworkQueryObjects queryObjects)
	//public General enterid(WebElement sample1, String data){

	//Wrappers W1 = new GeneralFunction(driver);

	public GeneralFunction login1(String lOg1, String lOg2, String lOg3, String lOg_D1, String lOg_D2, BFrameworkQueryObjects queryObjects){
		try {
			enterById(lOg1, lOg_D1);
			Thread.sleep(2000);
			queryObjects.logStatus(driver, LogStatus.PASS, "Login Screen -> User Name success", "UserName", null );
		} catch (InterruptedException e1) {
			//e1.printStackTrace();
			queryObjects.logStatus(driver, LogStatus.FAIL, "Login -> OrderEntry failure", e1.getLocalizedMessage(), e1 );
		}
				
		try {
			enterById(lOg2, lOg_D2);
			Thread.sleep(2000);
			queryObjects.logStatus(driver, LogStatus.PASS, "Login Screen -> Password success", "UserName", null );
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			queryObjects.logStatus(driver, LogStatus.FAIL, "Login -> OrderEntry failure", e1.getLocalizedMessage(), e1 );
		}
		
		try {
			clickById(lOg3);
			Thread.sleep(5000);
			queryObjects.logStatus(driver, LogStatus.PASS, "Login Screen -> User Name success", "UserName", null );
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			queryObjects.logStatus(driver, LogStatus.FAIL, "Login -> OrderEntry failure", e.getLocalizedMessage(), e );
		}
		//queryObjects.logStatus(driver, LogStatus.PASS, " Elemenet Name web element","Activation OE successful", null);
		return this;
	}

	public GeneralFunction selectOrderID(String oRd1, String oRd2, String oRd3, String oRd4, String oRd5, String oRd6,String oRd_D3){
		//clickById(O1);
		clickByCss(oRd1);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		clickById(oRd2);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.driver.switchTo().frame("PWGadget2Ifr");
		//waitUntilFrameVisible(20,"PWGadget2Ifr");
		enterById(oRd3, oRd_D3);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		clickByXpath(oRd4);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		clickByXpath(oRd5);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		clickById(oRd6);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;

	}


	public GeneralFunction selectTP(String tP1, String tP2, String tP3, String tP_D, String tPType_D) {
		selectValueTextById(tP1, tP_D);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		selectValueTextById(tP2, tPType_D);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		clickById(tP3);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
	}


	public GeneralFunction EnterKerninformationen(String kI1, String kI2, String kI3, String kI4, String kI1_D, String kI2_D,
			String kI3_D, String kI4_D) {
		selectValueTextById(kI1, kI1_D);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		selectValueTextById(kI2, kI2_D);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		selectValueTextById(kI3, kI3_D);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		selectValueTextById(kI4, kI4_D);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		return this;		
	}
	public  GeneralFunction Lokation(String lO1, String lO2, String lO3, String lO4, String lO5, String lO6, String lO2_D,
			String lO3_D, String lO4_D, String lO5_D, String lO6_D) {
		clickByXpath(lO1);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		enterById(lO2, lO2_D);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		enterById(lO3, lO3_D);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		enterById(lO4, lO4_D);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		enterById(lO5, lO5_D);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		enterById(lO6, lO6_D);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;


	}


	public GeneralFunction Produktkonfiguration(String pC1, String pC2, String pC3, String pC4, String pC5, String pC6, String pC7,
			String pC3_D, String pC4_D, String pC5_D, String pC6_D, String pC7_D, String pC8) {
		clickByXpath(pC1);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		doubleClickByXpath(pC2);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		selectValueTextByXpath(pC3, pC3_D);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		enterByXpath(pC4, pC4_D);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}				
		enterByXpath(pC5, pC5_D);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		enterByXpath(pC6, pC6_D);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}enterByXpath(pC7, pC7_D);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		clickById(pC8);
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
	}

	public GeneralFunction Produktkonfi1(String pCL1, String pCL2, String pCL2_D, String pCL3, String pCL4) {
		doubleClickByXpath(pCL1);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		enterById(pCL2, pCL2_D);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		clickById(pCL3);
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		clickByXpath(pCL4);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
	}

	public GeneralFunction Bearbeiten(String bB1, String bB2, String bB3, String bB2_D, String bB3_D, String bB4, String bB6, String bB7, String bB8, String bB9) {	
		this.driver.switchTo().defaultContent();
		this.driver.switchTo().frame("PWGadget3Ifr");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		clickByXpath(bB1);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		enterById(bB2, bB2_D);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		enterById(bB3, bB3_D);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		clickById(bB4);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Date date = new Date();
		String modifiedDate= new SimpleDateFormat("yyyy-MM-dd").format(date);
		String a[]=modifiedDate.split("-");
		String b = a[1].replaceAll("^0*", "");
		String c = a[2].replaceAll("^0*", "");
		String all = a[0].concat("_").concat(b).concat("_").concat(c);
		String datepick = "cal$PpyWorkPage$pCustomerSignature__".concat(all);
		clickByName(datepick);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//CP SAVE
		clickByCss(bB6);
		this.driver.switchTo().defaultContent();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// CP close
		clickByCss(bB7);
		//submit
		this.driver.switchTo().defaultContent();
		this.driver.switchTo().frame("PWGadget2Ifr");
		this.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		clickById(bB8);
		this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// close tab
		driver.switchTo().defaultContent();
		this.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		clickByXpath(bB9);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
	}


	public GeneralFunction logout(String lO11) {
		clickByXpath(lO11);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
		return this;

	}
}