package wrappers;

import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.pagefactory.ElementLocator;
import org.openqa.selenium.support.ui.Select;
import org.yaml.snakeyaml.tokens.Token.ID;

import com.framework.selenium.bean.ByMSafe;
import com.msafe.enumIdentifier.Locators;

public class Functional implements Wrappers{
	public WebDriver driver;

	public Functional(WebDriver driver){
		this.driver = driver;
	}
	@Override
	public void invokeApp(String browser) {
		// TODO Auto-generated method stub

	}
	/**
	 * This method will enter the value to the text field using id attribute to locate
	 * 
	 * @param sm - id of the webelement
	 * @param data - The data to be sent to the webelement
	 * @author Prasanna -  
	 * @throws IOException 
	 * @throws COSVisitorException 
	 */
	//@Override
	public void enterById(String idValue, String data) {
		try {

			driver.findElement(By.id(idValue)).clear();
			driver.findElement(By.id(idValue)).sendKeys(data);
			//reportStep("The data: "+data+" entered successfully in field :"+idValue, "PASS");
		} catch (NoSuchElementException e) {
			//reportStep("The data: "+data+" could not be entered in the field :"+idValue, "FAIL");
		} catch (Exception e) {
			//reportStep("Unknown exception occured while entering "+data+" in the field :"+idValue, "FAIL");
		}
	}
	/**
	 * This method will enter the value to the text field using name attribute to locate
	 * 
	 * @param nameValue - name of the webelement
	 * @param data - The data to be sent to the webelement
	 * @author Prasanna -  
	 * @throws IOException 
	 * @throws COSVisitorException 
	 */
	//@Override
	public void enterByName(String nameValue, String data) {
		try {
			driver.findElement(By.name(nameValue)).clear();
			driver.findElement(By.name(nameValue)).sendKeys(data);	
			//reportStep("The data: "+data+" entered successfully in field :"+nameValue, "PASS");

		} catch (NoSuchElementException e) {
			//reportStep("The data: "+data+" could not be entered in the field :"+nameValue, "FAIL");
		} catch (Exception e) {
			//reportStep("Unknown exception occured while entering "+data+" in the field :"+nameValue, "FAIL");
		}

	}
	/**
	 * This method will enter the value to the text field using name attribute to locate
	 * 
	 * @param xpathValue - xpathValue of the webelement
	 * @param data - The data to be sent to the webelement
	 * @author Prasanna -  
	 * @throws IOException 
	 * @throws COSVisitorException
	 */ 
	//@Override
	public void enterByXpath(String xpathValue, String data) {
		try {
			driver.findElement(By.xpath(xpathValue)).clear();
			driver.findElement(By.xpath(xpathValue)).sendKeys(data);	
			//reportStep("The data: "+data+" entered successfully in field :"+xpathValue, "PASS");

		} catch (NoSuchElementException e) {
			//reportStep("The data: "+data+" could not be entered in the field :"+xpathValue, "FAIL");
		} catch (Exception e) {
			//reportStep("Unknown exception occured while entering "+data+" in the field :"+xpathValue, "FAIL");
		}

	}

	@Override
	public boolean verifyTitle(String title) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void verifyTextById(String id, String text) {
		// TODO Auto-generated method stub

	}

	@Override
	public void verifyTextByXpath(String xpath, String text) {
		// TODO Auto-generated method stub

	}

	@Override
	public void verifyTextContainsByXpath(String xpath, String text) {
		// TODO Auto-generated method stub

	}

	@Override
	public void verifyTextContainsById(String id, String text) {
		// TODO Auto-generated method stub

	}
	/**
	 * This method will click the element using id as locator
	 * @param webElement  The id (locator) of the element to be clicked
	 * @author Prasanna -  
	 */
	//@Override
	public void clickById(String idValue) {
		try{
			driver.findElement(By.id(idValue)).click();
			//id.click();
			//reportStep("The element with id: "+id+" is clicked.", "PASS");

		} catch (Exception e) {
			//reportStep("The element with id: "+id+" could not be clicked.", "FAIL");
		}
	}
	/**
	 * This method will click the element using id as locator
	 * @param webElement  The id (locator) of the element to be clicked
	 * @author Prasanna -  
	 */
	//@Override
	public void doubleClickByXpath(String Value) {
		try{
			Actions action = new Actions(driver);
			//By byLocator = By.id(Value); 
			action.doubleClick(driver.findElement(By.xpath(Value)));
			action.build().perform();
			//reportStep("The element with id: "+id+" is clicked.", "PASS");

		} catch (Exception e) {
			//reportStep("The element with id: "+id+" could not be clicked.", "FAIL");
		}
	}

