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

public class KIMS_CpoePendingOrder_Billing_Yasasiiweb extends PageFactoryInitYasasiiWeb{
	public KIMS_CpoePendingOrder_Billing_Yasasiiweb(WebDriver driver) {
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

	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-billing-overview[1]/div[1]/div[2]/app-encounter-billing[1]/tabset[1]/div[1]/tab[1]/div[1]/div[1]/app-billing-details[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/ki-select-control[1]/div[1]/input[1]")
	public WebElement PayType;

	@FindBy(xpath = "//input[@id='lastname']")
	public WebElement Lastname;	


	//login
	@FindBy(xpath = "//input[@id='loginemail']")
	public WebElement userid;

	@FindBy(xpath = "//input[@id='loginpassword']")
	public WebElement password;

	@FindBy(xpath = "//input[@id='loginsite']")
	public WebElement site;

	///doctornote


	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='menu-toggle']")
	public WebElement MenuToggle;

	@FindBy(xpath = "//label[contains(text(),'Modules')]")
	public WebElement MOdules;

	@FindBy(xpath = "//div[contains(text(),'EMR HomeScreen')]")
	public WebElement EMRHomeScreen;

	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement EnterPatientName;

	@FindBy(xpath = "//input[@id='chiefcomplainttext']")
	public WebElement reasonForVisit;

	@FindBy(xpath = "//input[@id='emrtemplateid']")
	public WebElement Template;

	@FindBy(xpath = "//button[@aria-label='Ok'][normalize-space()='OK']")
	public WebElement TemplateOK;


	@FindBy(xpath = "//div[contains(text(),'Diagnosis and Plan')]")
	public WebElement disgnosis;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[9]/div[1]/app-cpoe-container[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/app-cpoe-pharmacy-prescription[1]/form[1]/div[2]/div[2]/div[11]/app-cpoe-diagnosis-list[1]/div[1]/div[1]/accordion[1]/accordion-group[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]/span[1]")
	public WebElement diagnosischevckbox;

	@FindBy(xpath = "//div[normalize-space()='CPOE Service']")
	public WebElement CpoeService;

	@FindBy(xpath = "//input[@id='cpoeSearchText']")
	public WebElement CpoeServiceSearch;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[3]/app-emr-dashboard[1]/div[1]/label[2]/label[1]")
	public WebElement DoctorNote;

	@FindBy(xpath = "//input[@id='cpoeSearchDb']")
	public WebElement CpoeServiceSearch1;

	@FindBy(xpath = "//div[@class='item-name'][normalize-space()='Plan']")
	public WebElement Plan;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-emrtemplateloader[1]/div[1]/div[1]/div[2]/div[2]/div[10]/div[1]/div[1]/div[1]/div[1]/div[1]/app-custum-template[1]/div[1]/form[1]/div[1]/div[1]/div[4]/ki-textarea-control[1]/div[1]/textarea[1]")
	public WebElement PlanText;

	@FindBy(xpath = "//label[@class='icon emrsave']")
	public WebElement EmrSave;

	@FindBy(xpath = "(//i[@class='ki ki-execution-pending pendingstatus ng-star-inserted'])[1]")
	public WebElement pending1;

	@FindBy(xpath = "//div[contains(text(),'CPOE Info')]")
	public WebElement CPOEInfo;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-cpoe-administration[1]/div[1]/div[2]/app-sar-container[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[5]/label[1]/i[1]")
	public WebElement service1;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-emr-homescreen[1]/div[2]/div[1]/div[1]/app-cpoe-administration[1]/div[1]/div[2]/app-sar-container[1]/div[1]/div[3]/div[1]/div[2]/div[2]/div[5]/label[1]/i[1]")
	public WebElement service2;

	@FindBy(xpath = "//textarea[@id='remarks']")
	public WebElement Remarks;

	@FindBy(xpath = "//label[normalize-space()='Service Administration']")
	public WebElement Serviceadmin;


	@FindBy(xpath = "//label[@id='emrdashboardpatient_cpoeadministration']//label[contains(@class,'icon cpoeadmin')]")
	public WebElement CpoeAdministration;

	@FindBy(xpath = "//i[@class='ki ki-save']")
	public WebElement Save1;
	
	@FindBy(xpath = "(//i[@class='ki ki-execution-pending coloredstatus ng-star-inserted'])[1]")
	public WebElement Executed1;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-frontoffice-patientregistration[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[7]/div[1]/ki-select-control[1]/div[1]/input[1]")
	public WebElement Nationality;
	
	@FindBy(xpath = "//label[@class='btn-feedback ng-star-inserted']")
	public WebElement Additionalinfo;
	
	@FindBy(xpath = "//input[@id='housingstatuslivesinid']")
	public WebElement Accomadation;


	@FindBy(xpath = "(//i[@title='Order Details'])[1]")
	public WebElement orderDetails1;

	@FindBy(xpath = "(//i[@title='Order Details'])[2]")
	public WebElement Orderdeatils2;

//	@FindBy(xpath = "//input[@id='chiefcomplainttext']")
//	public WebElement reasonForVisit;
//
//	@FindBy(xpath = "//input[@id='emrtemplateid']")
//	public WebElement Template;
//
//	@FindBy(xpath = "//button[@aria-label='Ok'][normalize-space()='OK']")
//	public WebElement TemplateOK;


	
	
	
	
	
	
	
	
	


	public void Patreg(String title,String Name,String lastname,String Dob, String DocID, String MobNo,String Address,String MRNo,String Provider ) throws InterruptedException, IOException, AWTException {

		///////////////////Register a patient

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
		HSSFSheet BirthRegistration=wb.getSheetAt(3);	
		int i=BirthRegistration.getLastRowNum();
		System.out.println("Number of rows: " + i);		
		BirthRegistration.getRow(i).createCell(7).setCellValue(mrno);	
		FileOutputStream fout=new FileOutputStream(src);	
		wb.write(fout);
		Thread.sleep(2000); 

		///////////////encounter

		billing.click();
		Thread.sleep(2000);
		encProvider.click();
		Thread.sleep(1000);
		encProvider.sendKeys(Provider);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[normalize-space()='"+Provider+"']")).click();
		Thread.sleep(2500);
		add.click();
		Thread.sleep(1000);
		//printUnckeck.click();
		//Thread.sleep(1000);
		billSave.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='modal-body']//button[@type='button'][normalize-space()='OK']")).click();
		Thread.sleep(1000);


	}




	public void	DoctorNote(String DOCuser ,String DOCpassword, String Site , String MRNo ) throws InterruptedException, AWTException, IOException {


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


		driver.findElement(By.xpath("//input[@id='maincategory']")).click();
		Thread.sleep(1200);
		driver.findElement(By.xpath("//li[normalize-space()='OP']")).click();
		Thread.sleep(1200);
		EnterPatientName.sendKeys(MRNo);
		Thread.sleep(1500);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNo+"')])[1]")).click();
		Thread.sleep(1000);

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


		///////cpoe Service	

		CpoeService.click();
		Thread.sleep(1000);
		CpoeServiceSearch.click();
		Thread.sleep(1000);
		CpoeServiceSearch.sendKeys("Potassium (ISE Indirect)");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='item-list-row']//label[@class='item-name']")).click();
		Thread.sleep(2000);
		CpoeServiceSearch1.clear();
		Thread.sleep(1000);
		CpoeServiceSearch1.sendKeys("Basophils");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[normalize-space()='Basophils']")).click();
		Thread.sleep(2000);

		EmrSave.click();
		Thread.sleep(3000);

	}



