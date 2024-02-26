package pagesOfYasasiiWeb;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;
public class KIMS_ORFlow_Yasasiiweb extends PageFactoryInitYasasiiWeb{
	protected static String filepath=System.getProperty("user.dir")+"C:\\Users\\haritha\\Workspace Eclipse\\HHCYasasiiWeb24090\\src\\test\\resources\\excelYasasiiWeb\\24090testData.xls";


	public KIMS_ORFlow_Yasasiiweb(WebDriver driver) {
		super(driver);

	}



	////Registration


	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='menu-toggle']")
	public WebElement hamberger;

	@FindBy(xpath = "//i[@class='ki ki-reception-fill']")
	public WebElement FO;

	@FindBy(xpath = "//span[@class='checkmark']")
	public WebElement billprint;

	@FindBy(xpath="//i[@title='Addendum']")
	public WebElement Addendum;

	@FindBy(xpath="//textarea[@id='addendum']")
	public WebElement AddendumTestarea;

	@FindBy(xpath = "//input[@id='lastname']")
	public WebElement Lastname;

	@FindBy(xpath = "//div[contains(@class,'col-md-3')]//div[contains(@class,'card-body')]//div[2]//div[1]//div[1]//ki-select-control[1]//div[1]//input[1]")
	public WebElement Title;

	@FindBy(xpath = "//input[@id='fo-card-reader-firstname']")
	public WebElement FirstName;

	@FindBy(xpath = "//input[@id='age']")
	public WebElement age;

	@FindBy(xpath = "//div[@class='form-group ng-star-inserted']//input[@id='mobilephone']")
	public WebElement mobileNo;

	@FindBy(xpath = "//input[@id='division']")
	public WebElement Organisation;

	@FindBy(xpath = "//span[normalize-space()='Contact Information']")
	public WebElement ContactInformation;

	@FindBy(xpath = "//input[@id='homeaddress1']")
	public WebElement address;

	@FindBy(xpath = "//span[normalize-space()='Document Identification']")
	public WebElement DocID;

	@FindBy(xpath = "//input[@id='value']")
	public WebElement aadharNo;

	@FindBy(xpath = "//button[@id='adddoc']//label")
	public WebElement docAdd;

	@FindBy(xpath = "//span[normalize-space()='Insurance and Other information']")
	public WebElement Insurance;

	@FindBy(xpath = "//ki-select-control[contains(@placeholder,'Ins/Corp')]//input[@id='undefined']")
	public WebElement Inscorp;

	@FindBy(xpath = "//ki-select-control[contains(@placeholder,'Plan name')]//input[@id='undefined']")
	public WebElement PlanName;

	@FindBy(xpath = "//span[@class='icon-btn btn-dark-green inline ng-star-inserted']//i[@class='ki ki-plus']")
	public WebElement insAdd;

	@FindBy(xpath = "//button[contains(@class,'btn-feedback')]")
	public WebElement howDidYouKnow;

	@FindBy(xpath = "//button[contains(@class,'sm active pull-right')]")
	public WebElement OKhowDidYouKnow;

	@FindBy(xpath = "//button[@id='saveregistrationbutton']")
	public WebElement RegSave;

	@FindBy(xpath = "//div[@class='modal-body']//button[@type='button'][normalize-space()='OK']")
	public WebElement SaveSuccess;

	////Encounter

	@FindBy(xpath = "//input[@id='EncBillingproviders']")
	public WebElement providerName;

	@FindBy(xpath = "//i[@class='ki ki-plus']")
	public WebElement EncounterAdd;

	@FindBy(xpath = "//button[@id='billingsave']")
	public WebElement EncounterSave;

	@FindBy(xpath = "//button[normalize-space()='Clear']")
	public WebElement clear;

	@FindBy(xpath = "//div[@class='modal-body']//button[@type='button'][normalize-space()='OK']")
	public WebElement SAvesuccess;

	@FindBy(xpath = "//input[@id='recomproviderdisplayname']")
	public WebElement EnterProviderName;


	///ADT

	@FindBy(xpath = "//input[@id='reasonid']")
	public WebElement Priority;

	@FindBy(xpath = "//li[contains(text(),'Elective')]")
	public WebElement SelectPriority;

	@FindBy(xpath = "//input[@id='bedcategory']")
	public WebElement BedCategory;

	@FindBy(xpath = "//li[contains(text(),'ROOM')]")
	public WebElement SelectBedCategory;

	@FindBy(xpath = "//input[@id='bedclass']")
	public WebElement RoomType;

	@FindBy(xpath = "//input[@id='bednumber']")
	public WebElement Bed;

	@FindBy(xpath = "//button[@id='savepatadtbutton']")
	public WebElement SAve;

	@FindBy(xpath = "//i[@class='ki ki-patient-bed-fill']")
	public WebElement ADT;

	@FindBy(xpath = "//input[@id='loginsite']")
	public WebElement site;

	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='bar2']")
	public WebElement Hamberger;

	@FindBy(xpath = "//div[normalize-space()='EMR HomeScreen']")
	public WebElement EMRhomescreen;

	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement Searchfield;

	@FindBy(xpath = "//label[@class='icon doctornote']")
	public WebElement DoctorNote;

	@FindBy(xpath = "//input[@id='chiefcomplainttext']")    
	public WebElement cheifComplaint;

	@FindBy(xpath = "//input[@id='emrtemplateid']")
	public WebElement template;

	@FindBy(xpath = "//button[@aria-label='Ok'][normalize-space()='OK']")
	public WebElement tempOk;

	@FindBy(xpath = "//div[contains(text(),'Diagnosis and Plan')]")
	public WebElement Diagnosis;

	@FindBy(xpath = "//label[normalize-space()='CPOE Service']")
	public WebElement CPOEService;

	@FindBy(xpath = "//input[@id='cpoeSearchText']")
	public WebElement enternameofProcedure;

	@FindBy(xpath = "//label[normalize-space()='CPOE Pharmacy']")
	public WebElement CPOEMedicine;

	@FindBy(xpath = "//input[@formcontrolname='searchText']")
	public WebElement entermedicine;

	@FindBy(xpath = "//div[@class='item-name'][normalize-space()='Referral/Handover/Handoff']")
	public WebElement referral;

	@FindBy(xpath = "//div[@class='col-md-6 md-height-dropdown-list']//input[@id='rhtonamewithid']")
	public WebElement referralprovider;

	@FindBy(xpath = "//input[@id='timeframeid']")
	public WebElement timeframe;

	@FindBy(xpath = "//li[normalize-space()='Urgent']")
	public WebElement selecttimeframe;

	@FindBy(xpath = "//textarea[@id='reason']")
	public WebElement remarksadd;

	@FindBy(xpath = "//div[@class='col-md-12 ta-r rtl-right pr-0']//button[@type='button'][normalize-space()='Add']")
	public WebElement referraladd;

	@FindBy(xpath = "//input[@id='maincategory']")
	public WebElement maincategory;

	@FindBy(xpath = "//li[normalize-space()='Pending Orders']")
	public WebElement pendingorder;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-ot-landing[1]/div[2]/app-otview[1]/form[1]/div[2]/lib-scheduler[1]/form[1]/div[1]/div[1]/div[2]/div[2]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/span[1]")
	public WebElement selectslot;

	@FindBy(xpath = "/html[1]/body[1]/modal-container[1]/div[1]/div[1]/lib-appointment-modal[1]/div[2]/accordion[1]/accordion-group[2]/div[1]/div[2]/div[1]/lib-add-subresource[1]/div[1]/form[1]/div[3]/div[1]/table[1]/tbody[1]/tr[3]/td[1]/label[2]/i[1]")
	public WebElement anestheEdit;

	@FindBy(xpath = "//ki-select-control[@formcontrolname='attendeegradeid']//input[@id='undefined']")
	public WebElement grade;

	@FindBy(xpath = "//li[normalize-space()='Senior']")
	public WebElement selectgrade;

	@FindBy(xpath = "//ki-select-control[@class='ng-untouched ng-pristine ng-invalid']//div[@class='form-group ki-dropdown']//input[@id='undefined']")
	public WebElement anesthesiaclick;

	@FindBy(xpath = "//li[normalize-space()='Block Anesthesia']")
	public WebElement selectanesthesia;

	@FindBy(xpath = "//button[@id='subresourceaddid']")
	public WebElement add;

	@FindBy(xpath = "/html[1]/body[1]/modal-container[1]/div[1]/div[1]/lib-appointment-modal[1]/div[2]/accordion[1]/accordion-group[2]/div[1]/div[2]/div[1]/lib-add-subresource[1]/div[1]/form[1]/div[3]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/label[2]/i[1]")
	public WebElement surgeonedit;

	@FindBy(xpath = "//li[normalize-space()='Senior Surgeon']")
	public WebElement selectsugrade;

	@FindBy(xpath = "//div[@class='form-group clear-bottom ki-dropdown']//input[@id='undefined']")
	public WebElement reportingstatus;

	@FindBy(xpath = "//li[normalize-space()='Day Case']")
	public WebElement Daycase;

	@FindBy(xpath = "//button[@id='appointmentsaveid']")
	public WebElement saveschedule;

	@FindBy(xpath = "//button[normalize-space()='OK']")
	public WebElement saveok;

	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='bar2']")
	public WebElement togglebar;

	@FindBy(xpath = "//div[normalize-space()='OR Authorization']")
	public WebElement orAuthorization;

	@FindBy(xpath = "//input[@id='searchmrno']")
	public WebElement searchMRNo;

	@FindBy(xpath = "//ki-checkbox-control[@class='ng-untouched ng-pristine ng-valid']//label[@class='check-container min-top']//span[@class='checkmark']")
	public WebElement authorizedcheckbox;

	@FindBy(xpath = "//div[normalize-space()='OR Tracking Board']")
	public WebElement ORTrackingboard;

	@FindBy(xpath = "//th[normalize-space()='Status']")
	public WebElement status;

	@FindBy(xpath = "//input[@id='loginemail']")
	public WebElement userid;

	@FindBy(xpath = "//input[@id='loginpassword']")
	public WebElement password;

	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement eterMRNo;

	@FindBy(xpath = "//label[@class='icon cpoeadmin']")
	public WebElement CPOEAdministration;

	@FindBy(xpath = "//label[normalize-space()='Operation Room']")
	public WebElement OperatioRoom;

	@FindBy(xpath = "//span[@class='checkmark']")
	public WebElement checkboxselect;

	@FindBy(xpath = "//input[@id='name']")
	public WebElement VerifiedBy;

	@FindBy(xpath = "//button[normalize-space()='Save']")
	public WebElement ORSave;

	@FindBy(xpath = "//input[@id='password']")
	public WebElement Passwordfield;

	@FindBy(xpath = "//input[@id='rejectquantity']")
	public WebElement rejectedQua;

	@FindBy(xpath = "//input[@id='verifiedbyname']")
	public WebElement Nurseverifiesby;

	@FindBy(xpath = "//input[@id='verifiedpassword']")
	public WebElement verifiedPass;

	@FindBy(xpath = "//span[normalize-space()='Today']")
	public WebElement today;

	@FindBy(xpath = "//input[@placeholder='Search Resource..']")
	public WebElement searchOR;

	@FindBy(xpath = "/html[1]/body[1]/modal-container[1]/div[1]/div[1]/lib-appointment-modal[1]/div[2]/accordion[1]/accordion-group[2]/div[1]/div[2]/div[1]/lib-add-subresource[1]/div[1]/form[1]/div[1]/div[1]/ki-select-control[1]/div[1]/input[1]")
	public WebElement Resource;

	@FindBy(xpath = "/html[1]/body[1]/modal-container[1]/div[1]/div[1]/lib-appointment-modal[1]/div[2]/accordion[1]/accordion-group[2]/div[1]/div[2]/div[1]/lib-add-subresource[1]/div[1]/form[1]/div[1]/div[2]/ki-select-control[1]/div[1]/input[1]")
	public WebElement resourceType;

	@FindBy(xpath = "/html[1]/body[1]/modal-container[1]/div[1]/div[1]/lib-appointment-modal[1]/div[2]/accordion[1]/accordion-group[2]/div[1]/div[2]/div[1]/lib-add-subresource[1]/div[1]/form[1]/div[1]/div[3]/ki-auto-complete-pagination[1]/div[1]/input[1]")
	public WebElement Department;

	@FindBy(xpath = "/html[1]/body[1]/modal-container[1]/div[1]/div[1]/lib-appointment-modal[1]/div[2]/accordion[1]/accordion-group[2]/div[1]/div[2]/div[1]/lib-add-subresource[1]/div[1]/form[1]/div[1]/div[4]/ki-auto-complete-pagination[1]/div[1]/input[1]")
	public WebElement Name;

	@FindBy(xpath = "//ki-select-control[@formcontrolname='anesthesiatype']//input[@id='undefined']")
	public WebElement AnesthesiaType;

	@FindBy(xpath = "/html[1]/body[1]/modal-container[1]/div[1]/div[1]/lib-appointment-modal[1]/div[2]/accordion[1]/accordion-group[2]/div[1]/div[2]/div[1]/lib-add-subresource[1]/div[1]/form[1]/div[2]/div[1]/ki-select-control[1]/div[1]/input[1]")
	public WebElement Grade;

	@FindBy(xpath = "//input[@id='frequencyid']")
	public WebElement Frequency;

	@FindBy(xpath = "//input[@id='reportingStatusId']")
	public WebElement reportingStatus;

	@FindBy(xpath = "//div[@class='count ng-star-inserted']")
	public WebElement Task;

	@FindBy(xpath = "//label[@title='IP Referral']")
	public WebElement IPReferaral;

	//		@FindBy(xpath = "//input[@id='password']")
	//		public WebElement Passwordfield;
	//		
	//	@FindBy(xpath = "//input[@id='rejectquantity']")
	//	public WebElement rejectedQua;
	//	
	//	@FindBy(xpath = "//input[@id='verifiedbyname']")
	//	public WebElement Nurseverifiesby;
	//	
	//	@FindBy(xpath = "//input[@id='verifiedpassword']")
	//	public WebElement verifiedPass;
	//	
	//	@FindBy(xpath = "//span[normalize-space()='Today']")
	//	public WebElement today;
	//	









	//////////////Register a patient with mandatory field entering


	public void patReg(String NAME , String lastname, String AGE , String MBLNO , String ORGANISATION , String ADDRESS , String AADHAAR,String MRNO ,String PROVIDER ,String SERVICE ) throws InterruptedException, IOException, AWTException {

		Thread.sleep(1000);
		hamberger.click();
		Thread.sleep(1000);
		FO.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[normalize-space()='Registration']")).click();


		Thread.sleep(1000);

		List<WebElement> dynamicElement=driver.findElements(By.xpath("//*[@class='required ng-star-inserted']"));

		if(dynamicElement.size() !=0)
		{

		}

		else
		{
			driver.findElement(By.xpath("//label[normalize-space()='Emergency']//span[@class='checkmark']")).click();
		}



		Thread.sleep(1000);
		Title.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Miss']")).click();
		Thread.sleep(1000);
		FirstName.click();
		Thread.sleep(1000);
		FirstName.sendKeys(NAME);
		Thread.sleep(1000);
		Lastname.click();
		Thread.sleep(500);
		Lastname.sendKeys(lastname);
		Thread.sleep(500);
		age.click();
		Thread.sleep(1000);
		age.sendKeys(AGE);
		Thread.sleep(1000);
		mobileNo.click();
		Thread.sleep(1000);
		mobileNo.sendKeys(MBLNO);
		Thread.sleep(1000);
		Organisation.click();
		Thread.sleep(1000);
		Organisation.sendKeys(ORGANISATION);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='KIMS']")).click();
		Thread.sleep(1000);
		ContactInformation.click();
		Thread.sleep(1000);
		address.click();
		Thread.sleep(1000);
		address.sendKeys(ADDRESS);
		Thread.sleep(1000);
		DocID.click();
		Thread.sleep(1000);
		for (int i = 0; i <=15; i++) {
			aadharNo.sendKeys( Keys.BACK_SPACE);
		}
		//aadharNo.click();
		aadharNo.sendKeys(Keys.HOME + AADHAAR);
		Thread.sleep(1000);
		docAdd.click();
		Thread.sleep(1000);

		Thread.sleep(1000);
		howDidYouKnow.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[normalize-space()='Newspaper']//span[@class='checkmark']")).click();
		Thread.sleep(1000);
		OKhowDidYouKnow.click();
		Thread.sleep(1000);
		RegSave.click();
		Thread.sleep(3000);
		String mrno= driver.findElement(By.xpath("//span[@class='pat-mrno']")).getText();
		System.out.println(mrno);
		Thread.sleep(1000);


		File src=new File("C:\\Users\\sriram\\eclipse-workspace\\KimsYasasiiWeb\\src\\test\\resources\\excelYasasiiWeb\\KIMSDataSheet.xls");
		FileInputStream fis=new FileInputStream(src);
		HSSFWorkbook wb=new HSSFWorkbook(fis);
		HSSFSheet FOFullRegTest=wb.getSheetAt(44);	
		int i=FOFullRegTest.getLastRowNum();
		System.out.println("Number of rows: " + i);		
		FOFullRegTest.getRow(i).createCell(7).setCellValue(mrno);	
		FileOutputStream fout=new FileOutputStream(src);	
		wb.write(fout);

		Thread.sleep(1000);

		//////Encounter

		clear.click();
		Thread.sleep(1000);
		//	billprint.click();
		//	Thread.sleep(1000);
		providerName.click();
		Thread.sleep(1000);
		providerName.sendKeys(PROVIDER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[contains(text(),'"+PROVIDER+"')]")).click();

		Thread.sleep(1000);
		EncounterAdd.click();
		Thread.sleep(1000);
		EncounterSave.click();
		Thread.sleep(1000);
		Thread.sleep(1000);
		SAvesuccess.click(); 

	}

	public void ADT(String ADTprovider) throws InterruptedException{



		/////Admit the patient
		ADT.click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Close'][normalize-space()='No']")).click();
		Thread.sleep(1000);
		EnterProviderName.sendKeys(ADTprovider);
		Thread.sleep(1500);
		driver.findElement(By.xpath("(//*[contains(text(),'"+ ADTprovider +"')])[1]")).click();
		Thread.sleep(1000);
		Priority.click();
		Thread.sleep(2000);
		SelectPriority.click();
		Thread.sleep(1000);

		BedCategory.click();
		Thread.sleep(1000);
		SelectBedCategory.click();
		Thread.sleep(1000);
		RoomType.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'Ultra-Deluxe')])")).click();
		Thread.sleep(1000);
		Bed.click();
		Thread.sleep(500);


		driver.findElement(By.xpath("(//*[contains(text(),'Emergency NS')])[1]")).click();
		//SelectBed.click();
		Thread.sleep(500);
		SAve.click();
		Thread.sleep(1000);
		Thread.sleep(2000);


	}



	//////////Adding Major procedure in doctor note

	public void addingmajorprocedure(String MRNO,String MajorProcedure,String Medicine,String refProvider,String docid,String docpassword,String Site) throws InterruptedException {

		((JavascriptExecutor)driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		int Windowsize =driver.getWindowHandles().size();
		int windowopen= Windowsize-1;

		driver.switchTo().window(tabs.get(windowopen));
		driver.switchTo().window(tabs.get(windowopen));
		Thread.sleep(3000);
		driver.get(URL);
		Thread.sleep(2000);

		////////login
		userid.click();
		Thread.sleep(1000);
		userid.sendKeys(docid);    
		Thread.sleep(1000);
		password.click();
		Thread.sleep(1000);
		password.sendKeys(docpassword);
		Thread.sleep(1000);
		site.click();

		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")) );
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(3000);

		/////doctornote
		Thread.sleep(1000);
		Hamberger.click();
		Thread.sleep(1000);
		EMRhomescreen.click();
		List<WebElement> dynamicElement=driver.findElements(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']"));

		if(dynamicElement.size() !=0)
		{
			driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		}


		else {
			System.out.println("sri");
		}
		Thread.sleep(2000);


		driver.findElement(By.xpath("//input[@id='maincategory']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='IP']")).click();
		Thread.sleep(1000);

		Searchfield.click();
		Thread.sleep(1000);
		Searchfield.sendKeys(MRNO);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[contains(text(),'" + MRNO + "')]")).click();
		Thread.sleep(2000);

		Thread.sleep(500);
		List<WebElement> dynamicElement1=driver.findElements(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']"));

		if(dynamicElement1.size() !=0)
		{
			driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		}


		else {
			System.out.println("sri");
		}
		Thread.sleep(1000);

		/*	UParrow.click();
			Thread.sleep(1000);
			act.doubleClick(UParrow).perform();
			Thread.sleep(1000);
			lock.click();
			Thread.sleep(1000); */
		DoctorNote.click();
		Thread.sleep(1000);
		List<WebElement> dynamicElement11=driver.findElements(By.xpath("//button[normalize-space()='Create New Note']"));

		if(dynamicElement11.size() !=0)
		{
			driver.findElement(By.xpath("//button[normalize-space()='Create New Note']")).click();
		}
		Thread.sleep(800); 


		cheifComplaint.clear();
		cheifComplaint.sendKeys("Fever");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//strong[normalize-space()='Fever']")).click();
		template.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='SOAP']")).click();
		Thread.sleep(800);
		tempOk.click();
		Thread.sleep(1000);

		Diagnosis.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//div[@title='(Idiopathic) normal pressure hydrocephalus']")).click();
		Thread.sleep(1000);


		//////////Adding procedure
		CPOEService.click();
		Thread.sleep(500);
		enternameofProcedure.sendKeys(MajorProcedure);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[normalize-space()='Wipple Procedure']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='woundclassid']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//li[normalize-space()='Class I']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id='isbloodtrans-1']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id='ispostopicubed-1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//textarea[@id='implantotherdevice']")).sendKeys("No");
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id='isinfectiousdesease-1']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//textarea[@id='equipinstramentremark']")).sendKeys("Yes");
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id='isansethetistinformed-0']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//span[normalize-space()='General']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//textarea[@id='clinicalindication']")).sendKeys("Clinical indication added");
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[@class='col-md-12 pr0 ta-r']//button[@type='button'][normalize-space()='Add']")).click();

		//////////Adding OR Medicine

		Thread.sleep(500);
		CPOEMedicine.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//label[normalize-space()='No Current Medication']//span[@class='checkmark']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[@class='mb10 btn-type-add ta-r']//button[@type='button'][normalize-space()='Add']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//i[@class='ki ki-admission-reconciliation']")).click();
		Thread.sleep(500);
		Thread.sleep(500);
		driver.findElement(By.xpath("//i[@class='ki ki-reconciliation']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		Thread.sleep(1000);
		entermedicine.click();
		Thread.sleep(500);
		entermedicine.sendKeys(Medicine);
		Thread.sleep(500);
		driver.findElement(By.xpath("(//*[contains(text(),'"+Medicine+"')])[1]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id='prescriptiontypeid']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//li[normalize-space()='OR Order']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id='antibioticorderingreasonid']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//li[normalize-space()='Others']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id='antibioticorderingremarks']")).sendKeys("OK");
		Thread.sleep(500);
		Frequency.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//li[normalize-space()='BID']")).click();
		Thread.sleep(500);

		driver.findElement(By.xpath("//input[@name='remarks']")).sendKeys("Remarks added here");
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[@class='col-md-11']//span[@class='checkmark']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//button[@id='updatePharmacy']//i[@class='ki ki-plus icon-plus']")).click();
		Thread.sleep(500);



		///////////Adding Referal
		referral.click();
		Thread.sleep(500);
		referralprovider.sendKeys(refProvider);
		Thread.sleep(500);
		driver.findElement(By.xpath("(//*[contains(text(),'"+refProvider+"')])[1]")).click();
		Thread.sleep(500);
		timeframe.click();
		Thread.sleep(500);
		selecttimeframe.click();
		Thread.sleep(500);
		remarksadd.sendKeys("remarks added");
		Thread.sleep(500);
		referraladd.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@class='icon emrsave']")).click();
		Thread.sleep(3000);


		///////////////Zoom out/Zoom in in document viewer
		//		
		//		
		//		
		//		driver.findElement(By.xpath("//label[@class='icon cpoedocuments']")).click();
		//		Thread.sleep(1500);
		//		driver.findElement(By.xpath("//button[normalize-space()='Capture']")).click();
		//		Thread.sleep(2000);
		//		driver.findElement(By.xpath("//button[normalize-space()='Take A Snapshot']")).click();
		//		Thread.sleep(2000);
		//		driver.findElement(By.xpath("//i[@class='fa fa-eye']")).click();
		//		Thread.sleep(2000);
		//		driver.findElement(By.xpath("//i[@class='ki ki-zoom-in']")).click();
		//		driver.findElement(By.xpath("//i[@class='ki ki-zoom-in']")).click();
		//		Thread.sleep(500);
		//		driver.findElement(By.xpath("//i[@class='ki ki-zoom-out']")).click();
		//		Thread.sleep(800);
		//		driver.findElement(By.xpath("//span[@aria-hidden='true']//i[@class='ki ki-refresh']")).click();
		//		Thread.sleep(1000);
		//		driver.findElement(By.xpath("//button[normalize-space()='Close']")).click();
		//		Thread.sleep(1000);
		//		driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
		//		Thread.sleep(2000);

	}



	////////////Give Anesthesia fitness	
	public void anesthesiafitness(String MRNO,String anesthesiaID , String anesthesiapassword ,String Site) throws InterruptedException {


		((JavascriptExecutor)driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		int Windowsize =driver.getWindowHandles().size();
		int windowopen= Windowsize-1;

		driver.switchTo().window(tabs.get(windowopen));
		driver.switchTo().window(tabs.get(windowopen));
		Thread.sleep(3000);
		driver.get(URL);
		Thread.sleep(2000);

		////////login
		userid.click();
		Thread.sleep(1000);
		userid.sendKeys(anesthesiaID);    
		Thread.sleep(1000);
		password.click();
		Thread.sleep(1000);
		password.sendKeys(anesthesiapassword);
		Thread.sleep(1000);
		site.click();

		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")) );
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(2000);

		Hamberger.click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//i[@class='ki ki-sthethescope']")).click();
		Thread.sleep(1000);
		EMRhomescreen.click();
		List<WebElement> dynamicElement=driver.findElements(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']"));

		if(dynamicElement.size() !=0)
		{
			driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		}


		else {
			System.out.println("sri");
		}
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@id='maincategory']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='IP']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='subcategory']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//li[normalize-space()='All IP']")).click();
		Thread.sleep(500);


		Searchfield.click();
		Thread.sleep(1000);
		Searchfield.sendKeys(MRNO);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[contains(text(),'" + MRNO + "')]")).click();
		Thread.sleep(2000);
		DoctorNote.click();

		Thread.sleep(1000);
		List<WebElement> dynamicElement11=driver.findElements(By.xpath("//button[normalize-space()='Create New Note']"));

		if(dynamicElement11.size() !=0)
		{
			driver.findElement(By.xpath("//button[normalize-space()='Create New Note']")).click();
		}
		Thread.sleep(800); 



		cheifComplaint.clear();
		Thread.sleep(800);
		cheifComplaint.sendKeys("Fever");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//strong[normalize-space()='Fever']")).click();
		Thread.sleep(800);
		template.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),' Pre Anesthesia ')])")).click();
		Thread.sleep(800);
		tempOk.click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//td[@title='Wipple Procedure']//span[@class='checkmark']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//label[normalize-space()='Fit For Surgery']//span[@class='checkmark']")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//div[contains(text(),'AnesthesiaPlan')]")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[@id='HTF1000121']//label[@class='radio-container'][normalize-space()='Yes']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[@class='element-container removespace auto']//span[@class='checkmark']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//textarea[@id='dynamic_textarea_HTF1000127']")).sendKeys("ok");
		Thread.sleep(500);
		driver.findElement(By.xpath("//label[@class='icon emrsave']")).click();
		Thread.sleep(1500);


	}


	public void ORSchedule(String ORAdmin, String ORpassword,String Site,String MRNo) throws InterruptedException, AWTException
	{



		((JavascriptExecutor)driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		int Windowsize =driver.getWindowHandles().size();
		int windowopen= Windowsize-1;

		driver.switchTo().window(tabs.get(windowopen));
		driver.switchTo().window(tabs.get(windowopen));
		Thread.sleep(3000);
		driver.get(URL);
		Thread.sleep(2000);

		////////login
		userid.click();
		Thread.sleep(1000);
		userid.sendKeys(ORAdmin);    
		Thread.sleep(1000);
		password.click();
		Thread.sleep(1000);
		password.sendKeys(ORpassword);
		Thread.sleep(1000);
		site.click();

		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")) );
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(2000);



		Thread.sleep(2000);
		maincategory.click();
		Thread.sleep(800);
		pendingorder.click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNo+"')])[1]")).click();
		Thread.sleep(1000);
		selectslot.click();
		Thread.sleep(800);
		searchOR.clear();
		Thread.sleep(800);
		searchOR.sendKeys("OR nagercoil");
		Thread.sleep(800);
		selectslot.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//tr[@class='row-0-0 ng-star-inserted']//td[@class='app-booking-bar ng-star-inserted']")).click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//tr[@class='row-0-0 ng-star-inserted']//i[@class='ki ki-plus']")).click();
		Thread.sleep(800);

		Resource.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='Human Resource']")).click();
		Thread.sleep(800);

		resourceType.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='Anesthetist']")).click();
		Thread.sleep(800);

		Department.click();
		Thread.sleep(800);
		Department.sendKeys("Anesthesia");
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='Anesthesia']")).click();
		Thread.sleep(800);


		Name.click();
		Thread.sleep(800);
		Name.sendKeys("Sam(sam)");
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='Sam(sam)']")).click();
		Thread.sleep(800);
		AnesthesiaType.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='Spinal']")).click();
		Thread.sleep(800);

		Grade.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='Senior']")).click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//button[@id='subresourceaddid']")).click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//i[@class='ki ki-save']")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		Thread.sleep(800);




		togglebar.click();
		Thread.sleep(800);
		orAuthorization.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//button[@title='Search']//i[@class='ki ki-search']")).click();
		Thread.sleep(800);
		searchMRNo.sendKeys(MRNo);
		Thread.sleep(800);
		authorizedcheckbox.click();
		Thread.sleep(800);

		driver.findElement(By.xpath("//span[@title='Preanesthesia Details']//i[@class='ki ki-info-circle-fill']")).click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//button[normalize-space()='Close']")).click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//button[@id='otauthdata']")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//span[@id='global_modal_close_button']")).click();
		Thread.sleep(1500);
		togglebar.click();
		Thread.sleep(800);


		ORTrackingboard.click();
		Thread.sleep(1000);
		JavascriptExecutor jss = (JavascriptExecutor) driver;
		jss.executeScript("arguments[0].scrollIntoView();" , status);
		Thread.sleep(2000);

	}



	public void operationroomprocess(String MRNo ,String Nuruser ,String Nurpassword,String Site) throws InterruptedException, AWTException {


		///////////login as nurse

		((JavascriptExecutor)driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		int Windowsize =driver.getWindowHandles().size();
		int windowopen= Windowsize-1;

		driver.switchTo().window(tabs.get(windowopen));
		driver.switchTo().window(tabs.get(windowopen));
		Thread.sleep(3000);
		driver.get(URL);
		Thread.sleep(2000);

		userid.click();
		Thread.sleep(800);
		userid.sendKeys(Nuruser);
		Thread.sleep(800);
		password.click();
		Thread.sleep(800);
		password.sendKeys(Nurpassword);
		Thread.sleep(1000);
		site.click();
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("//app-list-item/li[contains(text(),\""+Site+"\")]")) );
		driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(1500);

		////////////////////Process in Operation Room

		Thread.sleep(1000);
		eterMRNo.sendKeys(MRNo); 
		Thread.sleep(800);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNo+"')])[1]")).click();
		Thread.sleep(1500);

		CPOEAdministration.click();
		Thread.sleep(600);
		OperatioRoom.click();
		Thread.sleep(1000);
		checkboxselect.click();
		Thread.sleep(600);

		/////////////Checklist ward nurse

		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-cpoe-administration[1]/div[1]/div[2]/app-or-administration[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/app-or-checklist[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[2]/div[1]/label[1]")).click();
		Thread.sleep(600);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-cpoe-administration[1]/div[1]/div[2]/app-or-administration[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/app-or-checklist[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[3]/td[1]/div[2]/div[1]/label[1]")).click();
		Thread.sleep(600);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-cpoe-administration[1]/div[1]/div[2]/app-or-administration[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/app-or-checklist[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[4]/td[1]/div[2]/div[1]/label[3]")).click();
		Thread.sleep(700);
		VerifiedBy.clear();
		Thread.sleep(700);
		
		VerifiedBy.sendKeys(Nuruser , Keys.ENTER);
		Thread.sleep(600);
		driver.findElement(By.xpath("(//*[contains(text(),'"+Nuruser+"')])")).click();
		Thread.sleep(1000);
		ORSave.click();
		Thread.sleep(600);
		Passwordfield.sendKeys(Nurpassword);
		Thread.sleep(600);
		driver.findElement(By.xpath("//span[@class='btn btn-primary sm active ng-star-inserted']")).click(); 
		Thread.sleep(1500);

		//////////////Checklist Preop nurse			


		driver.findElement(By.xpath("//label[normalize-space()='Checklist Pre-OP Nurse']")).click();
		Thread.sleep(600);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-cpoe-administration[1]/div[1]/div[2]/app-or-administration[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/app-or-checklist[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/div[3]/div[1]/label[1]")).click();
		Thread.sleep(600);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-cpoe-administration[1]/div[1]/div[2]/app-or-administration[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/app-or-checklist[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[5]/td[1]/div[3]/div[1]/label[1]")).click();			
		Thread.sleep(1000);
		VerifiedBy.sendKeys(Nuruser);
		Thread.sleep(1500);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-cpoe-administration[1]/div[1]/div[2]/app-or-administration[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/app-or-checklist[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tfoot[1]/div[3]/typeahead-container[1]/button[1]/span[1]")).click();		
		Thread.sleep(1000);
		ORSave.click();
		Thread.sleep(1000);
		Passwordfield.sendKeys(Nurpassword);
		Thread.sleep(600);
		driver.findElement(By.xpath("//span[@class='btn btn-primary sm active ng-star-inserted']")).click();
		Thread.sleep(1500);



		/////////////////////Transfer Bypass to OR			
		driver.findElement(By.xpath("//label[normalize-space()='Transfer Bypass To OR']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-cpoe-administration[1]/div[1]/div[2]/app-or-administration[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/app-or-templates[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[1]/div[1]/div[4]/ki-calender-time[1]/div[1]/input[1]")).click();	
		Thread.sleep(600);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/owl-date-time-container[1]/div[2]/owl-date-time-timer[1]/owl-date-time-timer-box[2]/button[2]/span[1]/*[name()='svg'][1]")).click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//span[normalize-space()='Today']")).click();
		Thread.sleep(600);

		driver.findElement(By.xpath("//input[@id='dynamic_selectHTF810']")).click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//li[normalize-space()='Given']")).click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//input[@id='dynamic_selectHTF811']")).click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//li[normalize-space()='Given']")).click();
		Thread.sleep(600);
		ORSave.click();
		Thread.sleep(2500);
		///////////////Sign In			
		driver.findElement(By.xpath("//label[normalize-space()='Sign In']")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//div[@class='form-group ng-star-inserted']//input[@type='text']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[normalize-space()='Today']")).click();
		Thread.sleep(600);
		ORSave.click();
		Thread.sleep(1500);
		//////////////////OR Medicine Admin			
		driver.findElement(By.xpath("//label[normalize-space()='OR Medicine Admin']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//i[@title='Encounter']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//label[text()='All '])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//i[@class='ki-user-drug ki']")).click();
		Thread.sleep(1000);
//		rejectedQua.sendKeys("0");
//		Thread.sleep(1000);
		driver.findElement(By.xpath("//i[@class='ki ki-plus']")).click();
		Thread.sleep(1000);

		List<WebElement> dynamicElement=driver.findElements(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']"));

		if(dynamicElement.size() !=0)
		{
			driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		}
		Thread.sleep(800); 

		driver.findElement(By.xpath("//button[@class='btn btn-primary sm active']//i[@class='ki ki-save']")).click();
		Thread.sleep(2500);
		//		Nurseverifiesby.sendKeys(Nuruser);
		//		Thread.sleep(1000);
		//		driver.findElement(By.xpath("(//*[contains(text(),'"+Nuruser+"')])")).click();
		//		Thread.sleep(1000);
		//		verifiedPass.sendKeys("KAmeda123$");
		//		Thread.sleep(600);
		//		driver.findElement(By.xpath("//button[@class='btn btn-primary sm active'][normalize-space()='OK']")).click();
		//		Thread.sleep(1500); 

		////////////////////Time out			
		driver.findElement(By.xpath("//button[@title='Time Out']//div[@class='btn-name']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body/app-root/app-layout/main[@class='page-body']/app-emr-homescreen[@class='ng-star-inserted']/div[@class='page-container h-100']/div[@class='note-layout ng-star-inserted ab-locked layout-1']/div[@class='notelayoutcontainer']/app-cpoe-administration[@class='ng-star-inserted']/div[@class='cpoe-adm-container']/div[@class='cpoe-right-region']/app-or-administration[@class='ng-star-inserted']/div[@class='cpoe-admin-container']/div[@class='or-conatiner']/div[1]")).click();
		Thread.sleep(600);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-cpoe-administration[1]/div[1]/div[2]/app-or-administration[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/app-or-templates[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[4]/div[1]/label[1]/span[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-cpoe-administration[1]/div[1]/div[2]/app-or-administration[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/app-or-templates[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[6]/div[1]/label[1]/span[2]")).click();
		Thread.sleep(600);
		Thread.sleep(1000);
		ORSave.click();
		Thread.sleep(1500);

		/////////////Intra Operative notes/Vitals
		driver.findElement(By.xpath("//label[normalize-space()='Intra-Operative Notes / Vitals']")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//button[@title='Add']")).click();  
		ORSave.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[normalize-space()='Intra-Operative Procedure']")).click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//button[@title='Add']")).click();
		Thread.sleep(600);
		ORSave.click();
		Thread.sleep(1500);   

		/////////////After Procedure
		driver.findElement(By.xpath("//label[normalize-space()='After Procedure']")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//tbody/tr[1]/td[3]/label[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//tbody/tr[2]/td[3]/label[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//tbody/tr[3]/td[3]/label[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//tbody/tr[4]/td[3]/label[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//tbody/tr[5]/td[3]/label[1]")).click();
		Thread.sleep(1000);



		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-cpoe-administration[1]/div[1]/div[2]/app-or-administration[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/app-ot-checklist[1]/div[1]/div[2]/table[1]/tbody[1]/tr[32]/td[4]/ki-input-control[1]/div[1]/input[1]")).sendKeys("2");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-cpoe-administration[1]/div[1]/div[2]/app-or-administration[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/app-ot-checklist[1]/div[1]/div[2]/table[1]/tbody[1]/tr[34]/td[4]/ki-input-control[1]/div[1]/input[1]")).sendKeys("1");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-cpoe-administration[1]/div[1]/div[2]/app-or-administration[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/app-ot-checklist[1]/div[1]/div[2]/table[1]/tbody[1]/tr[34]/td[4]/ki-input-control[1]/div[1]/input[1]")).sendKeys("1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-cpoe-administration[1]/div[1]/div[2]/app-or-administration[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/app-ot-checklist[1]/div[1]/div[2]/table[1]/tbody[1]/tr[39]/td[4]/ki-input-control[1]/div[1]/input[1]")).sendKeys("3");
		Thread.sleep(2000);


		ORSave.click();
		Thread.sleep(1500);  


		/////////////Coming back to Intra Operative notes/Vitals to enter end date
		//////Adding end date in intra operative procedure

		driver.findElement(By.xpath("//label[normalize-space()='After Procedure']")).click();  ///////Just clicking on After Procedure
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[normalize-space()='Intra-Operative Notes / Vitals']")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//span[normalize-space()='Intra-Operative Procedure']")).click();
		Thread.sleep(1500);

		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-cpoe-administration[1]/div[1]/div[2]/app-or-administration[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/app-or-surgerydetails[1]/form[1]/div[2]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/label[1]/a[1]/i[1]")).click();
		Thread.sleep(1500);


		//end time 

		driver.findElement(By.xpath("//ki-calender-time[@class='ng-untouched ng-valid ng-dirty']//input[@type='text']")).click();
		Thread.sleep(1500);
		//		Robot r = new Robot();
		//		r.keyPress(KeyEvent.VK_ENTER);
		//		r.keyRelease(KeyEvent.VK_ENTER);

		//		Boolean Enable = driver.findElement(By.xpath("//span[normalize-space()='Today']")).isEnabled();
		//		System.out.println(" today is enabled  :"+Enable);
		//		Thread.sleep(1000);


		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space()='Set']")));
		Thread.sleep(1000);


		///today

		driver.findElement(By.xpath("(//span[@class='owl-dt-control-button-content'])[4]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[normalize-space()='Set']")).click();
		//	driver.findElement(By.xpath("(//span[@class='owl-dt-control-content owl-dt-control-button-content'])[4]")).click();
		//	act.moveToElement(today).click().build().perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@title='Add']")).click();
		Thread.sleep(1000);
		ORSave.click();
		Thread.sleep(1500);
		////////Adding end date in anesthesia notes
		driver.findElement(By.xpath("//span[@class='rep-head-daily']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='form-control ng-pristine ng-valid ng-star-inserted ng-touched']")).click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//span[normalize-space()='Today']")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//button[@title='Add']")).click();  
		ORSave.click();
		Thread.sleep(10000);  


		//////////////Resource Allocation			
		driver.findElement(By.xpath("//label[normalize-space()='Resource Allocation']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='form-group close-active ki-dropdown']//input[@id='typeId']")).click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//li[normalize-space()='ELECTIVE']")).click();
		Thread.sleep(600);

		reportingStatus.click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//li[normalize-space()='Day Case']")).click();
		Thread.sleep(600);

		driver.findElement(By.xpath("//div[@class='form-group ki-dropdown']//input[@id='typeId']")).click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//li[normalize-space()='Circulating Nurse']")).click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//input[@id='resourcemasterorid']")).sendKeys("Sheethal(nur01)");
		Thread.sleep(600);
		driver.findElement(By.xpath("//li[normalize-space()='Sheethal(nur01)']")).click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//button[@id='ordlsaddid']")).click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//textarea[@id='remarksId']")).sendKeys("Remarks added");
		Thread.sleep(600);
		driver.findElement(By.xpath("//button[@id='ormasteraddid']")).click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//i[@class='ki ki-save']")).click();
		Thread.sleep(1500);


		////////////Sign Out		

		driver.findElement(By.xpath("//label[normalize-space()='Sign Out']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-cpoe-administration[1]/div[1]/div[2]/app-or-administration[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/app-or-templates[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[1]/div[1]/div[4]/ki-calender-time[1]/div[1]/input[1]")).click();
		Thread.sleep(600);
		//	driver.findElement(By.xpath("//input[@class='form-control ng-pristine ng-star-inserted ng-touched ng-valid']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Today']")).click();		
		Thread.sleep(600);
		driver.findElement(By.xpath("//label[normalize-space()='The name of procedure recorded']//span[@class='checkmark']")).click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//div[4]//div[1]//label[1]//span[2]")).click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//div[4]//div[1]//label[1]//span[2]")).click();
		Thread.sleep(600);
		ORSave.click();
		Thread.sleep(1500);

		////////////TimeLine
		driver.findElement(By.xpath("//label[normalize-space()='Time Line']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-cpoe-administration[1]/div[1]/div[2]/app-or-administration[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/app-or-timelineview[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/ki-textarea-control[1]/div[1]/textarea[1]")).sendKeys("Remarks added");
		Thread.sleep(600);
		ORSave.click();
		Thread.sleep(1500);
	}


	public void referalLogin(String ReferalID, String Referalpassword, String Site,String MRNo ) throws InterruptedException {




		((JavascriptExecutor)driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		int Windowsize =driver.getWindowHandles().size();
		int windowopen= Windowsize-1;

		driver.switchTo().window(tabs.get(windowopen));
		driver.switchTo().window(tabs.get(windowopen));
		Thread.sleep(2000);
		driver.get(URL);
		Thread.sleep(1000);

		////////login
		userid.click();
		Thread.sleep(1000);
		userid.sendKeys(ReferalID);    
		Thread.sleep(1000);
		password.click();
		Thread.sleep(1000);
		password.sendKeys(Referalpassword);
		Thread.sleep(1000);
		site.click();

		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")) );
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(2000);

		Task.click();
		Thread.sleep(800); 
		IPReferaral.click();
		Thread.sleep(800); 
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNo+"')])[1]")).click();
		Thread.sleep(1500);

		DoctorNote.click();
		Thread.sleep(1000);
		List<WebElement> dynamicElement11=driver.findElements(By.xpath("//button[normalize-space()='Create New Note']"));

		if(dynamicElement11.size() !=0)
		{
			driver.findElement(By.xpath("//button[normalize-space()='Create New Note']")).click();
		}
		Thread.sleep(800); 


		cheifComplaint.clear();
		cheifComplaint.sendKeys("Fever");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//strong[normalize-space()='Fever']")).click();
		template.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='SOAP']")).click();
		Thread.sleep(800);
		tempOk.click();
		Thread.sleep(1000);

		Diagnosis.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//div[contains(text(),'Mark as Final')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@class='icon emrsave']")).click();
		Thread.sleep(1500);


	}




}