	/**
	 * This method will click the element using id as locator
	 * @param id  The id (locator) of the element to be clicked
	 * @author Prasanna -  
	 */
	//@Override
	public void clickByClassName(String classVal) {
		try{
			driver.findElement(By.className(classVal)).click();
			//reportStep("The element with class Name: "+classVal+" is clicked.", "PASS");
		} catch (Exception e) {
			//reportStep("The element with class Name: "+classVal+" could not be clicked.", "FAIL");
		}
	}
	/**
	 * This method will click the element using name as locator
	 * @param name  The name (locator) of the element to be clicked
	 * @author Prasanna -  
	 */
	//@Override
	public void clickByName(String name) {
		try{
			driver.findElement(By.name(name)).click();
			//reportStep("The element with name: "+name+" is clicked.", "PASS");
		} catch (Exception e) {
			//reportStep("The element with name: "+name+" could not be clicked.", "FAIL");
		}
	}
	/**
	 * This method will click the element using link name as locator
	 * @param name  The link name (locator) of the element to be clicked
	 * @author Prasanna -  
	 */
	//@Override
	public void clickByLink(String name) {
		try{
			driver.findElement(By.linkText(name)).click();
			//reportStep("The element with link name: "+name+" is clicked.", "PASS");
		} catch (Exception e) {
			//reportStep("The element with link name: "+name+" could not be clicked.", "FAIL");
		}
	}
	public void clickByLinkWithoutSnap(String name){
		try{
			driver.findElement(By.linkText(name)).click();
		} catch (Exception e) {

		}
	}
	/**
	 * This method will click the element using xpath as locator
	 * @param xpathVal  The xpath (locator) of the element to be clicked
	 * @author Prasanna -  
	 */
	//@Override
	public void clickByXpath(String xpathVal) {
		try{
			driver.findElement(By.xpath(xpathVal)).click();
			//reportStep("The element : "+xpathVal+" is clicked.", "PASS");
		} catch (Exception e) {
			//reportStep("The element with xpath: "+xpathVal+" could not be clicked.", "FAIL");
		}
	}
	/**
	 * This method will mouse over on the element using xpath as locator
	 * @param xpathVal  The xpath (locator) of the element to be moused over and click
	 * @author Prasanna -  
	 */
	public void actionClickByXpath(String xpathVal) {
		try{
			new Actions(driver).moveToElement(driver.findElement(By.xpath(xpathVal))).click().build().perform();
			//reportStep("The mouse over by xpath : "+xpathVal+" is performed.", "PASS");
		} catch (Exception e) {
			//reportStep("The mouse over by xpath : "+xpathVal+" could not be performed.", "FAIL");
		}
	}

	/**
	 * This method will mouse over on the element using xpath as locator
	 * @param xpathVal  The xpath (locator) of the element to be moused over
	 * @author Prasanna -  
	 */
	public void mouseOverByXpath(String xpathVal) {
		try{
			new Actions(driver).moveToElement(driver.findElement(By.xpath(xpathVal))).build().perform();
			//reportStep("The mouse over by xpath : "+xpathVal+" is performed.", "PASS");
		} catch (Exception e) {
			//reportStep("The mouse over by xpath : "+xpathVal+" could not be performed.", "FAIL");
		}
	}