	public void CPOEOrderStatus(String adminuser,String adminpassword , String Site ,String MRNo) throws InterruptedException {


		Thread.sleep(3000);
		((JavascriptExecutor)driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		int Windowsize =driver.getWindowHandles().size();
		int windowopen= Windowsize-1;

		driver.switchTo().window(tabs.get(windowopen));
		driver.switchTo().window(tabs.get(windowopen));
		Thread.sleep(3000);
		driver.get(URL);
		Thread.sleep(3000);

		userid.click();
		Thread.sleep(1000);
		userid.sendKeys(adminuser);
		password.click();
		Thread.sleep(1000);
		password.sendKeys(adminpassword);
		Thread.sleep(1000);
		site.click();
		Thread.sleep(1000);

		JavascriptExecutor js= (JavascriptExecutor) driver;//li[normalize-space()='Naufar Center']
		//js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")) );
		driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
		Thread.sleep(3000);




		Thread.sleep(1000);
		Hamburger.click();
		Thread.sleep(800);
		FOModule.click();
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

		driver.findElement(By.xpath("//input[@id='maincategory']")).click();
		Thread.sleep(1200);
		driver.findElement(By.xpath("//li[normalize-space()='CPOE Order']")).click();
		Thread.sleep(1200);
		EnterPatientName.sendKeys(MRNo);
		Thread.sleep(1500);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNo+"')])[1]")).click();
		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//i[@class='ki ki-execution-pending pendingstatus ng-star-inserted'])[1]")));
		Thread.sleep(2000);

