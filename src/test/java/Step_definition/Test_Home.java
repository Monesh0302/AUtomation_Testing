package Step_definition;

import Base_Test.Base_class;
import POM_Test.PageObjectManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Test_Home extends Base_class {
	
	PageObjectManager pom = new PageObjectManager();
	
	@Given("Launch the {string} browser")
	public void launch_the_browser(String string) {
		browserLaunch(string);
	}

	@Given("Enter the application URL {string}")
	public void enter_the_application_url(String string) {
		launchUrl(string);
	}

	@When("Click the home tab")
	public void click_the_home_tab() {
		clickOnWebelement(pom.getHome().getHome_tab());
		staticWait(2000);
	}

	@When("click the Skip Signin button")
	public void click_the_skip_signin_button() {
		clickOnWebelement(pom.getHome().getHome_skipsigin_button());
		staticWait(2000);
	}

	@Then("validate it is a Register page")
	public void validate_it_is_a_register_page() {
		getText(pom.getHome().getRegister_page_title());
		staticWait(2000);
		exit();
	}


}
