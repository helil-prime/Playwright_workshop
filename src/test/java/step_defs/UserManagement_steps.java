package step_defs;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.UserManagementPage;
import utils.PW;

public class UserManagement_steps {
	
	UserManagementPage userPage = new UserManagementPage();
	
	
	@Given("As a user, I am on the login page")
	public void as_a_user_i_am_on_the_login_page() {
	   PW.getPage().navigate("http://crater.primetech-apps.com/");
	}
	@When("I enter invalid username and valid password")
	public void i_enter_invalid_username_and_valid_password() {
	    PW.getPage().fill(userPage.emailFeild, "dum@primetechschool.com");
	    PW.getPage().locator(userPage.passwordFeild).fill("primetech");
	}
	@When("Click on login button")
	public void click_on_login_button() {
	    PW.getPage().locator(userPage.loginBtn).click();
	}
	@Then("I should not be logged in")
	public void i_should_not_be_logged_in() {
	   assertThat(PW.getPage().locator(userPage.loginBtn)).isVisible();
	}

}
