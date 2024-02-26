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
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class Naufar_VisitSummary_YasassiWeb extends PageFactoryInitYasasiiWeb{

	public Naufar_VisitSummary_YasassiWeb(WebDriver driver) {

		super(driver);

	}
		

@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='menu-toggle']")
public WebElement Hamburger;
@FindBy(xpath = "//i[@class='ki ki-reception-fill']")
public WebElement FOModule;
@FindBy(xpath = "//div[normalize-space()='Registration']")
public WebElement Registration;
@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/ki-select-control[1]/div[1]/input[1]")
public WebElement Title;
@FindBy(xpath = "//li[normalize-space()='Miss']")
public WebElement SelectMr;
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

@FindBy(xpath = "//input[@id='EncBillingproviders']")
public WebElement encProvider;

@FindBy(xpath = "//i[@class='ki ki-plus']")
public WebElement add;

@FindBy(xpath = "//button[@id='billingsave']")
public WebElement billSave;

@FindBy(xpath = "//i[@class='ki ki-reception-fill']")
public WebElement billing;

@FindBy(xpath = "//label[@class='check-container zero-label']")
public WebElement printUnckeck;	

@FindBy(xpath = "//input[@id='maritalstatusid']")
public WebElement maritialStatus;	

@FindBy(xpath = "//i[@id='capture']")
public WebElement signupload;	
		

@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[3]/app-emr-dashboard[1]/div[1]/label[2]/label[1]")
public WebElement DoctorNote;

@FindBy(xpath = "//input[@id='loginemail']")
public WebElement userid;

@FindBy(xpath = "//input[@id='loginpassword']")
public WebElement password;

@FindBy(xpath = "//input[@id='loginsite']")
public WebElement site;

@FindBy(xpath = "//input[@id='chiefcomplainttext']")
public WebElement reasonForVisit;

@FindBy(xpath = "//input[@id='emrtemplateid']")
public WebElement Template;

@FindBy(xpath = "//button[@aria-label='Ok'][normalize-space()='OK']")
public WebElement TemplateOK;


@FindBy(xpath = "//div[contains(text(),'Diagnosis and Plan')]")
public WebElement disgnosis;

@FindBy(xpath = "//div[contains(text(),'CPOE Pharmacy')]")
public WebElement CPOEpharm;

@FindBy(xpath = "//input[@formcontrolname='searchText']")
public WebElement MedicineSearch;

@FindBy(xpath = "//input[@id='antibioticorderingreasonid']")
public WebElement Orderingreason;


@FindBy(xpath = "//input[@id='antibioticorderingremarks']")
public WebElement justification;

@FindBy(xpath = "//label[contains(text(),'G91.2')]//span[@class='checkmark']")
public WebElement diagnosischevckbox;

@FindBy(xpath = "//label[contains(@class,'check-container ng-star-inserted')]//span[contains(@class,'checkmark')]")
public WebElement inclinicadmin;

@FindBy(xpath = "//button[@id='updatePharmacy']")
public WebElement medicineAdd;	

//@FindBy(xpath = "//input[@name='remarks']")
//public WebElement Remarks;

@FindBy(xpath = "//label[normalize-space()='No Current Medication']//span[@class='checkmark']")
public WebElement NoCurrentmed;

@FindBy(xpath = "//label[@class='check-container no-label']//span[@class='checkmark']")
public WebElement NoCurrentmedCheck;

@FindBy(xpath = "//i[@class='ki ki-admission-reconciliation']")
public WebElement AdmsnReconcile;

@FindBy(xpath = "//i[@class='ki ki-reconciliation']")
public WebElement Reconsile;

@FindBy(xpath = "//label[@class='icon emrsave']")
public WebElement EmrSave;
		

@FindBy(xpath = "//i[@class='dashboard-lock-arrow ki ki-chevron-up']")
public WebElement UParrow;

@FindBy(xpath = "//i[@class='dashboard-lock ki ki-lock-open']")
public WebElement Lock;

@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='bar2']")
public WebElement MenuToggle;

@FindBy(xpath = "//label[contains(text(),'Modules')]")
public WebElement MOdules;

@FindBy(xpath = "//div[contains(text(),'EMR HomeScreen')]")
public WebElement EMRHomeScreen;

@FindBy(xpath = "//input[@id='searchtext']")
public WebElement EnterPatientName;

@FindBy(xpath = "//input[@id='frequencyid']")
public WebElement Frequency;

