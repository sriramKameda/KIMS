package pagesOfYasasiiWeb;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
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

public class KIMS_BirthRegistrationYasasiiWeb extends PageFactoryInitYasasiiWeb{

	public KIMS_BirthRegistrationYasasiiWeb(WebDriver driver) {

		super(driver);

	}
	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='menu-toggle']")
	public WebElement Hamburger ;
	@FindBy(xpath = "//div[@class='module-icon-wrap active ng-star-inserted']//i[@class='ki ki-reception-fill']")
	public WebElement FOModule;
	@FindBy(xpath = "//i[@class='ki ki-reception-fill']")
	public WebElement FO;
	
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
	@FindBy(xpath = "//label[normalize-space()='Emergency']//span[@class='checkmark']")
	public WebElement checkbox;



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
	public WebElement SAve;



	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='menu-toggle']")
	public WebElement MenuToggle;
	@FindBy(xpath = "//label[contains(text(),'Modules')]")
	public WebElement MOdules;

	@FindBy(xpath = "//div[contains(text(),'EMR HomeScreen')]")
	public WebElement EMRHomeScreen;
	@FindBy(xpath = "//input[@id='maincategory']")
	public WebElement OP;
	@FindBy(xpath = "//li[normalize-space()='IP']")
	public WebElement SelectIP;
	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement EnterPatientName;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/span[2]")
	public WebElement SelectPatient;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[3]/div[1]/label[1]/i[1]")
	public WebElement UpArrow;

	@FindBy(xpath = "//input[@id='chiefcomplainttext']")
	public WebElement EnterChiefComplaint;
	@FindBy(xpath = "//input[@id='emrtemplateid']")
	public WebElement EnterTemplate;
	@FindBy(xpath = "//li[normalize-space()='Antenatal - TEM67']")
	public WebElement SelectTemplate;
	@FindBy(xpath = "//button[@aria-label='Ok'][normalize-space()='OK']")
	public WebElement ClickOk;



	@FindBy(xpath = "//label[normalize-space()='Pregnant']//span[@class='checkmark']")
	public WebElement Pregnant;
	@FindBy(xpath = "//input[@id='obstetricscore']")
	public WebElement EnterObstreticScore;
	@FindBy(xpath = "//label[normalize-space()='Marital History']//span[@class='checkmark']")
	public WebElement MaritalStatus;
	@FindBy(xpath = "//input[@id='noofyears']")
	public WebElement EnterNoYears;
	@FindBy(xpath = "//label[normalize-space()='Conception']//span[@class='checkmark']")
	public WebElement Conseption;
	@FindBy(xpath = "//label[normalize-space()='CPOE Pharmacy']")
	public WebElement CPOEPharmacy;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[9]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/app-cpoe-pharmacy-list[1]/form[1]/div[1]/div[3]/div[1]/div[1]/div[1]")
	public WebElement SelectMedicine;
	@FindBy(xpath = "//input[@id='prescriptiontypeid']")
	public WebElement Ongoing;
	@FindBy(xpath = "//li[normalize-space()='Ongoing']")
	public WebElement SelectOngoing;
	@FindBy(xpath = "//input[@id='prescriptionsubtypeid']")
	public WebElement Ownmedication;
	@FindBy(xpath = "//li[normalize-space()='Patient own medication']")
	public WebElement SelectOwnMedication;
	@FindBy(xpath = "//button[@id='updatePharmacy']")
	public WebElement Cladd;

	@FindBy(xpath = "//*[@id=\"component_cpoe\"]/app-cpoe-container/div/div/div[1]/div[2]/div/div/div[1]/app-cpoe-pharmacy-list/form/div/div[3]/div[2]/div/div[1]")
	public WebElement Medicine2;
	@FindBy(xpath = "//input[@id='prescriptiontypeid']")
	public WebElement Past;
	@FindBy(xpath = "//li[contains(text(),'Past')]")
	public WebElement SelectPast;
	@FindBy(xpath = "//input[@id='prescriptionsubtypeid']")
	public WebElement OwnMedication;
	@FindBy(xpath = "//li[contains(text(),'Patient own medication')]")
	public WebElement SelectOnMedication;
	@FindBy(xpath = "//button[@id='updatePharmacy']")
	public WebElement Cladd2;
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/label[1]/i[1]")
	public WebElement arrw;
	@FindBy(xpath = "//label[@class='icon emrsave']")
	public WebElement sAVe;
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/label[1]/i[1]")
	public WebElement arw;
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[3]/div[1]/app-emr-dashboard[1]/div[1]/label[2]/span[1]")
	public WebElement doctrnote;
	@FindBy(xpath = "//button[contains(text(),'Create New Note')]")
	public WebElement Selectcreate;


	@FindBy(xpath = "//input[@id='emrtemplateid']")
	public WebElement Enteremplate;
	@FindBy(xpath = "//li[contains(text(),'Delivery Note')]")
	public WebElement Selectemplate;
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[1]/app-emrtemplateloader[1]/div[3]/div[1]/div[1]/div[1]/div[2]/button[1]")
	public WebElement Clickk;	
	@FindBy(xpath = "//div[@class='item-name'][normalize-space()='Birth Notes']")
	public WebElement SelectBirthNote;
	@FindBy(xpath = "//input[@id='gestationperiodweeks']")
	public WebElement EnterGestationalAgeInWeeks;
	@FindBy(xpath = "//input[@id='genderid']")
	public WebElement Gender;
	@FindBy(xpath = "//li[contains(text(),'Female')]")
	public WebElement SelectGender;
	@FindBy(xpath = "//input[@id='birthweight']")
	public WebElement EnterWeight;
	@FindBy(xpath = "//input[@id='presentation']")
	public WebElement Presentation;
	@FindBy(xpath = "//li[contains(text(),'Breech')]")
	public WebElement SelectPresentation;
	@FindBy(xpath = "//input[@id='typeofdeliveryid']")
	public WebElement TypeOfDelivery;
	@FindBy(xpath = "//li[contains(text(),'Normal')]")
	public WebElement SelectNormal;
	@FindBy(xpath = "//i[@class='ki ki-note ng-star-inserted']")
	public WebElement APGARScore;
	@FindBy(xpath = "/html[1]/body[1]/modal-container[1]/div[1]/div[1]/lib-scoretemplate-modal[1]/div[2]/div[1]/div[1]/tabset[1]/div[1]/tab[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ki-select-control[1]/div[1]/input[1]")
	public WebElement RespiratoryEffort;
	@FindBy(xpath = "/html[1]/body[1]/modal-container[1]/div[1]/div[1]/lib-scoretemplate-modal[1]/div[2]/div[1]/div[1]/tabset[1]/div[1]/tab[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/app-list-item[3]/li[1]")
	public WebElement SelectRespiratoryEffort;
	@FindBy(xpath = "//body/modal-container[1]/div[1]/div[1]/lib-scoretemplate-modal[1]/div[3]/button[1]")
	public WebElement CLickOk;
	@FindBy(xpath = "//input[@id='neonatalstatus']")
	public WebElement NeonatalStatus;
	@FindBy(xpath = "//li[contains(text(),'Alive')]")
	public WebElement SelectNeonatal;
	@FindBy(xpath = "//div[contains(@class,'col-md-3 ta-r')]//button[contains(@type,'button')][normalize-space()='Add']")
	public WebElement ADD;

	@FindBy(xpath = "//label[contains(@class,'icon emrsave')]")
	public WebElement SelectSave;

	@FindBy(xpath = "//header/nav[1]/div[2]/ul[1]/li[1]/a[1]/label[1]/div[1]/div[2]")
	public WebElement mentogle;
	@FindBy(xpath = "//div[@class='btn-module-back']")
	public WebElement modles;
	@FindBy(xpath = "//i[@class='ki ki-reception-fill']")
	public WebElement fomod;
	@FindBy(xpath = "//div[normalize-space()='Registration']")
	public WebElement registration;



	@FindBy(xpath = "//input[@id='maincategory']")
	public WebElement SelectBirthRegisration;
	@FindBy(xpath = "//li[normalize-space()='Birth Registration']")
	public WebElement BirthRegitration;
	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement EnterName;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]")
	public WebElement Selectpatient;
	@FindBy(xpath = "//label[contains(text(),'Select')]")
	public WebElement Selectselect;
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[5]/div[2]/ki-input-control[1]/div[1]/input[1]")
	public WebElement Mobnum;
	@FindBy(xpath = "//button[@id='saveregistrationbutton']")
	public WebElement clickSave;
	@FindBy(xpath = "//button[contains(text(),'OK')]")
	public WebElement ClIckOK;
	@FindBy(xpath = "//input[@id='recomproviderdisplayname']")
	public WebElement EnterProvidername;
	@FindBy(xpath = "//li[contains(text(),'Thomas')]")
	public WebElement SelectProvidername;
	@FindBy(xpath = "//input[@id='reasonid']")
	public WebElement prioty;
	@FindBy(xpath = "//li[contains(text(),'Elective')]")
	public WebElement SelectPrirty;
	@FindBy(xpath = "//input[@id='bedcategory']")
	public WebElement Roomcatgry;
	@FindBy(xpath = "//li[contains(text(),'ROOM')]")
	public WebElement Selectcategry;
	@FindBy(xpath = "//input[@id='bedclass']")
	public WebElement BEd;//input[@id='bedclass']
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-adt[1]/div[1]/div[1]/div[4]/div[1]/form[1]/div[2]/div[1]/app-adt-beddetails[1]/form[1]/div[1]/div[2]/ul[1]/app-list-item[2]/li[1]")
	public WebElement SelectBEd;
	@FindBy(xpath = "//input[@id='bednumber']")
	public WebElement BEDno;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-adt[1]/div[1]/div[1]/div[4]/div[1]/form[1]/div[2]/div[1]/app-adt-beddetails[1]/form[1]/div[1]/div[3]/ul[1]/app-list-item[1]/li[1]")
	public WebElement SelectBEDno;
	@FindBy(xpath = "//button[@id='savepatadtbutton']")
	public WebElement SAVE;



	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='bar3']")
	public WebElement Menu;
	@FindBy(xpath = "//label[contains(text(),'Modules')]")
	public WebElement MODules;
	@FindBy(xpath = "//label[normalize-space()='LMP']//span[@class='checkmark']")
	public WebElement LMP;
	
	@FindBy(xpath = "//a[@title='EMRHomeScreen']//span[contains(text(),'EMR HomeScreen')]")
	public WebElement EMRHomeScreen1;
	@FindBy(xpath = "//input[@id='maincategory']")
	public WebElement Dropdown;

	@FindBy(xpath = "//input[@id='subcategory']")
	public WebElement NextDropdown;
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[1]/lib-patientlist[1]/form[1]/div[3]/div[1]/div[2]/ul[1]/app-list-item[2]/li[1]")
	public WebElement MyDeptIP;
	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement EnterPatientName1;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/span[2]/i[1]")
	public WebElement SelectBaby;
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/label[1]/i[1]")
	public WebElement UpArrow1;

	@FindBy(xpath = "//label[@class='icon doctornote']")
	public WebElement DoctorNote1;
	@FindBy(xpath = "//input[@id='chiefcomplainttext']")
	public WebElement EnterChiefComplaint1;
	@FindBy(xpath = "//input[@id='emrtemplateid']")
	public WebElement EnterTemplate1;
	@FindBy(xpath = "//li[contains(text(),'SOAP')]")
	public WebElement SelectTemplate1;
	@FindBy(xpath = "//button[@aria-label='Ok'][normalize-space()='OK']")
	public WebElement ClickOk1;


	@FindBy(xpath = "//div[contains(text(),'Child Development Chart')]")
	public WebElement ChildDevelopmentChart;
	
	@FindBy(xpath = "//div[contains(text(),'Social smile')]")
	public WebElement SocialSmile;

	@FindBy(xpath = "//textarea[@id='resultremarks']")
	public WebElement Remarks;
	
	@FindBy(xpath = "//div[@class='modal-dialog modal-md modal-fixed']//button[@type='button'][normalize-space()='OK']")
	public WebElement ClickOk2;
	
	@FindBy(xpath = "//div[contains(text(),'Eyes follow pen/pencil')]")
	public WebElement EyesFollow;

	@FindBy(xpath = "//div[contains(text(),'Child Language Evaluation Chart')]")
	public WebElement ChildLangEval;
	
	@FindBy(xpath = "//div[contains(text(),'Responds to bell/rettle/clap')]")
	public WebElement RespondsToBell;
	
	@FindBy(xpath = "//div[@class='modal-dialog modal-md modal-fixed']//button[@type='button'][normalize-space()='OK']")
	public WebElement ClickOk5;
	
	@FindBy(xpath = "//div[contains(text(),'Responds by smiling')]")
	public WebElement RespondsToSmile;
	
	@FindBy(xpath = "//div[@class='modal-dialog modal-md modal-fixed']//button[@type='button'][normalize-space()='OK']")
	public WebElement ClickOk6;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[8]/div[1]/app-childlanguageevaluationchart[1]/div[1]/div[1]/div[1]/*[name()='svg'][1]/*[name()='g'][9]/*[name()='g'][1]/*[name()='g'][8]/*[name()='rect'][1]")
	public WebElement ListensWhenSpoken;
	
	@FindBy(xpath = "//div[@class='modal-dialog modal-md modal-fixed']//button[@type='button'][normalize-space()='OK']")
	public WebElement ClickOk7;
	
	@FindBy(xpath = "//label[@class='icon emrsave']")
	public WebElement SelectSave1;


	@FindBy(xpath = "//header/nav[1]/div[2]/ul[1]/li[1]/a[1]/label[1]/div[1]")
	public WebElement mentogle1;
	@FindBy(xpath = "//label[contains(text(),'Modules')]")
	public WebElement modles1;
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-asideleftbar[1]/aside[1]/div[1]/div[2]/div[1]/div[1]/div[2]/label[1]/i[1]")
	public WebElement fomod1;
	@FindBy(xpath = "//body[1]/app-root[1]/app-layout[1]/main[1]/app-asideleftbar[1]/aside[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]/span[1]")
	public WebElement registran1;
	@FindBy(xpath = "//input[@id='maincategory']")
	public WebElement FoMenu1;
	@FindBy(xpath = "//li[contains(text(),'IP')]")
	public WebElement FoDropdown;
	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement Search2;
	@FindBy(xpath = "//body/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/span[2]/i[1]")
	public WebElement SelectBaby1;
	@FindBy(xpath = "//input[@id='dischargestatus']")
	public WebElement Dischargestat;
	@FindBy(xpath = "//li[normalize-space()='Patient Requested']")
	public WebElement SelectDischargestat;
	@FindBy(xpath = "//input[@id='disposition']")
	public WebElement Disposition;
	@FindBy(xpath = "//li[normalize-space()='Discharged Home']")
	public WebElement SelectDisposition;
	@FindBy(xpath = "//button[normalize-space()='Save']")
	public WebElement DischargeSave;


	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]")
	public WebElement Selectpatient2;
	@FindBy(xpath = "//input[@id='dischargestatus']")
	public WebElement Dischargestat1;
	@FindBy(xpath = "//li[normalize-space()='Patient Requested']")
	public WebElement SelectDischargestat1;
	@FindBy(xpath = "//input[@id='disposition']")
	public WebElement Disposition1;
	@FindBy(xpath = "//li[normalize-space()='Discharged Home']")
	public WebElement SelectDisposition1;
	@FindBy(xpath = "//button[normalize-space()='Save']")
	public WebElement DischargeSave1;



	@FindBy(xpath = "//ul[@class='navbar-nav float-right']//a[@class='nav-link dropdown-toggle pro-pic']")
	public WebElement Logoutarw;
	@FindBy(xpath = "//div[@id='headitemdropdown_desktop']//a[contains(@class,'logout list-item')]")
	public WebElement Logoutbutton;
	@FindBy(xpath = "//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")
	public WebElement Logoutconfrm;

	@FindBy(xpath = "//input[@formcontrolname='searchText']")
	public WebElement medicineSearch;

	@FindBy(xpath = "//app-cpoe-pharmacy-list//div[contains(@class,'card-header pb0')]//img[1]")
	public WebElement Star;



	@FindBy(xpath = "//i[contains(@class,'dashboard-lock ki ki-lock')]")
	public WebElement lock;

	@FindBy(xpath = "//div[@class='form-group ki-dropdown']//input[@id='genderid']")
	public WebElement gender;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[4]/div[2]/ki-calender-time[1]/div[1]/input[1]")
	public WebElement DOB;

	@FindBy(xpath = "//span[normalize-space()='Set']")
	public WebElement Set;

	@FindBy(xpath = "//input[@id='gestperiodmonths']")
	public WebElement Week;

	@FindBy(xpath = "//input[@id='gestperioddays']")
	public WebElement Days;

	@FindBy(xpath = "//input[@id='Term']")
	public WebElement Term;

	@FindBy(xpath = "//input[@id='Present']")
	public WebElement Prsntatn;

	@FindBy(xpath = "//input[@id='delv']")
	public WebElement TypeofDel;

	@FindBy(xpath = "//input[@id='neostatus']")
	public WebElement neoStatus;

	@FindBy(xpath = "//button[@id='saveregistrationbutton']")
	public WebElement BabyREGSave;

	@FindBy(xpath = "//input[@id='numbaby']")
	public WebElement nObaby;

	@FindBy(xpath = "//input[@id='score0']")
	public WebElement Score;

	@FindBy(xpath = "//i[@class='ki ki-patient-bed-fill']")
	public WebElement ADT1;

	@FindBy(xpath = "//input[@id='EncBillingproviders']")
	public WebElement encProvider;

	@FindBy(xpath = "//i[@class='ki ki-plus']")
	public WebElement add;

	@FindBy(xpath = "//button[@id='billingsave']")
	public WebElement billSave;

	@FindBy(xpath = "(//i[@class='ki ki-trash p0'])[1]")
	public WebElement deleteconsult;

	@FindBy(xpath = "//i[@class='ki ki-reception-fill']")
	public WebElement billing;

	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='bar1']")
	public WebElement Hamberger;

	@FindBy(xpath = "//div[contains(text(),'EMR HomeScreen')]")
	public WebElement EMRhomescreen;

	@FindBy(xpath = "//input[@id='maincategory']")
	public WebElement mainCategory;

	@FindBy(xpath = "//li[normalize-space()='IP']")
	public WebElement IP;

	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement Searchfield;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[1]/lib-patientlist[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/label[1]")
	public WebElement patientSelect1;

	@FindBy(xpath = "//i[@class='dashboard-lock-arrow ki ki-chevron-up']")
	public WebElement UParrow;

	@FindBy(xpath = "//i[@class='dashboard-lock ki ki-lock-open']")
	public WebElement Lock;

	@FindBy(xpath = "//label[@class='icon doctornote']")
	public WebElement DoctorNote;

	@FindBy(xpath = "//input[@id='chiefcomplainttext']")
	public WebElement cheifComplaint;

	@FindBy(xpath = "//input[@id='emrtemplateid']")
	public WebElement template;

	@FindBy(xpath = "//button[@aria-label='Ok'][normalize-space()='OK']")
	public WebElement tempOk;

	@FindBy(xpath = "//div[contains(text(),'Diagnosis and Plan')]")
	public WebElement diagnosis;

	@FindBy(xpath = "//span[normalize-space()='Discharge Recommendation']")
	public WebElement DisRecom;

	@FindBy(xpath = "//label[normalize-space()='Patient for Discharge']//span[contains(@class,'checkmark')]")
	public WebElement Dischargecheckbox;

	@FindBy(xpath = "//label[contains(@class,'icon emrsave')]")
	public WebElement EmrSave;

	@FindBy(xpath = "//div[@class='link-value'][normalize-space()='EMR']")
	public WebElement EMR;

	@FindBy(xpath = "//li[@class='sidebar-item ng-star-inserted']//li[5]//a[1]")
	public WebElement WhiteBoard;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-whiteboard[1]/div[1]/div[1]/div[1]/lib-whiteboard-header[1]/div[1]/div[1]/div[7]/div[1]/ki-input-control[1]/div[1]/input[1]")
	public WebElement NameSearch;

	@FindBy(xpath = "//i[@class='ki ki-search']")
	public WebElement SearchIcon;

	@FindBy(xpath = "//input[@id='loginemail']")
	public WebElement userid;

	@FindBy(xpath = "//input[@id='loginpassword']")
	public WebElement password;

	@FindBy(xpath = "//input[@id='loginsite']")
	public WebElement site;

	@FindBy(xpath = "//i[@class='ki ki-info-circle']")
	public WebElement element;

	@FindBy(xpath = "//button[normalize-space()='Ready for discharge']")
	public WebElement REadyForDischarge;

	@FindBy(xpath = "//input[@id='enteredbynameview']")
	public WebElement verifiedBy;

	@FindBy(xpath = "//input[@id='verifiedpassword']")
	public WebElement verifyPassword;

	@FindBy(xpath = "//button[@id='verifyuser']")
	public WebElement verifySave;

	@FindBy(xpath = "//i[@class='ki ki-sthethescope']")
	public WebElement EmrIcon;

	@FindBy(xpath = "//button[normalize-space()='Department Clearance']")//button[normalize-space()='Department Clearance']
	public WebElement Depclearance;

	@FindBy(xpath = "//tbody/tr[1]/td[2]/label[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")
	public WebElement laboratoryCheckbox;

	@FindBy(xpath = "//tbody/tr[2]/td[2]/label[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")
	public WebElement radiologyCheckbox;

	@FindBy(xpath = "//tbody/tr[3]/td[2]/label[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")
	public WebElement medicalclrnceCheckbox;
	
	@FindBy(xpath = "//button[normalize-space()='Pharmacy Clearance']")
	public WebElement pharmacyClearance;

	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement FOSearchField;

	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement FOPatientSelect;

	@FindBy(xpath = "//i[@class='ki ki-patient-bed-fill']")
	public WebElement ADT;

	@FindBy(xpath = "//input[@id='dischargestatus']")
	public WebElement dischargeStatus;

	@FindBy(xpath = "//input[@id='disposition']")
	public WebElement disposition;

	@FindBy(xpath = "//button[@id='savepatadtbutton']")
	public WebElement ADTSave;

	@FindBy(xpath = "//button[normalize-space()='Financial Clearance']")
	public WebElement FinancialClearance;

	@FindBy(xpath = "//button[normalize-space()='Physical Discharge']")
	public WebElement pysicalDischarge;

	@FindBy(xpath = "//label[@class='icon cpoeadmin']")
	public WebElement cpoeAdmin;
	
	@FindBy(xpath = "//label[normalize-space()='Immunization']")
	public WebElement Immunization;
	
	@FindBy(xpath = "(//i[@title='Add due date'])[1]")
	public WebElement BCG;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-cpoe-administration[1]/div[1]/div[2]/app-immunization[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[4]/label[1]/span[1]")
	public WebElement outsidehosp;
	
	@FindBy(xpath = "//div[@class='immunization-table switch-rtl']//div[1]//div[2]//div[1]//div[5]//span[1]//i[1]")
	public WebElement remarks;
	
	@FindBy(xpath = "(//i[@title='Add due date'])[1]")
	public WebElement OPV0;
	
	@FindBy(xpath = "//i[@title='Add due date']")
	public WebElement hepatitis;
	
	@FindBy(xpath = "//div[3]//div[7]//span[1]//i[1]")
	public WebElement delete;
	
	@FindBy(xpath = "//i[@class='ki ki-save']")
	public WebElement Saveimmunization;
	
	@FindBy(xpath = "//div[@class='table-row ng-star-inserted']//div[1]//div[7]//label[1]//span[1]//i[1]")
	public WebElement log;
	
	@FindBy(xpath = "//input[@id='EncBillingproviders']")
	public WebElement providerName;

	@FindBy(xpath = "//i[@class='ki ki-plus']")
	public WebElement EncounterAdd;

	@FindBy(xpath = "//button[@id='billingsave']")
	public WebElement EncounterSave;

	@FindBy(xpath = "//button[normalize-space()='Clear']")
	public WebElement clear;
	
	@FindBy(xpath = "//input[@id='lastname']")
	public WebElement Lastname;	
	
	@FindBy(xpath = "//input[@id='maritalstatusid']")
	public WebElement maritialStatus;	

	@FindBy(xpath = "//button[contains(text(),'Save')]")
	public WebElement fosave;
	
	@FindBy(xpath = "//div[@class='modal-body']//button[@type='button'][normalize-space()='OK']")
	public WebElement SAvesuccess; 
	
	@FindBy(xpath = "//label[@title='Add Registration']//i[@class='ki ki-doctor-fill']")
	public WebElement AddRegisteration;
	
	@FindBy(xpath = "//input[@id='chiefcomplainttext']")
	public WebElement reasonForVisit;

	@FindBy(xpath = "//input[@id='emrtemplateid']")
	public WebElement Template;

	@FindBy(xpath = "//button[@aria-label='Ok'][normalize-space()='OK']")
	public WebElement TemplateOK;

	@FindBy(xpath = "//input[@id='admndischargestatusid']")
	public WebElement DischargeStatus;

	@FindBy(xpath = "//div[contains(text(),'Diagnosis and Plan')]")
	public WebElement disgnosis;
	
@FindBy(xpath = "//tbody/tr[2]/td[2]/label[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")
public WebElement radiology_imaging;

@FindBy(xpath = "//tbody/tr[3]/td[2]/label[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")
public WebElement MedicalRecords;

@FindBy(xpath = "//button[normalize-space()='Discharge Summary Clearance']")
public WebElement Discharge_summary_Clearance;

@FindBy(xpath = "//button[normalize-space()='Clinical Pharmacist Clearance']")
public WebElement Clinical_Pharmacist_Clearance;
	
	
	
	
	
	
	
	
	
	


	public void patreg(String title , String NAME ,String lastName, String DOB , String MBLNO , String ADDRESS , String DOCno,String MRNO,String Provider ,String ADTprovider ) throws InterruptedException, IOException, AWTException {

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
		EnterFirstNME.sendKeys(NAME);
		Thread.sleep(500);
		Lastname.click();
		Thread.sleep(500);
		Lastname.sendKeys(lastName);
		Thread.sleep(500);
		
		EnterAge.click();
		Thread.sleep(500);
		
		
		Robot t=new Robot();
		t.keyPress(KeyEvent.VK_ESCAPE);
		Thread.sleep(500);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(500);
		
		EnterAge.sendKeys(DOB);
		Thread.sleep(600);
		t.keyPress(KeyEvent.VK_ESCAPE);
		Thread.sleep(500);
		t.keyRelease(KeyEvent.VK_ESCAPE);
		Thread.sleep(500);


		Thread.sleep(600);
		EnterMob.sendKeys(MBLNO);
		Thread.sleep(500);
	    maritialStatus.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//li[normalize-space()='Single']")).click();
		Thread.sleep(500);
		
        ContactInformation.click();
		Thread.sleep(1000);
		EnterAddress.sendKeys(ADDRESS);
		Thread.sleep(1000);
		DocumentIdentification.click();
		Thread.sleep(1000);
		for (int i = 0; i <=15; i++) {
			EnterAadhar.sendKeys( Keys.BACK_SPACE);
		}
		Thread.sleep(1000);
		EnterAadhar.sendKeys(DOCno );
		Thread.sleep(600);
		Clickadd.click();
		Thread.sleep(800);
		

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
		fosave.click();
		Thread.sleep(3000);
	
		String mrno= driver.findElement(By.xpath("//span[@class='pat-mrno']")).getText();
		System.out.println(mrno);


		File src=new File("C:\\Users\\sriram\\eclipse-workspace\\KimsYasasiiWeb\\src\\test\\resources\\excelYasasiiWeb\\KIMSDataSheet.xls");
		FileInputStream fis=new FileInputStream(src);
		HSSFWorkbook wb=new HSSFWorkbook(fis);
		HSSFSheet BirthRegistration=wb.getSheetAt(34);	
		int i=BirthRegistration.getLastRowNum();
		System.out.println("Number of rows: " + i);		
		BirthRegistration.getRow(i).createCell(7).setCellValue(mrno);	
		FileOutputStream fout=new FileOutputStream(src);	
		wb.write(fout);
		Thread.sleep(2000); 

		///////////////encounter

		//////Encounter
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
		EncounterAdd.click();
		Thread.sleep(1000);
		EncounterSave.click();
		Thread.sleep(1000);
		SAvesuccess.click();
		Thread.sleep(3000);

		/////Admit the patient
		
			ADT.click();
			Thread.sleep(1000);
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
			SAve.click();
			Thread.sleep(1000);
//			driver.findElement(By.xpath("//div[contains(@class,'modal ki-dialog fade in show')]//button[contains(@aria-label,'Close')][normalize-space()='No']")).click();
//			Thread.sleep(2000);
			
	}



	public void pregnantNOTE(String Name , String MRNo ,String Provider,String DOCuser ,String DOCpassword,  String Site) throws InterruptedException, AWTException {


		((JavascriptExecutor)driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		driver.switchTo().window(tabs.get(1));
		Thread.sleep(2000);
		driver.get(URL);
		Thread.sleep(3000);

		userid.click();
		userid.sendKeys(DOCuser);
		password.click();
		password.sendKeys(DOCpassword);
		
		Thread.sleep(1000);
		site.click();
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")) );
        driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(5000);



		Thread.sleep(3000);
		MenuToggle.click();
		Thread.sleep(1000);
		//MOdules.click();
		//EMR.click();
		Thread.sleep(1000);
		EMRHomeScreen.click();
		Thread.sleep(1200);
		OP.click();
		Thread.sleep(600);
		SelectIP.click();
		EnterPatientName.sendKeys(MRNo);
		Thread.sleep(1500);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNo+"')])[1]")).click();
		Thread.sleep(500);
		//UpArrow.click();
		Thread.sleep(500);
		//lock.click();
		
		
		
		///////Create the doctor note and select pregnant
		DoctorNote.click();
		Thread.sleep(1000);
//		List<WebElement> dynamicElement=driver.findElements(By.xpath("//button[normalize-space()='Create New Note']"));
//
//		if(dynamicElement.size() !=0)
//		{
//			driver.findElement(By.xpath("//button[normalize-space()='Create New Note']")).click();
//		}

		Thread.sleep(1000);
		EnterChiefComplaint.clear();
		Thread.sleep(1000);
		EnterChiefComplaint.sendKeys("Pregnant");
		Thread.sleep(600);
		EnterTemplate.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Antenatal Assessment']")).click();
		Thread.sleep(500);
		ClickOk.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[contains(text(),'Antenatal Assessment')]")).click();
		
		LMP.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//span[@class='owl-dt-control-button-arrow']")).click();
		Robot t=new Robot();
		t.keyPress(KeyEvent.VK_ENTER);
		t.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(400);
		
		for (int i = 0; i < 9; i++) {
			
			t.keyPress(KeyEvent.VK_RIGHT);
			t.keyRelease(KeyEvent.VK_RIGHT);
			Thread.sleep(300);
			
		}
		
		Thread.sleep(400);
		
		for (int i = 0; i < 3; i++) {
			
			t.keyPress(KeyEvent.VK_ENTER);
			t.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(300);
			
		}
		
	
		Pregnant.click();
		Thread.sleep(500);
		EnterObstreticScore.sendKeys("2");
		Thread.sleep(500);
		MaritalStatus.click();
		Thread.sleep(500);
		EnterNoYears.sendKeys("3");
		Thread.sleep(500);
		Conseption.click();
		Thread.sleep(500);
		CPOEPharmacy.click();
		Thread.sleep(500);
		//Star.click();
		Thread.sleep(500);
		medicineSearch.click();
		Thread.sleep(500);
		medicineSearch.sendKeys("dolopar 650");
		Thread.sleep(500);
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[8]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/app-cpoe-pharmacy-list[1]/form[1]/div[1]/div[3]/div[1]/div[1]/div[1]")).click();
		Thread.sleep(500);
		
		Ongoing.click();
		Thread.sleep(1000);
		SelectOngoing.click();
		Thread.sleep(1000);
		OwnMedication.click();
		Thread.sleep(1000);
		SelectOwnMedication.click();
		Thread.sleep(1000);
		Cladd.click();
		Thread.sleep(1000);
		/*	Medicine2.click();
	Thread.sleep(500);
	Past.click();
	SelectPast.click();
	OwnMedication.click();
	SelectOnMedication.click();
	Thread.sleep(500);
	Cladd2.click();      */

		Thread.sleep(1000);
		//arrw.click();
		UpArrow.click();
		Thread.sleep(600);
		sAVe.click();
		Thread.sleep(10000);
		//arw.click();
		Thread.sleep(600);



	}
	/////////Select the delivery note template and add the details

	public void DeliveryNOTE() throws InterruptedException {

		DoctorNote.click();
		Thread.sleep(1000);
		List<WebElement> dynamicElement1=driver.findElements(By.xpath("//button[normalize-space()='Create New Note']"));

		if(dynamicElement1.size() !=0)
		{
			driver.findElement(By.xpath("//button[normalize-space()='Create New Note']")).click();
		}

		Thread.sleep(1000);

		Thread.sleep(900);
		Enteremplate.click();
		Thread.sleep(900);
		driver.findElement(By.xpath("//li[normalize-space()='Delivery Note']")).click();
		Thread.sleep(900);
		ClickOk.click();
		Thread.sleep(1000);
		SelectBirthNote.click();
		Thread.sleep(1000);
		EnterGestationalAgeInWeeks.sendKeys("32");
		Gender.click();
		SelectGender.click();
		EnterWeight.sendKeys("3");
		Presentation.click();
		SelectPresentation.click();
		Thread.sleep(500);
		TypeOfDelivery.click();
		Thread.sleep(500);
		SelectNormal.click();
		Thread.sleep(500);
		APGARScore.click();
		Thread.sleep(500);
		Score.click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//input[@id='score1']")).click();
		Thread.sleep(1000);
		//	driver.findElement(By.xpath("//li[normalize-space()='Less than 100']")).click();
		Thread.sleep(500);

		//	RespiratoryEffort.click();//img[@src='../../../assets/img/icons/AddNewIcon.png']
		//Thread.sleep(2000);
		SelectRespiratoryEffort.click();
		//	Thread.sleep(1000);
		CLickOk.click();
		Thread.sleep(1000);
		Thread.sleep(500);
		NeonatalStatus.click();
		Thread.sleep(500);
		SelectNeonatal.click();
		ADD.click();
	//	UpArrow.click();
		Thread.sleep(1000);
		SelectSave.click();
		Thread.sleep(5000); 


	}
	public void Birthreg(String MRNo ,String Provider, String ADTprovider , String Mrno1,  String Site,String AdminUser, String AdminPassword) throws InterruptedException, IOException {

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
		userid.sendKeys(AdminUser);
		password.click();
		password.sendKeys(AdminPassword);
		Thread.sleep(1000);
		site.click();
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")) );

		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(3000);




		////////////Take Fo and select Birth registration and register the baby
		Hamburger.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[normalize-space()='Modules']")).click();
		//modles.click();
		Thread.sleep(1000);
		//fomod.click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='link-value'][normalize-space()='RCM']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[normalize-space()='Approve Request']")).click();
		Thread.sleep(1000);
		
		Hamburger.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='link-value'][normalize-space()='FO']")).click();
		Thread.sleep(1000);
		
		registration.click();  
		Thread.sleep(1000);
		
		List<WebElement> dynamicElement2=driver.findElements(By.xpath("//ki-dialog-common//button[contains(@aria-label,'Ok')][normalize-space()='Yes']"));

		if(dynamicElement2.size() !=0)
		{
			driver.findElement(By.xpath("//ki-dialog-common//button[contains(@aria-label,'Ok')][normalize-space()='Yes']")).click();
		}

		Thread.sleep(1000);

		
		
		SelectBirthRegisration.click();
		Thread.sleep(1000);
		BirthRegitration.click();
		Thread.sleep(800);
		
		EnterName.sendKeys(MRNo);
		EnterName.sendKeys(Keys.ENTER);
		Thread.sleep(600);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNo+"')])[1]")).click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//label[normalize-space()='Select']")).click();

		Lastname.sendKeys("A");
		Thread.sleep(600);
		
		
		EnterMob.clear();
		EnterMob.sendKeys("4512451236");
