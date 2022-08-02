package step.definition;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import page.objects.DesktopPageObject;

public class DesktopPageStepDefinition extends Base {

	DesktopPageObject desktopObj = new DesktopPageObject();

	@When("User click on Desktops tab")
	public void user_click_on_desktops_tab() {
		desktopObj.clickOnDesktops();
		logger.info("User clicked on Desktops tab successfully!");
	}

	@When("User click on Show all desktops")
	public void user_click_on_show_all_desktops() {
		desktopObj.clickOnShowAllDesktop();
		logger.info("User clicked on Show all desktops link successfully!");
	}
	
	@Then("User should see all items are present in Desktop page")
	public void user_should_see_all_items_are_present_in_desktop_page() {
		List<WebElement> AllDesktopElements = desktopObj.desktopItems();
		for(WebElement item : AllDesktopElements ) {
			Assert.assertTrue(item.isDisplayed());
			logger.info(item.getAttribute("title")+ ": Presence approved !");
		}
	}

//	@Then("User should see all items are present in Desktop page")
//	public void user_should_see_all_items_are_present_in_desktop_page() {
//		String expected = "Desktops (13)";
//		String actual = desktopObj.getAllItemsText();
//		Assert.assertEquals(expected, actual);
//		logger.info("All desktop Items verified successfully!");
//	}
	
	@When("User click  ADD TO CART option on HP LP3065item")
	public void user_click_add_to_cart_option_on_hp_lp3065item() {
	    desktopObj.clickOnAddToCartOfHP();
	    logger.info("User Clicked on add to cart of HP...");
	}
	
	@When("User select quantity {int}")
	public void user_select_quantity(Integer int1) {
	   desktopObj.selectQuantity(int1);
	   logger.info("User successfully selected quantity");
	}
	
	@When("User click add to Cart button")
	public void user_click_add_to_cart_button() {
		desktopObj.clickOnAddToCartButton();
		logger.info("User Successfully added item to cart");
	}
	
	@Then("User should see a message ‘Success: you have added HP LP {int} to your Shopping cart!’")
	public void user_should_see_a_message_success_you_have_added_hp_lp_to_your_shopping_cart(Integer int1) {
	    String expected ="Success: You have added HP LP3065 to your shopping cart!";
	    String actual = desktopObj.getSuccessText().substring(0, 56);
	    System.err.println("This is your actual output String from UI -->"+actual);
	    Assert.assertEquals(expected, actual);
	    logger.info("Success Message Verified!");
	}
	
	//Success: You have added Canon EOS 5D Camera to your shopping cart!
	@When("User click  ADD TO CART option on Canon EOS 5Ditem")
	public void user_click_add_to_cart_option_on_canon_eos_5ditem() {
		desktopObj.clickCanonAddToCartLink();
	}
	
	@When("User select color from dropdown Red")
	public void user_select_color_from_dropdown_red() {
		desktopObj.clickOnColorDD();
		
	}
	
	@When("User select quantity {int} for Canon")
	public void user_select_quantity_for_canon(Integer int1) {
	    desktopObj.selectCanonQuantity(int1);
	}
	
	@When("User click add to Cart button Of Canon")
	public void user_click_add_to_cart_button_of_canon() {
	    desktopObj.clickCanonAddToCartButton();
	}

	@Then("User should see a message ‘Success: You have added Canon EOS 5D to your shopping cart!’")
	public void user_should_see_a_message_success_you_have_added_canon_eos_5d_to_your_shopping_cart() {
		String expected = "Success: You have added Canon EOS 5D Camera to your shopping cart!";
		String actual = desktopObj.getSuccessTextCanon().substring(0,66);
		System.err.println("This is your actual output String from UI -->"+actual);
		Assert.assertEquals(expected, actual);
	}
	
	@When("User click on Canon EOS 5D item")
	public void user_click_on_canon_eos_5d_item() {
		desktopObj.canonPictureClick();
		logger.info("User clicked on canon camera Picture");
	}
	@When("User click on write a review link")
	public void user_click_on_write_a_review_link() {
	    desktopObj.reviewLinkClick();
	    logger.info("User clicked on review Link");
	}
	@When("user fill the review information with below information")
	public void user_fill_the_review_information_with_below_information(DataTable dataTable) {
		List<Map<String,String>> data = dataTable.asMaps(String.class,String.class);
		desktopObj.sendNameForReview(data.get(0).get("yourname"));
		desktopObj.sendTextForReview(data.get(0).get("yourReview"));
		desktopObj.ratingOptions(data.get(0).get("Rating"));
		logger.info("User filled review Fields");
	}
	
	@When("User click on Continue Button")
	public void user_click_on_continue_button() {
	    desktopObj.clickOnReviewButton();
	    logger.info("User clicked on continue button !");
	}
	
	@Then("User should see a message with ‘Thank you for your review. It has been submitted to the webmaster for approval.”                                     |")
	public void user_should_see_a_message_with_thank_you_for_your_review_it_has_been_submitted_to_the_webmaster_for_approval() {
		String expected = "Thank you for your review. It has been submitted to the webmaster for approval.";
	    String actual = desktopObj.getReagardText();
	    Assert.assertEquals(expected, actual);
	    logger.info("User successfully verified review response message!");
	}
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