	/**
	 * This method will mouse over on the element using link name as locator
	 * @param xpathVal  The link name (locator) of the element to be moused over
	 * @author Prasanna -  
	 */
	public void mouseOverByLinkText(String linkName) {
		try{
			new Actions(driver).moveToElement(driver.findElement(By.linkText(linkName))).build().perform();
			//reportStep("The mouse over by link : "+linkName+" is performed.", "PASS");
		} catch (Exception e) {
			//reportStep("The mouse over by link : "+linkName+" could not be performed.", "FAIL");
		}
	}
	/**
	 * This method will return the text of the element using xpath as locator
	 * @param xpathVal  The xpath (locator) of the element
	 * @author Prasanna -  
	 */
	//@Override
	public String getTextByXpath(String xpathVal){
		String bReturn = "";
		try{
			return driver.findElement(By.xpath(xpathVal)).getText();
		} catch (Exception e) {
			//reportStep("The element with xpath: "+xpathVal+" could not be found.", "FAIL");
		}
		return bReturn; 
	}
	/**
	 * This method will return the text of the element using id as locator
	 * @param xpathVal  The id (locator) of the element
	 * @author Prasanna -  
	 */
	//@Override
	public String getTextById(String idVal) {
		return idVal;
		/*String bReturn = "";
		try{
			return driver.findElementById(idVal).getText();
		} catch (Exception e) {
			//reportStep("The element with id: "+idVal+" could not be found.", "FAIL");
		}
		return bReturn;*/ 
	}
	/**
	 * This method will select the drop down value using id as locator
	 * @param id The id (locator) of the drop down element
	 * @param value The value to be selected (visibletext) from the dropdown 
	 * @author Prasanna -  
	 */
	//@Override
	public void selectVisibileTextById(String id, String value) {
		try{
			new Select(driver.findElement(By.id(id))).selectByVisibleText(value);
			//reportStep("The element with id: "+id+" is selected with value :"+value, "PASS");
		} catch (Exception e) {
			//reportStep("The value: "+value+" could not be selected.", "FAIL");
		}
	}
	/**
	 * This method will select the drop down value using id as locator
	 * @param id The id (locator) of the drop down element
	 * @param value The value to be selected (visibletext) from the dropdown 
	 * @author Prasanna -  
	 */
	//@Override
	public void selectValueTextById(String id, String value) {
		try{
			new Select(driver.findElement(By.id(id))).selectByValue(value);
			//reportStep("The element with id: "+id+" is selected with value :"+value, "PASS");
		} catch (Exception e) {
			//reportStep("The value: "+value+" could not be selected.", "FAIL");
		}
	}
	/**
	 * This method will select the drop down value using id as locator
	 * @param id The id (locator) of the drop down element
	 * @param value The value to be selected (visibletext) from the dropdown 
	 * @author Prasanna -  
	 */
	//@Override
	public void selectValueTextByXpath(String id, String value) {
		try{
			new Select(driver.findElement(By.xpath(id))).selectByValue(value);
			//reportStep("The element with id: "+id+" is selected with value :"+value, "PASS");
		} catch (Exception e) {
			//reportStep("The value: "+value+" could not be selected.", "FAIL");
		}
	}
	//my list
	//	public void selectFromList(String id, String value){
	//		List<WebElement ele> = driver.findElement(By.id(id));
	//	}

	//@Override
	public void selectIndexById(String id, String value) {
		try{
			new Select(driver.findElement(By.id(id))).selectByIndex(Integer.parseInt(value));;
			//reportStep("The element with id: "+id+" is selected with index :"+value, "PASS");
		} catch (Exception e) {
			//reportStep("The index: "+value+" could not be selected.", "FAIL");
		}
	}

	//@Override
	public void switchToParentWindow() {
		try {
			Set<String> winHandles = driver.getWindowHandles();
			for (String wHandle : winHandles) {
				driver.switchTo().window(wHandle);
				break;
			}
		} catch (Exception e) {
			//reportStep("The window could not be switched to the first window.", "FAIL");
		}
	}

	//@Override
	public void switchToLastWindow() {
		try {
			Set<String> winHandles = driver.getWindowHandles();
			for (String wHandle : winHandles) {
				driver.switchTo().window(wHandle);
			}
		} catch (Exception e) {
			//reportStep("The window could not be switched to the last window.", "FAIL");
		}
	}

	//@Override
	public void acceptAlert(){
		try {
			driver.switchTo().alert().accept();
			//reportStep("Merge Lead button clicked & Alert accepted.", "PASS");
		} catch (NoAlertPresentException e) {
			//reportStep("The alert could not be found.", "FAIL");
		} catch (Exception e) {
			//reportStep("The alert not accepted.", "FAIL");
		}
	}
	public String getAlertText() {		
		String text = null;
		try {
			driver.switchTo().alert().dismiss();
		} catch (NoAlertPresentException e) {
			//reportStep("The alert could not be found.", "FAIL");
		} catch (Exception e) {
			//reportStep("The alert could not be accepted.", "FAIL");
		}
		return text;

	}

	public void dismissAlert() {
		try {
			driver.switchTo().alert().dismiss();
		} catch (NoAlertPresentException e) {
			//reportStep("The alert could not be found.", "FAIL");
		} catch (Exception e) {
			//reportStep("The alert could not be accepted.", "FAIL");
		}

	}
	/**
	 * This method will close all the browsers
	 * @author Prasanna -  
	 */
	//@Override
	public void quitBrowser() {
		try {
			driver.quit();
		} catch (Exception e) {
			//reportStep("The browser:"+driver.getCapabilities().getBrowserName()+" could not be closed.", "FAIL");
		}
	}
	public void clickByCss(String locator){
		//By byLocator = elementLocator(locator);
		try{
			//driver.findElement(By.id(webElement)).click();
			driver.findElement(By.cssSelector(locator)).click();
			//reportStep("The element with id: "+id+" is clicked.", "PASS");
		}
		catch (Exception e) {
			//reportStep("The index: "+value+" could not be selected.", "FAIL");
		}
	}
}