//		driver.findElement(By.xpath("//li[normalize-space()='Female']")).click();
//		Thread.sleep(1000);


		Thread.sleep(1000);
		BabyREGSave.click();
		Thread.sleep(3000);
		String mrno= driver.findElement(By.xpath("//span[@class='pat-mrno']")).getText();
		System.out.println(mrno);

		File src=new File("C:\\\\Users\\\\sriram\\\\eclipse-workspace\\\\KimsYasasiiWeb\\\\src\\\\test\\\\resources\\\\excelYasasiiWeb\\\\KIMSDataSheet.xls");
		FileInputStream fis=new FileInputStream(src);
		HSSFWorkbook wb=new HSSFWorkbook(fis);
		HSSFSheet BirthRegistration=wb.getSheetAt(34);	
		int i=BirthRegistration.getLastRowNum();
		System.out.println("Number of rows: " + i);		
		BirthRegistration.getRow(i).createCell(9).setCellValue(mrno);	
		FileOutputStream fout=new FileOutputStream(src);	
		
		wb.write(fout);
//		driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Close'][normalize-space()='No']")).click();
//		Thread.sleep(500);
//		driver.findElement(By.xpath("//div[@class='item-icon']//i[@class='ki ki-reception-fill']")).click();
		Thread.sleep(2000);
		
		clear.click();
		Thread.sleep(1000);

		AddRegisteration.click();
		Thread.sleep(1000);
		EncounterSave.click();
		Thread.sleep(1000);
		SAvesuccess.click();
		Thread.sleep(3000);


		//////////Admit the baby
		Thread.sleep(2000);
		driver.findElement(By.xpath("//i[@class='ki ki-patient-bed-fill']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Close'][normalize-space()='No']")));
		Thread.sleep(500);
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
		
			
			js.executeScript("arguments[0].scrollIntoView(true);", element);
		}
		BedCategory.click();
		Thread.sleep(1000);
		SelectBedCategory.click();
		Thread.sleep(1000);
		RoomType.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'Ultra-Deluxe')]) [2]")).click();
		Thread.sleep(1000);
		Bed.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("(//*[contains(text(),'Emergency NS')])[2]")).click();
		Thread.sleep(500);
		SAve.click();
		Thread.sleep(1000);
