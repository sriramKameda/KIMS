package pagesOfYasasiiWeb;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
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

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class KIMS_EmployeeAuthorization_YasasiiWeb extends PageFactoryInitYasasiiWeb{

	public KIMS_EmployeeAuthorization_YasasiiWeb(WebDriver driver) {

		super(driver);

	}



	@FindBy(xpath = "//div[contains(@class,'col-md-3')]//div[contains(@class,'card-body')]//div[2]//div[1]//div[1]//ki-select-control[1]//div[1]//input[1]")
	public WebElement Title;

	@FindBy(xpath = "//i[@id='capture']")
	public WebElement signupload;

	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='menu-toggle']")
	public WebElement Hamburger;

	@FindBy(xpath = "//i[@class='ki ki-reception-fill']")
	public WebElement FOModule;

	@FindBy(xpath = "//div[normalize-space()='Registration']")
	public WebElement Registration;

	@FindBy(xpath = "//li[normalize-space()='Miss']")
	public WebElement SelectMr;

	@FindBy(xpath = "//input[@id='lastname']")
	public WebElement Lastname;

	@FindBy(xpath = "//input[@id='fo-card-reader-firstname']")
	public WebElement EnterFirstNME;

	@FindBy(xpath = "//ki-calendar[@id='dob']//input[@type='text']")
	public WebElement EnterAge;

	@FindBy(xpath = "//div[@class='form-group ng-star-inserted']//input[@id='mobilephone']")
	public WebElement EnterMob;

	@FindBy(xpath = "//input[@id='division']")
	public WebElement EnterOrganisationLetter;

	@FindBy(xpath = "//li[contains(text(),'Others')]")
	public WebElement SelectOrganisation;

	@FindBy(xpath = "//span[contains(text(),'Contact Information')]")
	public WebElement ContactInformation;

	@FindBy(xpath = "//input[@id='homeaddress1']")
	public WebElement EnterAddress;

	@FindBy(xpath = "//span[contains(text(),'Document Identification')]")
	public WebElement DocumentIdentification;

	@FindBy(xpath = "//input[@id='value']")
	public WebElement EnterAadhar;

	@FindBy(xpath = "//i[@title='Add']")
	public WebElement Clickadd;

	@FindBy(xpath = "//button[@class='btn-feedback']")
	public WebElement HowDidYouKnow;

	@FindBy(xpath = "//body/modal-container[1]/div[1]/div[1]/div[2]/div[1]/div[2]/lib-checkbox-group[1]/div[1]/lib-checkbox-list[3]/div[1]/label[1]/span[1]")
	public WebElement TV;

	@FindBy(xpath = "//body/modal-container[1]/div[1]/div[1]/div[3]/button[1]")
	public WebElement Ok;

	@FindBy(xpath = "//button[@id='saveregistrationbutton']")
	public WebElement Save;

	@FindBy(xpath = "//div[@class='dialog-content Success']//button[@type='button'][normalize-space()='OK']")
	public WebElement OK;

	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[7]/div[1]/ki-select-control[1]/div[1]/input[1]")
	public WebElement nationality;

	@FindBy(xpath = "//input[@id='maritalstatusid']")
	public WebElement maritialStatus;	

	@FindBy(xpath = "//button[normalize-space()='Clear']")
	public WebElement clear;

	@FindBy(xpath = "//i[@class='ki ki-info-circle-fill ng-star-inserted']")
	public WebElement EpisodeIcon;

	@FindBy(xpath = "//li[@class='nav-item ng-star-inserted']//span[contains(text(),'Encounter')]")
	public WebElement Encounter;

	@FindBy(xpath = "//button[normalize-space()='Close']")
	public WebElement Close;

	@FindBy(xpath = "//input[@id='EncBillingproviders']")
	public WebElement providerName;

	@FindBy(xpath = "//i[@class='ki ki-plus']")
	public WebElement Add;

	@FindBy(xpath = "//button[@id='billingsave']")
	public WebElement EncounterSave;

	@FindBy(xpath = "//div[@class='modal-body']//button[@type='button'][normalize-space()='OK']")
	public WebElement SAvesuccess;
	
	@FindBy(xpath = "//input[@id='loginemail']")
	public WebElement userid;
	
	@FindBy(xpath="//input[@id='loginpassword']")
	public WebElement password;

	@FindBy(xpath="//input[@id='loginsite']")
	public WebElement Site;

	@FindBy(xpath = "//input[@id='chiefcomplainttext']")
	public WebElement reasonForVisit;

	@FindBy(xpath = "//input[@id='emrtemplateid']")
	public WebElement Template;

	@FindBy(xpath = "//button[@aria-label='Ok'][normalize-space()='OK']")
	public WebElement TemplateOK;

	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement EnterPatientName;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[3]/app-emr-dashboard[1]/div[1]/label[2]/label[1]")
	public WebElement DoctorNote;

	@FindBy(xpath = "//label[@class='icon emrsave']")
	public WebElement EmrSave;
	
	@FindBy(xpath = "//i[@class='ki ki-doctor-fill']")
	public WebElement ChangeProvider;
	
	@FindBy(xpath = "//input[@id='providername']")
	public WebElement ProviderName;
	
	@FindBy(xpath = "//label[normalize-space()='CPOE Service']")
	public WebElement CPOEService;
	
	@FindBy(xpath = "//div[normalize-space()='CPOE Service']")
	public WebElement CpoeService;

	@FindBy(xpath = "//input[@id='cpoeSearchText']")
	public WebElement CpoeServiceSearch;

	@FindBy(xpath = "//i[@class='fa fa-caret-right']")
	public WebElement Visit;
	
	@FindBy(xpath = "//i[@title='Counter Sign Pending']")
	public WebElement CountersignPending;
	
	@FindBy(xpath = "//textarea[@id='countersignremarkstxt']")
	public WebElement CountersignRemarks;
	
	@FindBy(xpath = "//i[@class='ki ki-save']")
	public WebElement save;
	
	@FindBy(xpath = "//i[@title='Signed']")
	public WebElement Signed;
	
	@FindBy(xpath = "//div[@class='link-value'][normalize-space()='EMR']")
	public WebElement EMR;
	
	@FindBy(xpath = "//div[normalize-space()='Employee Authorization']")
	public WebElement EmpAuthorization;
	
	@FindBy(xpath = "//input[@id='searchUsers']")
	public WebElement SearchUsers;
	

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
	
	@FindBy(xpath = "//input[@id='recomproviderdisplayname']")
	public WebElement EnterProviderName;
	
	@FindBy(xpath = "//span[normalize-space()='Insurance and Other Information']")
	public WebElement insuranceinfo;

	@FindBy(xpath = "//ki-select-control[contains(@placeholder,'Insurance')]//input[@id='undefined']")
	public WebElement insurance;
	
	@FindBy(xpath = "//ki-select-control[@class='ng-untouched ng-pristine ng-invalid']//input[@id='undefined']")
	public WebElement Plan;
	
	@FindBy(xpath = "//input[@class='form-control ng-untouched ng-pristine ng-star-inserted ng-valid']")
	public WebElement validto;

	@FindBy(xpath = "//button[@class='btn-feedback']")
	public WebElement referenceLetter;
	
	@FindBy(xpath = "//input[@id='refno']")
	public WebElement referenceNo;
	
	@FindBy(xpath = "//ki-calendar[@formcontrolname='validfrom']//input[@type='text']")
	public WebElement fromdate;
	
	@FindBy(xpath = "//ki-calendar[@formcontrolname='validto']//input[@type='text']")
	public WebElement todate;
	
	@FindBy(xpath = "//i[@class='ki ki-user-referral']")
	public WebElement referenceletter;
	
	@FindBy(xpath = "//i[@class='ki ki-reception-fill']")
	public WebElement Billing;

	@FindBy(xpath = "//span[@class='icon-btn btn-dark-green inline ng-star-inserted']//i[@class='ki ki-plus']")
	public WebElement add;
	
	@FindBy(xpath = "//button[@title='Attach here']")
	public WebElement Attach;
	
	@FindBy(xpath = "//i[@class='ki ki-file-attach']")
	public WebElement Attachment;

	@FindBy(xpath = "//i[@class='fa fa-eye']")
	public WebElement Eye;
	
	@FindBy(xpath = "//div[@class='item-name'][normalize-space()='Diagnosis and Plan']")
	public WebElement Diagnosis;
	
	@FindBy(xpath = "//button[@class='btn-feedback']")
	public WebElement referenceLetter1;
	
	@FindBy(xpath = "//input[@id='refno']")
	public WebElement referencenumber;
	
	@FindBy(xpath = "//ki-calendar[@formcontrolname='validfrom']//input[@type='text']")
	public WebElement FrmDate;

	@FindBy(xpath = "//ki-calendar[@class='ng-untouched ng-pristine ng-invalid']//input[@type='text']")
	public WebElement ToDate;
	
	@FindBy(xpath = "//span[@class='icon-btn btn-dark-green inline ng-star-inserted']//i[@class='ki ki-plus']")
	public WebElement ADD;
	
