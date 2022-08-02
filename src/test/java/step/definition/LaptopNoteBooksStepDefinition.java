package step.definition;

import core.Base;
import io.cucumber.java.en.*;
import org.junit.Assert;
import page.objects.LaptopNoteBooksPageObject;

public class LaptopNoteBooksStepDefinition extends Base {
	
	LaptopNoteBooksPageObject LNObj = new LaptopNoteBooksPageObject();
	
	@When("User click on Laptop &NoteBook tab")
	public void user_click_on_laptop_note_book_tab() {
	    LNObj.clickOnLaptopTab();
	    logger.info("User clicked on laptop and note book tap");
	}
	@When("User click on Show all Laptop &NoteBook option")
	public void user_click_on_show_all_laptop_note_book_option() {
	    LNObj.clickOnShowAllLaptop();
	    logger.info("User clicked on Show all laptop and note book link");
	}
	@When("User click on MacBook  item")
	public void user_click_on_mac_book_item() {
	    LNObj.clickOnMacbookItem();
	    logger.info("User clicked on Macbook link");
	}
	@When("User click add to Cart button of macbook")
	public void user_click_add_to_cart_button_of_macbook() {
	    LNObj.clickOnAddToCartMacbook();
	    logger.info("User clicked on add to cart");
	}
	@Then("User should see a message ‘Success: You have added MacBook to your shopping cart!’")
	public void user_should_see_a_message_success_you_have_added_mac_book_to_your_shopping_cart() {
		String expected ="Success: You have added MacBook to your shopping cart!";
	    String actual = LNObj.getSuccessMessageMacbook().substring(0, 54);
	    Assert.assertEquals(expected, actual);
	    logger.info("Macbook Successfully added to cart shows, Verified !");
	}
	
	@Then("User click on cart option")
	public void user_click_on_cart_option() {
	    LNObj.clickOnMacbookCart();
	    logger.info("User Clicked On Cart Option");
	}
	
	@Then("User should see {int} Item\\(s){int}.00showed to the cart")
	public void user_should_see_tem_s_00showed_to_the_cart(Integer int1, Integer int2) {
		String expected = "$602.00";
	    String actual = LNObj.getPriceOfMacbook();
	    Assert.assertEquals(expected, actual);
	    logger.info("Macbook Price of $602.00 Verified !");
	}
	
	@Then("user click on red X button to remove the item from cart")
	public void user_click_on_red_x_button_to_remove_the_item_from_cart() {
	    LNObj.removeMacbookItem();
	    logger.info("User Removed Macbook Item from cart !");
	}
	@Then("item should be removed and cart should show {int} item\\(s)")
	public void item_should_be_removed_and_cart_should_show_item_s(Integer int1) {
	    String expected = "Your shopping cart is empty!";
	    String actual = LNObj.showEmptyCartMacbook();
	    System.err.println(actual);
	    Assert.assertEquals(expected, actual);
	    logger.info("User Verified Cart is Empty!");
	}
	
	
	@When("User click on product comparison icon on ‘MacBook’")
	public void user_click_on_product_comparison_icon_on_mac_book() {
	    LNObj.clickOnMacbookComparisonButton();
	    logger.info("User Successfully Clicked on MacBook Comparison Icon!");
	}
	@When("User click on product comparison icon on ‘MacBook Air’")
	public void user_click_on_product_comparison_icon_on_mac_book_air() throws Exception {
		LNObj.clickOnMacbookAirComparisonButton();
		logger.info("User Successfully Clicked on MacBook Air Comparison Icon!");
	}
	@Then("User should see a message ‘Success: You have added MacBook Air to your product comparison!’")
	public void user_should_see_a_message_success_you_have_added_mac_book_air_to_your_product_comparison() throws InterruptedException {
		String expected ="Success: You have added MacBook Air to your product comparison!";
	    String actual = LNObj.getComparisonSuccessMessage().substring(0, 63);
	    System.err.println(actual);
	    Assert.assertEquals(expected,actual);
	    logger.info("Successfull Message Verified!");
	}
	@Then("User click on Product comparison link")
	public void user_click_on_product_comparison_link() {
	    LNObj.clickOnCompareLink();
	    logger.info("User Successfully Clicked on Comparison Link!");
	}
	@Then("User should see Product Comparison Chart")
	public void user_should_see_product_comparison_chart() {
		String expected = "Product Comparison";
	    String actual = LNObj.getComparisonHeaderText();
	    System.out.println(actual);
	    Assert.assertEquals(expected, actual);
	    logger.info("User Successfully Verified Product Comparison Text !");
	}
	
	@When("User click on heart icon to add ‘Sony VaIO’ laptop to wish list")
	public void user_click_on_heart_icon_to_add_sony_va_io_laptop_to_wish_list() {
	    LNObj.clickOnHeartOfSonnyVaio();
	    logger.info("User Successfully Clicked on sony Vaio heart Icon!");
	}
	
	@Then("User should get a message ‘You must login or create an account to save Sony VAIO to your wish list!’")
	public void user_should_get_a_message_you_must_login_or_create_an_account_to_save_sony_vaio_to_your_wish_list() {
	    String expected = "You must login or create an account to save Sony VAIO to your wish list!";
	    String actual = LNObj.getAlertTextOfSignUp().substring(0, 72);
	    System.err.println(actual);
	    Assert.assertEquals(expected, actual);
	    logger.info("User Successfully Verified Sign Up Alert Text !");
	}
	
	
	@When("User click on ‘MacBook Pro’ item")
	public void user_click_on_mac_book_pro_item() {
	    LNObj.clickOnMacBookProLink();
	    logger.info("User clicked on Macbook Pro link");
	}
	@Then("User should see  ‘${double}’ price tag is present on UI.")
	public void user_should_see_$_price_tag_is_present_on_ui(Double double1) {
	    String expected = "$2,000.00";
	    String actual = LNObj.getMacbookPrice();
	    System.out.println(actual);
	    Assert.assertEquals(expected, actual);
	    logger.info("User Successfully Verified MacBook Pro Price!");
	}

}
