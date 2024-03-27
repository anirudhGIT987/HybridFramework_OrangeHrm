package com.OrangeHRMApplicationPagesTests;

import org.testng.annotations.Test;

import com.BaseTest.BaseTest;
import com.OrangeHRMApplicationPages.OrangeHRMApplication_LogInPage;

public class OrangeHRMApplication_LoginPage_SingleData_Test extends BaseTest {
	
	
	
	
	
	
	@Test(priority=1,description="Validating OrangeHRM Application LogIn Page Text - Test ")
	public void validatingLogInPanelTextTest()
	{
	OrangeHRMApplication_LogInPage orangeHRM = new OrangeHRMApplication_LogInPage();
	orangeHRM.validatingLogInPanelText();
	}


	@Test(priority=2,description="Validating OrangeHRM Application LogIn Test ")
	public void validatingOrangeHRMApplicationLogInPageLogoTest()
	{
	OrangeHRMApplication_LogInPage orangeHRM = new OrangeHRMApplication_LogInPage();
	orangeHRM.validatingOrangeHRMApplicationLogInPageLogo();
	}

	@Test(priority=3,description=" Validating OrangeHRM Application LogIn Funcationality - Test")
	public void orangeHRMApplicationLogInPage_logInTest()
	{
	OrangeHRMApplication_LogInPage orangeHRM = new OrangeHRMApplication_LogInPage();
	orangeHRM.orangeHRMApplicationLogInPage_logIn("AnirudhHrm", "Ohrm@987");
	}
	
	
	@Test(priority=4,description=" Validating OrangeHRM Application WelcomeAdmin Funcationality - Test")
	public void welcomeAdminValidation()
	{
	OrangeHRMApplication_LogInPage orangeHRM = new OrangeHRMApplication_LogInPage();
	orangeHRM.welcomeAdmin();
	}
	
	@Test(priority=5,description=" Validating OrangeHRM Application LogOut Funcationality - Test")
	public void logOutValidation()
	{
	OrangeHRMApplication_LogInPage orangeHRM = new OrangeHRMApplication_LogInPage();
	orangeHRM.logOut();
	}
	
	
	
	
	
	
	
	
	
	@Test(priority =6, description = "Validating OrangeHRM Application Footer Element Alternative Login Text - Test")
	public void orangeHRMApplicationFooterAlternativeLoginTextTest() {
		OrangeHRMApplication_LogInPage orangeHRM = new OrangeHRMApplication_LogInPage();

		orangeHRM.validatingFooterAlternativeLoginText();
	}
	
	
	@Test(priority =7, description ="Validating OrangeHRM Application Select DropDown Functionality Test ")
	public void orangeHRMApplicationSelectDropDownTest()
	{
		OrangeHRMApplication_LogInPage orangeHRM = new OrangeHRMApplication_LogInPage();

		orangeHRM.validatingOrangeHRMSelectDropDown();
	}
	
	
	@Test(priority = 8, description = "Validaiton of OrangeHRM Application Footer LoginButton Functionality Test")
	public void orangeHRMFooterLoginButtonTest()
	{	OrangeHRMApplication_LogInPage orangeHRM = new OrangeHRMApplication_LogInPage();

		orangeHRM.validatingFooterLoginButton();
	}
	
	@Test(priority = 9, description = "Validation of OrangeHRM Application Version Name Test")
	public void orangeHRMApplicationVersionNameTest()
	{	OrangeHRMApplication_LogInPage orangeHRM = new OrangeHRMApplication_LogInPage();

		orangeHRM.validatingOrangeHRMVersionText();
	}
	
	
	@Test(priority = 10, description ="Validation of OrangeHRM Application Footer Div2 Elements")
	public void orangeHRMApplicationFooterDiv2Elements() {
		OrangeHRMApplication_LogInPage orangeHRM = new OrangeHRMApplication_LogInPage();

		orangeHRM.ohrmLoginPageFooterDiv2Elements();
	}
	
	
	@Test(priority = 11, description = "Validation of OrangeHRM Application Footer OHRM Inc. Link Test")
	public void orangeHRMApplicationOHRMIncLink()
	{	OrangeHRMApplication_LogInPage orangeHRM = new OrangeHRMApplication_LogInPage();

		orangeHRM.footerOHRMIncLink();
	}
	
	
	
	
	
	
}
