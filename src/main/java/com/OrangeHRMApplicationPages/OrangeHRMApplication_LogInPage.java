package com.OrangeHRMApplicationPages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseTest.BaseTest;

public class OrangeHRMApplication_LogInPage extends BaseTest {
	
	//This class will contain information about the elements present in the Web Page
	// and also the Operations performed on these elements.

	// This class is referred to as an  "Object Repository Class"
	
	public OrangeHRMApplication_LogInPage() // Constructor - of Java
	// whenever a Class name is similar to Method Name then it is called as a Constructor
	{
	PageFactory.initElements(driver, this);

	}


	// id="logInPanelHeading"
	// WebElement logInPanel=driver.findElement(By.id("logInPanelHeading"));

	// identification of the WebElements
	@FindBy(id="logInPanelHeading")
	WebElement logInPanel;

	// Business Logics - Performing Operation on the WebElement
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

	if(flag==true)
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
	
	@FindBy(id ="welcome")
	WebElement welcomeAdmin;
	public void welcomeAdmin() {
		welcomeAdmin.click();
		
		
	}
	@FindBy(linkText ="Logout")
	WebElement logOut;
	public void logOut()
	{
		logOut.click();
		
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

		@FindBy(tagName = "option")
		List<WebElement>selectComboBoxElements;
		
		public void orangeHRMSelectDropDownElements(){
			for(int index=0; index<selectComboBoxElements.size();index++)
			{
				String actualComboBoxElementText=selectComboBoxElements.get(index).getText();
System.out.println(index+"--"+actualComboBoxElementText);			
			}
		}

		//@FindBy(xpath ="/html/body/div[1]/div/div[3]/div/form")
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
System.out.println("Actual Disability Status of LoginPage's FOoter Login Button :- "+actualDisabilityStatusFooterLoginButton);
System.out.println("Actual Status of LoginPage's FOoter Login Button :- "+actualStatusFooterLoginButton);
	
			if(actualStatusFooterLoginButton ==true)
			{
System.out.println("Actual Status of LoginPage's Footer LOgin Button is Enabled | PASS ");
			}
			else {
System.out.println("Actual Status of LoginPage's Footer LOgin Button is NOT Enabled | FAIL ");
			
			}
System.out.println("Actual Status of LoginPage's Footer LOgin Button:- "+actualStatusFooterLoginButton);
	
		}
		///html/body/div[1]/div/div[3]/div/form/text()
		@FindBy(xpath ="/html/body/div[1]/div/div[3]/div/form/text()")
		WebElement ohrmLoginPageFooterAlternateLoginText;
	public void	validatingFooterAlternativeLoginText() {
		String expectedAlternativeLoginText="Alternative Login";
		String actualFooterAlterantiveLoginTextName=ohrmLoginPageFooterAlternateLoginText.getText();
		if(actualFooterAlterantiveLoginTextName.equalsIgnoreCase(expectedAlternativeLoginText))
		{
System.out.println("The actual name of Alternative Login Text is matched with the Expected Text | PASS");	
		}
		else {
System.out.println("The actual name of Alternative Login Text is NOT matched with the Expected Text | FAIL");	
			
		}
	}
	
	// There is a division of elements where we have to expand the div tag or else
		@FindBy(xpath="/html/body/div[1]/div/div[4]/div[1]/text()[1]")
		WebElement orangeHRMVersionTextFooter;
		public void validatingOrangeHRMVersionText() {
			String expectedOrangeHrmVersionText="OrangeHRM 4.2.0.1";
			String actualOrangeHRMVersionName=orangeHRMVersionTextFooter.getText();
System.out.println("OrangeHRM Web Application Version is:- "+actualOrangeHRMVersionName);			
			if(actualOrangeHRMVersionName.equals(expectedOrangeHrmVersionText))
			{
System.out.println("The Actual Verison Name of OrangeHRM Web Application is matched with the Expected Name | PASS");
			}
			else {
System.out.println("The Actual Version Name of OrangeHRM Web Application is NOT matched with the Expected Name | FAIL");				
			}
		}

		@FindBy(xpath="//*[@id=\"footer\"]/div[1]")
		List<WebElement> ohrmLoginPageFooterDiv2;
		public void ohrmLoginPageFooterDiv2Elements() {
			for(int i=0; i<ohrmLoginPageFooterDiv2.size();i++)
			{
				String actualFooterDiv2ElementText=ohrmLoginPageFooterDiv2.get(i).getText();
System.out.println(i+"-- "+actualFooterDiv2ElementText);			
			}
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


