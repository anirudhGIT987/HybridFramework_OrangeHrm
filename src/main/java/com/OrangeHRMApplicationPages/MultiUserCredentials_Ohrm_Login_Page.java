package com.OrangeHRMApplicationPages;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Footer;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseTest.BaseTest;
import com.Utilities.log;



public class MultiUserCredentials_Ohrm_Login_Page extends BaseTest {

	Properties locators;
	FileInputStream orangeHrmPropertiesfile;
	
	
	public MultiUserCredentials_Ohrm_Login_Page() throws IOException {
		// the above method name is similar to classname -- so this is a constructor
		
		
		//orangeHrmPropertiesfile = new FileInputStream("./src/main/java/com/Config/OrangeHRM.properties");
				//locators.load(orangeHrmPropertiesfile);
		PageFactory.initElements(driver, this);
	}
	
		@FindBy(id="logInPanelHeading")
		@CacheLookup
		WebElement logInPanel;
		public void validatingLoginPage_LogInPanelText()
	{
			String expected_OrangeHRMApplicationLogInPageText="LOGIN Panel";
//System.out.println(" The Expected text of the OrangeHRM Application LogIn Page is : -"+expected_OrangeHRMApplicationLogInPageText);
log.info("The Expected text of the OrangeHRM Application LogIn Page is : -"+expected_OrangeHRMApplicationLogInPageText);
	
			String actual_OrangeHRMApplicationLogInPageText=logInPanel.getText();
//System.out.println(" The actual Text of the OrangeHRM Application LogIn Page is :- "+actual_OrangeHRMApplicationLogInPageText);
log.info(" The actual Text of the OrangeHRM Application LogIn Page is :- "+actual_OrangeHRMApplicationLogInPageText);
	
			if(actual_OrangeHRMApplicationLogInPageText.equals(expected_OrangeHRMApplicationLogInPageText))
			{
//System.out.println(" OrangeHRM Application LogInPage Text Validation Sucessfull - PASS ");
log.info(" OrangeHRM Application LogInPage Text Validation Sucessfull - PASS ");
			}
			else
			{
//System.out.println(" OrangeHRM Application LogInPage Text Validation Sucessfull - FAIL");
log.info(" OrangeHRM Application LogInPage Text Validation Sucessfull - FAIL");			
	
			}
	}

		@FindBy(xpath = "/html/body/div[1]/div/div[2]/div/img")
		WebElement orangeHRMApplicationLogInPageLogo;

		public void validatingOrangeHRMApplication_LogInPageLogo()
		{
			boolean flag=orangeHRMApplicationLogInPageLogo.isDisplayed();

			if(flag==true)
			{
//System.out.println(" OrangeHRM Application LogIN Page Logo is displayed - PASS");
log.info(" OrangeHRM Application LogIN Page Logo is displayed - PASS");		
			}
			else
			{
//System.out.println(" OrangeHRM Application LogIN Page Logo is NOT displayed - FAIL");
log.info(" OrangeHRM Application LogIN Page Logo is NOT displayed - FAIL");	
			
			}
	}
	
		
			@FindBy(id="txtUsername")
			WebElement userName;

			// name="txtPassword"
			@FindBy(name="txtPassword")
			WebElement password;

			// class="button"
			@FindBy(className = "button")
			WebElement logInPageLogInButton;

	public void orangeHRMApplicationLogInPage_LogInButton(String expecteduserName,String expectedPassword) throws IOException
	{
		
			userName.sendKeys(expecteduserName);
			password.sendKeys(expectedPassword);
			logInPageLogInButton.click();
/*
			String actualCurrentWebPageUrl=driver.getCurrentUrl();
			if(actualCurrentWebPageUrl.contains("validateCredentials"))
			{
				File snap=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(snap, new File("D:\\Jaava\\Eclipse Workspace\\OrangeHRMApplication_POM\\OrangeHRMWebApp_Error_Screenshots"+expecteduserName+" "+expectedPassword+".png"));
				//TakesScreenshot snap=((TakesScreenshot)driver);
				//File srcFile=snap.getScreenshotAs(OutputType.FILE);
				//File destFile=new File("D:\\Jaava\\Eclipse Workspace\\OrangeHRMApplication_POM\\OrangeHRMWebApp_Error_Screenshots\\"+expecteduserName+" "+expectedPassword+".png");
				//FileUtils.copyFile(srcFile, destFile);
	log.info("Failed to Navigate to the Expected OrangeHRM HomePage | FAIL");		
			
			}
			// Validation of HomePage	
			if(actualCurrentWebPageUrl.contains("dashboard"))
			{
log.info("********Successfully Navigated to the OrangeHRM HomePage with Valid Data | PASS");				
			}
			
//System.out.println("UserName Entered :-"+expecteduserName+ " || Password Entered:- "+expectedPassword);			
log.info("UserName Entered :-"+expecteduserName+ " || Password Entered:- "+expectedPassword);
*/	
 }
	
	
	@FindBy(id ="welcome")
	WebElement welcomeAdmin;
	public void orangeHRMApplication_welcomeAdmin() {
		
		welcomeAdmin.click();
log.info("Successfully Clicked Welcome Admin Element");		
	}
	
	@FindBy(linkText ="Logout")
	WebElement logOut;
	public void orangeHRMApplication_logOut()
	{
		logOut.click();	
log.info("Successfully Clicked Log Out");		
	}	
	
	@FindBy(id ="openIdProvider")
	WebElement selectDropDown;
	