//	@FindBy(xpath = "//i[@class='ki ki-file-attach']")
//	public WebElement Attachment;
//
//	@FindBy(xpath = "//i[@class='fa fa-eye']")
//	public WebElement Eye;
	
	
	
	
	public void patreg(String title,String Name,String lastname,String Dob, String DocID, String MobNo,String Address,String MRNo) throws InterruptedException, AWTException, IOException {

		///////////////////Register a female patient


		Thread.sleep(1000);
		Hamburger.click();
		Thread.sleep(800);
		FOModule.click();
		Thread.sleep(1000);
		Registration.click();
		Thread.sleep(500);
		List<WebElement> dynamicElement=driver.findElements(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']"));

		if(dynamicElement.size() !=0)
		{
			driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		}


		else {
			System.out.println("sri");
		}
		Thread.sleep(1000);


		Title.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//li[normalize-space()='"+title+"']")).click();
		Thread.sleep(500);
		EnterFirstNME.sendKeys(Name);
		Thread.sleep(500);
		Lastname.click();
		Thread.sleep(500);
		Lastname.sendKeys(lastname);
		Thread.sleep(500);

		EnterAge.click();
		Thread.sleep(500);


		Robot t=new Robot();
		t.keyPress(KeyEvent.VK_ESCAPE);
		Thread.sleep(500);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(500);

		EnterAge.sendKeys(Dob);
		Thread.sleep(600);
		t.keyPress(KeyEvent.VK_ESCAPE);
		Thread.sleep(500);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(500);


		Thread.sleep(600);
		EnterMob.sendKeys(MobNo);
		Thread.sleep(500);
		maritialStatus.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//li[normalize-space()='Single']")).click();
		Thread.sleep(500);

		ContactInformation.click();
		Thread.sleep(1000);
		EnterAddress.sendKeys(Address);
		Thread.sleep(1000);
		DocumentIdentification.click();
		Thread.sleep(1000);
		for (int i = 0; i <=15; i++) {
			EnterAadhar.sendKeys( Keys.BACK_SPACE);
		}
		Thread.sleep(1000);
		EnterAadhar.sendKeys(DocID );
		Thread.sleep(600);
		Clickadd.click();
		Thread.sleep(800);

		insuranceinfo.click();
		insurance.click();
		driver.findElement(By.xpath("//li[normalize-space()='MSD Ins Corp PVT.LTD']")).click();
		Thread.sleep(500);
		Plan.click();
		driver.findElement(By.xpath("//li[normalize-space()='MSD Full cover']")).click();
		Thread.sleep(500);
		validto.click();
		Thread.sleep(1000);
		for (int i = 0; i <=5; i++) {
			
	    	t.keyPress(KeyEvent.VK_RIGHT);
			Thread.sleep(300);
			t.keyRelease(KeyEvent.VK_RIGHT);
			
		}
		
		t.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(500);
		t.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(500);

		add.click();
		Thread.sleep(500);
		
		
		
		List<WebElement> dynamicElement1=driver.findElements(By.xpath("//*[@class='required ng-star-inserted']"));

		System.out.println(dynamicElement1.size());
		if(dynamicElement1.size() ==0)
		{
			driver.findElement(By.xpath("//label[normalize-space()='Emergency']//span[@class='checkmark']")).click();

		}



		HowDidYouKnow.click();
		Thread.sleep(600);
		TV.click();
		Thread.sleep(600);
		Ok.click();
		Thread.sleep(600);
		Save.click();
		Thread.sleep(3000);

		String mrno= driver.findElement(By.xpath("//span[@class='pat-mrno']")).getText();
		System.out.println(mrno);

		File src=new File("C:\\Users\\sriram\\eclipse-workspace\\KimsYasasiiWeb\\src\\test\\resources\\excelYasasiiWeb\\KIMSDataSheet.xls");
		FileInputStream fis=new FileInputStream(src);
		HSSFWorkbook wb=new HSSFWorkbook(fis);
		HSSFSheet BirthRegistration=wb.getSheetAt(45);	
		int i=BirthRegistration.getLastRowNum();
		System.out.println("Number of rows: " + i);		
		BirthRegistration.getRow(i).createCell(7).setCellValue(mrno);	
		FileOutputStream fout=new FileOutputStream(src);	
		wb.write(fout);
		Thread.sleep(2000);


	}




	public void encounter(String Provider ) throws AWTException, InterruptedException {



		/////////Provider1		
		Thread.sleep(1000);
		clear.click();
		Thread.sleep(1000);
		//	printuncheck.click();
		//	Thread.sleep(1000);
		providerName.click();
		Thread.sleep(1000);
		providerName.sendKeys(Provider);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[contains(text(),'"+Provider+"')]")).click();
		Thread.sleep(1000);
		Add.click();
		Thread.sleep(2000);
		referenceLetter.click();
		Thread.sleep(1000);
		referencenumber.click();
		Thread.sleep(1000);
		referencenumber.sendKeys("524356346");
		Thread.sleep(1000);
		
		FrmDate.click();
		Thread.sleep(1000);
		Robot t=new Robot();
		t.keyPress(KeyEvent.VK_ENTER);
		t.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(400);
		ToDate.click();
		Thread.sleep(1000);
		t.keyPress(KeyEvent.VK_ENTER);
		t.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(400);
		
		ADD.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary sm active'][normalize-space()='OK']")).click();
		Thread.sleep(1000);
		EncounterSave.click();
		Thread.sleep(1000);
		SAvesuccess.click();
		Thread.sleep(1000);


	}
	
	
public void ADT(String  ADTprovider ) throws InterruptedException, AWTException {
		
		/////Admitting the patient
		ADT.click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Close'][normalize-space()='No']")).click();
		Thread.sleep(500);
		EnterProviderName.sendKeys(ADTprovider);
		Thread.sleep(1500);
		driver.findElement(By.xpath("(//*[contains(text(),'"+ ADTprovider +"')])[1]")).click();
    	Thread.sleep(1000);
		Priority.click();
		Thread.sleep(2000);
		SelectPriority.click();
		Thread.sleep(1000);
		{
			
			WebElement element = driver.findElement(By.xpath("//input[@id='bedcategory']"));
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView(true);", element);
		}
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
		Thread.sleep(500);
		referenceLetter.click();
		Thread.sleep(500);
		referenceNo.click();
		Thread.sleep(500);
		referenceNo.sendKeys("34453rt78");
		Thread.sleep(500);
		fromdate.click();
		Thread.sleep(500);
		Robot t = new Robot();
		t.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(500);
		t.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(500);
		
		todate.click();
		Thread.sleep(500);
		t.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(500);
		t.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(500);
		
		
		Attachment.click();
		Thread.sleep(600);
		Attach.click();
		Thread.sleep(600);


		// copying File path to Clipboard
		StringSelection str = new StringSelection("C:\\Users\\sriram\\Pictures\\Screenshots\\prescription.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		Thread.sleep(1000);
		// press Contol+V for pasting
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		Thread.sleep(500);
		// release Contol+V for pasting
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		Thread.sleep(1000);
		// for pressing and releasing Enter
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);


		Eye.click();
		Thread.sleep(2000);
		rb.keyPress(KeyEvent.VK_ESCAPE);
		Thread.sleep(400);
		rb.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(2000);  
		driver.findElement(By.xpath("//div[@class='modal-dialog modal-xl']//button[@class='btn btn-danger sm clear'][normalize-space()='Close']")).click();
		Thread.sleep(500);
		Add.click();
		Thread.sleep(500);	
		driver.findElement(By.xpath("//button[@class='btn btn-primary sm active']")).click();
		Thread.sleep(500);
		SAve.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(@class,'modal ki-dialog fade in show')]//button[contains(@aria-label,'Close')][normalize-space()='No']")).click();
		Thread.sleep(2000);
		

	//viewing refletter
		
		Billing.click();
		Thread.sleep(500);
		referenceletter.click();
		driver.findElement(By.xpath("//i[@class='ki ki-search text-white']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//i[@title='View']")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//button[@class='btn btn-danger sm clear']")).click();
		Thread.sleep(500);
		
		
	}

	
	
	public void employeeAuthorization(String seniorDR ,String JRdoctor, String Password , String site, String MRNO,String Service) throws InterruptedException {




		((JavascriptExecutor)driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles()); 
		int Windowsize =driver.getWindowHandles().size();
		int windowopen= Windowsize-1;

		driver.switchTo().window(tabs.get(windowopen));
		driver.switchTo().window(tabs.get(windowopen));
		Thread.sleep(2000);
		driver.get(URL);

		Thread.sleep(2000);
		userid.click();
		Thread.sleep(1000);
		userid.sendKeys(seniorDR);
		Thread.sleep(1000);
		password.click();
		Thread.sleep(1000);
		password.sendKeys(Password);
		Thread.sleep(1000);
		Site.click();
		Thread.sleep(1000);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//li[normalize-space()='"+site+"']")) );
		driver.findElement(By.xpath("//li[normalize-space()='"+site+"']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(2000);

		Hamburger.click();
		Thread.sleep(500);
		EMR.click();
		Thread.sleep(500);
		EmpAuthorization.click();
		Thread.sleep(500);
		
		
	for (int i = 0; i < 4; i++) {
		
	
		
		Thread.sleep(500);
		List<WebElement> dynamicElement=driver.findElements(By.xpath("//i[@class='ki ki-trash']"));

		if(dynamicElement.size() !=0)
		{
			driver.findElement(By.xpath("//i[@class='ki ki-trash']")).click();
		}


		else {
			System.out.println("sri");
		}
		Thread.sleep(1000);
		
	}	
		
		
		SearchUsers.click();
		Thread.sleep(500);
		SearchUsers.sendKeys(JRdoctor);
		Thread.sleep(500);
		driver.findElement(By.xpath("//label[contains(text(),'"+JRdoctor+"')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//i[@class='ki ki-chevron-right']")).click();
		Thread.sleep(1000);
		save.click();
		Thread.sleep(1000);

	
	}
	
	public void juniordocnote(String JRdoctor , String Password , String site, String MRNO,String Service) throws InterruptedException {




		((JavascriptExecutor)driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles()); 
		int Windowsize =driver.getWindowHandles().size();
		int windowopen= Windowsize-1;

		driver.switchTo().window(tabs.get(windowopen));
		driver.switchTo().window(tabs.get(windowopen));
		Thread.sleep(3000);
		driver.get(URL);
		Thread.sleep(3000);


		Thread.sleep(2000);
		userid.click();
		Thread.sleep(1000);
		userid.sendKeys(JRdoctor);
		Thread.sleep(1000);
		password.click();
		Thread.sleep(1000);
		password.sendKeys(Password);
		Thread.sleep(1000);
		Site.click();
		Thread.sleep(1000);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//li[normalize-space()='"+site+"']")) );
		driver.findElement(By.xpath("//li[normalize-space()='"+site+"']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(2000);

	
		driver.findElement(By.xpath("//input[@id='maincategory']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//li[normalize-space()='IP']")).click();
		Thread.sleep(500);
		
		ChangeProvider.click();
		Thread.sleep(500);
		ProviderName.click();
		Thread.sleep(500);
		ProviderName.sendKeys("Raina S");
		Thread.sleep(500);
		driver.findElement(By.xpath("//li[normalize-space()='Raina S(raina)']")).click();
		Thread.sleep(2000);
		
		EnterPatientName.sendKeys(MRNO);
		Thread.sleep(1500);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
		Thread.sleep(1000);
		//SelectPatient.click();
		/*	Thread.sleep(5000);
		UpArrow.click();
		Thread.sleep(500);
		Lock.click(); */
		
		
		///////Create the doctor note and select pregnant
		
		DoctorNote.click();
		Thread.sleep(1000);
	//	driver.findElement(By.xpath("//div[@class='dailog-btn']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		
		List<WebElement> dynamicElement=driver.findElements(By.xpath("//button[normalize-space()='Create New Note']"));

		if(dynamicElement.size() !=0)
		{
			driver.findElement(By.xpath("//button[normalize-space()='Create New Note']")).click();
		}

		Thread.sleep(2000);
		reasonForVisit.clear();
		Thread.sleep(1000);
		reasonForVisit.sendKeys("fever");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//strong[normalize-space()='Fever']")).click();
		Thread.sleep(1000);
		Template.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='SOAP']")).click();
		Thread.sleep(1000);
		TemplateOK.click();
		Thread.sleep(3000);
		
		Diagnosis.click();
		Thread.sleep(700);
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
		
		
		driver.findElement(By.xpath("//input[@id='fav']")).sendKeys("(Idiopathic) normal pressure hydrocephalus" , Keys.ENTER);
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//div[@title='(Idiopathic) normal pressure hydrocephalus']")).click();
		Thread.sleep(1000);

	///////cpoe Service	

			CpoeService.click();
			Thread.sleep(1000);
			CpoeServiceSearch.click();
			Thread.sleep(1000);
			CpoeServiceSearch.sendKeys(Service);
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[@class='item-list-row']//label[@class='item-name']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@class='col-md-12 pr0 ta-r']//button[@type='button'][normalize-space()='Add']")).click();
			Thread.sleep(1000);
	
			EmrSave.click();
			Thread.sleep(3000);
		
			Visit.click();
			Thread.sleep(1000);
			CountersignPending.click();
			Thread.sleep(1000);

		
	
	}
	
	
	public void seniorDoctor(String seniorDR , String Password , String site, String MRNO,String Service) throws InterruptedException {
		
		
		((JavascriptExecutor)driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles()); 
		int Windowsize =driver.getWindowHandles().size();
		int windowopen= Windowsize-1;

		driver.switchTo().window(tabs.get(windowopen));
		driver.switchTo().window(tabs.get(windowopen));
		Thread.sleep(3000);
		driver.get(URL);
		Thread.sleep(3000);


		Thread.sleep(2000);
		userid.click();
		Thread.sleep(1000);
		userid.sendKeys(seniorDR);
		Thread.sleep(1000);
		password.click();
		Thread.sleep(1000);
		password.sendKeys(Password);
		Thread.sleep(1000);
		Site.click();
		Thread.sleep(1000);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//li[normalize-space()='"+site+"']")) );
		driver.findElement(By.xpath("//li[normalize-space()='"+site+"']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//input[@id='maincategory']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//li[normalize-space()='IP']")).click();
		Thread.sleep(500);
		
		
		EnterPatientName.sendKeys(MRNO);
		Thread.sleep(1500);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
		Thread.sleep(1000);
		
		
		Visit.click();
		Thread.sleep(500);
		CountersignPending.click();
		Thread.sleep(1000);
		CountersignRemarks.click();
		Thread.sleep(500);
		CountersignRemarks.sendKeys("verified");
		Thread.sleep(500);
		
		save.click();
		Thread.sleep(1500);
		Signed.click();
		Thread.sleep(1000);
		save.click();
		Thread.sleep(1500);
		
		Hamburger.click();
		Thread.sleep(500);
		EMR.click();
		Thread.sleep(500);
		EmpAuthorization.click();
		Thread.sleep(500);
		
		

		for (int i = 0; i < 2; i++) {
			
			
			
			Thread.sleep(500);
			List<WebElement> dynamicElement=driver.findElements(By.xpath("//i[@class='ki ki-trash']"));

			if(dynamicElement.size() !=0)
			{
				driver.findElement(By.xpath("//i[@class='ki ki-trash']")).click();
			}


			else {
				System.out.println("sri");
			}
			Thread.sleep(1000);
			
		}	
			
		save.click();
		Thread.sleep(500);
		
		
		
	}
	
	
	
	
	
	
	
	

}