@FindBy(xpath = "//div[contains(text(),'ADT Info')]")
public WebElement ADT;

@FindBy(xpath = "//input[@id='admittype']")
public WebElement AdmissionType;

@FindBy(xpath = "//input[@id='recomproviderdisplayname']")
public WebElement providername;

@FindBy(xpath = "//button[@id='savepatadtbutton']")
public WebElement SAve;

@FindBy(xpath = "//input[@id='prescriptiontypeid']")
public WebElement prescriptionType;

@FindBy(xpath = "//i[@class='ki ki-discharge-reconciliation']")
public WebElement DischargeReconcile;

@FindBy(xpath = "//i[@class='fa fa-print print-size']")
public WebElement PrescriptionPrintDN;

@FindBy(xpath = "//div[@class='item-name'][normalize-space()='Plan']")
public WebElement Plan;

@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[10]/div[1]/div[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[1]/div[1]/div[4]/ki-textarea-control[1]/div[1]/textarea[1]")
public WebElement PlanText;

@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emr-homescreen-landing[1]/div[1]/div[1]/div[2]/app-patient-previousnotes[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/label[1]/span[2]")
public WebElement EnteredNote;

@FindBy(xpath = "//i[@class='fa fa-pencil']")
public WebElement Editnote;

@FindBy(xpath = "//i[@class='ki ki-file-log']")
public WebElement Log;

@FindBy(xpath = "//i[@class='ki ki-user-computer']")
public WebElement CpoeView;

@FindBy(xpath = "//span[normalize-space()='Medicine']")
public WebElement Medicine;

@FindBy(xpath = "//i[contains(@title,'Prescription Print')]")
public WebElement cpoePrescriptionPrint;

@FindBy(xpath = "//div[normalize-space()='CPOE Service']")
public WebElement CpoeService;

@FindBy(xpath = "//input[@id='cpoeSearchText']")
public WebElement CpoeServiceSearch;

@FindBy(xpath = "//label[@id='emrdashboardpatient_cpoeadministration']//label[contains(@class,'icon cpoeadmin')]")
public WebElement CpoeAdministration;

@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-cpoe-administration[1]/div[1]/div[2]/app-mar-container[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/span[2]/label[1]/i[1]")
public WebElement AdminIcon;

@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='menu-toggle']")
public WebElement Hamberger;

@FindBy(xpath = "//div[normalize-space()='Group Note']")
public WebElement GroupNote;

@FindBy(xpath = "//div[contains(text(),'EMR HomeScreen')]")
public WebElement HomeScreen;

@FindBy(xpath = "/html[1]/body[1]/modal-container[1]/div[1]/div[1]/lib-duplicate-medicine-confirmation[1]/div[2]/div[1]/div[2]/div[2]/ki-input-control[1]/div[1]/input[1]")
public WebElement OverRidereason;


@FindBy(xpath = "//label[@class='icon discharesum']")
public WebElement visitsummary;

@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-discharge-summary[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[4]/ki-calender-time[1]/div[1]/input[1]")
public WebElement DOD;


@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-discharge-summary[1]/div[1]/div[2]/div[1]/div[2]/div[1]/app-load-components[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[2]/div[1]/div[4]/div[2]/div[1]/div[1]/div[4]/ki-textarea-control[1]/div[1]/textarea[1]")
public WebElement historyandfindings;


@FindBy(xpath = "//i[@class='ki ki-file-report']")
public WebElement Report;

@FindBy(xpath = "/html[1]/body[1]/modal-container[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ki-auto-complete-pagination[1]/div[1]/input[1]")
public WebElement Basecategory;

@FindBy(xpath = "//button[@class='btn btn-primary sm active']")
public WebElement Go;

@FindBy(xpath = "//button[normalize-space()='Log']")
public WebElement LOG;

@FindBy(xpath = "//button[normalize-space()='Preview']")
public WebElement Previewsummary;

@FindBy(xpath = "//label[normalize-space()='Authorize']//span[@class='checkmark']")
public WebElement Authorize;

@FindBy(xpath = "//button[normalize-space()='Save']")
public WebElement SummarySave;

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

@FindBy(xpath="//input[@id='undefined']")
public WebElement visitTemplate;

@FindBy(xpath="//div[@role='textbox']")
public WebElement visitAssesment;

@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-discharge-summary[1]/div[1]/div[2]/div[1]/div[2]/div[1]/app-load-components[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[3]/div[1]/div[3]/div[3]")
public WebElement Medication;

@FindBy(xpath="//input[@id='educationlevel-0']")
public WebElement OP;

@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-discharge-summary[1]/div[1]/div[2]/div[1]/div[2]/div[1]/app-load-components[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[4]/div[1]/div[1]/div[3]/ki-textarea-control[1]/div[1]/textarea[1]")
public WebElement visitreason;

@FindBy(xpath = "//label[@class='check-container zero-right']//span[@class='checkmark']")
public WebElement Admission;	

@FindBy(xpath = "//input[@id='recomproviderdisplayname']")
public WebElement EnterProviderName;
@FindBy(xpath = "//li[contains(text(),'Thomas')]")
public WebElement SelectProviderName;
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
@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-adt[1]/div[1]/div[1]/div[4]/div[1]/form[1]/div[2]/div[1]/app-adt-beddetails[1]/form[1]/div[1]/div[2]/ul[1]/app-list-item[2]/li[1]")
public WebElement SelectRoomType;
@FindBy(xpath = "//input[@id='bednumber']")
public WebElement Bed;
@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-adt[1]/div[1]/div[1]/div[4]/div[1]/form[1]/div[2]/div[1]/app-adt-beddetails[1]/form[1]/div[1]/div[3]/ul[1]/app-list-item[1]/li[1]")
public WebElement SelectBed;
@FindBy(xpath = "//button[@id='savepatadtbutton']")
public WebElement ADTSAve;
@FindBy(xpath = "//input[@id='roomtypeid']")
public WebElement Roomtype;	

@FindBy(xpath = "//input[@id='reservationtypeid']")
public WebElement ReservationmType;

@FindBy(xpath = "//textarea[@id='remarks']")
public WebElement Remarks;

@FindBy(xpath = "//input[@id='searchtext']")
public WebElement FOSearchField;

@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='bar1']")
public WebElement toggle;

@FindBy(xpath = "//div[contains(text(),'Pharmacy Panel')]")
public WebElement Pharmacypanel;

@FindBy(xpath = "//div[normalize-space()='OP Panel']")
public WebElement opPanel;

@FindBy(xpath = "//input[@id='locationid']")
public WebElement pharloc;

@FindBy(xpath = "//div[@class='modal-footer']//button[@type='button'][normalize-space()='OK']")
public WebElement pharlocOK;

@FindBy(xpath = "//input[@id='searchText']")
public WebElement counterSearch;

@FindBy(xpath = "//div[@class='plt-prt-5 col-md-8']//i[@class='ki ki-search']")
public WebElement counterSearchicon;

@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-panel-container[1]/div[1]/app-order-list-container[1]/lib-order-list[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")
public WebElement patientSearch2;

@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-panel-container[1]/div[2]/div[1]/app-op-panel[1]/div[2]/div[2]/lib-pharmacy-card[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")
public WebElement medicineCheck;

@FindBy(xpath = "//button[@id='confirmsave']")
public WebElement medicineSaveconfirm;

@FindBy(xpath = "//button[normalize-space()='OK']")
public WebElement confirmOK;

@FindBy(xpath = "//label[@class='check-container zero-label mt0 mr0']//span[@class='checkmark']")
public WebElement medicineCheck1;

@FindBy(xpath = "//button[@id='billholdsave']")
public WebElement holdbillSave;

@FindBy(xpath = "//button[@id='billingsave']")
public WebElement BILLsave;

@FindBy(xpath = "//ki-select-control[@placeholder='Status']//input[@id='undefined']")
public WebElement status;













public void ADT(String ADTprovider,String MRNO) throws InterruptedException, AWTException {
	

	
	
	Thread.sleep(2000);
	Hamburger.click();
	Thread.sleep(800);
	FOModule.click();
	Thread.sleep(1000);
	List<WebElement> dynamicElement=driver.findElements(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']"));

	if(dynamicElement.size() !=0)
	{
		driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
	}


	else {
		System.out.println("sri");
	}
	Thread.sleep(1000);
	
	Registration.click();
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


	FOSearchField.click();
	Thread.sleep(1000);
	FOSearchField.sendKeys(MRNO);
	Thread.sleep(1000);
	FOSearchField.sendKeys(Keys.ENTER);
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
	Thread.sleep(2000);
	
	
	
	
/////Admit the patient
ADT.click();
Thread.sleep(1500);
Admission.click();
Thread.sleep(1000);
EnterProviderName.sendKeys(ADTprovider);
Thread.sleep(1500);
driver.findElement(By.xpath("(//*[contains(text(),'"+ ADTprovider +"')])[1]")).click();
Thread.sleep(1000);
Priority.click();
Thread.sleep(2000);
SelectPriority.click();
Thread.sleep(1000);
Roomtype.click();
Thread.sleep(800);
driver.findElement(By.xpath("//li[normalize-space()='Deluxe']")).click();
Thread.sleep(800);
ReservationmType.click();
Thread.sleep(800);
driver.findElement(By.xpath("//li[normalize-space()='Normal']")).click();
Thread.sleep(800);
Remarks.click();
Thread.sleep(800);
Remarks.sendKeys("Recommended for Admission");
Thread.sleep(800);
ADTSAve.click();
Thread.sleep(3000);
driver.findElement(By.xpath("//img[@class='dr-image']")).click();
Thread.sleep(800);
driver.findElement(By.xpath("//input[@id='bednumber']")).click();
Thread.sleep(800);
driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-adt[1]/div[1]/div[1]/div[4]/div[1]/form[1]/div[2]/div[1]/app-adt-beddetails[1]/form[1]/div[1]/div[3]/ul[1]/app-list-item[1]/li[1]")).click();
Thread.sleep(800);
ADTSAve.click();
Thread.sleep(3000);


}


public void	DoctorNote(String DOCuser ,String DOCpassword, String Site , String MRNo,String ADTProvider ) throws InterruptedException, AWTException {


	Thread.sleep(3000);
	((JavascriptExecutor)driver).executeScript("window.open()");
	ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	int Windowsize =driver.getWindowHandles().size();
	int windowopen= Windowsize-1;

	driver.switchTo().window(tabs.get(windowopen));
	driver.switchTo().window(tabs.get(windowopen));
	Thread.sleep(5000);
	driver.get(URL);
	Thread.sleep(3000);

    userid.click();
	Thread.sleep(1000);
	userid.sendKeys(DOCuser);
	password.click();
	Thread.sleep(1000);
	password.sendKeys(DOCpassword);
	Thread.sleep(1000);
	site.click();
	Thread.sleep(1000);
	
	JavascriptExecutor js= (JavascriptExecutor) driver;//li[normalize-space()='Naufar Center']
	//js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")) );
	driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
	Thread.sleep(3000);
//	MenuToggle.click();
//	Thread.sleep(1000);
//	EMRHomeScreen.click();
//	Thread.sleep(1200);
	
    EnterPatientName.sendKeys(MRNo);
	Thread.sleep(1500);
	driver.findElement(By.xpath("(//*[contains(text(),'"+MRNo+"')])[1]")).click();
	Thread.sleep(1000);
	
	
	//SelectPatient.click();
	/*Thread.sleep(5000);
	UParrow.click();
	Thread.sleep(500);
	Lock.click();
	Thread.sleep(500); */
	
	///ADT
	
/*	ADT.click();
	Thread.sleep(1000);
	//driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
	Thread.sleep(1000);
	AdmissionType.click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//li[normalize-space()='Day Case Admission']")).click();
	Thread.sleep(1000);
	providername.click();
	Thread.sleep(1000);
	providername.sendKeys(ADTProvider);
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//*[contains(text(),'"+ADTProvider+"')])[1]")).click();
	Thread.sleep(1000);
	Priority.click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//li[normalize-space()='Elective']")).click();
	Thread.sleep(1000);
	BedCategory.click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//li[normalize-space()='ROOM']")).click();
	Thread.sleep(1000);
	RoomType.click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//*[contains(text(),'Deluxe')])")).click();
	Thread.sleep(1000);
	Bed.click();
	Thread.sleep(500);
	driver.findElement(By.xpath("(//*[contains(text(),'Emergency NS')])[1]")).click();
	Thread.sleep(500);
	SAve.click();
	Thread.sleep(2500);      */
	
	
	///////Create the doctor note and select pregnant
	
	Hamberger.click();
	Thread.sleep(1000);
	GroupNote.click();
	Thread.sleep(1000);
	Hamberger.click();
	Thread.sleep(1000);
	HomeScreen.click();
	Thread.sleep(1000);    
	
	driver.findElement(By.xpath("//input[@id='maincategory']")).click();
	Thread.sleep(1200);
	driver.findElement(By.xpath("//li[normalize-space()='IP']")).click();
	Thread.sleep(1200);
	EnterPatientName.sendKeys(MRNo);
	Thread.sleep(1500);
	driver.findElement(By.xpath("(//*[contains(text(),'"+MRNo+"')])[1]")).click();
	Thread.sleep(2500);
/*	UParrow.click();
	Thread.sleep(500);
	Lock.click();
	Thread.sleep(500); */
	DoctorNote.click();
	Thread.sleep(1000);
	List<WebElement> dynamicElement=driver.findElements(By.xpath("//button[normalize-space()='Create New Note']"));

	if(dynamicElement.size() !=0)
	{
		driver.findElement(By.xpath("//button[normalize-space()='Create New Note']")).click();
	}

	Thread.sleep(1000);
	reasonForVisit.clear();
	Thread.sleep(1000);
	reasonForVisit.sendKeys("fever");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//strong[normalize-space()='Fever']")).click();
	Thread.sleep(1000);
	Template.click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//li[normalize-space()='Dental Examination and Treatment']")).click();
	Thread.sleep(1000);
	TemplateOK.click();
	Thread.sleep(1000);
	
	disgnosis.click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//div[@title='(Idiopathic) normal pressure hydrocephalus']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[contains(text(),'Mark as Final')]")).click();
	Thread.sleep(1000); 

	///Pharmacy
	
	CPOEpharm.click();
	Thread.sleep(1000);
	MedicineSearch.clear();
	Thread.sleep(1000);
	MedicineSearch.sendKeys("Calpol");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[contains(@title,'by Oral')]")).click();
	Thread.sleep(1000);
	prescriptionType.click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//li[normalize-space()='Discharge']")).click();
	Thread.sleep(1000);
	Frequency.click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//li[normalize-space()='TID']")).click();
	Thread.sleep(1000);
	
	
	js.executeScript("arguments[0].scrollIntoView();",diagnosischevckbox);
	Thread.sleep(1000);
	diagnosischevckbox.click();
	Thread.sleep(1000); 

	
	NoCurrentmed.click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//div[@class='mb10 btn-type-add ta-r']//button[@type='button'][normalize-space()='Add']")).click();
	Thread.sleep(1000);
	NoCurrentmedCheck.click();
	Thread.sleep(1000);
	DischargeReconcile.click();
	Thread.sleep(1000);
	//AdmsnReconcile.click();
	Thread.sleep(1000);
	Reconsile.click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
	Thread.sleep(1000);
    medicineAdd.click();
	Thread.sleep(1000);
	
	
	////Pharmacy 
	
    CPOEpharm.click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@placeholder='Search Medicines']")).clear();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@placeholder='Search Medicines']")).sendKeys("dolo");
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//div[contains(@title,'by Oral')])[1]")).click();
	Thread.sleep(1000);
	prescriptionType.click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//li[normalize-space()='Discharge']")).click();
	Thread.sleep(1000);
	Frequency.click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//li[normalize-space()='TID']")).click();
	Thread.sleep(1000);
	
	

	js.executeScript("arguments[0].scrollIntoView();",diagnosischevckbox);
	Thread.sleep(1000);
	diagnosischevckbox.click();
	Thread.sleep(1000); 
	
	medicineAdd.click();
	Thread.sleep(1000);
	

	//OverRidereason.click();
	Thread.sleep(500);
	//OverRidereason.sendKeys("ok");
	Thread.sleep(500);
//	driver.findElement(By.xpath("//button[@class='btn btn-dark-green active ng-star-inserted']")).click();
	Thread.sleep(500);
	PrescriptionPrintDN.click();
	Thread.sleep(3000);
	
	Robot t=new Robot();
	t.keyPress(KeyEvent.VK_ESCAPE);
	Thread.sleep(500);
	t.keyRelease(KeyEvent.VK_ESCAPE);
	Thread.sleep(1000);
///////cpoe Service	
	
	CpoeService.click();
	Thread.sleep(1000);
	CpoeServiceSearch.click();
	Thread.sleep(1000);
	CpoeServiceSearch.sendKeys("Alcohol");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//label[normalize-space()='Alcohol and/or drug assessment']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//div[@id='cpoeservicelist_9']//label[@class='item-name']")).click();
	Thread.sleep(1000);
	
////Plan	
	Thread.sleep(1000);
	Plan.click();
	Thread.sleep(1000);
	PlanText.click();
	Thread.sleep(1000);
	PlanText.sendKeys("There were pretty minor changes in transition from ODF 1.0 to 1.1 versions. The ODF 1.2 version is the latest version for ODF specifications and should be consulted by developers for development of applications related to ODS reading/writing.");
	Thread.sleep(2000);
	EmrSave.click();
	
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emr-homescreen-landing[1]/div[1]/div[1]/div[2]/app-patient-previousnotes[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/label[1]/span[2]")));
	Thread.sleep(3000);
	EnteredNote.click();
	Thread.sleep(1000);
	Log.click();
	Thread.sleep(1000);
	CpoeView.click();
	Thread.sleep(1000);
	Medicine.click();
	Thread.sleep(1000);
	cpoePrescriptionPrint.click();
	Thread.sleep(2000);
	//Robot t=new Robot();
	t.keyPress(KeyEvent.VK_ESCAPE);
	Thread.sleep(1000);
	t.keyRelease(KeyEvent.VK_ESCAPE);
	Thread.sleep(1000);   
	
	}  

	public void VisitSummary(String DOCuser ,String DOCpassword, String Site , String MRNo,String ADTProvider ) throws InterruptedException, AWTException{
		
		

		Thread.sleep(3000);
		((JavascriptExecutor)driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		int Windowsize =driver.getWindowHandles().size();
		int windowopen= Windowsize-1;

		driver.switchTo().window(tabs.get(windowopen));
		driver.switchTo().window(tabs.get(windowopen));
		Thread.sleep(5000);
		driver.get(URL);
		Thread.sleep(3000);

	    userid.click();
		Thread.sleep(1000);
		userid.sendKeys(DOCuser);
		password.click();
		Thread.sleep(1000);
		password.sendKeys(DOCpassword);
		Thread.sleep(1000);
		site.click();
		Thread.sleep(1000);
		
		JavascriptExecutor js= (JavascriptExecutor) driver;//li[normalize-space()='Naufar Center']
		//js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")) );
		driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(3000);
		
		
		
		MenuToggle.click();
		Thread.sleep(1000);
		EMRHomeScreen.click();
		Thread.sleep(1200);
		EnterPatientName.sendKeys(MRNo);
		Thread.sleep(1500);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNo+"')])[1]")).click();
		Thread.sleep(1000);
		//SelectPatient.click();
	/*	Thread.sleep(5000);
		UParrow.click();
		Thread.sleep(500);
		Lock.click();
		Thread.sleep(500);  */
		
		
		
	
		
		

		//JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@class='icon discharesum']")));
		Thread.sleep(2000);
		visitsummary.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='educationlevel-1']")).click();
		
		Thread.sleep(3000);
//		DOD.click();
//		Thread.sleep(2000);
//		Robot r=new Robot(); 
//		r.keyPress(KeyEvent.VK_ENTER);
//		Thread.sleep(500);
//		r.keyRelease(KeyEvent.VK_ENTER);
//		Thread.sleep(2000);	
		
		visitTemplate.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Consent Form']")).click();
		Thread.sleep(1000);
		visitTemplate.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Visit Summary']")).click();
		Thread.sleep(1000);
		
		
		visitAssesment.click();
		Thread.sleep(1000);
		visitAssesment.sendKeys("Files with .xlt extension are template files created with Microsoft Excel which is a spreadsheet application which comes as part of Microsoft Office suite. Microsoft Office 97-2003 supported creating new XLT files as well as opening these. The latest version of Excel is still capable of opening this old format template files. Such a template file is used to quickly create new Excel files with default data and settings such as page formatting, font size, margins, charts, etc which can be further saved as new .xls files.");
		Thread.sleep(1000);
		js.executeScript("arguments[0].scrollIntoView();", Medication );
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-discharge-summary[1]/div[1]/div[2]/div[1]/div[2]/div[1]/app-load-components[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[3]/div[1]/div[3]/div[4]/div[1]/div[1]/div[3]/div[3]/element-medication[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/label[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-discharge-summary[1]/div[1]/div[2]/div[1]/div[2]/div[1]/app-load-components[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[3]/div[1]/div[3]/div[4]/div[1]/div[1]/div[3]/div[3]/element-medication[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/label[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")).click();
		Thread.sleep(1000);
		SummarySave.click();
		Thread.sleep(1000);
		LOG.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='btn btn-danger sm clear']")).click();
		Thread.sleep(1000);
		
	/////Op Visit	
		
		OP.click();
		Thread.sleep(2000);
		
		visitTemplate.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Consent Form']")).click();
		Thread.sleep(1000);
		visitTemplate.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Visit Summary']")).click();
		Thread.sleep(2000);
		visitreason.click();
		Thread.sleep(1000);
		visitreason.sendKeys("spritual evaluation");
		Thread.sleep(1000);
		
		
		DOD.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[normalize-space()='Today']")).click();
		Thread.sleep(2000);
	/*	Robot r=new Robot(); 
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(500);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);	   */
		
		js.executeScript("arguments[0].scrollIntoView();", Report);//i[@class='ki ki-file-report']
		
		Report.click();
		Thread.sleep(1000);
		Basecategory.click();
		Thread.sleep(1000);
		Basecategory.sendKeys("laboratory");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Laboratory']")).click();
		Thread.sleep(1000);
		Go.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/modal-container[1]/div[1]/div[1]/div[2]/div[4]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/label[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/modal-container[1]/div[1]/div[1]/div[2]/div[4]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/label[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html[1]/body[1]/modal-container[1]/div[1]/div[1]/div[2]/div[4]/div[1]/table[1]/tbody[1]/tr[3]/td[1]/label[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@type='button']")).click();
		Thread.sleep(1000);
		LOG.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='btn btn-danger sm clear']")).click();
		Thread.sleep(1000);
		Previewsummary.click();
		Thread.sleep(3000);
		Authorize.click();
		Thread.sleep(1000);
		SummarySave.click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//div[@class='dailog-btn']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//i[@class='ki ki-print']")).click();
		Thread.sleep(3000);
		Robot t=new Robot();
		t.keyPress(KeyEvent.VK_ESCAPE);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(1000);
		LOG.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn btn-danger sm clear']")).click();
		Thread.sleep(1000);
			
	}

	
	
	public void PanelCheck( String user , String Password ,String Site , String MRNO ) throws InterruptedException {
		
		Thread.sleep(3000);
		((JavascriptExecutor)driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		int Windowsize =driver.getWindowHandles().size();
		int windowopen= Windowsize-1;

		driver.switchTo().window(tabs.get(windowopen));
		driver.switchTo().window(tabs.get(windowopen));
		Thread.sleep(5000);
		driver.get(URL);
		Thread.sleep(3000);

	    userid.click();
		Thread.sleep(1000);
		userid.sendKeys(user);
		password.click();
		Thread.sleep(1000);
		password.sendKeys(Password);
		Thread.sleep(1000);
		site.click();
		Thread.sleep(1000);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		//js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")) );
		driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(3000);
		

		toggle.click();
		Thread.sleep(1000);
		FO.click();
		Thread.sleep(1000);
		Pharmacypanel.click();
		Thread.sleep(1000);
		opPanel.click();
		Thread.sleep(1000);
		
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

		pharloc.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Basement Bulk Store A B']")).click();
		Thread.sleep(1000);
		pharlocOK.click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//span[@class='checkmark']")).click();
		Thread.sleep(1000);
		counterSearch.click();
		Thread.sleep(1000);
		counterSearch.sendKeys(MRNO , Keys.ENTER);
		Thread.sleep(1000);
	
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
		Thread.sleep(1000);

		medicineCheck.click();	
		Thread.sleep(2000);
		medicineSaveconfirm.click();
		Thread.sleep(2000);
		confirmOK.click(); 
		Thread.sleep(2000);

		
		status.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Confirmed'] ")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
		// patientSearch2.click();
		Thread.sleep(1000);
		Thread.sleep(1000);
		medicineCheck1.click();
		Thread.sleep(1000);
		holdbillSave.click();
		Thread.sleep(2000);
		confirmOK.click();
		Thread.sleep(1000);
		status.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[normalize-space()='Stock Reservation']")).click();
		
		Thread.sleep(1000);
     	counterSearch.clear();
		Thread.sleep(1000);
		counterSearch.sendKeys(MRNO);
		Thread.sleep(1000);
		//counterSearchicon.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(text(),'"+MRNO+"')]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//label[normalize-space()='Print']//span[@class='checkmark']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//i[@class='ki ki-save']")).click();
		Thread.sleep(2000);
		
		


		
		
	}
	
	
	
	
	
	
	
	

}
