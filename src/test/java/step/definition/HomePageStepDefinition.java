package step.definition;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.*;
import page.objects.HomePageObject;

public class HomePageStepDefinition extends Base{
	HomePageObject homePage = new HomePageObject();

	@Given("User is on Retail website")
	public void user_is_on_retail_website() {
		String expected = "TEST ENVIRONMENT";
		String actual = homePage.retailPage();
		Assert.assertEquals(expected, actual);
		logger.info("User Successfully Opened Retail Webpage");
	}

	@When("User click on Currency")
	public void user_click_on_currency() {
		homePage.clickOnCurrency();
		logger.info("Ueser Successfully clicked On Currency Button");
	}

	@When("User Chose Euro from dropdown")
	public void user_chose_euro_from_dropdown() {
		homePage.chooseEuro();
		logger.info("User Successfully chose Euro currency ");
	}

	@Then("currency value should change to Euro")
	public void currency_value_should_change_to_euro() {
		String expected = "€";
		String actual = homePage.currencyType();
		Assert.assertEquals(expected, actual);
		logger.info("User Successfully changed payment currency to Euro");
	}
	
	@When("User click on shopping cart")
	public void User_click_on_shopping_cart() throws InterruptedException{
		homePage.clickOnCart();
		logger.info("User clicked on Shopping cart Icon");
	}
	
	@Then("“Your shopping cart is empty!” message should display")
	public void your_shopping_cart_is_empty_message_should_display() {
		String expected = "Your shopping cart is empty!";
		String actual = homePage.emptyShoppingCartMessage();
		Assert.assertEquals(expected,actual);
		logger.info("User received cart empty message");
	}
	

}
