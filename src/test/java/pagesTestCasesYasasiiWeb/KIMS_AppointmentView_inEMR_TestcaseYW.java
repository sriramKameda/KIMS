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
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;
import pagesOfYasasiiWeb.KIMS_AppointmentView_inEMR_Yasasiiweb;

public class KIMS_AppointmentView_inEMR_TestcaseYW  extends TestBaseYasasiiWeb  {
	public static LoginPageYasasiiWeb login;
public static HomePageYasasiiWeb hm;


@BeforeClass
public void navigateemradt() throws InterruptedException {
	
	this.login =new LoginPageYasasiiWeb(driver) ;
	this.hm = login.enterloginDetails("admin","KAmeda123$","KIMSHEALTH Nagarcoil");
	Thread.sleep(3000);
	
}

@Test(dataProvider="getData"  , priority=0)
public void Reg(String title,String Name,String Lastname,String Dob, String DocID, String MobNo,String Address,String MRNo,String Provider ,String User , String Password , String Site) throws InterruptedException, IOException, AWTException {
		Thread.sleep(2000);
		 
		    
		KIMS_AppointmentView_inEMR_Yasasiiweb App = new KIMS_AppointmentView_inEMR_Yasasiiweb(driver);
		
		App.Patreg(title, Name, Lastname, Dob, DocID, MobNo, Address, MRNo, Provider);
		
		App.Appointment(Provider);
		
}

@Test(dataProvider="getData"  , priority=1)
public void EMRapp(String title,String Name,String Lastname,String Dob, String DocID, String MobNo,String Address,String MRNo,String Provider ,String User , String Password , String Site) throws InterruptedException, IOException, AWTException {
		Thread.sleep(2000);
		
		    
		KIMS_AppointmentView_inEMR_Yasasiiweb App = new KIMS_AppointmentView_inEMR_Yasasiiweb(driver);
		
		App.EMR_Appointment(MRNo, Provider, MobNo,  User, Password, Site);   
		
		
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

	Object[][] data =readExcel("EMRAPP"); 
	return data;	
}



}
