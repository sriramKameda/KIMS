package pagesTestCasesYasasiiWeb;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.baseYasasiiWeb.TestBaseYasasiiWeb;

import pagesOfYasasiiWeb.HomePageYasasiiWeb;
import pagesOfYasasiiWeb.LoginPageYasasiiWeb;
import pagesOfYasasiiWeb.KIMS_ORFlow_Yasasiiweb;

public class KIMS_ORFlowTestCases extends TestBaseYasasiiWeb{
	public static LoginPageYasasiiWeb login;
	public static HomePageYasasiiWeb hm;


	@BeforeClass
	public void navigateFOPage() throws InterruptedException {

		KIMS_ORFlowTestCases.login =new LoginPageYasasiiWeb(driver) ;
		KIMS_ORFlowTestCases.hm = login.enterloginDetails("admin", "KAmeda123$", "KIMSHEALTH Nagarcoil");
		Thread.sleep(2000);


	}
		@Test(dataProvider="getData",priority=0)
	public void foReg(String NAME , String lastname, String AGE , String MBLNO , String ORGANISATION , String ADDRESS , String AADHAAR,String MRNO ,String PROVIDER ,String MajorProcedure ,String ADTprovider,String docid,String docpassword,String User , String Password,String Site,String Medicine,String refProvider,String anesthesiaID , String anesthesiapassword,String ORAdmin, String ORpassword,String Nuruser ,String Nurpassword,String ReferalID, String Referalpassword) throws InterruptedException, IOException, AWTException {
		Thread.sleep(2000);

		KIMS_ORFlow_Yasasiiweb reb = new KIMS_ORFlow_Yasasiiweb(driver) ;

		reb.patReg(NAME, lastname, AGE, MBLNO, ORGANISATION, ADDRESS, AADHAAR, MRNO, PROVIDER, User);

		reb.ADT(ADTprovider);

	}

	@Test(dataProvider="getData",priority=1)
	public void doc(String NAME , String lastname, String AGE , String MBLNO , String ORGANISATION , String ADDRESS , String AADHAAR,String MRNO ,String PROVIDER ,String MajorProcedure ,String ADTprovider,String docid,String docpassword,String User , String Password,String Site,String Medicine,String refProvider,String anesthesiaID , String anesthesiapassword,String ORAdmin, String ORpassword,String Nuruser ,String Nurpassword,String ReferalID, String Referalpassword) throws InterruptedException, IOException {

		Thread.sleep(2000);
		KIMS_ORFlow_Yasasiiweb docnote= new KIMS_ORFlow_Yasasiiweb(driver);

		docnote.addingmajorprocedure(MRNO, MajorProcedure, Medicine, refProvider, docid, docpassword, Site);

		docnote.anesthesiafitness(MRNO, anesthesiaID, anesthesiapassword, Site);

	}

	@Test(dataProvider="getData",priority=2)
	public void or(String NAME , String lastname, String AGE , String MBLNO , String ORGANISATION , String ADDRESS , String AADHAAR,String MRNO ,String PROVIDER ,String MajorProcedure ,String ADTprovider,String docid,String docpassword,String User , String Password,String Site,String Medicine,String refProvider,String anesthesiaID , String anesthesiapassword,String ORAdmin, String ORpassword,String Nuruser ,String Nurpassword,String ReferalID, String Referalpassword) throws InterruptedException, IOException, AWTException {

		Thread.sleep(2000);
		KIMS_ORFlow_Yasasiiweb orsch= new KIMS_ORFlow_Yasasiiweb(driver);

		orsch.ORSchedule(ORAdmin, ORpassword, Site, MRNO);

		orsch.operationroomprocess(MRNO, Nuruser, Nurpassword, Site);

		orsch.referalLogin(ReferalID, Referalpassword, Site, MRNO);
		
	}





	@DataProvider
	public Object[][] getData() throws Exception{

		Object[][] data =readExcel("OR");
		return data;	
	}	

}