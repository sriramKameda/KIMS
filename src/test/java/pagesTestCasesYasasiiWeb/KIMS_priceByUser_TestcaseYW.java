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
import pagesOfYasasiiWeb.KIMS_OutsiderPatientFlow_YasasiiWeb;
import pagesOfYasasiiWeb.KIMS_priceByUser_Yasasiiweb;

public class KIMS_priceByUser_TestcaseYW  extends TestBaseYasasiiWeb  {
	public static LoginPageYasasiiWeb login;
public static HomePageYasasiiWeb hm;


@BeforeClass
public void navigateemradt() throws InterruptedException {
	
	this.login =new LoginPageYasasiiWeb(driver) ;
	this.hm = login.enterloginDetails("admin","KAmeda123$","KIMSHEALTH Nagarcoil");
	Thread.sleep(3000);
	
}

@Test(dataProvider="getData"  , priority=0)
public void pricebyUser(String codeType , String code,String ServiceName , String BaseCategory , String SubCategory, String User ,String Password , String Site , String MRNO,String Provider ,String ServiceDescription) throws InterruptedException, IOException, AWTException {
		Thread.sleep(2000);
		
		    
		KIMS_priceByUser_Yasasiiweb price = new KIMS_priceByUser_Yasasiiweb(driver);
		
		price.master(codeType, code, ServiceName, BaseCategory, SubCategory, ServiceDescription);
		
    	price.tariff(ServiceName, SubCategory);
		 
		price.Billing( User, Password, Site, MRNO, ServiceName, Provider);
	  		
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

	Object[][] data =readExcel("priceby");
	return data;	

 


}

}