		act.moveToElement(pending1).build().perform();
		Thread.sleep(1000);
		CPOEInfo.click();
		Thread.sleep(2000);




	}

	public void serviceExecution(String DOCuser ,String DOCpassword, String Site , String MRNo) throws InterruptedException {


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


		driver.findElement(By.xpath("//input[@id='maincategory']")).click();
		Thread.sleep(1200);
		driver.findElement(By.xpath("//li[normalize-space()='OP']")).click();
		Thread.sleep(1200);
		EnterPatientName.sendKeys(MRNo);
		Thread.sleep(1500);
		driver.findElement(By.xpath("(//*[contains(text(),'"+MRNo+"')])[1]")).click();
		Thread.sleep(1000);

		Thread.sleep(1000);
		CpoeAdministration.click();
		Thread.sleep(1000);

		Serviceadmin.click();
		Thread.sleep(1000);

		service1.click();
		Thread.sleep(1000);
		Remarks.click();
		Thread.sleep(1000);
		Save1.click();
		Thread.sleep(1000);
        service2.click();
        Thread.sleep(1000);
		Remarks.click();
		Thread.sleep(1000);
		Remarks.sendKeys("Remarks");
		Thread.sleep(700);
		Save1.click();
		Thread.sleep(2000);
		
		orderDetails1.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='btn btn-danger sm clear']")).click();
		Thread.sleep(1000);
		Orderdeatils2.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='btn btn-danger sm clear']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//i[@class='ki ki-file-log'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='btn btn-danger sm clear']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//i[@class='ki ki-file-log'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='btn btn-danger sm clear']")).click();
		Thread.sleep(1000);
	


	}	

public void OrderBilling(String adminuser,String adminpassword , String Site ,String MRNo) throws InterruptedException {
	
	Thread.sleep(3000);
	((JavascriptExecutor)driver).executeScript("window.open()");
	ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	int Windowsize =driver.getWindowHandles().size();
	int windowopen= Windowsize-1;

	driver.switchTo().window(tabs.get(windowopen));
	driver.switchTo().window(tabs.get(windowopen));
	Thread.sleep(3000);
	driver.get(URL);
	Thread.sleep(3000);

	userid.click();
	Thread.sleep(1000);
	userid.sendKeys(adminuser);
	password.click();
	Thread.sleep(1000);
	password.sendKeys(adminpassword);
	Thread.sleep(1000);
	site.click();
	Thread.sleep(1000);

	JavascriptExecutor js= (JavascriptExecutor) driver;//li[normalize-space()='Naufar Center']
	//js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")) );
	driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
	Thread.sleep(3000);




	Thread.sleep(1000);
	Hamburger.click();
	Thread.sleep(800);
	FOModule.click();
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

	driver.findElement(By.xpath("//input[@id='maincategory']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//li[normalize-space()='CPOE Order']")).click();
	Thread.sleep(1000);
	EnterPatientName.sendKeys(MRNo);
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//*[contains(text(),'"+MRNo+"')])[1]")).click();
	Thread.sleep(2000);

	act.moveToElement(Executed1).build().perform();
	Thread.sleep(2000);
	
	//driver.findElement(By.xpath("//span[@class='checkmark']")).click();
	//Thread.sleep(1000);
	Save1.click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[@class='modal-body']//button[@type='button'][normalize-space()='OK']")).click();
	Thread.sleep(1000);
	
	CPOEInfo.click();
    Thread.sleep(2000);




}

	
	
	
	
	
	
}
























