package com.OrangeHRMApplicationPagesTests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import com.BaseTest.BaseTest;
import com.OrangeHRMApplicationPages.MultiUserCredentials_Ohrm_Login_Page;
import com.Utilities.log;

public class MultiUsersCredentials_OhrmLoginPage_Test extends BaseTest{

	FileInputStream excelMultiUsersFile;
	XSSFWorkbook workBook;
	XSSFSheet sheet;

	
	MultiUserCredentials_Ohrm_Login_Page  multiUsers;
	
	public void initi() throws IOException {
		multiUsers = new MultiUserCredentials_Ohrm_Login_Page();
		
	}
	
	@Test(priority=1,description="Validating OrangeHRM Application LogIn Page Text - Test ")
	public void validatingLogInPanelTextTest() throws IOException
	{
		 multiUsers.validatingLoginPage_LogInPanelText();
	}	
	

	@Test(priority=2,description="Validating OrangeHRM Application LogInPage Logo - Test ")
	public void validatingOrangeHRMApplicationLogoTest() throws IOException
	{
		multiUsers.validatingOrangeHRMApplication_LogInPageLogo();
	}
	
	@Test(priority=3,description=" Validating OrangeHRM Application LogIn Funcationality - Test")
	public void orangeHRMApplicationLogInPage_logInTest() throws IOException
	{
		excelMultiUsersFile = new FileInputStream("./src/main/java/com/OrangeHRMTestDataFiles/1LogInTest.xlsx");
		workBook = new XSSFWorkbook(excelMultiUsersFile);
		sheet = workBook.getSheet("Sheet1");
		
		for(int rowIndex =1; rowIndex<=sheet.getLastRowNum();rowIndex++)
		{
			Row currentRow=sheet.getRow(rowIndex);
			String expecteduserName=currentRow.getCell(9).getStringCellValue();
			String expectedPassword=currentRow.getCell(10).getStringCellValue();
			
			multiUsers.orangeHRMApplicationLogInPage_LogInButton(expecteduserName, expectedPassword);
			
			String actualCurrentWebPageUrl=driver.getCurrentUrl();
			log.info("UserName Entered :-"+expecteduserName+ " || Password Entered:- "+expectedPassword);

			if(actualCurrentWebPageUrl.contains("validateCredentials"))
			{
				//File snap=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				//FileUtils.copyFile(snap, new File("D:\\Jaava\\Eclipse Workspace\\OrangeHRMApplication_POM\\OrangeHRMWebApp_Error_Screenshots"+expecteduserName+" "+expectedPassword+".png"));
				TakesScreenshot snapShot=((TakesScreenshot)driver);
				File src=snapShot.getScreenshotAs(OutputType.FILE);
				File destFile=new File("./OrangeHRMWebApp_Error_Screenshots/ "+expecteduserName+" "+expectedPassword+".png");
				FileUtils.copyFile(src, destFile);
			currentRow.createCell(11).setCellValue("FAIL");
			currentRow.createCell(12).setCellValue("./OrangeHRMWebApp_Error_Screenshots/ "+expecteduserName+" "+expectedPassword+".png");
				//workBook.addPicture(src, 6);
log.info("Failed to Navigate to the Expected OrangeHRM HomePage | FAIL");		
			
			}
			// Validation of HomePage	
			if(actualCurrentWebPageUrl.contains("dashboard"))
			{	currentRow.createCell(11).setCellValue("PASS");
log.info("********Successfully Navigated to the OrangeHRM HomePage with Valid Data | PASS");				
			}
			
//System.out.println("UserName Entered :-"+expecteduserName+ " || Password Entered:- "+expectedPassword);			

			
				
			}
log.info("Validation of Log In Button Functionality is Successfully Completed");		
		
	
	}	
		
	@Test(priority =4, description ="Validating OrangeHRM HomePage Welcome Admin Element Functionality - Test")
	public void orangeHRMApplicationHome_WelcomeAdminClick() throws IOException
	{
		MultiUserCredentials_Ohrm_Login_Page multiUsers = new MultiUserCredentials_Ohrm_Login_Page();
		multiUsers.orangeHRMApplication_welcomeAdmin();
	}
	
	@Test(priority =5, description ="Validating OrangeHRM Application Log Out Functionality - Test")
	public void orangeHRMApplicationLogOutTest() throws IOException
	{
		MultiUserCredentials_Ohrm_Login_Page multiUsers = new MultiUserCredentials_Ohrm_Login_Page();
		multiUsers.orangeHRMApplication_logOut();
	}
	
	@Test(priority =6, description ="Validating OrangeHRM Application LoginPage ComboBox-DropDown -Test")
	public void orangeHRMApplicationLoginPage_ComboBoxTest() throws IOException {
		
		MultiUserCredentials_Ohrm_Login_Page multiUsers = new MultiUserCredentials_Ohrm_Login_Page();
		multiUsers.OrangeHRMLoginPage_SelectDropDown();
		
	}
	
	@Test(priority =7, description ="Validating OrangeHRM Application Footer Login Button Functionality - Test")
	public void orangeHRMApplication_FooterLoginButtonTest() throws IOException
	{
		MultiUserCredentials_Ohrm_Login_Page multiUsers = new MultiUserCredentials_Ohrm_Login_Page();
	multiUsers.orangeHRMApplicationFooterLoginButton();
	}
	
	@Test(priority=8, description = "Validating OrangeHRM Application Footer Alternative Login Text- Test")
	public void orangeHRMApplication_FooterAlternativeLoginTextTest() throws IOException
	{
		MultiUserCredentials_Ohrm_Login_Page multiUsers = new MultiUserCredentials_Ohrm_Login_Page();
		multiUsers.orangeHRMApplication_FooterAlternativeLoginText();
	}
	
	@Test(priority =9, description ="Validating Orange HRM Application Footer Div2 Elements - Test")
	public void orangeHRMApplication_FooterDiv2ElementsTest() throws IOException
	{
		MultiUserCredentials_Ohrm_Login_Page multiUsers = new MultiUserCredentials_Ohrm_Login_Page();
		multiUsers.orangeHRMApplication_FooterDiv2Elements();
	
	}
	
	@Test(priority  = 10, description ="Validating OrangeHRM Appplication OHRM Inc. Link - Test ")
	public void orangeHRMApplicationOhrmIncLinkTest() throws IOException
	{
		MultiUserCredentials_Ohrm_Login_Page multiUsers = new MultiUserCredentials_Ohrm_Login_Page();
		multiUsers.orangeHRMApplication_IncLink();
	
	}
	
	@Test(priority =11, description ="Validating OrangeHRM Application Social Icons - Test")
	public void orangeHRMApplicationSocialIconsTest() throws IOException
	{
		MultiUserCredentials_Ohrm_Login_Page multiUsers = new MultiUserCredentials_Ohrm_Login_Page();
		multiUsers.orangeHRMApplicationSocialIcons();
		
		FileOutputStream loginResultExcel = new FileOutputStream("./src/main/java/com/OrangeHRMTestResultFiles/MultipleUsers_LoginValidation.xlsx");
		workBook.write(loginResultExcel);
	}
	
	
	
	}
	
	
	

