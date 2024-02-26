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
import pagesOfYasasiiWeb.Naufar_Task_Stickynote_Qasi_Yasasiiweb;

public class Naufar_Task_Stickynote_Qasi_TestcaseYW extends TestBaseYasasiiWeb  {
	public static LoginPageYasasiiWeb login;
public static HomePageYasasiiWeb hm;


@BeforeClass
public void navigateemradt() throws InterruptedException {
	
	this.login =new LoginPageYasasiiWeb(driver) ;
	this.hm = login.enterloginDetails("admin","KAmeda123$","Naufar Center");
	Thread.sleep(3000);
	
}

@Test(dataProvider="getData"  , priority=0)
public void Reg(String title,String Name,String Lastname ,String Dob, String DocID, String MobNo,String Address,String MRNO, String PROVIDER ,String id, String docpassword , String Site,String URL,String ADTprovider,String nurseid, String nursepassword) throws InterruptedException, IOException, AWTException {
		Thread.sleep(2000);
		
		    
		Naufar_Task_Stickynote_Qasi_Yasasiiweb INS = new Naufar_Task_Stickynote_Qasi_Yasasiiweb(driver);

		INS.patreg(title, Name, Lastname, Dob, DocID, MobNo, Address, MRNO, PROVIDER);
		
		INS.Task();
		
		
			}
 


@Test(dataProvider="getData"  , priority=1)
public void Patreg(String title,String Name,String Lastname ,String Dob, String DocID, String MobNo,String Address,String MRNO, String PROVIDER ,String id, String docpassword , String Site,String URL,String ADTprovider,String nurseid, String nursepassword) throws InterruptedException, IOException, AWTException {
		Thread.sleep(2000);
		
     
		Naufar_Task_Stickynote_Qasi_Yasasiiweb INS = new Naufar_Task_Stickynote_Qasi_Yasasiiweb(driver);
		
		
		INS.DoctorNote(MRNO, id, docpassword, Site);
	
		INS.nursenote(nurseid, nursepassword, Site, MRNO);
		 
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

	Object[][] data =readExcel("Task");
	return data;	
}

}