//		driver.findElement(By.xpath("//div[contains(@class,'modal ki-dialog fade in show')]//button[contains(@aria-label,'Close')][normalize-space()='No']")).click();
//		Thread.sleep(2000);

	}

	
	public void babyNote(String MRNo1 ,String DOCuser ,String DOCpassword,  String Site) throws InterruptedException {

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
		userid.sendKeys(DOCuser);
		password.click();
		password.sendKeys(DOCpassword);
		Thread.sleep(1000);
		site.click();
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")) );

		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(5000);




		///////Create doctor note for the baby	
		Menu.click();
		Thread.sleep(5000);
		//MODules.click();
		Thread.sleep(1000);
		//EMR1.click();
		Thread.sleep(1000);
		EMRHomeScreen.click();
		Thread.sleep(1000);
		Dropdown.click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//li[normalize-space()='IP']")).click();
		Thread.sleep(1000);
		//	NextDropdown.click();
		Thread.sleep(1000);
		//	MyDeptIP.click();
		Thread.sleep(1000);
		EnterPatientName1.sendKeys(MRNo1 , Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNo1+"')])[1]")).click();
		Thread.sleep(1000);

		//SelectBaby.click();
		Thread.sleep(1000);
	//	UpArrow.click();
		Thread.sleep(1000);
	//	lock.click();
		Thread.sleep(1000);
		DoctorNote1.click();
		Thread.sleep(2000);

		EnterChiefComplaint1.sendKeys("New Born Yellow");
		Thread.sleep(600);
		EnterTemplate1.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='SOAP']")).click();
		Thread.sleep(1000);
		ClickOk.click();
		Thread.sleep(500);
		
		
		//////////Enter data in child development chart	
		ChildDevelopmentChart.click();
		Thread.sleep(5000);
		SocialSmile.click();
		Thread.sleep(600);
		Remarks.sendKeys("Baby is smiling while seeing face");
		ClickOk2.click();
		Thread.sleep(1000);
		EyesFollow.click();
		Thread.sleep(500);
		ClickOk2.click();
		Thread.sleep(500);
		/*TransferObj.click();
	Thread.sleep(1000);
    ClickOk4.click();
	Thread.sleep(1000);*/


		ChildLangEval.click();
		Thread.sleep(500);
		RespondsToBell.click();
		Thread.sleep(500);
		Remarks.sendKeys("getting fine response");
		Thread.sleep(500);
		ClickOk2.click();
		Thread.sleep(500);
		RespondsToSmile.click();
		Thread.sleep(1000);
		Remarks.sendKeys("Recognizing face and smiling back");
		Thread.sleep(500);
		ClickOk2.click();
		Thread.sleep(1000);
		sAVe.click();
		Thread.sleep(2000);

	}
	
	public void immunizationchart() throws InterruptedException {
		Thread.sleep(1000);
		cpoeAdmin.click();
		Thread.sleep(1000);
		 Immunization.click();
		 Thread.sleep(1000);
		 BCG.click();
		 Thread.sleep(1000);
		 outsidehosp.click();
		 Thread.sleep(1000);
		 remarks.click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//textarea[@id='remarks']")).sendKeys("baby from another hospital");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//button[normalize-space()='Ok']")).click();
		 Thread.sleep(1000);
		 OPV0.click();
		 Thread.sleep(1000);
		 hepatitis.click();
		 Thread.sleep(1000);
		 delete.click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//div[@class='dailog-btn']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		 Thread.sleep(1000);
		 Saveimmunization.click();
		 Thread.sleep(2000);
		 act.moveToElement(log).build().perform();
		 Thread.sleep(2500);
		 }
	
	
	
	

	public void  dischargeRecommendationBaby(String MRNo1 , String nurseUser , String  Password,String DOCuser , String DOCpassword,  String Site) throws InterruptedException, AWTException {


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
		userid.sendKeys(DOCuser);
		password.click();
		password.sendKeys(DOCpassword);
		Thread.sleep(1000);
		site.click();
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")) );

		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(5000);
				
		Thread.sleep(3000);
		Hamberger.click();
		Thread.sleep(1000);
		EMRhomescreen.click();
		Thread.sleep(1000);
		mainCategory.click();
		IP.click();
		Searchfield.click();
		Thread.sleep(1000);
		Searchfield.sendKeys(MRNo1);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNo1+"')])[1]")).click();
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
		
	/*	Thread.sleep(5000);
		UpArrow.click();
		Thread.sleep(500);
		Lock1.click(); */
		///////Create the doctor note and select pregnant
		DoctorNote.click();
		Thread.sleep(1000);
		List<WebElement> dynamicElement1=driver.findElements(By.xpath("//button[normalize-space()='Create New Note']"));

		if(dynamicElement1.size() !=0)
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
		driver.findElement(By.xpath("//li[normalize-space()='SOAP']")).click();
		Thread.sleep(1000);
		TemplateOK.click();
		Thread.sleep(1000);
		
		disgnosis.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@title='(Idiopathic) normal pressure hydrocephalus']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'Mark as Final')]")).click();
		Thread.sleep(1000);
	
		
		DisRecom.click();
		Thread.sleep(1000);
		Dischargecheckbox.click();
		Thread.sleep(1000);
		DischargeStatus.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Cured']")).click();
		Thread.sleep(1000);
		EmrSave.click();
		Thread.sleep(1000); 

		//openNewTab

		Thread.sleep(3000);
		((JavascriptExecutor)driver).executeScript("window.open()");
		ArrayList<String> tabs1 = new ArrayList<String>(driver.getWindowHandles());
		int Windowsize1 =driver.getWindowHandles().size();
		int windowopen1= Windowsize1-1;

		driver.switchTo().window(tabs1.get(windowopen1));
		driver.switchTo().window(tabs1.get(windowopen1));
		Thread.sleep(5000);
		driver.get(URL);
		Thread.sleep(3000);

		//login
		userid.click();
		userid.sendKeys(nurseUser);
		password.click();
		password.sendKeys(Password); 
		Thread.sleep(1000);
		site.click();
		//JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")) );
     	Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(3000);

		

	}
	public void  dischargeApprovalBaby(String MRNo1 , String nurseUser , String  Password,String depUser , String RADuser, String meduser , String AdminUser ,String  AdminPassword, String Site) throws InterruptedException {

///////////////dischargeApproval



	//openNewTab

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

	//login
	userid.click();
	Thread.sleep(1000);
	userid.sendKeys(nurseUser);
	Thread.sleep(1000);
	password.click();
	password.sendKeys(Password); 
	Thread.sleep(1000);
	site.click();
	Thread.sleep(1000);
	JavascriptExecutor js= (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")) );
	driver.findElement(By.xpath("//*[contains(text(),'" +Site+ "')]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
	Thread.sleep(5000);


	///	driver.navigate().refresh();
	Thread.sleep(2000);
	Hamberger.click();
	Thread.sleep(1000);
	EMR.click();
	Thread.sleep(1000);
	driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL , Keys.END);
	Thread.sleep(1000);
	WhiteBoard.click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[@class='btn btn-primary sm active']")).click();
	Thread.sleep(2000);
	
	NameSearch.clear();
	Thread.sleep(1000);
	NameSearch.sendKeys(MRNo1);
	Thread.sleep(1000);
	SearchIcon.click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//th[normalize-space()='MRNo']")).click();
	Thread.sleep(2000);

	js.executeScript("arguments[0].scrollIntoView();", Clinical_Pharmacist_Clearance);
	Thread.sleep(2000);
	act.moveToElement(Clinical_Pharmacist_Clearance).click().build().perform();
	Thread.sleep(2000);

	verifiedBy.click();
	Thread.sleep(1000);
	verifiedBy.sendKeys(nurseUser);
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//*[contains(text(),'"+nurseUser+"')])")).click();
	Thread.sleep(1000);
	verifyPassword.click();
	verifyPassword.sendKeys(Password);
	Thread.sleep(1000);
	verifySave.click();
	Thread.sleep(2000);
	
	
	
	
////Ready for Discharge
	

	NameSearch.clear();
	Thread.sleep(1000);
	NameSearch.sendKeys(MRNo1);
	Thread.sleep(1000);
	SearchIcon.click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//th[normalize-space()='MRNo']")).click();
	Thread.sleep(2000);

	js.executeScript("arguments[0].scrollIntoView();", REadyForDischarge);
	Thread.sleep(2000);
	act.moveToElement(REadyForDischarge).click().build().perform();
	Thread.sleep(2000);

	verifiedBy.click();
	Thread.sleep(1000);
	verifiedBy.sendKeys(nurseUser);
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//*[contains(text(),'"+nurseUser+"')])")).click();
	Thread.sleep(1000);
	verifyPassword.click();
	verifyPassword.sendKeys(Password);
	Thread.sleep(1000);
	verifySave.click();
	Thread.sleep(2000);





	}

	public void  LaboratoryClearanceBaby(String MRNo1 , String nurseUser , String  Password,String depUser , String RADuser, String meduser , String AdminUser ,String  AdminPassword,  String Site) throws InterruptedException {

		//////////////////////////////////laboratory clearance

	/*	Hamberger.click();
		Thread.sleep(1000);
		EmrIcon.click();
		Thread.sleep(1000);
		EMR.click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL , Keys.END);
		Thread.sleep(1000);
		WhiteBoard.click(); */
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-whiteboard[1]/div[1]/div[1]/div[1]/lib-whiteboard-header[1]/div[1]/div[1]/div[7]/div[1]/ki-input-control[1]/div[1]/input[1]")));

//		Thread.sleep(2000);
//		NameSearch.clear();
//		Thread.sleep(1000);
//		NameSearch.sendKeys(MRNo1);
//		Thread.sleep(1000);
//		SearchIcon.click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//th[normalize-space()='MRNo']")).click();
//		Thread.sleep(2000);
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].scrollIntoView();", Depclearance);
//		Thread.sleep(3000);
//		act.moveToElement(Depclearance).click().build().perform();
//		//Depclearance.click();
//		Thread.sleep(1000);
//		laboratoryCheckbox.click();
//		Thread.sleep(1000);
//		radiology_imaging.click();
//		Thread.sleep(1000);
//		//MedicalRecords.click();
//		//Thread.sleep(1000);
//		
//		verifiedBy.click();
//		Thread.sleep(1000);
//		verifiedBy.sendKeys(nurseUser);
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("(//*[contains(text(),'"+nurseUser+"')])")).click();
//		Thread.sleep(1000);
//		verifyPassword.click();
//		verifyPassword.sendKeys(Password);
//		Thread.sleep(1000);
//		verifySave.click();
//		Thread.sleep(2000); 
		
		/////////////Discharge summary clearance
		
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-whiteboard[1]/div[1]/div[1]/div[1]/lib-whiteboard-header[1]/div[1]/div[1]/div[7]/div[1]/ki-input-control[1]/div[1]/input[1]")));

		Thread.sleep(2000);
		NameSearch.clear();
		Thread.sleep(1000);
		NameSearch.sendKeys(MRNo1);
		Thread.sleep(1000);
		SearchIcon.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//th[normalize-space()='MRNo']")).click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", Discharge_summary_Clearance);
		Thread.sleep(3000);
		act.moveToElement(Discharge_summary_Clearance).click().build().perform();
		//Depclearance.click();
		Thread.sleep(1000);
		
		verifiedBy.click();
		Thread.sleep(1000);
		verifiedBy.sendKeys(nurseUser);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+nurseUser+"')])")).click();
		Thread.sleep(1000);
		verifyPassword.click();
		verifyPassword.sendKeys(Password);
		Thread.sleep(1000);
		verifySave.click();
		Thread.sleep(2000); 
		

		
	//////////Pharmacy clearance	
		

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-whiteboard[1]/div[1]/div[1]/div[1]/lib-whiteboard-header[1]/div[1]/div[1]/div[7]/div[1]/ki-input-control[1]/div[1]/input[1]")));

		Thread.sleep(2000);
		NameSearch.clear();
		Thread.sleep(1000);
		NameSearch.sendKeys(MRNo1);
		Thread.sleep(1000);
		SearchIcon.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//th[normalize-space()='MRNo']")).click();
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView();", pharmacyClearance);
		Thread.sleep(3000);
		act.moveToElement(pharmacyClearance).click().build().perform();
		//Depclearance.click();
		Thread.sleep(1000);
		
		verifiedBy.click();
		Thread.sleep(1000);
		verifiedBy.sendKeys(nurseUser);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+nurseUser+"')])")).click();
		Thread.sleep(1000);
		verifyPassword.click();
		verifyPassword.sendKeys(Password);
		Thread.sleep(1000);
		verifySave.click();
		Thread.sleep(2000);   
		
	}

	public void  radiologyClearanceBaby(String MRNo1 , String nurseUser , String  Password,String depUser , String RADuser, String meduser , String AdminUser ,String  AdminPassword,  String Site) throws InterruptedException {
		////////////////////////////radiology clearance

		Hamberger.click();
		Thread.sleep(1000);
		EmrIcon.click();
		Thread.sleep(1000);
		EMR.click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL , Keys.END);
		Thread.sleep(1000);
		WhiteBoard.click();
		Thread.sleep(1000);   
		NameSearch.click();
		Thread.sleep(1000);
		NameSearch.sendKeys(MRNo1);
		Thread.sleep(1000);
		SearchIcon.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//th[normalize-space()='MRNo']")).click();;
		Thread.sleep(1000);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", Depclearance);
		Thread.sleep(3000);
		act.moveToElement(Depclearance).click().build().perform();
		//Depclearance.click();
		Thread.sleep(1000);
		radiologyCheckbox.click();
		Thread.sleep(1000);
		verifiedBy.click();
		Thread.sleep(1000);
		verifiedBy.sendKeys(RADuser);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+RADuser+"')])")).click();
		Thread.sleep(1000);
		verifyPassword.click();
		verifyPassword.sendKeys(Password);
		Thread.sleep(1000);
		verifySave.click();


		//openNewTab

		Thread.sleep(3000);
		((JavascriptExecutor)driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		int Windowsize =driver.getWindowHandles().size();
		int windowopen= Windowsize-1;

		driver.switchTo().window(tabs.get(windowopen));
		driver.switchTo().window(tabs.get(windowopen));
		Thread.sleep(2000);
		driver.get(URL);
		Thread.sleep(3000);

		//login
		userid.click();
		userid.sendKeys(meduser);
		password.click();
		password.sendKeys(Password);
		Thread.sleep(1000);
		site.click();
		driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(5000);
	}

	public void  medicalClearanceBaby(String MRNo1 , String nurseUser , String  Password,String depUser , String RADuser, String meduser , String AdminUser ,String  AdminPassword,  String Site) throws InterruptedException {


		/////////////////////////medical Clearance

		Hamberger.click();
		Thread.sleep(1000);
		EmrIcon.click();
		Thread.sleep(2000);
		EMR.click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL , Keys.END);
		Thread.sleep(1000);
		WhiteBoard.click();
		Thread.sleep(1000);
		
		
		
		NameSearch.click();
		Thread.sleep(1000);
		NameSearch.sendKeys(MRNo1);
		Thread.sleep(1000);
		SearchIcon.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//th[normalize-space()='MRNo']")).click();
		Thread.sleep(1000);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", Depclearance);
		Thread.sleep(3000);
		act.moveToElement(Depclearance).click().build().perform();
		//Depclearance.click();
		Thread.sleep(1000);
		radiologyCheckbox.click();
		Thread.sleep(1000);
		verifiedBy.click();
		Thread.sleep(1000);
		verifiedBy.sendKeys(meduser);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+meduser+"')])")).click();
		Thread.sleep(1000);
		verifyPassword.click();
		verifyPassword.sendKeys(Password);
		Thread.sleep(1000);
		verifySave.click();


		//openNewTab

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

		//login
		userid.click();
		userid.sendKeys(nurseUser);
		password.click();
		password.sendKeys(Password);
		Thread.sleep(1000);
		site.click();
		driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(5000);
	}


	public void  pharmacyClearanceBaby(String MRNo1 , String nurseUser , String  Password,String depUser , String RADuser, String meduser , String AdminUser ,String  AdminPassword,  String Site) throws InterruptedException {

		//////////////////////////////////pharmacy clearance

		Thread.sleep(1000);
	/*	Hamberger.click();
		Thread.sleep(1000);
		EMR.click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL , Keys.END);
		Thread.sleep(2000);
		WhiteBoard.click();
		Thread.sleep(1000);   */
		Thread.sleep(1000);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-whiteboard[1]/div[1]/div[1]/lib-whiteboard-header[1]/div[1]/div[1]/div[7]/div[1]/ki-input-control[1]/div[1]/input[1]")));
		Thread.sleep(1000);
		NameSearch.clear();
		Thread.sleep(1000);
		NameSearch.sendKeys(MRNo1);
		Thread.sleep(1000);
		SearchIcon.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//th[normalize-space()='MRNo']")).click();
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].scrollIntoView();",  pharmacyClearance);
		Thread.sleep(3000);
		act.moveToElement( pharmacyClearance).click().build().perform();

		Thread.sleep(1000);
		
		Thread.sleep(1000);
		verifiedBy.click();
		Thread.sleep(1000);
		verifiedBy.sendKeys(nurseUser);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+nurseUser+"')])")).click();
		Thread.sleep(1000);
		verifyPassword.click();
		verifyPassword.sendKeys(Password);
		Thread.sleep(1000);
		verifySave.click();
		
		//openNewTab

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

		//login
		userid.click();
		userid.sendKeys(AdminUser);
		password.click();
		password.sendKeys(AdminPassword);
		Thread.sleep(1000);
		site.click();
		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")) );
		driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(5000);  

	}


	public void  ADTapproval(String MRNo1 , String nurseUser , String  Password,String depUser , String RADuser, String meduser , String AdminUser ,String  AdminPassword,  String Site) throws InterruptedException {


		///////////////////////////////ADT aPProval
		Thread.sleep(2000);
		Hamburger.click();
		Thread.sleep(800);
		FO.click();
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
		
		
		FOSearchField.click();
		Thread.sleep(1000);
		FOSearchField.sendKeys(MRNo1);
		Thread.sleep(1000);
		FOSearchField.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNo1+"')])[1]")).click();
		Thread.sleep(1000);
		
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

		ADT.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].scrollIntoView();", dischargeStatus);
		
		
		Thread.sleep(2000);
		dischargeStatus.click();//input[@id='dischargestatus']
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Cured']")).click();
		Thread.sleep(1000);
		disposition.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Discharged Home']")).click();
		Thread.sleep(1000);
		 ADTSave.click();
		 Thread.sleep(1000);



	}


	public void  financialClearance(String MRNo1 , String nurseUser , String  Password,String depUser , String RADuser, String meduser , String AdminUser ,String  AdminPassword,  String Site) throws InterruptedException {


		//openNewTab
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
		
		
	//login
	userid.click();
	userid.sendKeys(nurseUser);
	password.click();
	password.sendKeys(Password);
	Thread.sleep(1000);
	site.click();
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")) );
	driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
	Thread.sleep(2000);

		///////////////////////////////////////////financial clearance 

		Thread.sleep(1000);
		Hamberger.click();
		Thread.sleep(1000);
		EMR.click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL , Keys.END);
		Thread.sleep(2000);
		WhiteBoard.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary sm active']")).click();
		Thread.sleep(2000);
		NameSearch.clear();
		Thread.sleep(1000);
		NameSearch.sendKeys(MRNo1);
		Thread.sleep(1000);
		SearchIcon.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//th[normalize-space()='MRNo']")).click();
		Thread.sleep(1000);
	//	JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].scrollIntoView();", FinancialClearance);
		Thread.sleep(3000);
		act.moveToElement( FinancialClearance).click().build().perform();

		Thread.sleep(1000);
		
		Thread.sleep(1000);
		verifiedBy.click();
		Thread.sleep(1000);
		verifiedBy.sendKeys(nurseUser);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+nurseUser+"')])")).click();
		Thread.sleep(1000);
		verifyPassword.click();
		verifyPassword.sendKeys(Password);
		Thread.sleep(1000);
		verifySave.click();
		

		//openNewTab

	/*	Thread.sleep(3000);
		((JavascriptExecutor)driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(6));
		driver.switchTo().window(tabs.get(6));
		Thread.sleep(5000);
		driver.get(URL);
		Thread.sleep(3000);

		//login
		userid.click();
		userid.sendKeys(nurseUser);
		password.click();
		password.sendKeys(Password);
		Thread.sleep(1000);
		site.click();
		driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();   */
		Thread.sleep(5000);

	}

	public void  physicalDischarge(String MRNo1 , String nurseUser , String  Password,String depUser , String RADuser, String meduser , String AdminUser ,String  AdminPassword,String DOCuser,  String  DOCpassword, String Site) throws InterruptedException

	{

		//////////////////////////physical Discharge

	/*	Thread.sleep(1000);
		Hamberger.click();
		Thread.sleep(1000);
		EMR.click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL , Keys.END);
		Thread.sleep(2000);
		WhiteBoard.click();
		Thread.sleep(1000);

		//driver.navigate().refresh(); */
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(NameSearch));
		Thread.sleep(1000);
		NameSearch.clear();
		Thread.sleep(1000);
		NameSearch.sendKeys(MRNo1);
		Thread.sleep(1000);
		SearchIcon.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//th[normalize-space()='Incharge Provider']")).click();
		
		//driver.findElement(By.xpath("//th[normalize-space()='MRNo']")).click();
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].scrollIntoView();", pysicalDischarge);
		Thread.sleep(3000);
		act.moveToElement( pysicalDischarge).click().build().perform();

		Thread.sleep(1000);
		
		Thread.sleep(1000);
		verifiedBy.click();
		Thread.sleep(1000);
		verifiedBy.sendKeys(nurseUser);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+nurseUser+"')])")).click();
		Thread.sleep(1000);
		verifyPassword.click();
		verifyPassword.sendKeys(Password);
		Thread.sleep(1000);
		verifySave.click();

		




	}
	
	
	/////////////////////////////discharge mom

	public void dischargeRecommendationMOM(String MRNo , String nurseUser , String  Password,String DOCuser , String DOCpassword, String meduser , String AdminUser ,String  AdminPassword, String Site) throws InterruptedException, AWTException {

		//openNewTab
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
				//login
				userid.click();
				userid.sendKeys(DOCuser); 
				password.click();
				password.sendKeys(DOCpassword);   

				Thread.sleep(1000);
				site.click();
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")) );
				driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
				Thread.sleep(5000);
		
		Thread.sleep(3000);
		Hamberger.click();
		Thread.sleep(1000);
		EMRhomescreen.click();
		Thread.sleep(1000);
		mainCategory.click();
		IP.click();
		Searchfield.click();
		Thread.sleep(1000);
		Searchfield.sendKeys(MRNo);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNo+"')])[1]")).click();
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
		
	/*	Thread.sleep(5000);
		UpArrow.click();
		Thread.sleep(500);
		Lock1.click(); */
		///////Create the doctor note and select pregnant
		DoctorNote.click();
		Thread.sleep(1000);
		List<WebElement> dynamicElement1=driver.findElements(By.xpath("//button[normalize-space()='Create New Note']"));

		if(dynamicElement1.size() !=0)
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
		driver.findElement(By.xpath("//li[normalize-space()='SOAP']")).click();
		Thread.sleep(1000);
		TemplateOK.click();
		Thread.sleep(1000);
		
		disgnosis.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@title='(Idiopathic) normal pressure hydrocephalus']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'Mark as Final')]")).click();
		Thread.sleep(1000);
	
		
		DisRecom.click();
		Thread.sleep(1000);
		Dischargecheckbox.click();
		Thread.sleep(1000);
		DischargeStatus.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Cured']")).click();
		Thread.sleep(1000);
		EmrSave.click();
		Thread.sleep(1000); 


	}

	public void dischargeApprovalMOM(String MRNo , String nurseUser , String  NursePassword,String depUser , String RADuser, String meduser , String AdminUser ,String  AdminPassword,String Site) throws InterruptedException {


		///////////////dischargeApproval



		//openNewTab

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

		//login
		userid.click();
		Thread.sleep(1000);
		userid.sendKeys(nurseUser);
		Thread.sleep(1000);
		password.click();
		password.sendKeys(NursePassword); 
		Thread.sleep(1000);
		site.click();
		Thread.sleep(1000);
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")) );
		driver.findElement(By.xpath("//*[contains(text(),'" +Site+ "')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(5000);


		///	driver.navigate().refresh();
		Thread.sleep(2000);
		Hamberger.click();
		Thread.sleep(1000);
		EMR.click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL , Keys.END);
		Thread.sleep(1000);
		WhiteBoard.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary sm active']")).click();
		Thread.sleep(2000);
		
		NameSearch.clear();
		Thread.sleep(1000);
		NameSearch.sendKeys(MRNo);
		Thread.sleep(1000);
		SearchIcon.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//th[normalize-space()='MRNo']")).click();
		Thread.sleep(2000);

		js.executeScript("arguments[0].scrollIntoView();", Clinical_Pharmacist_Clearance);
		Thread.sleep(2000);
		act.moveToElement(Clinical_Pharmacist_Clearance).click().build().perform();
		Thread.sleep(2000);

		verifiedBy.click();
		Thread.sleep(1000);
		verifiedBy.sendKeys(nurseUser);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+nurseUser+"')])")).click();
		Thread.sleep(1000);
		verifyPassword.click();
		verifyPassword.sendKeys(NursePassword);
		Thread.sleep(1000);
		verifySave.click();
		Thread.sleep(2000);
		
		
		
		
	////Ready for Discharge
		

		NameSearch.clear();
		Thread.sleep(1000);
		NameSearch.sendKeys(MRNo);
		Thread.sleep(1000);
		SearchIcon.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//th[normalize-space()='MRNo']")).click();
		Thread.sleep(2000);

		js.executeScript("arguments[0].scrollIntoView();", REadyForDischarge);
		Thread.sleep(2000);
		act.moveToElement(REadyForDischarge).click().build().perform();
		Thread.sleep(2000);

		verifiedBy.click();
		Thread.sleep(1000);
		verifiedBy.sendKeys(nurseUser);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+nurseUser+"')])")).click();
		Thread.sleep(1000);
		verifyPassword.click();
		verifyPassword.sendKeys(NursePassword);
		Thread.sleep(1000);
		verifySave.click();
		Thread.sleep(2000);





	}

	public void laboratoryclearanceMOM(String MRNo , String nurseUser , String  Password,String depUser , String RADuser, String meduser , String AdminUser ,String  AdminPassword ) throws InterruptedException {


		//////////////////////////////////laboratory clearance
		/*	Hamberger.click();
		Thread.sleep(1000);
		EmrIcon.click();
		Thread.sleep(1000);
		EMR.click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL , Keys.END);
		Thread.sleep(1000);
		WhiteBoard.click(); */
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-whiteboard[1]/div[1]/div[1]/div[1]/lib-whiteboard-header[1]/div[1]/div[1]/div[7]/div[1]/ki-input-control[1]/div[1]/input[1]")));

//		Thread.sleep(2000);
//		NameSearch.clear();
//		Thread.sleep(1000);
//		NameSearch.sendKeys(MRNo);
//		Thread.sleep(1000);
//		SearchIcon.click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//th[normalize-space()='MRNo']")).click();
//		Thread.sleep(2000);
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].scrollIntoView();", Depclearance);
//		Thread.sleep(3000);
//		act.moveToElement(Depclearance).click().build().perform();
//		//Depclearance.click();
//		Thread.sleep(1000);
//		laboratoryCheckbox.click();
//		Thread.sleep(1000);
//		radiology_imaging.click();
//		Thread.sleep(1000);
//		//MedicalRecords.click();
//		//Thread.sleep(1000);
//		
//		verifiedBy.click();
//		Thread.sleep(1000);
//		verifiedBy.sendKeys(nurseUser);
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("(//*[contains(text(),'"+nurseUser+"')])")).click();
//		Thread.sleep(1000);
//		verifyPassword.click();
//		verifyPassword.sendKeys(Password);
//		Thread.sleep(1000);
//		verifySave.click();
//		Thread.sleep(2000); 
//		
		/////////////Discharge summary clearance
		
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-whiteboard[1]/div[1]/div[1]/div[1]/lib-whiteboard-header[1]/div[1]/div[1]/div[7]/div[1]/ki-input-control[1]/div[1]/input[1]")));

		Thread.sleep(2000);
		NameSearch.clear();
		Thread.sleep(1000);
		NameSearch.sendKeys(MRNo);
		Thread.sleep(1000);
		SearchIcon.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//th[normalize-space()='MRNo']")).click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", Discharge_summary_Clearance);
		Thread.sleep(3000);
		act.moveToElement(Discharge_summary_Clearance).click().build().perform();
		//Depclearance.click();
		Thread.sleep(1000);
		
		verifiedBy.click();
		Thread.sleep(1000);
		verifiedBy.sendKeys(nurseUser);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+nurseUser+"')])")).click();
		Thread.sleep(1000);
		verifyPassword.click();
		verifyPassword.sendKeys(Password);
		Thread.sleep(1000);
		verifySave.click();
		Thread.sleep(2000); 
		

		
	//////////Pharmacy clearance	
		

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-whiteboard[1]/div[1]/div[1]/div[1]/lib-whiteboard-header[1]/div[1]/div[1]/div[7]/div[1]/ki-input-control[1]/div[1]/input[1]")));

		Thread.sleep(2000);
		NameSearch.clear();
		Thread.sleep(1000);
		NameSearch.sendKeys(MRNo);
		Thread.sleep(1000);
		SearchIcon.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//th[normalize-space()='MRNo']")).click();
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView();", pharmacyClearance);
		Thread.sleep(3000);
		act.moveToElement(pharmacyClearance).click().build().perform();
		//Depclearance.click();
		Thread.sleep(1000);
		
		verifiedBy.click();
		Thread.sleep(1000);
		verifiedBy.sendKeys(nurseUser);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+nurseUser+"')])")).click();
		Thread.sleep(1000);
		verifyPassword.click();
		verifyPassword.sendKeys(Password);
		Thread.sleep(1000);
		verifySave.click();
		Thread.sleep(2000);   
		

	}
	public void RadiologyclearanceMOM(String MRNo , String nurseUser , String  Password,String depUser , String RADuser, String meduser , String AdminUser ,String  AdminPassword ) throws InterruptedException {



		////////////////////////////radiology clearance

		Hamberger.click();
		Thread.sleep(1000);
		EmrIcon.click();
		Thread.sleep(1000);
		EMR.click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL , Keys.END);
		Thread.sleep(1000);
		WhiteBoard.click();
		Thread.sleep(1000);
		NameSearch.click();
		Thread.sleep(1000);
		NameSearch.sendKeys(MRNo);
		Thread.sleep(1000);
		SearchIcon.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//th[normalize-space()='MRNo']")).click();;
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", Depclearance);
		Thread.sleep(3000);
		act.moveToElement(Depclearance).click().build().perform();
		//Depclearance.click();
		Thread.sleep(1000);
		radiologyCheckbox.click();
		Thread.sleep(1000);
		verifiedBy.click();
		Thread.sleep(1000);
		verifiedBy.sendKeys(RADuser);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+RADuser+"')])")).click();
		Thread.sleep(1000);
		verifyPassword.click();
		verifyPassword.sendKeys(Password);
		Thread.sleep(1000);
		verifySave.click();


		//openNewTab

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
		
		
		//login
		userid.click();
		userid.sendKeys(meduser);
		password.click();
		password.sendKeys(Password);
		Thread.sleep(1000);
		site.click();
		driver.findElement(By.xpath("//li[normalize-space()='KIMSHEALTH TVM']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(5000);
	}

	public void MedicalclearanceMOM(String MRNo , String nurseUser , String  Password,String depUser , String RADuser, String meduser , String AdminUser ,String  AdminPassword ) throws InterruptedException {


		/////////////////////////medical Clearance

		Hamberger.click();
		Thread.sleep(1000);
		EmrIcon.click();
		Thread.sleep(2000);
		EMR.click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL , Keys.END);
		Thread.sleep(1000);
		WhiteBoard.click();
		Thread.sleep(1000);
		NameSearch.click();
		Thread.sleep(1000);
		NameSearch.sendKeys(MRNo);
		Thread.sleep(1000);
		SearchIcon.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//th[normalize-space()='MRNo']")).click();
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", Depclearance);
		Thread.sleep(3000);
		act.moveToElement(Depclearance).click().build().perform();
		//Depclearance.click();
		Thread.sleep(1000);
		radiologyCheckbox.click();
		Thread.sleep(1000);
		verifiedBy.click();
		Thread.sleep(1000);
		verifiedBy.sendKeys(meduser);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+meduser+"')])")).click();
		Thread.sleep(1000);
		verifyPassword.click();
		verifyPassword.sendKeys(Password);
		Thread.sleep(1000);
		verifySave.click();


		//openNewTab

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

		//login
		userid.click();
		userid.sendKeys(nurseUser);
		password.click();
		password.sendKeys(Password);
		Thread.sleep(1000);
		site.click();
		driver.findElement(By.xpath("//li[normalize-space()='KIMSHEALTH TVM']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(5000);

	}

	public void pharmacyClearanceMOM(String MRNo , String nurseUser , String  Password,String depUser , String RADuser, String meduser , String AdminUser ,String  AdminPassword, String Site) throws InterruptedException {


		//////////////////////////////////pharmacy clearance

		Thread.sleep(1000);
		/*	Hamberger.click();
			Thread.sleep(1000);
			EMR.click();
			Thread.sleep(1000);
			driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL , Keys.END);
			Thread.sleep(2000);
			WhiteBoard.click();
			Thread.sleep(1000);   */
			Thread.sleep(1000);
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/lib-whiteboard[1]/div[1]/div[1]/lib-whiteboard-header[1]/div[1]/div[1]/div[7]/div[1]/ki-input-control[1]/div[1]/input[1]")));
			Thread.sleep(1000);
			NameSearch.clear();
			Thread.sleep(1000);
			NameSearch.sendKeys(MRNo);
			Thread.sleep(1000);
			SearchIcon.click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//th[normalize-space()='MRNo']")).click();
			Thread.sleep(1000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
		    js.executeScript("arguments[0].scrollIntoView();",  pharmacyClearance);
			Thread.sleep(3000);
			act.moveToElement( pharmacyClearance).click().build().perform();

			Thread.sleep(1000);
			
			Thread.sleep(1000);
			verifiedBy.click();
			Thread.sleep(1000);
			verifiedBy.sendKeys(nurseUser);
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//*[contains(text(),'"+nurseUser+"')])")).click();
			Thread.sleep(1000);
			verifyPassword.click();
			verifyPassword.sendKeys(Password);
			Thread.sleep(1000);
			verifySave.click();
			
			

	}

	public void ADTapprovalMOM(String MRNo , String nurseUser , String  Password,String depUser , String RADuser, String meduser , String AdminUser ,String  AdminPassword,  String Site) throws InterruptedException {

		//openNewTab

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

		//login
		userid.click();
		userid.sendKeys(AdminUser);
		password.click();
		password.sendKeys(AdminPassword);
		Thread.sleep(1000);
		site.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")) );
		driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(5000);  



		Thread.sleep(2000);
		Hamburger.click();
		Thread.sleep(800);
		FO.click();
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
		
		
		FOSearchField.click();
		Thread.sleep(1000);
		FOSearchField.sendKeys(MRNo);
		Thread.sleep(1000);
		FOSearchField.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNo+"')])[1]")).click();
		Thread.sleep(1000);
		
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

		ADT.click();
		//JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].scrollIntoView();", dischargeStatus);
		
		
		Thread.sleep(2000);
		dischargeStatus.click();//input[@id='dischargestatus']
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Cured']")).click();
		Thread.sleep(1000);
		disposition.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='Discharged Home']")).click();
		Thread.sleep(1000);
		 ADTSave.click();
		 Thread.sleep(1000);

		

	}

	public void financialClearanceMOM(String MRNo , String nurseUser , String  Password,String depUser , String RADuser, String meduser , String AdminUser ,String  AdminPassword,String Site) throws InterruptedException {


		//openNewTab

		 Thread.sleep(3000);
			((JavascriptExecutor)driver).executeScript("window.open()");
			ArrayList<String> tabs1 = new ArrayList<String>(driver.getWindowHandles());
			int Windowsize1 =driver.getWindowHandles().size();
			int windowopen1= Windowsize1-1;

			driver.switchTo().window(tabs1.get(windowopen1));
			driver.switchTo().window(tabs1.get(windowopen1));
			Thread.sleep(5000);
			driver.get(URL);
			Thread.sleep(3000);

		//login
		userid.click();
		userid.sendKeys(nurseUser);
		password.click();
		password.sendKeys(Password);
		Thread.sleep(1000);
		site.click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")) );
		driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(5000);
		///////////////////////////////////////////financial clearance 


		Thread.sleep(1000);
		Hamberger.click();
		Thread.sleep(1000);
		EMR.click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL , Keys.END);
		Thread.sleep(2000);
		WhiteBoard.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary sm active']")).click();
		Thread.sleep(1000);
		NameSearch.clear();
		Thread.sleep(1000);
		NameSearch.sendKeys(MRNo);
		Thread.sleep(1000);
		SearchIcon.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//th[normalize-space()='MRNo']")).click();
		Thread.sleep(1000);
		//JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].scrollIntoView();", FinancialClearance);
		Thread.sleep(3000);
		act.moveToElement( FinancialClearance).click().build().perform();

		Thread.sleep(1000);
		
		Thread.sleep(1000);
		verifiedBy.click();
		Thread.sleep(1000);
		verifiedBy.sendKeys(nurseUser);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[contains(text(),'"+nurseUser+"')])")).click();
		Thread.sleep(1000);
		verifyPassword.click();
		verifyPassword.sendKeys(Password);
		Thread.sleep(1000);
		verifySave.click();
		

		//openNewTab

	/*	Thread.sleep(3000);
		((JavascriptExecutor)driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(6));
		driver.switchTo().window(tabs.get(6));
		Thread.sleep(5000);
		driver.get(URL);
		Thread.sleep(3000);

		//login
		userid.click();
		userid.sendKeys(nurseUser);
		password.click();
		password.sendKeys(Password);
		Thread.sleep(1000);
		site.click();
		driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();   */
		Thread.sleep(5000);

	}
	public void physicalDischargeMOM(String MRNo , String nurseUser , String  Password,String depUser , String RADuser, String meduser ) throws InterruptedException {


		//////////////////////////physical Discharge


		/*	Thread.sleep(1000);
			Hamberger.click();
			Thread.sleep(1000);
			EMR.click();
			Thread.sleep(1000);
			driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL , Keys.END);
			Thread.sleep(2000);
			WhiteBoard.click();
			Thread.sleep(1000);

			//driver.navigate().refresh(); */
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
			wait.until(ExpectedConditions.elementToBeClickable(NameSearch));
			Thread.sleep(1000);
			NameSearch.clear();
			Thread.sleep(1000);
			NameSearch.sendKeys(MRNo);
			Thread.sleep(1000);
			SearchIcon.click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//th[normalize-space()='Incharge Provider']")).click();
			
			//driver.findElement(By.xpath("//th[normalize-space()='MRNo']")).click();
			Thread.sleep(1000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
		    js.executeScript("arguments[0].scrollIntoView();", pysicalDischarge);
			Thread.sleep(3000);
			act.moveToElement( pysicalDischarge).click().build().perform();

			Thread.sleep(1000);
			
			Thread.sleep(1000);
			verifiedBy.click();
			Thread.sleep(1000);
			verifiedBy.sendKeys(nurseUser);
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//*[contains(text(),'"+nurseUser+"')])")).click();
			Thread.sleep(1000);
			verifyPassword.click();
			Thread.sleep(1000);
			verifyPassword.sendKeys(Password);
			Thread.sleep(1000);
			verifySave.click();
			Thread.sleep(2000);
			SearchIcon.click();
			Thread.sleep(2000);
	}






}


