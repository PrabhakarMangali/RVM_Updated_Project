package stepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PatientRegistrationTest extends Setup {
	PatientRegistrationPage pr ;

	@Given("User launches the browser and opens the RVM application")
	public void user_launches_the_browser_and_opens_the_rvm_application() throws InterruptedException {
		// driver = new ChromeDriver();
		/*
		 * driver.manage().window().maximize();
		 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 * driver.get("http://49.207.10.149:8882/master-sign-in/"); js =
		 * (JavascriptExecutor) driver;
		 */
		initialization();
	}

	@When("User enters valid credentials and logs in {string} and {string}")
	public void user_enters_valid_credentials_and_logs_in(String email, String password) throws InterruptedException {
		pr= new PatientRegistrationPage(driver);
		pr.enterEmail(email);
		pr.enterPass(password);
		pr.signinBtn();
		Thread.sleep(1000);

		System.out.println(" User logged in successfully with valid credentials.");
	}

	@When("User navigates to Patient Registration page and click new walk-in registration")
	public void user_navigates_to_patient_registration_page() throws InterruptedException {

		pr.patientRegMenu();
		pr.newRegMenu();
		pr.walkinBtn();
		System.out.println(" Navigated to Patient Registration > New Walk-in.");
	}

	@When("User enters patient personal details")
	public void user_enters_patient_personal_details() throws InterruptedException {

		pr.firstName("Krishna");
		pr.lastName("P");
		pr.dateofbirth("15-06-1993");
		pr.gender();
		pr.bloodGp();
		pr.nationality("INDIA");
		pr.guardian();
		pr.clicknextbtn();
		System.out.println("Entered patient personal details.");
	}

	@When("User enters address details")
	public void user_enters_address_details() throws InterruptedException {

		pr.Area("500073");
		Thread.sleep(1000);
		pr.AreaSelect();
		pr.Address("Srinagar Colony");
		pr.Submit();
		System.out.println("Entered address details and submitted registration form.");
	}

	@When("User skips OTP verification")
	public void user_skips_otp_verification() throws InterruptedException {

		pr.SkipVer();
		System.out.println("Skipped OTP verification.");
	}

	@When("User selects specialty, team, doctor, visit type and payment")
	public void user_selects_specialty_team_doctor_visit_type_and_payment() throws InterruptedException {

		pr.ClickSpecality();
		pr.GenaralMedician();
		pr.ClickTeam();
		pr.GMUnit111();
		pr.ClickDoctor();
		pr.TanveerBarad();
		pr.ClickVisit();
		pr.Genaral();
		pr.RequiredNurse();
		pr.PaymentMethodCash();
		pr.ClickSubmit();
		pr.clickWristband();
		System.out.println("Selected specialty, team, doctor, visit type and payment successfully.");
	}

	@Then("Registration should complete successfully")
	public void registration_should_complete_successfully() {
		System.out.println("Registration completed");
		// driver.quit();
	}
}
