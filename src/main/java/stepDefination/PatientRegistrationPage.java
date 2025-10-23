package stepDefination;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PatientRegistrationPage extends Setup {
	//WebDriver driver;
    JavascriptExecutor js;
	
       //Constructor
	public PatientRegistrationPage(WebDriver driver)
	{		
		//this.driver = driver;
        //this.js = (JavascriptExecutor) driver;
		PageFactory.initElements(driver, this);
	}


	  //WebElements and actions
	// --------- Login Elements ----------
	@FindBy(xpath= "//input[@id='email-username']")
	WebElement email;
	public void enterEmail(String val)
	{
		email.sendKeys(val);
	}
	
	@FindBy(xpath= "//input[@id='password-input']")
	WebElement pass;
	public void enterPass(String val)
	{
		pass.sendKeys(val);
	}
	
	@FindBy(xpath= "//button[@type='submit']")
	WebElement signin;
	public void signinBtn()
	{
		signin.click();
	}
	
	
	 // --------- Menu Navigation ----------
	
	@FindBy(xpath= "//span[text()='Patient Registration']")
	WebElement patientReg;
	public void patientRegMenu() throws InterruptedException
	{
		patientReg.click();
		Thread.sleep(1000);
	}
	
	@FindBy(xpath= "//h4[text()='New Registration']")
	WebElement newReg;
	public void newRegMenu() throws InterruptedException
	{
		newReg.click();
		Thread.sleep(1000);
	}
	
	@FindBy(xpath= "//a[text()='🚶 Walk-in']")
	WebElement walkin;
	public void walkinBtn() throws InterruptedException
	{
		walkin.click();
		Thread.sleep(1000);
	}
	
	// personal details
	
	@FindBy(xpath= "//input[@name='admission_first_name']")
	WebElement fn;
	public void firstName(String val)
	{
		fn.sendKeys(val);
	}
	
	@FindBy(xpath= "//input[@name='admission_last_name']")
	WebElement ln;
	public void lastName(String val)
	{
		ln.sendKeys(val);
	}
	
	@FindBy(xpath= "//input[@name='date_of_birth']")
	WebElement dob;
	public void dateofbirth(String val)
	{
		dob.sendKeys(val);
	}
	
	@FindBy(xpath= "//input[@name='admission_gender']")
	WebElement gen;
	public void gender()
	{
		gen.click();
	}
	
	@FindBy(xpath= "//select[@name='blood_group']//option[@value='1']")
	WebElement blood;
	public void bloodGp()
	{
		blood.click();
	}
	
	@FindBy(xpath= "//select[@name='admission_nationality']")
	WebElement nation;
	public void nationality(String val)
	{
		nation.sendKeys(val);
	}
	
	@FindBy(xpath= "//select[@name='admission_guardian_relation']//option[@value='2']")
	WebElement guar;
	public void guardian()
	{
		guar.click();
	}
	
	@FindBy(xpath = "//button[@class='btn btn-success btn-label ms-auto next-tab right']")
	WebElement nextbtn;

	public void clicknextbtn() {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", nextbtn);
	}
	
	
	//Address details
	@FindBy(xpath= "//input[@role='combobox']")
	WebElement specificArea;
	public void Area(String val)
	{
		specificArea.sendKeys(val);
	}
	
	@FindBy(xpath= "//div[@class='option']")
	WebElement clickArea;
	public void AreaSelect()
	{
		clickArea.click();
	}
	
	@FindBy(xpath= "//textarea[@id='admission_current_friendly_address']")
	WebElement addr;
	public void Address(String val)
	{
		addr.sendKeys(val);
	}
	
	@FindBy(xpath= "//button[@name='create_new_register']")
	WebElement sub;
	public void Submit() throws InterruptedException
	{
		sub.click();
		Thread.sleep(1000);
	}
	
	@FindBy(xpath= "//a[text()='Skip Verification ?']")
	WebElement skip;
	public void SkipVer() throws InterruptedException
	{
		skip.click();
		Thread.sleep(1000);
	}
	
	//Doctors details
	
	@FindBy(xpath= "//input[@placeholder='Select Specialty']")
	WebElement specality;
	public void ClickSpecality() throws InterruptedException
	{
		specality.click();
		
	}
	
	@FindBy(xpath= "//div[@id='tomselect-3-opt-13']")
	WebElement selectspecialty;
	public void GenaralMedician()
	{
		 js.executeScript("arguments[0].click();", selectspecialty);
	}
	
	@FindBy(xpath= "//input[@id='tomselect-4-ts-control']")
	WebElement team;
	public void ClickTeam() throws InterruptedException
	{
		team.click();
		
	}
	
	@FindBy(xpath= "//div[@id='tomselect-4-opt-2']")
	WebElement selectteam;
	public void GMUnit111() throws InterruptedException
	{
		selectteam.click();
		
	}
	
	
	@FindBy(xpath= "//input[@id='tomselect-5-ts-control']")
	WebElement doctor;
	public void ClickDoctor() throws InterruptedException
	{
		doctor.click();
		
	}
	
	@FindBy(xpath= "//div[@id='tomselect-5-opt-1']")
	WebElement selectdoctor;
	public void TanveerBarad() 
	{
		selectdoctor.click();
		
	}
	
	@FindBy(xpath= "//select[@name='visit_type']//option[@value='1']")
	WebElement visittype;
	public void ClickVisit() throws InterruptedException
	{
		visittype.click();
		
	}
	
	@FindBy(xpath= "//select[@name='referal_type']//option[@value='self']")
	WebElement selectvisittype;
	public void Genaral() throws InterruptedException
	{
		selectvisittype.click();
		
	}
	
	
	@FindBy(xpath= "//input[@name='nurse_triage']")
	WebElement nurse;
	public void RequiredNurse() throws InterruptedException
	{
		nurse.click();
		
	}
	
	
	@FindBy(xpath= "//input[@id='cash']")
	WebElement paymentmethod;
	public void PaymentMethodCash() throws InterruptedException
	{
		paymentmethod.click();
		
	}
	
	@FindBy(xpath= "//button[@name='create_out_patient']")
	WebElement submit;
	public void ClickSubmit() throws InterruptedException
	{
		submit.click();
		
	}
	

	@FindBy(xpath= "//button[normalize-space()='Wrist Band']")
	WebElement wristband;
	public void clickWristband()
	{
		 js.executeScript("arguments[0].click();", wristband);
	}
	
	
}
