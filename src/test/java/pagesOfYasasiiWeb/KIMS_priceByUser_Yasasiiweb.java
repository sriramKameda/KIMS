package pagesOfYasasiiWeb;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.baseYasasiiWeb.PageFactoryInitYasasiiWeb;

public class KIMS_priceByUser_Yasasiiweb extends PageFactoryInitYasasiiWeb{

	public KIMS_priceByUser_Yasasiiweb(WebDriver driver) {

		super(driver);

	
	}	
		
		
	
	@FindBy(xpath = "//a[@class='nav-link navbar-brand menu']//div[@class='bar2']")
	public WebElement Hamberger;

	@FindBy(xpath = "//i[@class='ki ki-cog']")
	public WebElement Master;

	@FindBy(xpath="//div[@class='link-value'][normalize-space()='Service']")
	public WebElement  Service;

	@FindBy(xpath="//div[normalize-space()='Service Master']")
	public WebElement  ServiceMaster;

	@FindBy(xpath="//input[@id='rootinvcatgeoryser']")
	public WebElement  categoryMaster;

	@FindBy(xpath="//input[@id='servicecategoryser']")
	public WebElement  Subcategory;

	@FindBy(xpath="//input[@id='name']")
	public WebElement  serviceName;
	
	
	@FindBy(xpath="//span[@class='btn btn-link ng-star-inserted'][normalize-space()='Site Mapping']")
	public WebElement SiteMap;

	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/ng-component[1]/div[2]/form[1]/div[1]/div[2]/div[1]/accordion[1]/accordion-group[1]/div[1]/div[2]/div[1]/div[1]/div[1]/app-sitemapping[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/label[1]/ki-checkbox-control[1]/label[1]/label[1]/span[1]")
	public WebElement ServiceCheck;

	@FindBy(xpath="//i[@class='ki ki-chevron-double-right']")
	public WebElement MoveRight;

	@FindBy(xpath="//i[@class='fa fa-exclamation-triangle red']")
	public WebElement Triangle;

	@FindBy(xpath="//input[@id='internallabid']")
	public WebElement internalLab;

	@FindBy(xpath="//input[@id='executioncategoryid']")
	public WebElement Executioncategory;
	
	@FindBy(xpath="//label[normalize-space()='Modules']")
	public WebElement modules;
	
	@FindBy(xpath="//input[@id='codetype']")
	public WebElement codetype;
	
	@FindBy(xpath="//input[@id='tempcode']")
	public WebElement Code;
	
	@FindBy(xpath="//div[@class='code-table-wrapper']//i[@class='ki ki-plus']")
	public WebElement Add;
	
	@FindBy(xpath="//textarea[@id='description']")
	public WebElement Description;
	
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-sitemapping[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/lib-hismultiselect[1]/div[1]/div[1]/button[1]")
	public WebElement AllowedSite;
	
	@FindBy(xpath="//input[@id='mappingsearchkey']")
	public WebElement Basedon;
	
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-sitemapping[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/lib-hismultiselect[1]/div[1]/div[1]/button[1]")
	public WebElement SearchType;
	
	@FindBy(xpath="//span[@id='searchservice']//i[@class='ki ki-search']")
	public WebElement Search;
	
	@FindBy(xpath="//i[@class='ki ki-chevron-double-right']")
	public WebElement doubleright;
	
	@FindBy(xpath="//a[normalize-space()='Map Details']")
	public WebElement mapall;
	
	@FindBy(xpath="//input[@id='executioncategoryid']")
	public WebElement ExecutionCategory;
	
	
	@FindBy(xpath="//span[normalize-space()='Category Master']")
	public WebElement categorymaster;
	@FindBy(xpath="//input[@id='parentinvcategoryid']")
	public WebElement parentcategory;
	@FindBy(xpath="//li[normalize-space()='Procedure']")
	public WebElement selectprocedure;
	@FindBy(xpath="//input[@id='name']")
	public WebElement entername;
	@FindBy(xpath="//button[@id='categorymastersave']")
	public WebElement subcategorysave;

	@FindBy(xpath="//input[@id='searchtext']")
	public WebElement search;
	
	@FindBy(xpath="//div[@class='link-value'][normalize-space()='RCM-Plan']")
	public WebElement RCM;
	
	@FindBy(xpath="//div[normalize-space()='Tariff Setting']")
	public WebElement TariffSetting;
	
	@FindBy(xpath="//input[@placeholder='Search reference name...']")
	public WebElement SchemeSearch;
	
	@FindBy(xpath="//input[@placeholder='Service Name']")
	public WebElement ServiceSearch;
	
	@FindBy(xpath="//i[@class='ki ki-pencil']")
	public WebElement Edit;
	
	@FindBy(xpath="//span[normalize-space()='Services']")
	public WebElement Services;
	
	@FindBy(xpath="//ki-select-control[@formcontrolname='servicetypeid']//input[@id='undefined']")
	public WebElement ServiceType;
	
	@FindBy(xpath="//input[@id='basecategoryid']")
	public WebElement baseCAt;
	
	@FindBy(xpath="//ki-select-control[@formcontrolname='servicecategoryid']//input[@id='undefined']")
	public WebElement ServiceCAt;
	
	@FindBy(xpath="//input[@id='serviceidBilling']")
	public WebElement Servicename;
	
	@FindBy(xpath="//ki-select-control[@class='ng-untouched ng-pristine ng-invalid']//input[@id='undefined']")
	public WebElement Coverage;
	
	@FindBy(xpath="//label[@class='check-container zero-bottom']//span[@class='checkmark']")
	public WebElement PriceByUser;
	
	@FindBy(xpath="//span[normalize-space()='Charge Parameter']")
	public WebElement chargingParameter;
	
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-tariff-setting[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/accordion[1]/accordion-group[1]/div[1]/div[2]/div[1]/div[1]/div[1]/lib-hismultiselect[1]/div[1]/div[1]/button[1]")
	public WebElement SubMode;

	@FindBy(xpath="//i[@class='ki ki-plus']")
	public WebElement tariffAdd;
	
	@FindBy(xpath="//input[@placeholder='Service Name']")
	public WebElement ServiceSearch1;
	
	@FindBy(xpath="//th[@class='code']")
	public WebElement TableClick;
	
	@FindBy(xpath="//th[normalize-space()='Final Amt.']")
	public WebElement FinalAmount;
	
	@FindBy(xpath="//button[normalize-space()='Update']")
	public WebElement Update;
	
	@FindBy(xpath = "//input[@id='loginemail']")
	public WebElement userid;

	@FindBy(xpath = "//input[@id='loginpassword']")
	public WebElement password;

	@FindBy(xpath = "//input[@id='loginsite']")
	public WebElement site;
	
	@FindBy(xpath = "//i[@class='ki ki-reception-fill']")
	public WebElement FO;
	
	@FindBy(xpath = "//div[normalize-space()='Registration']")
	public WebElement Registration;
	
	@FindBy(xpath = "//input[@id='searchtext']")
	public WebElement SearchPAt;
	
	@FindBy(xpath = "//span[normalize-space()='Service']")
	public WebElement Servicebill;
	
	@FindBy(xpath = "//span[@class='btn btn-link ng-star-inserted']")
	public WebElement Addnew;
	
	@FindBy(xpath = "//input[@id='serviceidBilling']")
	public WebElement ServiceNAme;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-fo-landing[1]/div[2]/app-patient-view[1]/form[1]/div[2]/app-billing-overview[1]/div[1]/div[2]/app-encounter-billing[1]/tabset[1]/div[1]/tab[2]/div[1]/div[1]/app-billing-details[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/accordion[1]/accordion-group[1]/div[1]/div[2]/div[1]/div[1]/div[4]/ki-input-control[1]/div[1]/input[1]")
	public WebElement amount;
	
	@FindBy(xpath = "//input[@id='EncBillingproviders']")
	public WebElement provider;
	
	@FindBy(xpath = "//i[@class='ki ki-plus']")
	public WebElement serviceAdd;
	
	@FindBy(xpath = "//label[@class='check-container zero-label']")
	public WebElement PrintuNCHECK;
	
	@FindBy(xpath = "//div[@class='page-inner-btn-group']//button[1]")
	public WebElement Save;
	
	@FindBy(xpath = "//label[normalize-space()='Modules']")
	public WebElement module;
	
	@FindBy(xpath = "//i[@class='ki ki-cog']")
	public WebElement Masters;
	
	@FindBy(xpath = "//label[@class='table-action-icons']//i[@class='ki ki-trash']")
	public WebElement delete;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-tariff-setting[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[4]/accordion[1]/accordion-group[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/ki-input-control[1]/div[1]/input[1]")
	public WebElement tariffBaseCharge;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-layout[1]/main[1]/app-tariff-setting[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[4]/accordion[1]/accordion-group[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/ki-input-control[1]/div[1]/input[1]")
	public WebElement tariffcontractCharge;
	
	
	

public void master(String codeType , String code,String ServiceName , String BaseCategory , String SubCategory,String ServiceDescription) throws InterruptedException, AWTException{
		
	
		Thread.sleep(1000);
		Hamberger.click(); 
		Thread.sleep(400);
		Master.click();
		Thread.sleep(600);
		List<WebElement> dynamicElement1=driver.findElements(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']"));
		
		if(dynamicElement1.size() !=0)
		{
			driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
		}
		 

		  else {
		System.out.println("sri");
		  }
		Thread.sleep(600);

		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",Service );
		Thread.sleep(400);
		Service.click();
		Thread.sleep(400);
		ServiceMaster.click();
		Thread.sleep(400);
		driver.findElement(By.xpath("//button[normalize-space()='Clear']")).click();
	

      List<WebElement> dynamicElement11=driver.findElements(By.xpath("//div[@class='modal ki-dialog fade in show']//i[@class='ki ki-check']"));
	
	if(dynamicElement11.size() !=0)
	{
		driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//i[@class='ki ki-check']")).click();
	}

	  else {
		  System.out.println("sri");
		  
	  }
//	  Thread.sleep(800); 
		categoryMaster.clear();
		Thread.sleep(400);
		categoryMaster.click();
		Thread.sleep(400);
		categoryMaster.sendKeys(BaseCategory);
		Thread.sleep(400);
		driver.findElement(By.xpath("//li[normalize-space()='"+BaseCategory+"']")).click();
     	Thread.sleep(400);
     	Subcategory.clear();
		Thread.sleep(400);
		Subcategory.clear();
		Thread.sleep(400);
		Subcategory.click();
		Thread.sleep(400);
		Subcategory.sendKeys(SubCategory);
		Thread.sleep(400);
		driver.findElement(By.xpath("//li[contains(text(),'"+SubCategory+"')]")).click();
		Thread.sleep(400);
		serviceName.clear();
		Thread.sleep(400);
		serviceName.click();
		Thread.sleep(400);
		serviceName.sendKeys(ServiceName);
		Thread.sleep(400);
		codetype.click();
		Thread.sleep(400);
		driver.findElement(By.xpath("//li[normalize-space()='"+codeType +"']")).click();
		Thread.sleep(400);
		Code.clear();
		Thread.sleep(400);
		Code.sendKeys(code);
		Thread.sleep(400);
		Add.click();
		Thread.sleep(400);
		Description.click();
		Thread.sleep(400);
		Description.clear();
		Thread.sleep(400);
		Description.sendKeys(ServiceDescription);
		Thread.sleep(400);
		
		js.executeScript("arguments[0].scrollIntoView();",SiteMap );
		SiteMap.click();
		Thread.sleep(400);
		ServiceCheck.click();
	    Thread.sleep(400);
		MoveRight.click();
		Thread.sleep(400);
		 Triangle.click();
		Thread.sleep(400);
		//internalLab.click();
		Thread.sleep(400);
		//driver.findElement(By.xpath("//li[normalize-space()='"+InternalLab+"']")).click();
		Thread.sleep(400);
		Executioncategory.click();
		Thread.sleep(400);
		driver.findElement(By.xpath("//li[contains(text(),'"+BaseCategory+"')]")).click();
		Thread.sleep(400);
		driver.findElement(By.xpath("//button[@class='btn btn-primary sm ng-star-inserted']")).click();
		Thread.sleep(400);       
		driver.findElement(By.xpath("//button[@id='servicemastersave']")).click();
		Thread.sleep(2000); 
		
		
		Robot t=new Robot();
		t.keyPress(KeyEvent.VK_ESCAPE);
		Thread.sleep(400);   
		t.keyRelease(KeyEvent.VK_ESCAPE);
		
		

	}
public void tariff(String ServiceName ,String SubCategory) throws InterruptedException {
	
	
	Thread.sleep(2000); 
	Hamberger.click();
	Thread.sleep(1000); 
	RCM.click();
	Thread.sleep(1000); 
	TariffSetting.click();
	Thread.sleep(1000); 
	SchemeSearch.click();
	Thread.sleep(1000); 
	SchemeSearch.sendKeys("default" , Keys.ENTER);
	Thread.sleep(1000); 
	driver.findElement(By.xpath("//div[@title='Default']")).click();
	Thread.sleep(1000); 
	Edit.click();
	Thread.sleep(2000); 
//	driver.findElement(By.xpath("//input[@id='plan']")).click();
//	Thread.sleep(1000); 
//	driver.findElement(By.xpath("//li[normalize-space()='Government Sponsored']")).click();
//	Thread.sleep(1000); 
	Services.click();
	Thread.sleep(1000); 
	ServiceType.click();
	Thread.sleep(1000); 
	driver.findElement(By.xpath("//li[normalize-space()='Procedure']")).click();
	Thread.sleep(1000); 
	baseCAt.click();
	Thread.sleep(1000); 
	driver.findElement(By.xpath("//li[normalize-space()='Procedure']")).click();
	Thread.sleep(1000); 
	ServiceCAt.click();
	Thread.sleep(1000); 
	driver.findElement(By.xpath("//li[normalize-space()='"+SubCategory+"']")).click();
	Thread.sleep(1000); 
	Servicename.click();
	Thread.sleep(1000); 
	Servicename.sendKeys(ServiceName);
	Thread.sleep(1000); 
	driver.findElement(By.xpath("//li[normalize-space()='"+ServiceName+"']")).click();
	Thread.sleep(1000); 
	Coverage.click();
	Thread.sleep(1000); 
	driver.findElement(By.xpath("//li[normalize-space()='Inclusion']")).click();
	Thread.sleep(1000); 
	PriceByUser.click();
	Thread.sleep(1000); 
	chargingParameter.click();
	Thread.sleep(1000); 
	SubMode.click();
	Thread.sleep(1000); 
	driver.findElement(By.xpath("//span[@title='OP']")).click();
	Thread.sleep(1000); 
	tariffAdd.click();
	Thread.sleep(2500); 
//	ServiceSearch1.click();
//	Thread.sleep(1000); 
//	ServiceSearch1.sendKeys(ServiceName);
//	Thread.sleep(1000); 
//	TableClick.click();
//	Thread.sleep(1000);
//	JavascriptExecutor js= (JavascriptExecutor) driver;
//	js.executeScript("arguments[0].scrollIntoView();", FinalAmount);
//	FinalAmount.click();
//	Thread.sleep(1000); 
	Update.click();
	Thread.sleep(1000); 
	driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
	Thread.sleep(1000); 
	
	
	}



public void Billing( String User ,String Password , String Site , String MRNO , String ServiceName,String Provider) throws InterruptedException {
	
	
	
	//openNewTab

	((JavascriptExecutor)driver).executeScript("window.open()");
	ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles()); 
	int Windowsize =driver.getWindowHandles().size();
	int windowopen= Windowsize-1;
	
	driver.switchTo().window(tabs.get(windowopen));
	driver.switchTo().window(tabs.get(windowopen));
	Thread.sleep(3000);
	driver.get(URL);
	Thread.sleep(3000);

	//login
	userid.click();
	Thread.sleep(500); 
	userid.sendKeys(User);
	Thread.sleep(500);
	password.click();
	Thread.sleep(500);
	password.sendKeys(Password);
	Thread.sleep(500);;
	site.click();
	Thread.sleep(500);
	JavascriptExecutor js= (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")) );
	Thread.sleep(1000);
	driver.findElement(By.xpath("//li[normalize-space()='"+Site+"']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[@id='login_spinner']")).click();
	Thread.sleep(3000);
	

	Thread.sleep(1000);
	Hamberger.click();
	Thread.sleep(600);
	FO.click();
	Thread.sleep(600);
	List<WebElement> dynamicElement1=driver.findElements(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']"));
	
	if(dynamicElement1.size() !=0)
	{
		driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
	}
	 

	  else {
	System.out.println("sri");
	  }
	Thread.sleep(600);

	Registration.click();
	
	Thread.sleep(600);
	List<WebElement> dynamicElement=driver.findElements(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']"));
	
	if(dynamicElement.size() !=0)
	{
		driver.findElement(By.xpath("//ki-dialog-common//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
	}
	 

	  else {
	System.out.println("sri");
	  }
	Thread.sleep(600);

	
	
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='searchtext']")));
	
	
	Thread.sleep(1500);
	SearchPAt.click();
	Thread.sleep(600);
	SearchPAt.sendKeys(MRNO , Keys.ENTER);
	Thread.sleep(600);
	driver.findElement(By.xpath("(//*[contains(text(),'"+MRNO+"')])[1]")).click();
	
	wait.until(ExpectedConditions.elementToBeClickable(Servicebill));
	Thread.sleep(2000);
	Servicebill.click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//label[@class='icon-btn btn-dark-red inline ml-1']//i[@class='ki ki-close']")).click();
	Thread.sleep(600);
	Addnew.click();
	Thread.sleep(600);
	ServiceNAme.click();
	Thread.sleep(600);
	ServiceNAme.sendKeys(ServiceName);  
	Thread.sleep(600);
	driver.findElement(By.xpath("//li[normalize-space()='"+ServiceName+"']")).click();
	Thread.sleep(600);
	amount.click();
	Thread.sleep(600);

	for (int i = 0; i <=5; i++) {
		amount.sendKeys( Keys.RIGHT);
	}
	Thread.sleep(1000);

	for (int i = 0; i <=5; i++) {
		amount.sendKeys( Keys.BACK_SPACE);
	}
	Thread.sleep(1000);
	
	amount.sendKeys("1278.69");
	Thread.sleep(600);
	provider.click();
	Thread.sleep(600);
	provider.sendKeys(Provider);
	Thread.sleep(1200);
	driver.findElement(By.xpath("//li[normalize-space()='"+Provider+"']")).click();
	Thread.sleep(600);
	serviceAdd.click();
	Thread.sleep(600);
	PrintuNCHECK.click();
	Thread.sleep(600);
	Save.click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@class='dialog-content Success']//button[@type='button'][normalize-space()='OK']")).click();
	Thread.sleep(2000);
	Hamberger.click();
	Thread.sleep(600);
	module.click();
	Thread.sleep(600);
	Masters.click();
	Thread.sleep(1000);
	js.executeScript("arguments[0].scrollIntoView();", RCM);
	Thread.sleep(1000);
	RCM.click();
	Thread.sleep(1000);
	TariffSetting.click();
	Thread.sleep(1000);
	SchemeSearch.click();
	Thread.sleep(1000);
	SchemeSearch.sendKeys("Default", Keys.ENTER);
	Thread.sleep(1000);
	driver.findElement(By.xpath("//div[@title='Default']")).click();
	Thread.sleep(2000); 
//	driver.findElement(By.xpath("//input[@id='plan']")).click();
//	Thread.sleep(1000); 
//	driver.findElement(By.xpath("//li[normalize-space()='Government Sponsored']")).click();
//	Thread.sleep(1000); 
	Edit.click();
	Thread.sleep(1000);
	ServiceSearch.click();
	Thread.sleep(1000);
	ServiceSearch.sendKeys(ServiceName);
	Thread.sleep(1000);
	delete.click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//div[@class='modal ki-dialog fade in show']//button[@aria-label='Ok'][normalize-space()='Yes']")).click();
	Thread.sleep(2000);
	
	}


}
