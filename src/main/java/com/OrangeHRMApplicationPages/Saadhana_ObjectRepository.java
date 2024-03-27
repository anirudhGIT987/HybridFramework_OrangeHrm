package com.OrangeHRMApplicationPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseTest.BaseTest;

public class Saadhana_ObjectRepository extends BaseTest {
	
	public Saadhana_ObjectRepository() // Constructor - of Java
	// whenever a Class name is similar to Method Name then it is called as Constructor
	{
	PageFactory.initElements(driver, this);

	}


	// id="logInPanelHeading"
	// WebElement logInPanel=driver.findElement(By.id("logInPanelHeading"));

	// identification of the WebElements
	@FindBy(id="logInPanelHeading")
	WebElement logInPanel;

	// Business Logics - Performing Opertion on the WebElement
	public void validatingLogInPanelText()
	{
	String expected_OrangeHRMApplicationLogInPageText="LOGIN Panel";
System.out.println(" The Expected text of the OrangeHRM Application LogIn Page is : -"+expected_OrangeHRMApplicationLogInPageText);

	String actual_OrangeHRMApplicationLogInPageText=logInPanel.getText();
System.out.println(" The actual Text of the OrangeHRM Application LogIn Page is :- "+actual_OrangeHRMApplicationLogInPageText);

	if(actual_OrangeHRMApplicationLogInPageText.equals(expected_OrangeHRMApplicationLogInPageText))
	{
System.out.println(" OrangeHRM Application LogInPage Text Validation Sucessfull - PASS ");
	}
	else
	{
System.out.println(" OrangeHRM Application LogInPage Text Validation Sucessfull - FAILED ");
	}
	}

	// OrangeHRM Application Logo Validation
	// /html/body/div[1]/div/div[2]/div/img
	
	@FindBy(xpath = "/html/body/div[1]/div/div[2]/div/img")
	WebElement orangeHRMApplicationLogInPageLogo;

	public void validatingOrangeHRMApplicationLogInPageLogo()
	{
	boolean flag=orangeHRMApplicationLogInPageLogo.isDisplayed();

	if(flag)
	{
System.out.println(" OrangeHRM Application LogIN Page Logo is displayed - PASS");
	}
	else
	{
System.out.println(" OrangeHRM Application LogIN Page Logo is NOT displayed - FAIL");
	}
	}

	// id="txtUsername"
	@FindBy(id="txtUsername")
	WebElement userName;

	// name="txtPassword"
	@FindBy(name="txtPassword")
	WebElement password;

	// class="button"
	@FindBy(className = "button")
	WebElement logInPageLogInButton;

	public void orangeHRMApplicationLogInPage_logIn(String userNameTestData,String passwordTestData)
	{
	userName.sendKeys(userNameTestData);
	password.sendKeys(passwordTestData);
	logInPageLogInButton.click();

	// Validation of HomePage
 }
	@FindBy(id ="openIdProvider")
	WebElement selectDropDown;

	public void validatingOrangeHRMSelectDropDown() {

	selectDropDown.click();
System.out.println("DropDown Element is clicked | PASS");
	String expectedSelectComboBoxText="Select";
	String actualDropDownSelectText=selectDropDown.getText();
	System.out.println("The text of the Select DropDOwn is:- "+actualDropDownSelectText);
	if(actualDropDownSelectText.equalsIgnoreCase(expectedSelectComboBoxText))
	{
System.out.println("The Actual OHRM LoginPage Combo Box  Text is matched with the Expected Combo Box text | PASS");			
	}
	else {
System.out.println("The Actual OHRM LoginPage Combo Box  Text is NOT matched with the Expected Combo Box text | FAIL");			
		
	}
	
	}
	
	@FindBy(id ="openIdLogin")
	WebElement loginButtonFooterRedLoginPage;
	
	public void validatingFooterLoginButton() {
		String expectedFooterLoginButtonText="Login";
		String actualFooterLoginButtonText=loginButtonFooterRedLoginPage.getText();
		if(actualFooterLoginButtonText.equalsIgnoreCase(expectedFooterLoginButtonText))
		{
System.out.println("The OHRM LoginPage Footer LoginButton's Actual Text is matched with the expected text |PASS");
		}
		else {
System.out.println("The OHRM LoginPage Footer LoginButton's Actual Text is NOT matched with the expected text |FAIL");
			
		}
		String actualDisabilityStatusFooterLoginButton=loginButtonFooterRedLoginPage.getAttribute("disabled");
		Boolean actualStatusFooterLoginButton=loginButtonFooterRedLoginPage.isEnabled();
System.out.println("Actual Text of Loginpage's Footer LoginButton:- "+actualFooterLoginButtonText);
System.out.println("Actual Disability Status of LoginPage's FOoter Login Button :- "+actualDisabilityStatusFooterLoginButton);
		if(actualStatusFooterLoginButton ==true)
		{
System.out.println("Actual Status of LoginPage's Footer LOgin Button is Enabled | PASS ");
		}
		else {
System.out.println("Actual Status of LoginPage's Footer LOgin Button is NOT Enabled | FAIL ");
		
		}
System.out.println("Actual Status of LoginPage's Footer LOgin Button:- "+actualStatusFooterLoginButton);

	}
	
	@FindBy(linkText = "OrangeHRM, Inc")
	WebElement oHRMIncLink;
	public void footerOHRMIncLink()
	{
		oHRMIncLink.click();
System.out.println("OrangeHrm Inc. is clicked ");	
		String expectedOrangeHRMIncTitle="OrangeHRM HR Software | OrangeHRM";
		String actualOHRMIncWebPageTitle=driver.getTitle();
		String oHrmIncUrl=driver.getCurrentUrl();
System.out.println("OrangeHRM Inc. WebPage title is:- "+actualOHRMIncWebPageTitle);	
		if(actualOHRMIncWebPageTitle.equals(expectedOrangeHRMIncTitle))
		{
System.out.println("The Actual Title of OrangeHRM Inc. WebPage is matched with the Expected Title | PASS");		
		}
		else {
System.out.println("The Actual Title of OrangeHRM Inc. WebPage is NOT matched with the Expected Title | FAIL");		
		}
}

	
	
	
}
