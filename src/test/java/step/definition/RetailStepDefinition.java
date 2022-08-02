package step.definition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import page.objects.RetailPageObject;

public class RetailStepDefinition extends Base {

	RetailPageObject rPO = new RetailPageObject();

	@Given("User click  on MyAccount")
	public void user_click_on_my_account() {
		rPO.clickOnMyAccountDD();
		logger.info("User Successfully clicked on my account drop down");
	}

	@When("User click on Login")
	public void user_click_on_login() {
		rPO.clickOnLoginLink();
		logger.info("User Successfully clicked on login link");
	}

	@When("User enter username {string} and password {string}")
	public void user_enter_username_and_password(String username, String password) {
		rPO.sendEmailToField(username);
		rPO.sendPassToField(password);
		logger.info("User Successfully entered username and password !");
	}

	@When("User click on Login button")
	public void user_click_on_login_button() {
		rPO.doLogin();
		logger.info("User Successfully clicked on login button");
	}

	@Then("User should be logged in to MyAccount dashboard")
	public void user_should_be_logged_in_to_my_account_dashboard() {
		String expected = "TEST ENVIRONMENT";
		String actual = rPO.dashboardText();
		Assert.assertEquals(expected, actual);
		logger.info("User Successfully Verified he/she logged in to my account dash-board ");
	}
	
	@When("User click on register")
	public void user_click_on_register() {
	    rPO.clickOnRegisterLink();
	}
	@When("User fill the Registration form")
	public void user_fill_the_registration_form() {
	  rPO.fillNewAccountForm();
	}
	@When("User clicks on yes for newsletter and privacy check box")
	public void user_clicks_on_yes_for_newsletter_and_privacy_check_box() {
	    rPO.clickOnCheckBoxes();
	}
	@When("User click on continue")
	public void user_click_on_continue() {
	    rPO.clickOnNewContinueButton();
	}
	@When("User verify new Account Created {string}")
	public void user_verify_new_account_created(String string) {
	    String actual = rPO.getNewAccountCreationSuccessMessage();
	    System.out.println(actual);
	    Assert.assertEquals(string, actual);
	}
	@When("User click on continue to navigate to account")
	public void user_click_on_continue_to_navigate_to_account() {
	    rPO.clickOnContinueAfterAccountCreated();
	}

	@When("User click on Register for an Affiliate Account link")
	public void user_click_on_register_for_an_affiliate_account_link() {
		rPO.clickOnAffiliateLink();
		logger.info("User Successfully clicked on register affiliate link");
	}

	@When("User fill affiliate form with below information")
	public void user_fill_affiliate_form_with_below_information(DataTable dataTable) {
		List<Map<String, String>> affiliateInfo = dataTable.asMaps(String.class, String.class);
		rPO.sendCompanyName(affiliateInfo.get(0).get("company"));
		rPO.sendWebsite(affiliateInfo.get(0).get("website"));
		rPO.sendTaxID(affiliateInfo.get(0).get("taxID"));
		rPO.sendPaymentMethod(affiliateInfo.get(0).get("paymentMethodType"));
		rPO.sendPayerName(affiliateInfo.get(0).get("payeeName"));
		logger.info("User Successfully Filled all of affiliate form fields !");
	}

	@When("User check on About us check box")
	public void user_check_on_about_us_check_box() {
		rPO.clickOnAboutUsCheckBox();
		logger.info("User Successfully checked about us check box !");
	}

	@When("User click on Continue button")
	public void user_click_on_continue_button() {
		rPO.clickOnContinueButton();
		logger.info("User Successfully clicked on continue button");
	}

	@Then("User should see a success message")
	public void user_should_see_a_success_message() {
		String expected = "Success: Your account has been successfully updated.";
		String actual = rPO.getAffiliateSuccessMessage();
		System.err.println("This is your actual success message -->" + actual);
		Assert.assertEquals(expected, actual);
		logger.info("User Successfully Verified he/she inserted all affiliate informations ");

	}

	@When("User click on ‘Edit your affiliate informationlink")
	public void user_click_on_edit_your_affiliate_informationlink() {
		rPO.clickOnEditAffiliate();
	}

	@When("user click on Bank Transfer radio button")
	public void user_click_on_bank_transfer_radio_button() {
		rPO.clickOnBankTransferRadioButton();
	}

	@When("User fill Bank information with below information")
	public void user_fill_bank_information_with_below_information(DataTable dataTable) {
		List<Map<String, String>> bankInfo = dataTable.asMaps(String.class, String.class);
		rPO.sendbankName(bankInfo.get(0).get("bankName"));
		rPO.sendbankBranch(bankInfo.get(0).get("abaNumber"));
		rPO.sendswiftNumber(bankInfo.get(0).get("swiftCode"));
		rPO.sendAccountName(bankInfo.get(0).get("accountName"));
		rPO.sendAccountNumber(bankInfo.get(0).get("accountNumber"));
	}

	@When("User click on ‘Edit your account information’ link")
	public void user_click_on_edit_your_account_information_link() {
		rPO.clickOnEditAccountInfo();
	}

	@When("User modify below information")
	public void user_modify_below_information(DataTable dataTable) {
		List<Map<String, String>> editInfo = dataTable.asMaps(String.class, String.class);
		rPO.sendNewFirstName(editInfo.get(0).get("firstname"));
		rPO.sendNewLastName(editInfo.get(0).get("lastName"));
		rPO.sendNewEmail(editInfo.get(0).get("email"));
		rPO.sendNewTelephone(editInfo.get(0).get("telephone"));
	}


	@When("User click on continue Button")
	public void user_click_on_continue_Button() {
		rPO.clickOnEditInfoContinueButton();
	}

	@Then("User should see a message {string}")
	public void user_should_see_a_message(String string) {
		String actual = rPO.getEditAccountInfoSuccessMessage();
		System.err.println("This is your actual success message -->" + actual);
		Assert.assertEquals(string, actual);
	}

}
