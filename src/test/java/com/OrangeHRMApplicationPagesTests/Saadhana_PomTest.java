package com.OrangeHRMApplicationPagesTests;

import org.testng.annotations.Test;

import com.OrangeHRMApplicationPages.Saadhana_ObjectRepository;

public class Saadhana_PomTest {

	Saadhana_ObjectRepository ohrm = new Saadhana_ObjectRepository();
	
	@Test(priority=1,description="Validating OrangeHRM Application LogIn Page Text - Test ")
	public void validatingLogInPanelTextTest()
	{
			ohrm.validatingLogInPanelText();
	}
	
	@Test(priority=2,description="Validating OrangeHRM Application LogIn Test ")
	public void validatingOrangeHRMApplicationLogInPageLogoTest()
	{
		ohrm.validatingOrangeHRMApplicationLogInPageLogo();
	}
	
	
	@Test(priority =3,description=" Validating OrangeHRM Application LogIn Funcationality - Test")
	public void orangeHRMApplicationLogInPage_logInTest()
	{
			ohrm.orangeHRMApplicationLogInPage_logIn("AnirudhHrm", "Ohrm@987");
	}
	
	@Test(priority =4, description ="Validating OrangeHRM Application Select DropDown Functionality Test ")
	public void orangeHRMApplicationSelectDropDownTest()
	{
		ohrm.validatingOrangeHRMSelectDropDown();
	}
	
	
	@Test(priority = 5, description = "Validaiton of OrangeHRM Application Footer LoginButton Functionality Test")
	public void orangeHRMFooterLoginButtonTest()
	{
		ohrm.validatingFooterLoginButton();
	}
	
	@Test(priority = 6, description = "Validation of OrangeHRM Application Footer OHRM Inc. Link Test")
	public void orangeHRMApplicationOHRMIncLink()
	{
		ohrm.footerOHRMIncLink();
	}
	
	
}
