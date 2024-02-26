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
import pagesOfYasasiiWeb.Naufar_VisitSummary_YasassiWeb;
import pagesOfYasasiiWeb.KIMS_MedicineAdmin_VisitSummary_YasasiWeb;

public class Naufar_VisitSummary_testcaseYW extends TestBaseYasasiiWeb  {
	public static LoginPageYasasiiWeb login;
    public static HomePageYasasiiWeb hm;


@BeforeClass
public void navigateemradt() throws InterruptedException {
	
	this.login =new LoginPageYasasiiWeb(driver) ;
	this.hm = login.enterloginDetails("admin", "KAmeda123$", "Naufar Center"); 
	Thread.sleep(3000);
	
}

@Test(dataProvider="getData"  , priority=0)
public void doctorNote( String MRNo,String DOCuser ,String DOCpassword,String URL , String Site ,String ADTProvider, String user , String Password ) throws InterruptedException, IOException, AWTException {
		Thread.sleep(2000);
		
		Naufar_VisitSummary_YasassiWeb cpoe = new Naufar_VisitSummary_YasassiWeb(driver);
		
		cpoe.ADT(ADTProvider, MRNo);
		
		cpoe.DoctorNote(DOCuser, DOCpassword, Site, MRNo, ADTProvider);
		
		cpoe.VisitSummary(DOCuser, DOCpassword,  Site, MRNo, ADTProvider);
		
		
		}

@Test(dataProvider="getData"  , priority=1)
public void PanelCheck( String MRNo,String DOCuser ,String DOCpassword,String URL , String Site ,String ADTProvider, String user , String Password ) throws InterruptedException, IOException, AWTException {
		Thread.sleep(2000);
		
		Naufar_VisitSummary_YasassiWeb cpoe = new Naufar_VisitSummary_YasassiWeb(driver);
		
		cpoe.PanelCheck( user,Password, Site, MRNo);
		
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

	Object[][] data =readExcel("visitSummary");
	return data;	
}




}
