package pagesTestCasesYasasiiWeb;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.TestBaseYasasiiWeb;

import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.KIMS_BirthRegistrationYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;

public class KIMS_BirthRegistrationTestCasesYW extends TestBaseYasasiiWeb  {
	public static LoginPageYasasiiWeb login;
public static HomePageYasasiiWeb hm;


@BeforeClass
public void navigateemradt() throws InterruptedException { 
	
	this.login =new LoginPageYasasiiWeb(driver) ;
	this.hm = login.enterloginDetails("admin", "KAmeda123$", "KIMSHEALTH Nagarcoil");
	Thread.sleep(3000);
	
}

@Test(dataProvider="getData"  , priority=0)
public void BirthReg(String title , String NAME ,String lastName, String DOB , String MBLNO , String ADDRESS , String DOCno,String MRNO, String Provider , String MRNo1, String ADTprovider,String nurseUser, String password , String depUser , String RADuser , String meduser, String AdminUser , String AdminPassword,String DOCuser , String DOCpassword, String Site) throws InterruptedException, IOException, AWTException {
		Thread.sleep(2000);
		
		KIMS_BirthRegistrationYasasiiWeb Schedule1 = new KIMS_BirthRegistrationYasasiiWeb(driver);
		
		Schedule1.patreg(title, NAME, lastName, DOB, MBLNO, ADDRESS, DOCno, MRNo1, Provider, ADTprovider);
		
		}

@Test(dataProvider="getData" , priority =1)
public void Doctornote(String title , String NAME ,String lastName, String DOB , String MBLNO , String ADDRESS , String DOCno,String MRNo, String Provider , String MRNo1, String ADTprovider,String nurseUser, String password , String depUser , String RADuser , String meduser, String AdminUser , String AdminPassword,String DOCuser , String DOCpassword, String Site) throws InterruptedException, IOException, AWTException {
		Thread.sleep(5000);
		
		KIMS_BirthRegistrationYasasiiWeb Schedule1 = new KIMS_BirthRegistrationYasasiiWeb(driver);
		
		Schedule1.pregnantNOTE(NAME, MRNo,Provider,DOCuser , DOCpassword, Site);
		
		Schedule1 .DeliveryNOTE();
		
		Schedule1.Birthreg(MRNo, Provider, ADTprovider, MRNo1, Site, AdminUser, AdminPassword);
	
		}

@Test(dataProvider="getData" , priority=2)
public void babynote(String title , String NAME ,String lastName, String DOB , String MBLNO , String ADDRESS , String DOCno,String MRNO, String Provider , String MRNo1, String ADTprovider,String nurseUser, String password , String depUser , String RADuser , String meduser, String AdminUser , String AdminPassword,String DOCuser , String DOCpassword, String Site) throws InterruptedException, IOException {
		Thread.sleep(5000);
		
		KIMS_BirthRegistrationYasasiiWeb Schedule1 = new KIMS_BirthRegistrationYasasiiWeb(driver);
		
		Schedule1.babyNote(MRNo1 , DOCuser ,  DOCpassword, Site);
		
		Schedule1.immunizationchart();
		
		}

@Test(dataProvider="getData" , priority=3)
public void Babydischarge(String title , String NAME ,String lastName, String DOB , String MBLNO , String ADDRESS , String DOCno,String MRNo,String Provider , String MRNo1, String ADTprovider,String nurseUser, String password , String depUser , String RADuser , String meduser, String AdminUser , String AdminPassword,String DOCuser , String DOCpassword, String Site) throws InterruptedException, IOException, AWTException {
		Thread.sleep(2000);
		
		KIMS_BirthRegistrationYasasiiWeb Schedule1 = new KIMS_BirthRegistrationYasasiiWeb(driver);
		
		Schedule1.dischargeRecommendationBaby( MRNo1 ,  nurseUser ,  password, DOCuser ,  DOCpassword,   Site);
		
		Schedule1.dischargeApprovalBaby(MRNo1, nurseUser, password, depUser, RADuser, meduser, AdminUser, AdminPassword,Site);
		
		Schedule1.LaboratoryClearanceBaby(MRNo1, nurseUser, password, depUser, RADuser, meduser, AdminUser, AdminPassword,Site);
		
	//	Schedule1.radiologyClearanceBaby(MRNo1, nurseUser, password, depUser, RADuser, meduser, AdminUser, AdminPassword,URL,Site);
	//	Schedule1.medicalClearanceBaby(MRNo1, nurseUser, password, depUser, RADuser, meduser, AdminUser, AdminPassword,URL,Site);
	//	Schedule1.pharmacyClearanceBaby(MRNo1, nurseUser, password, depUser, RADuser, meduser, AdminUser, AdminPassword,Site);
	
		Schedule1.ADTapproval(MRNo1, nurseUser, password, depUser, RADuser, meduser, AdminUser, AdminPassword,Site);
		
		Schedule1.financialClearance(MRNo1, nurseUser, password, depUser, RADuser, meduser, AdminUser, AdminPassword,Site);
		
		Schedule1.physicalDischarge(MRNo1, nurseUser, password, depUser, RADuser, meduser, AdminUser, AdminPassword ,DOCuser , DOCpassword,Site);
}

@Test(dataProvider="getData" , priority=4)
public void MOMdischarge(String title , String NAME ,String lastName, String DOB , String MBLNO , String ADDRESS , String DOCno,String MRNo, String Provider , String MRNo1, String ADTprovider,String nurseUser, String password , String depUser , String RADuser , String meduser, String AdminUser , String AdminPassword,String DOCuser , String DOCpassword, String Site) throws InterruptedException, IOException, AWTException {
		Thread.sleep(2000);
		
		KIMS_BirthRegistrationYasasiiWeb Schedule = new KIMS_BirthRegistrationYasasiiWeb(driver);
		
		Schedule.dischargeRecommendationMOM(MRNo, nurseUser, password, DOCuser , DOCpassword, meduser, AdminUser, AdminPassword,Site);
		
		Schedule.dischargeApprovalMOM(MRNo, nurseUser, password, depUser, RADuser, meduser, AdminUser, AdminPassword,Site);
		
		Schedule.laboratoryclearanceMOM(MRNo, nurseUser, password, depUser, RADuser, meduser, AdminUser, AdminPassword);
		
		//Schedule.RadiologyclearanceMOM(MRNo, nurseUser, password, depUser, RADuser, meduser, AdminUser, AdminPassword,URL);
		//Schedule.MedicalclearanceMOM(MRNo, nurseUser, password, depUser, RADuser, meduser, AdminUser, AdminPassword,URL);
		//Schedule.pharmacyClearanceMOM(MRNo, nurseUser, password, depUser, RADuser, meduser, AdminUser, AdminPassword,Site);
		
		Schedule.ADTapprovalMOM(MRNo, nurseUser, password, depUser, RADuser, meduser, AdminUser, AdminPassword,Site);
		
		Schedule.financialClearanceMOM(MRNo, nurseUser, password, depUser, RADuser, meduser, AdminUser, AdminPassword,Site);
		
		Schedule.physicalDischargeMOM(MRNo, nurseUser, password, depUser, RADuser, meduser);
		
}


@AfterClass
public void logout() throws Exception
{
	Robot t=new Robot();
	t.keyPress(KeyEvent.VK_ESCAPE);
	t.keyRelease(KeyEvent.VK_ESCAPE);
	Thread.sleep(400);
	t.keyPress(KeyEvent.VK_ESCAPE);
	t.keyRelease(KeyEvent.VK_ESCAPE);
	
	this.hm.clickLogout();
}

@DataProvider
public Object[][] getData() throws Exception{

	
	
	Object[][] data =readExcel("BirthRegistration");
	return data;	
}


}