	public void OrangeHRMLoginPage_SelectDropDown() {
		
		selectDropDown.click();
System.out.println("DropDown Element is clicked | PASS");
		String expectedSelectComboBoxText="Select";
		String actualDropDownSelectText=selectDropDown.getText();
		System.out.println("The text of the Combo Box - Select DropDown is:- "+actualDropDownSelectText);
		if(actualDropDownSelectText.contains(expectedSelectComboBoxText))
		{
System.out.println("The Actual OHRM LoginPage Combo Box  Text is matched with the Expected Combo Box text | PASS");			
		}
		else {
System.out.println("The Actual OHRM LoginPage Combo Box  Text is NOT matched with the Expected Combo Box text | FAIL");			
		}
		
		List<WebElement>comboBoxElements=selectDropDown.findElements(By.tagName("Option"));
		for (int index=0; index<comboBoxElements.size();index++)
		{
			String actualComboBoxElementName=comboBoxElements.get(index).getText();
log.info(index+" "+actualComboBoxElementName);
		}
	
	
	}

	//@FindBy(xpath ="/html/body/div[1]/div/div[3]/div/form")
			@FindBy(id ="openIdLogin")
			WebElement footerLoginButton;
			
			public void orangeHRMApplicationFooterLoginButton()
			{
				String expectedFooterLoginButtonText="Login";
				String actualFooterLoginButtonText=footerLoginButton.getText();
log.info("The Actual Text of OrangeHRM Application Footer Login Button is:- "+actualFooterLoginButtonText);				
				if(actualFooterLoginButtonText.equalsIgnoreCase(expectedFooterLoginButtonText))
				{
log.info("The OHRM LoginPage Footer LoginButton's Actual Text is matched with the expected text |PASS");	
				}
				else {
log.info("The OHRM LoginPage Footer LoginButton's Actual Text is NOT matched with the expected text |FAIL");	
				}
				String actualDisabilityStatusFooterLoginButton=footerLoginButton.getAttribute("disabled");
				Boolean actualStatusFooterLoginButton=footerLoginButton.isEnabled();
log.info("Actual Disability Status of LoginPage's FOoter Login Button :- "+actualDisabilityStatusFooterLoginButton);
log.info("Actual Enable Status of LoginPage's Footer Login Button :- "+actualStatusFooterLoginButton);	
				if(actualStatusFooterLoginButton ==true)
				{
log.info("OrangeHRM LoginPage's Footer LOgin Button is Enabled  ");
				}
				else {
log.info("OrangeHRM LoginPage's Footer LOgin Button is NOT Enabled ");				
				}
				
	footerLoginButton.click();
			}
			
			//
			///html/body/div[1]/div/div[3]/div/form
			@FindBy(xpath ="/html/body/div[1]/div/div[3]/div/form")
			List<WebElement>footerAlternateLoginTextList;
		public void	orangeHRMApplication_FooterAlternativeLoginText() {
			String expectedAlternativeLoginText="Alternative login :";

			for(short index =0; index<footerAlternateLoginTextList.size(); index++)
			{
				String actualFooterDiv1Name=footerAlternateLoginTextList.get(index).getText();
log.info("OrangeHRM Footer Div1 Elements are :- "+index+" "+actualFooterDiv1Name);			
			if(actualFooterDiv1Name.equals(expectedAlternativeLoginText))
			{
log.info("The actual name of Alternative Login Text is matched with the Expected Text | PASS");		
			}
			else {
log.info("The actual name of Alternative Login Text is NOT matched with the Expected Text | FAIL");					
			}
		}	
		}
		@FindBy(xpath="//*[@id=\"footer\"]/div[1]")
		List<WebElement> footerDiv2Elemets;
		public void orangeHRMApplication_FooterDiv2Elements() {
			for(int i=0; i<footerDiv2Elemets.size();i++)
			{
				String actualFooterDiv2ElementText=footerDiv2Elemets.get(i).getText();
log.info("OrangeHRM Application footer Div2 Elements are:- "+ i+"-- "+actualFooterDiv2ElementText);
			}
		}
	
		@FindBy(linkText = "OrangeHRM, Inc")
		WebElement footerOrangeHRMInc_Link;
		public void orangeHRMApplication_IncLink()
		{
			footerOrangeHRMInc_Link.click();
log.info("OrangeHrm Inc. is clicked ");	
			String expectedOrangeHRMIncTitle="OrangeHRM HR Software | OrangeHRM";
			String actualOHRMIncWebPageTitle=driver.getTitle();
			String oHrmIncUrl=driver.getCurrentUrl();
log.info("OrangeHRM Inc. WebPage title is:- "+actualOHRMIncWebPageTitle);	
			if(actualOHRMIncWebPageTitle.equals(expectedOrangeHRMIncTitle))
			{
log.info("The Actual Title of OrangeHRM Inc. WebPage is matched with the Expected Title | PASS");			
			}
			else {
log.info("The Actual Title of OrangeHRM Inc. WebPage is NOT matched with the Expected Title | FAIL");		
			}
	}

		
		@FindBy(xpath ="/html/body/div[1]/div/div[4]/div[2]")
		List<WebElement>orangeHRMSocialIconsList;
		public void orangeHRMApplicationSocialIcons()
		{
			for(int sind = 0; sind<orangeHRMSocialIconsList.size(); sind++)
			{
				WebElement ohrmSocialIconsElement=orangeHRMSocialIconsList.get(sind);
				String actualOrangeHRMSocialIconsName = ohrmSocialIconsElement.getAttribute("alt");
				Boolean flag=ohrmSocialIconsElement.isDisplayed();
				if(flag)
				{
log.info("OrangeHRM Application Social Icon"+sind+1+" :- "+ actualOrangeHRMSocialIconsName);			
log.info(actualOrangeHRMSocialIconsName+" is displayed");
				}
				else {
log.info(actualOrangeHRMSocialIconsName+" is not displayed");
				}
			
			
			
			}
		}
		
	
}
