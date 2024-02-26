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
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class Naufar_Task_Stickynote_Qasi_Yasasiiweb extends PageFactoryInitYasasiiWeb{

	public Naufar_Task_Stickynote_Qasi_Yasasiiweb(WebDriver driver) {

		super(driver);
	} 

	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='bar2']")
	public WebElement Hamburger;

	@FindBy(xpath = "//div[@class='module-icon-wrap active ng-star-inserted']//i[@class='ki ki-reception-fill']")
	public WebElement FOModule;

	@FindBy(xpath = "//div[normalize-space()='Registration']")
	public WebElement Registration;

	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/ki-select-control[1]/div[1]/input[1]")
	public WebElement Title;

	@FindBy(xpath = "//li[normalize-space()='Miss']")
	public WebElement SelectMr;

	@FindBy(xpath = "//input[@id='fo-card-reader-firstname']")
	public WebElement EnterFirstNME;

	@FindBy(xpath="//input[@id='lastname']")
	public WebElement lastname;

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

	@FindBy(xpath = "//i[@class='ki ki-reception-fill']")
	public WebElement billing;

	@FindBy(xpath = "//label[@class='check-container zero-label']")
	public WebElement printUnckeck;	

	@FindBy(xpath = "//input[@id='maritalstatusid']")
	public WebElement maritialStatus;	

	@FindBy(xpath = "//i[@id='capture']")
	public WebElement signupload;	

	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='bar2']")
	public WebElement Hamberger;

	@FindBy(xpath = "//input[@id='dynamic_selectHTF1004493']")
	public WebElement InterviewerSeverity;

	@FindBy(xpath = "//i[@class='ki ki-plus']")
	public WebElement EncounterAdd;

	@FindBy(xpath = "//button[@id='billingsave']")
	public WebElement EncounterSave;

	@FindBy(xpath = "//div[@class='modal-body']//button[@type='button'][normalize-space()='OK']")
	public WebElement SAvesuccess;

	@FindBy(xpath = "//label[contains(@class,'check-container zero-label')]")
	public WebElement printuncheck;

	@FindBy(xpath = "//button[normalize-space()='Clear']")
	public WebElement clear;

	@FindBy(xpath = "//label[@class='btn-feedback ng-star-inserted']")
	public WebElement Additionalinfo;

	@FindBy(xpath = "//input[@id='housingstatuslivesinid']")
	public WebElement Accomadation;

	@FindBy(xpath = "//button[@id='saveregistrationbutton']")
	public WebElement Savereg;

	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[7]/div[1]/ki-select-control[1]/div[1]/input[1]")
	public WebElement nationality;


	////////////Task

	@FindBy(xpath = "//img[@src='../../../../../assets/img/header/reports-lg.png']")
	public WebElement task;

	@FindBy(xpath = "//label[@title='Add Task']//i[@class='ki ki-plus']")
	public WebElement newTask;

	@FindBy(xpath = "//input[@id='groupname']")
	public WebElement Subject;

	@FindBy(xpath = "//input[@placeholder='Search...']")
	public WebElement Search;

	@FindBy(xpath = "//ki-calender-time[@placeholder='Due Date']//input[@type='text']")
	public WebElement Duedate;

	@FindBy(xpath = "//input[@id='priorityid']")
	public WebElement Priority;

	@FindBy(xpath = "//textarea[@id='comments']")
	public WebElement Comment;

	@FindBy(xpath = "//button[@title='To add Employees to the list']//i[@class='ki ki-plus']")
	public WebElement Add;

	@FindBy(xpath = "//label[normalize-space()='Schedule']//span[@class='checkmark']")
	public WebElement Schedule;

	@FindBy(xpath = "//input[@id='daycount']")
	public WebElement Every;

	@FindBy(xpath = "//button[@id='emptasksave']")
	public WebElement TaskSave;

	@FindBy(xpath = "//i[@class='fa fa-eye']")
	public WebElement TaskView;

	@FindBy(xpath = "//img[@class='pat-head-icons']")
	public WebElement StickyNote;

	@FindBy(xpath = "//div[@id='0']")
	public WebElement stickyText;

	@FindBy(xpath = "//input[@id='occurrenceCount']")
	public WebElement EndAfter;

	@FindBy(xpath = "//label[normalize-space()='Keep an updated copy of this task on my task list']//span[@class='checkmark']")
	public WebElement Keepupdated;

	@FindBy(xpath = "//label[normalize-space()='Reminder']//span[@class='checkmark']")
	public WebElement Reminder;

	

	///Login


	@FindBy(xpath = "//input[@id='loginemail']")
	public WebElement userid;

	@FindBy(xpath = "//input[@id='loginpassword']")
	public WebElement password;

	@FindBy(xpath = "//input[@id='loginsite']")
	public WebElement site;

	@FindBy(xpath = "(//i[@class='ki ki-trash'])[1]")
	public WebElement TaskDelete;

	//	@FindBy(xpath = "//input[@id='loginpassword']")
	//	public WebElement password;

	@FindBy(xpath = "//div[@class='col-md-2 p-0']//i[@class='ki ki-comments']")
	public WebElement Comments;

	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement Searchfield;

	@FindBy(xpath = "//input[@id='chiefcomplainttext']")    
	public WebElement cheifComplaint;

	@FindBy(xpath = "//input[@id='emrtemplateid']")
	public WebElement template;

	@FindBy(xpath = "//button[@aria-label='Ok'][normalize-space()='OK']")
	public WebElement tempOk;

	@FindBy(xpath = "//label[@class='icon doctornote']")
	public WebElement DoctorNote;

	@FindBy(xpath = "//label[@class='icon nursenote']")
	public WebElement NurseNote;

	@FindBy(xpath = "//div[@id='HTF1004482']")
	public WebElement medicalStatus;

	@FindBy(xpath = "//input[@id='dynamic_textHTF1007426']")
	public WebElement Hospitalized;

	@FindBy(xpath = "//input[@id='dynamic_textHTF1004491']")
	public WebElement MedicalProblems;	

	@FindBy(xpath = "//input[@id='dynamic_selectHTF1004492']")
	public WebElement Troubled;	

	@FindBy(xpath = "//input[@id='dynamic_selectHTF1004906']")
	public WebElement Treatment;

	@FindBy(xpath = "//input[@id='EncBillingproviders']")
	public WebElement providerName;

	@FindBy(xpath = "//input[@id='dynamic_selectHTF1004500']")
	public WebElement Confidencemarking1;

	@FindBy(xpath = "//input[@id='dynamic_selectHTF1004502']")
	public WebElement Confidencemarking2;

	@FindBy(xpath = "//input[@id='dynamic_textHTF1007438']")
	public WebElement EducationCompleted_Yrs;

	@FindBy(xpath = "//input[@id='dynamic_textHTF1007439']")
	public WebElement EducationCompleted_MOS;

	@FindBy(xpath = "//div[@id='HTF1007441']//label[1]//span[2]")
	public WebElement Training;

	@FindBy(xpath = "//input[@id='dynamic_textHTF1007442']")
	public WebElement TrainingComments;

	@FindBy(xpath = "//input[@id='dynamic_textHTF1007445']")
	public WebElement UsualOccupation;

	@FindBy(xpath = "//input[@id='dynamic_selectHTF1004516']")
	public WebElement paidForWorking;

	@FindBy(xpath = "//input[@id='dynamic_textHTF1004519']")
	public WebElement Employment;

	@FindBy(xpath = "//input[@id='dynamic_textHTF1004528']")
	public WebElement Illegal;

	@FindBy(xpath = "//input[@id='dynamic_selectHTF1004534']")
	public WebElement HowTroubled;

	@FindBy(xpath = "//input[@id='dynamic_selectHTF1004535']")
	public WebElement CouncellingNEeDED;

	@FindBy(xpath = "//input[@id='dynamic_selectHTF1004537']")
	public WebElement EmploymentCounselling;

	@FindBy(xpath = "//div[@id='HTF1004541']")
	public WebElement Alcohol_Drugs;


	@FindBy(xpath = "//div[@class='element-container removespace isabsolute']//div[1]//div[1]//div[4]//div[2]//div[1]//div[1]//label[1]//span[2]")
	public WebElement Alcoholalluse;

	@FindBy(xpath = "//div[@class='element-container removespace isabsolute']//div[1]//div[1]//div[4]//div[2]//div[2]//div[1]//label[1]//span[2]")
	public WebElement AlcoholIntaxiacation;

	@FindBy(xpath = "//div[@class='element-container removespace isabsolute']//div[1]//div[1]//div[4]//div[2]//div[3]//div[1]//label[1]//span[2]")
	public WebElement Heroin;

	@FindBy(xpath = "//div[@class='element-container removespace isabsolute']//div[1]//div[1]//div[4]//div[2]//div[4]//div[1]//label[1]//span[2]")
	public WebElement OtherOpiates;

	@FindBy(xpath = "//div[@class='element-container removespace isabsolute']//div[1]//div[1]//div[4]//div[2]//div[5]//div[1]//label[1]//span[2]")
	public WebElement barbituates;

	@FindBy(xpath = "//div[@class='element-container removespace isabsolute']//div[1]//div[1]//div[4]//div[2]//div[6]//div[1]//label[1]//span[2]")
	public WebElement Other;

	@FindBy(xpath = "//div[@class='element-container removespace isabsolute']//div[1]//div[1]//div[4]//div[2]//div[7]//div[1]//label[1]//span[2]")
	public WebElement Cocaine1;

	@FindBy(xpath = "//div[@class='element-container removespace isabsolute']//div[1]//div[1]//div[4]//div[2]//div[8]//div[1]//label[1]//span[2]")
	public WebElement Methamphetamines;

	@FindBy(xpath = "//div[@class='element-container removespace isabsolute']//div[1]//div[1]//div[4]//div[2]//div[9]//div[1]//label[1]//span[2]")
	public WebElement Amphetamines;

	@FindBy(xpath = "//div[@class='element-container removespace isabsolute']//div[1]//div[1]//div[4]//div[2]//div[10]//div[1]//label[1]//span[2]")
	public WebElement Cannabis;

	@FindBy(xpath = "//div[@class='element-container removespace isabsolute']//div[1]//div[1]//div[4]//div[2]//div[11]//div[1]//label[1]//span[2]")
	public WebElement Hallucinogens;

	@FindBy(xpath = "//div[@class='element-container removespace isabsolute']//div[1]//div[1]//div[4]//div[2]//div[12]//div[1]//label[1]//span[2]")
	public WebElement Inhalants;

	@FindBy(xpath = "//div[@class='element-container removespace isabsolute']//div[1]//div[1]//div[4]//div[2]//div[13]//div[1]//label[1]//span[2]")
	public WebElement morethanOne;

	@FindBy(xpath = "//input[@id='dynamic_textHTF1007508']")
	public WebElement AcoholDT;


	@FindBy(xpath = "//input[@id='dynamic_textHTF1007510']")
	public WebElement AlcoholAbuse;

	@FindBy(xpath = "//input[@id='dynamic_textHTF1007509']")
	public WebElement Overdosed;

	@FindBy(xpath = "//input[@id='dynamic_textHTF1007513']")
	public WebElement Drugs;

	@FindBy(xpath = "//input[@id='dynamic_textHTF1007512']")
	public WebElement Alcohol;

	@FindBy(xpath = "//input[@id='dynamic_textHTF1004619']")
	public WebElement AlcoholMoney;

	@FindBy(xpath = "//input[@id='dynamic_textHTF1007514']")
	public WebElement Drugsmoney;

	@FindBy(xpath = "//input[@id='dynamic_textHTF1007511']")
	public WebElement DrugAbuse;

	@FindBy(xpath = "//span[@title='Sticky Note']//img[@title='Sticky Note']")
	public WebElement StickynotrEMR;

	@FindBy(xpath = "//input[@id='dynamic_selectHTF1004623']")
	public WebElement AlcoholProblem;

	@FindBy(xpath = "//input[@id='dynamic_selectHTF1004624']")
	public WebElement DrugProblem;

	@FindBy(xpath = "//input[@id='dynamic_selectHTF1004626']")
	public WebElement AlcoholProblem1;

	@FindBy(xpath = "//input[@id='dynamic_selectHTF1004627']")
	public WebElement DrugsProblem1;
	
	@FindBy(xpath = "//input[@id='dynamic_selectHTF1004628']")
	public WebElement AlcoholProblem2;

	@FindBy(xpath = "//input[@id='dynamic_selectHTF1004629']")
	public WebElement DrugsProblem2;

	@FindBy(xpath = "//input[@id='dynamic_selectHTF1004631']")
	public WebElement AlcoholProblem3;

	@FindBy(xpath = "//input[@id='dynamic_selectHTF1004632']")
	public WebElement DrugsProblem3;

	@FindBy(xpath = "//div[@id='HTF1004636']")
	public WebElement legalStus;

	@FindBy(xpath = "//input[@id='dynamic_textHTF1007516']")
	public WebElement Shoplifting;

	@FindBy(xpath = "//input[@id='dynamic_textHTF1007519']")
	public WebElement Forgry;

	@FindBy(xpath = "//input[@id='dynamic_textHTF1007522']")
	public WebElement Robbery;

	@FindBy(xpath = "//input[@id='dynamic_textHTF1007525']")
	public WebElement Rape;

	@FindBy(xpath = "//input[@id='dynamic_textHTF1007528']")
	public WebElement Contempt;

	@FindBy(xpath = "//input[@id='dynamic_textHTF1007517']")
	public WebElement Parole_Probation;

	@FindBy(xpath = "//input[@id='dynamic_textHTF1007520']")
	public WebElement Weapons;

	@FindBy(xpath = "//input[@id='dynamic_textHTF1007523']")
	public WebElement Asssault;

	@FindBy(xpath = "//input[@id='dynamic_textHTF1007526']")
	public WebElement Homicide_Manslaughter;

	@FindBy(xpath = "//input[@id='dynamic_textHTF1007529']")
	public WebElement others;

	@FindBy(xpath = "//input[@id='dynamic_textHTF1007518']")
	public WebElement DrugCharges;

	@FindBy(xpath = "//input[@id='dynamic_textHTF1007521']")
	public WebElement Burglary;

	@FindBy(xpath = "//input[@id='dynamic_textHTF1007524']")
	public WebElement Arson;

	@FindBy(xpath = "//input[@id='dynamic_textHTF1007527']")
	public WebElement Prostitution;

	@FindBy(xpath = "//input[@id='dynamic_textHTF1007530']")
	public WebElement Conviction;
	

	@FindBy(xpath = "//input[@id='dynamic_textHTF1007531']")
	public WebElement  public_intoxication;

	@FindBy(xpath = "//input[@id='dynamic_textHTF1007532']")
	public WebElement Driving_intoxication;

	@FindBy(xpath = "//input[@id='dynamic_textHTF1007533']")
	public WebElement driving_violations;

	@FindBy(xpath = "//input[@id='dynamic_textHTF1007534']")
	public WebElement incarcerated;

	@FindBy(xpath = "//input[@id='dynamic_selectHTF1004663']")
	public WebElement Sentence;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[6]/div[1]/div[4]/div[2]/div[3]/div[1]/div[4]/div[2]/div[9]/div[1]/div[4]/div[2]/div[5]/div[4]/div[4]/ki-select-control[1]/div[1]/input[1]")   
	public WebElement illegal_activities;

	@FindBy(xpath = "//input[@id='dynamic_selectHTF1004667']")   
	public WebElement PresentlegalProblems;
	
	@FindBy(xpath = "//input[@id='dynamic_selectHTF1004668']")   
	public WebElement Counselling;
	
	@FindBy(xpath = "//input[@id='dynamic_selectHTF1004670']")
	public WebElement legal_services;

	@FindBy(xpath = "//div[@id='HTF1004722']")
	public WebElement FamilySocial;

	@FindBy(xpath = "//input[@id='dynamic_selectHTF1004726']")
	public WebElement satisfied;
	
	
	@FindBy(xpath = "//input[@id='dynamic_selectHTF1007556']")
	public WebElement LivingArrangements;

	@FindBy(xpath = "//input[@id='dynamic_selectHTF1004775']")
	public WebElement WithYourFamily;

	@FindBy(xpath = "//input[@id='dynamic_selectHTF1004778']")
	public WebElement FamilyProblems;

	@FindBy(xpath = "//input[@id='dynamic_selectHTF1004781']")
	public WebElement FamilyProblems1;

	@FindBy(xpath = "//input[@id='dynamic_selectHTF1004784']")
	public WebElement SocialCounselling;

	@FindBy(xpath = "//div[@id='HTF1004789']")
	public WebElement PSYCHIATRIC_STATUS;

	@FindBy(xpath = "//input[@id='dynamic_textHTF1007566']")
	public WebElement InPatient;

	@FindBy(xpath = "//input[@id='dynamic_textHTF1007567']")
	public WebElement Outpatient;

	@FindBy(xpath = "//input[@id='dynamic_selectHTF1004792']")
	public WebElement Pension;

	@FindBy(xpath = "//input[@id='dynamic_selectHTF1004815']")
	public WebElement SeriousDepression;

	@FindBy(xpath = "//input[@id='dynamic_selectHTF1004817']")
	public WebElement SeriousAnxeity;

	@FindBy(xpath = "//input[@id='dynamic_selectHTF1004819']")
	public WebElement hallucinations ;
	
	
	@FindBy(xpath = "//input[@id='dynamic_selectHTF1004821']")
	public WebElement Concentrating;

	@FindBy(xpath = "//input[@id='dynamic_selectHTF1004866']")
	public WebElement trouble_controlling;

	@FindBy(xpath = "//input[@id='dynamic_selectHTF1004863']")
	public WebElement ThoughtsOFSuicide;

	@FindBy(xpath = "//input[@id='dynamic_selectHTF1004861']")
	public WebElement AttemptedSuicide;

	@FindBy(xpath = "//input[@id='dynamic_selectHTF1004868']")
	public WebElement PrescribedMedicine;

	@FindBy(xpath = "//input[@id='dynamic_selectHTF1004873']")
	public WebElement EmotionalProblems;

	@FindBy(xpath = "//input[@id='dynamic_selectHTF1004874']")
	public WebElement Troubled_EmotionalProblems;

	@FindBy(xpath = "//input[@id='dynamic_selectHTF1004875']")
	public WebElement PsychologicalProblems;

	@FindBy(xpath = "//input[@id='dynamic_selectHTF1005485']")
	public WebElement PsychologicalTreatments;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[11]/div[1]/div[4]/div[2]/div[1]/div[1]/div[4]/span[1]/div[1]/table[1]/tbody[1]/tr[4]/td[3]/p[1]")
	public WebElement AlcoholSeverity;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[11]/div[1]/div[4]/div[2]/div[1]/div[1]/div[4]/span[1]/div[1]/table[1]/tbody[1]/tr[6]/td[3]/p[1]")
	public WebElement LegalSeverity;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[12]/div[1]/div[4]/div[2]/div[1]/div[1]/div[4]/span[1]/div[1]/table[1]/tbody[1]/tr[3]/td[3]/p[1]")
	public WebElement AlcoholScore;
	
	@FindBy(xpath = "//div[@id='HTF1004894']")
	public WebElement DoctorReport;
	
	@FindBy(xpath = "//div[@class='ql-editor ql-blank dx-htmleditor-content']//p")
	public WebElement DoctorReportText;
	
	@FindBy(xpath = "//i[@title='More']")
	public WebElement More;
	
	@FindBy(xpath = "//div[@class='listitem']")
	public WebElement Log;
	
	@FindBy(xpath = "//div[@class='header-label']")
	public WebElement Previousnote;
	
	@FindBy(xpath = "//label[@class='icon emrsave']")
	public WebElement EmrSave;
	
	@FindBy(xpath = "//i[@class='ki ki-debit-card icon-btn-billing btn-dark-green inline']")
	public WebElement debitCard;
	
	@FindBy(xpath = "//input[@id='roundedTotal']")
	public WebElement RoundedTotal;
	
	@FindBy(xpath = "//input[@id='cash']")
	public WebElement Cash;
	
	
	
	
	
	
	
	
	


	public void patreg(String title,String Name,String Lastname ,String Dob, String DocID, String MobNo,String Address,String MRNo , String PROVIDER) throws InterruptedException, AWTException, IOException {

		Thread.sleep(1000);
		Hamburger.click();
		Thread.sleep(800);
		FOModule.click();
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


		Title.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//li[normalize-space()='"+title+"']")).click();
		Thread.sleep(500);
		EnterFirstNME.sendKeys(Name);
		Thread.sleep(500);
		lastname.sendKeys(Lastname);
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
		nationality.click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//li[normalize-space()='Indian']")).click();

		Thread.sleep(600);
		EnterMob.sendKeys(MobNo);
		Thread.sleep(500);
		maritialStatus.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//li[normalize-space()='Single']")).click();
		Thread.sleep(500);


		////Additional information

		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", Additionalinfo);
		Thread.sleep(500);
		Additionalinfo.click();
		Thread.sleep(500);
		Accomadation.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//li[normalize-space()='Other']")).click();
		Thread.sleep(500);	
		driver.findElement(By.xpath("//input[@id='refferalsourceid']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//li[normalize-space()='Unknown']")).click();
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
		HowDidYouKnow.click();
		Thread.sleep(600);
		TV.click();
		Thread.sleep(600);
		Ok.click();
		Thread.sleep(600);
		Savereg.click();
		Thread.sleep(3000);

		//driver.findElement(By.xpath("//div[@class='dailog-btn']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		//Thread.sleep(1000);

		//JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", signupload);
		Thread.sleep(1000);
		signupload.click();
		Thread.sleep(2000);
		Actions builder = new Actions(driver);
		Action drawAction = builder.moveToElement(driver.findElement(By.cssSelector(".upper-canvas"))) //start points x axis and y axis. 

				.moveByOffset(-100,0)
				.clickAndHold()
				.moveByOffset(-50,0) // 2nd points (x1,y1)
				.moveByOffset(20, 50)// 3rd points (x2,y2)
				.moveByOffset(30,0) // 2nd points (x1,y1)
				.moveByOffset(0,-50)// 3rd points (x2,y
				.moveByOffset(100,10)
				.moveByOffset(12,70)
				.moveByOffset(50,6)
				.release()
				.build();
		drawAction.perform();
		Thread.sleep(2500);
		driver.findElement(By.xpath("//span[normalize-space()='Save']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='Close']")).click();
		Thread.sleep(3000);
		String mrno= driver.findElement(By.xpath("//span[@class='pat-mrno']")).getText();
		System.out.println(mrno);


		File src=new File("C:\\Users\\sriram\\eclipse-workspace\\NauferYasassiWeb - 8083\\src\\test\\resources\\excelYasasiiWeb\\NaufarDataSheet8083.xls");
		FileInputStream fis=new FileInputStream(src); 
		HSSFWorkbook wb=new HSSFWorkbook(fis);
		HSSFSheet BirthRegistration=wb.getSheetAt(38);	
		int i=BirthRegistration.getLastRowNum();
		System.out.println("Number of rows: " + i);		
		BirthRegistration.getRow(i).createCell(7).setCellValue(mrno);	
		FileOutputStream fout=new FileOutputStream(src);	
		wb.write(fout);
		Thread.sleep(2000); 



		//////Encounter
		Thread.sleep(1000);
		clear.click();
		Thread.sleep(1000);
		printuncheck.click();
		Thread.sleep(1000);
		providerName.click();
		Thread.sleep(1000);
		providerName.sendKeys(PROVIDER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[contains(text(),'"+PROVIDER+"')]")).click();
		Thread.sleep(1000);
		EncounterAdd.click();
		Thread.sleep(1000);
		
		///card details
 
		Thread.sleep(1000);
		
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", debitCard);
		Thread.sleep(800);

		String AMOUNT = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-billing-overview[1]/div[1]/div[2]/app-encounter-billing[1]/tabset[1]/div[1]/tab[1]/div[1]/div[1]/app-payment-details[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[10]/div[2]")).getText();


		//converting string into double

		double A = new Double(AMOUNT);


		//converting double into int

		int Rupee = (int)Math.round (A) ;
		//int intValue = (int) i;

		//converting int into String

		String CARDAMOUNT = String.valueOf(Rupee);

		System.out.println(CARDAMOUNT);
		Thread.sleep(1000);

		///edit roundoff	

		act.moveToElement(RoundedTotal).doubleClick().build().perform();

		Thread.sleep(500);
		//Robot t= new Robot();
		t.keyPress(KeyEvent.VK_BACK_SPACE);
		Thread.sleep(500);
		t.keyRelease(KeyEvent.VK_BACK_SPACE);
		Thread.sleep(1000);

		RoundedTotal.sendKeys(CARDAMOUNT);
		Thread.sleep(500);
		driver.findElement(By.xpath("//i[@class='fa fa-close']")).click();
		Thread.sleep(1000);
		Cash.click();
		Thread.sleep(500);
		Cash.sendKeys(CARDAMOUNT);
		Thread.sleep(1000);
		EncounterSave.click();
		Thread.sleep(1000);
		SAvesuccess.click();
		Thread.sleep(3000);
	}


	public void Task() throws InterruptedException {

		
		
		WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(30));
		
		wait.until(ExpectedConditions.elementToBeClickable(task));
	
		Thread.sleep(1000);
		task.click();
		Thread.sleep(600);
		newTask.click();
		Thread.sleep(600);
		Subject.sendKeys("General visit to W2 ward");
		Thread.sleep(600);
		driver.findElement(By.xpath("//label[normalize-space()='Employee']")).click();
		Thread.sleep(1000);
		Search.click();
		Thread.sleep(600);
		Search.sendKeys("100435", Keys.ENTER);
		Thread.sleep(600);
		driver.findElement(By.xpath("//div[@title='Dr. Sultan Essa I Albrahim']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@id='refreshsearch']//i[@class='ki ki-refresh']")).click();
		Thread.sleep(600);
		Duedate.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@aria-label='Add a minute']//span[@class='owl-dt-control-button-content']//*[name()='svg']")).click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//span[normalize-space()='Set']")).click();
		Thread.sleep(600);

		Priority.click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//li[normalize-space()='High']")).click();
		Thread.sleep(600);
		Comment.click();
		Thread.sleep(600);
		Comment.sendKeys("Do it on high priority");
		Thread.sleep(600);
		driver.findElement(By.xpath("//div[@title='Dr. Sultan Essa I Albrahim']")).click();
		Thread.sleep(1000);

		Add.click();
		Thread.sleep(600);
		Schedule.click();
		Thread.sleep(600);
		Every.click();
		Thread.sleep(600);
		Every.sendKeys("1");
		Thread.sleep(600);
		EndAfter.click();
		Thread.sleep(600);
		EndAfter.sendKeys("1");
		Thread.sleep(600);
		Reminder.click();
		
		
		//Keepupdated.click();
		Thread.sleep(600);
		TaskSave.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='closeButton']")).click();
		Thread.sleep(1000);
		TaskView.click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//i[@class='fa fa-remove']")).click();
		Thread.sleep(1000);

		StickyNote.click();
		Thread.sleep(600);
		stickyText.click();
		Thread.sleep(600);
		stickyText.sendKeys("Treat patient on high priority");
		Thread.sleep(600);
		
		driver.findElement(By.xpath("//i[@class='fa fa-arrow-left']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[normalize-space()='All']//span[@class='checkmark']")).click();
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("//div[@class='cdk-overlay-backdrop popover-backdrop cdk-overlay-backdrop-showing']")).click();
		Thread.sleep(1000);
		StickyNote.click();
		Thread.sleep(2000);



	}

	public void DoctorNote(String MRNO ,String id, String docpassword , String Site ) throws InterruptedException, AWTException {



		((JavascriptExecutor)driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles()); 
		int Windowsize =driver.getWindowHandles().size();
		int windowopen= Windowsize-1;

		driver.switchTo().window(tabs.get(windowopen));
		driver.switchTo().window(tabs.get(windowopen));
		Thread.sleep(3000);
		driver.get(URL);
		Thread.sleep(3000);

		////////login
		Thread.sleep(5000);
		userid.click();
		Thread.sleep(1000);
		userid.sendKeys(id);    
		Thread.sleep(1000);
		password.click();
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



		//task Checking

		task.click();
		Thread.sleep(1000);
		Comments.click();
		Thread.sleep(1000);
//		TaskView.click();
//		Thread.sleep(1000);
//		TaskDelete.click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
//		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='close-icon ta-r']//i[@class='fa fa-remove']")).click();
		Thread.sleep(3000);
		
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[@class='btn-alam dismiss']//i[@class='ki ki-dismiss']")));
//		Thread.sleep(500);
		List<WebElement> dynamicElement1=driver.findElements(By.xpath("//label[@class='btn-alam dismiss']//i[@class='ki ki-dismiss']"));

		if(dynamicElement1.size() !=0)
		{
			driver.findElement(By.xpath("//label[@class='btn-alam dismiss']//i[@class='ki ki-dismiss']")).click();
		}


		else {
			System.out.println("sri");
			
			task.click();
			Thread.sleep(1000);
			Comments.click();
			Thread.sleep(1000);
			TaskView.click();
			Thread.sleep(1000);
			TaskDelete.click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[@class='close-icon ta-r']//i[@class='fa fa-remove']")).click(); 
			Thread.sleep(3000);
		}
		Thread.sleep(3000);

	    
		
		Searchfield.click();
		Thread.sleep(1000);
		Searchfield.sendKeys(MRNO);
		Thread.sleep(3000);
		
		StickynotrEMR.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//i[@class='ki ki-trash']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary sm'][normalize-space()='OK']")).click();
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("//*[contains(text(),'" + MRNO + "')]")).click();
		Thread.sleep(2000);

		Thread.sleep(500);
		List<WebElement> dynamicElement11=driver.findElements(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']"));

		if(dynamicElement11.size() !=0)
		{
			driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		}


		else {
			System.out.println("sri");
		}
		Thread.sleep(1000);

		DoctorNote.click();
		Thread.sleep(1000);
		List<WebElement> dynamicElement111=driver.findElements(By.xpath("//button[normalize-space()='Create New Note']"));

		if(dynamicElement111.size() !=0)
		{
			driver.findElement(By.xpath("//button[normalize-space()='Create New Note']")).click();
		}
		Thread.sleep(800); 


		cheifComplaint.clear();
		Thread.sleep(800);
		cheifComplaint.sendKeys("Fever");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//strong[normalize-space()='Fever']")).click();
		template.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='QASI-Doctor']")).click();
		Thread.sleep(800);
		tempOk.click();
		Thread.sleep(2000);

		///Medical Status

		medicalStatus.click();
		Thread.sleep(800);
		Hospitalized.sendKeys("5");
		Thread.sleep(800);
		MedicalProblems.sendKeys("3");
		Thread.sleep(800);
		Troubled.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='Extremely']")).click();
		Thread.sleep(800);

		Treatment.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='Not at all']")).click();
		Thread.sleep(800);

		InterviewerSeverity.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='5 - Moderate problem, some treatment indicated']")).click();
		Thread.sleep(800);

		Confidencemarking1.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='No']")).click();
		Thread.sleep(800);

		Confidencemarking2.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='No']")).click();
		Thread.sleep(800);


		///////////Employment support status	

		
		driver.findElement(By.xpath("//div[@id='HTF1004504']")).click();
		Thread.sleep(800);

		
		EducationCompleted_Yrs.sendKeys("7");
		Thread.sleep(800);
		EducationCompleted_MOS.sendKeys("4");
		Thread.sleep(800);
		driver.findElement(By.xpath("//div[@id='HTF1007618']//span[@class='editable'][normalize-space()='Yes']")).click();
		Thread.sleep(800);
		Training.click();
		Thread.sleep(800);
		TrainingComments.click();
		Thread.sleep(800);
		TrainingComments.sendKeys("TrainingComments");
		Thread.sleep(800);
		UsualOccupation.click();
		Thread.sleep(800);
		UsualOccupation.sendKeys("Theif");
		Thread.sleep(800);
		paidForWorking.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='2']")).click();
		Thread.sleep(800);
		Thread.sleep(800);
		Employment.click();
		Thread.sleep(800);
		Employment.sendKeys("5000");
		Thread.sleep(800);
		Illegal.click();
		Thread.sleep(800);
		Illegal.sendKeys("455670");
		Thread.sleep(800);
		HowTroubled.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='Slightly']")).click();
		Thread.sleep(800);

		CouncellingNEeDED.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='Moderately']")).click();
		Thread.sleep(800);

		EmploymentCounselling.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='1 - No real problem, treatment not indicated']")).click();
		Thread.sleep(800);

		/////////Alcohol & Drugs


		Alcohol_Drugs.click();
		Thread.sleep(800);
		Alcoholalluse.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//input[@id='dynamic_textHTF1007456']")).sendKeys("3");
		Thread.sleep(800);
		driver.findElement(By.xpath("//input[@id='dynamic_textHTF1007457']")).sendKeys("30");
		Thread.sleep(800);

		AlcoholIntaxiacation.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//input[@id='dynamic_textHTF1007460']")).sendKeys("3");
		Thread.sleep(800);
		driver.findElement(By.xpath("//input[@id='dynamic_textHTF1007461']")).sendKeys("30");
		Thread.sleep(800);

		Heroin.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//input[@id='dynamic_textHTF1007464']")).sendKeys("3");
		Thread.sleep(800);
		driver.findElement(By.xpath("//input[@id='dynamic_textHTF1007465']")).sendKeys("30");
		Thread.sleep(800);

		OtherOpiates.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//input[@id='dynamic_textHTF1007468']")).sendKeys("3");
		Thread.sleep(800);
		driver.findElement(By.xpath("//input[@id='dynamic_textHTF1007469']")).sendKeys("30");
		Thread.sleep(800);

		barbituates.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//input[@id='dynamic_textHTF1007472']")).sendKeys("3");
		Thread.sleep(800);
		driver.findElement(By.xpath("//input[@id='dynamic_textHTF1007473']")).sendKeys("30");
		Thread.sleep(800);

		Other.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//input[@id='dynamic_textHTF1007476']")).sendKeys("3");
		Thread.sleep(800);
		driver.findElement(By.xpath("//input[@id='dynamic_textHTF1007477']")).sendKeys("30");
		Thread.sleep(800);



		Cocaine1.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//input[@id='dynamic_textHTF1007480']")).sendKeys("3");
		Thread.sleep(800);
		driver.findElement(By.xpath("//input[@id='dynamic_textHTF1007481']")).sendKeys("30");
		Thread.sleep(800);

		Methamphetamines.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//input[@id='dynamic_textHTF1007484']")).sendKeys("3");
		Thread.sleep(800);
		driver.findElement(By.xpath("//input[@id='dynamic_textHTF1007485']")).sendKeys("30");
		Thread.sleep(800);

		Amphetamines.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//input[@id='dynamic_textHTF1007488']")).sendKeys("3");
		Thread.sleep(800);
		driver.findElement(By.xpath("//input[@id='dynamic_textHTF1007489']")).sendKeys("30");
		Thread.sleep(800);

		Cannabis.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//input[@id='dynamic_textHTF1007492']")).sendKeys("3");
		Thread.sleep(800);
		driver.findElement(By.xpath("//input[@id='dynamic_textHTF1007493']")).sendKeys("30");
		Thread.sleep(800);

		Hallucinogens.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//input[@id='dynamic_textHTF1007496']")).sendKeys("3");
		Thread.sleep(800);
		driver.findElement(By.xpath("//input[@id='dynamic_textHTF1007497']")).sendKeys("30");
		Thread.sleep(800);

		Inhalants.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//input[@id='dynamic_textHTF1007500']")).sendKeys("3");
		Thread.sleep(800);
		driver.findElement(By.xpath("//input[@id='dynamic_textHTF1007501']")).sendKeys("30");
		Thread.sleep(800);

		morethanOne.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//input[@id='dynamic_textHTF1007504']")).sendKeys("3");
		Thread.sleep(800);
		driver.findElement(By.xpath("//input[@id='dynamic_textHTF1007505']")).sendKeys("30");
		Thread.sleep(800);


		AcoholDT.sendKeys("24");
		Thread.sleep(800);
		Overdosed.sendKeys("24");
		Thread.sleep(800);
		AlcoholAbuse.sendKeys("34");
		Thread.sleep(800);
		DrugAbuse.sendKeys("32");
		Thread.sleep(800);
		Alcohol.sendKeys("23");
		Thread.sleep(800);
		Drugs.sendKeys("6");
		Thread.sleep(800);
		AlcoholMoney.sendKeys("5767");
		Thread.sleep(800);
		Drugsmoney.sendKeys("3400");
		Thread.sleep(800);

		AlcoholProblem.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='4']")).click();
		Thread.sleep(800);
		
		DrugProblem.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='4']")).click();
		Thread.sleep(800);
		
		AlcoholProblem1.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='Moderately']")).click();
		Thread.sleep(800);
		
		DrugsProblem1.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='Considerably']")).click();
		Thread.sleep(800);
		
		AlcoholProblem2.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='Moderately']")).click();
		Thread.sleep(800);
		
		Thread.sleep(800);
		DrugsProblem2.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='Considerably']")).click();
		Thread.sleep(800);
		
		
		AlcoholProblem3.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//app-list-item[@id='droplistkey7']")).click();
		Thread.sleep(800);
		DrugsProblem3.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[contains(text(),'8 - Extreme problem, treatment absolutely necessar')]")).click();
		Thread.sleep(800);
		legalStus.click();
		Thread.sleep(800);
		Shoplifting.sendKeys("4");
		Thread.sleep(800);
		Forgry.sendKeys("5");
		Thread.sleep(800);
		Robbery.sendKeys("4");
		Thread.sleep(800);
		Contempt.sendKeys("4");
		Thread.sleep(800);
		Rape.sendKeys("4");
		Thread.sleep(800);
		Parole_Probation.sendKeys("4");
		Thread.sleep(800);
		Weapons.sendKeys("5");
		Thread.sleep(800);
		Asssault.sendKeys("4");
		Thread.sleep(800);
		Homicide_Manslaughter.sendKeys("4");
		Thread.sleep(800);
		others.sendKeys("4");
		Thread.sleep(800);
		DrugCharges.sendKeys("4");
		Thread.sleep(800);
		Burglary.sendKeys("5");
		Thread.sleep(800);
		Arson.sendKeys("4");
		Thread.sleep(800);
		Prostitution.sendKeys("4");
		Thread.sleep(800);
		Conviction.sendKeys("4");
		Thread.sleep(800);
		public_intoxication.sendKeys("3");
		Thread.sleep(800);
		Driving_intoxication.sendKeys("4");
		Thread.sleep(800);
		driving_violations.sendKeys("4");
		Thread.sleep(800);
		incarcerated.sendKeys("4");
		Thread.sleep(800);
		Sentence.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='No']")).click();
		Thread.sleep(800);
		

		List<WebElement> dynamicElement1111=driver.findElements(By.xpath("//i[@class='fa fa-remove']"));

		if(dynamicElement1111.size() !=0)
		{
			driver.findElement(By.xpath("//i[@class='fa fa-remove']")).click();
		}


		else {
			System.out.println("sri");
		}
		Thread.sleep(3000);	
		
		illegal_activities.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='3']")).click();
		Thread.sleep(800);
		List<WebElement> dynamicElement11111=driver.findElements(By.xpath("//i[@class='fa fa-remove']"));

		if(dynamicElement11111.size() !=0)
		{
			driver.findElement(By.xpath("//i[@class='fa fa-remove']")).click();
		}


		else {
			System.out.println("sri");
		}
		Thread.sleep(3000);	
		
	
		///--again
		illegal_activities.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='3']")).click();
		Thread.sleep(800);
		
		
		PresentlegalProblems.click();
		Thread.sleep(800);
		PresentlegalProblems.sendKeys(Keys.DOWN);
		Thread.sleep(800);
		
		Robot robot =new Robot();
		
		robot.keyPress(KeyEvent.VK_SHIFT);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_SHIFT);
		
		PresentlegalProblems.sendKeys(Keys.DOWN);
		Thread.sleep(800);
		
		
		Counselling.click();
		Thread.sleep(800);
		Counselling.sendKeys(Keys.DOWN);
		Thread.sleep(2000);
		
		legal_services.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[contains(text(),'3 - Slight problem, treatment probably not necessa')]")).click();
		Thread.sleep(800);
		
		//////////Family/social history
		
		FamilySocial.click();
		Thread.sleep(800);
		satisfied.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='Yes']")).click();
		Thread.sleep(800);
		LivingArrangements.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='With children alone']")).click();
		Thread.sleep(800);
		
		driver.findElement(By.xpath("//div[6]//div[1]//div[4]//div[2]//div[1]//div[1]//label[1]//span[2]")).click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//div[6]//div[1]//div[4]//div[2]//div[2]//div[1]//label[1]//span[2]")).click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//div[6]//div[1]//div[4]//div[2]//div[3]//div[1]//label[1]//span[2]")).click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//div[6]//div[1]//div[4]//div[2]//div[4]//div[1]//label[1]//span[2]")).click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//div[6]//div[1]//div[4]//div[2]//div[5]//div[1]//label[1]//span[2]")).click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//div[6]//div[1]//div[4]//div[2]//div[6]//div[1]//label[1]//span[2]")).click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//div[6]//div[1]//div[4]//div[2]//div[7]//div[1]//label[1]//span[2]")).click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//div[6]//div[1]//div[4]//div[2]//div[8]//div[1]//label[1]//span[2]")).click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//input[@id='dynamic_selectHTF1004768']")).click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='Yes']")).click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//input[@id='dynamic_selectHTF1004769']")).click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='Yes']")).click();
		Thread.sleep(800);
		WithYourFamily.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='2']")).click();
		Thread.sleep(800);
		FamilyProblems.click();
		Thread.sleep(2000);
		FamilyProblems.sendKeys(Keys.DOWN);
		Thread.sleep(2000);
	//	driver.findElement(By.xpath("//li[normalize-space()='Slightly']")).click();
		Thread.sleep(2000);
		FamilyProblems1.click();
		Thread.sleep(800);
		FamilyProblems1.sendKeys(Keys.DOWN);
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//li[normalize-space()='Moderately']")).click();
		Thread.sleep(800);
		SocialCounselling.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='1- No real problem, treatment not indicated']")).click();
		Thread.sleep(800);
		
	////////////////PSYCHIATRIC_STATUS	
		
		
		Thread.sleep(800);
		PSYCHIATRIC_STATUS.click();
		Thread.sleep(800);
		InPatient.sendKeys("3");
		Thread.sleep(800);
		Outpatient.sendKeys("3");
		Thread.sleep(800);
		Pension.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='Yes']")).click();
		Thread.sleep(800);
		
		SeriousDepression.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='No']")).click();
		Thread.sleep(800);
		SeriousAnxeity.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='No']")).click();
		Thread.sleep(800);
		hallucinations.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='No']")).click();
		Thread.sleep(800);
		Concentrating.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='No']")).click();
		Thread.sleep(800);

		trouble_controlling.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='No']")).click();
		Thread.sleep(800);
		ThoughtsOFSuicide.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='No']")).click();
		Thread.sleep(800);
		AttemptedSuicide.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='No']")).click();
		Thread.sleep(800);
		PrescribedMedicine.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='No']")).click();
		Thread.sleep(800);
		EmotionalProblems.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='5']")).click();
		Thread.sleep(800);
		Troubled_EmotionalProblems.click();
		Thread.sleep(800);
		Troubled_EmotionalProblems.sendKeys(Keys.DOWN);
		//driver.findElement(By.xpath("//li[normalize-space()='Not at all']")).click();
		Thread.sleep(800);
		PsychologicalProblems.click();
		Thread.sleep(800);
		PsychologicalProblems.sendKeys(Keys.DOWN);
		Thread.sleep(800);
	//	driver.findElement(By.xpath("//li[normalize-space()='Moderately']")).click();
		Thread.sleep(800);
		PsychologicalTreatments.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//li[normalize-space()='4 - Moderate problem, some treatment indicated']")).click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//span[normalize-space()='Completed']")).click();
		Thread.sleep(4000);
		
		
		
		DoctorReport.click();
		Thread.sleep(800);
		DoctorReportText.click();
		Thread.sleep(800);
		DoctorReportText.sendKeys("Alert on unbilled CPOE or services/procedures/consumables marked by nurses on discharge clearance            KI-Comments:                ​           Add points       Discharge clearance - white board         This list will need to be displayed to the doctor when the doctor  recommends a discharge. The doctor can either keep the items as pending or cancel the items     These options will be made available during the discharge clearance process and the discharge process and must be cleared before the physical discharge              File Name:     Discharge whiteboard.pdf              File path:     https://docs.zoho.com/ws/project/file/0td0vf9ede7ebe458467b84e31141b9bfbe39             File Name: Billing Changes V 1.3.pdf         File path:    https://docs.zoho.com/ws/project/file/5mf5qb1923660ea714fc19bdff9141bf2d786            Point-no:13.14");
		Thread.sleep(800);
		
		driver.findElement(By.xpath("//label[@class='icon emrpreview']")).click();
		Thread.sleep(800);
		EmrSave.click();
		Thread.sleep(3000);  
	
		More.click();
		Thread.sleep(800);
		Log.click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//div[@class='previewhtml-site-name']")).click();
		Thread.sleep(1500);
		
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(3000);
	
		
		

	}
	
	
	
	public void nursenote(String nurseid, String nursepassword,String Site,String MRNO) throws InterruptedException {
		

		((JavascriptExecutor)driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles()); 
		int Windowsize =driver.getWindowHandles().size();
		int windowopen= Windowsize-1;

		driver.switchTo().window(tabs.get(windowopen));
		driver.switchTo().window(tabs.get(windowopen));
		Thread.sleep(3000);
		driver.get(URL);
		Thread.sleep(3000);

		////////login
		Thread.sleep(5000);
		userid.click();
		Thread.sleep(1000);
		userid.sendKeys(nurseid);    
		Thread.sleep(1000);
		password.click();
		password.sendKeys(nursepassword);
		Thread.sleep(1000);
		site.click();

		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")) );
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(3000);


		Searchfield.click();
		Thread.sleep(1000);
		Searchfield.sendKeys(MRNO);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//i[@title='Click to change view as Card View']")).click();
		Thread.sleep(1000);
		StickynotrEMR.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//i[@class='ki ki-trash']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary sm'][normalize-space()='OK']")).click();
		Thread.sleep(1000);
		
		
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

		NurseNote.click();
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
		template.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='QASI-Nurse']")).click();
		Thread.sleep(800);
		tempOk.click();
		Thread.sleep(2000);

		FamilySocial.click();
		Thread.sleep(800);
		
	//	driver.findElement(By.xpath("//div[6]//div[1]//div[4]//div[2]//div[1]//div[1]//label[1]//span[2]")).click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//div[6]//div[1]//div[4]//div[2]//div[2]//div[1]//label[1]//span[2]")).click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//div[6]//div[1]//div[4]//div[2]//div[3]//div[1]//label[1]//span[2]")).click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//div[6]//div[1]//div[4]//div[2]//div[4]//div[1]//label[1]//span[2]")).click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//div[6]//div[1]//div[4]//div[2]//div[5]//div[1]//label[1]//span[2]")).click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//div[6]//div[1]//div[4]//div[2]//div[6]//div[1]//label[1]//span[2]")).click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//div[6]//div[1]//div[4]//div[2]//div[7]//div[1]//label[1]//span[2]")).click();
		Thread.sleep(800);
		driver.findElement(By.xpath("//div[6]//div[1]//div[4]//div[2]//div[8]//div[1]//label[1]//span[2]")).click();
		Thread.sleep(800);

		
		Previousnote.click();
		Thread.sleep(800);
		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("(//span[@class='btn btn-link ng-star-inserted'])[1]")) );
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='btn btn-link ng-star-inserted'])[1]")).click();
		Thread.sleep(800);
		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//div[@class='col-md-12']//div[@class='rootrow']//div[@class='previewsectioncontainer']//div//div[contains(text(),'SEVERITY PROFILE')]")) );
		Thread.sleep(2000);
	
		driver.findElement(By.xpath("//span[normalize-space()='Completed']")).click();
		Thread.sleep(4000);
		EmrSave.click();
		Thread.sleep(3000);
	
		
		
		
		
		
		
	}
	
	
	
	
	
	
}



