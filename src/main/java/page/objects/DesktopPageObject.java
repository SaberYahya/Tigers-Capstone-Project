package page.objects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.Utils;

public class DesktopPageObject extends Base {
	
	public DesktopPageObject() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//nav[@id='menu']//a[text()='Desktops']")
	private WebElement desktopLink;
	@FindBy(xpath="//nav[@id='menu']//a[text()='Show All Desktops']")
	private WebElement showAllDesktopLink;
	@FindBy(tagName = "img")
	private List<WebElement> items;
	@FindBy(xpath="//div[@id='product-category']//div[@class='row']//child::a[text()='Desktops (13)']")
	private WebElement allItemsLink;
	
	/**
	 * this method will hover mouse on desktop link
	 */
	public void clickOnDesktops() {
		Utils.hoverMouseOverElement(desktopLink);
	}
	/**
	 * this method will click on show all desktop link
	 */
	public void clickOnShowAllDesktop() {
		Utils.doClick(showAllDesktopLink);
	}
	/**
	 * this method will get the present text of all presence Items in top
	 * of the right table of page
	 * @return the return type of this method is String of all present Items in that table
	 */
//	public String getAllItemsText() {
//		String actual = Utils.getTextFromUI(allItemsLink);
//		return actual;
//	}
	/**
	 * this method will return the present text of all presence Items in top
	 * of the right table of page as a list
	 * @return is list of web elements
	 */
	public List<WebElement> desktopItems(){
		List<WebElement> desktopItems = items;
		return desktopItems;
	}
	
	@FindBy(xpath="//div[@id='content']//div[@class='row'][4]//div[contains(@class,'product-layout')][3]//button[@onclick=\"cart.add('47', '1');\"]")
	private WebElement addHPLPToCart;
	@FindBy(xpath="//div[@id='content']//input[@name='quantity']")
	private WebElement HpQuantityField;
	@FindBy(xpath="//div[@id='product']//button[@id='button-cart']")
	private WebElement addToCartButton;
	@FindBy(xpath="//div[@id='product-product']//div[contains(@class,'alert-success')]")
	private WebElement successMessage;
	/**
	 * this method will click on add HPLP3065 to cart Button
	 * and navigate you to a new page where you can see
	 * more detail of this product
	 */
	public void clickOnAddToCartOfHP() {
		Utils.doClick(addHPLPToCart);
	}
	/**
	 * this method will select the quantity of HPLP3065 product 
	 * @param value is the number of your wanted quantity
	 */
	public void selectQuantity(int value) {
		Utils.sendKeysOfInteger(HpQuantityField, value);
	}
	/**
	 * this method will click on last add to cart button and 
	 * order of HPLP3065 will be completed
	 */
	public void clickOnAddToCartButton() {
		Utils.doClick(addToCartButton);
	}
	/**
	 * this method will get success message of ordering HPLP3065 
	 * product and will return it as String
	 * @return
	 */
	public String getSuccessText() {
		String actual = Utils.getTextFromUI(successMessage);
		return actual;
	}
	
	@FindBy(xpath="//div[@id='content']//div[@class='row'][4]//div[contains(@class,'product-layout')][2]//button[@onclick=\"cart.add('30', '1');\"]")
	private WebElement addCanonToCart;
	@FindBy(xpath="//div[@id='product']//select")
	private WebElement colorDD;
	@FindBy(xpath="//div[@id='product']//select//option[@value='15']")
	private WebElement choseRedFormDD;
	@FindBy(xpath="//div[@id='content']//div[@id='product']//input[@id='input-quantity']")
	private WebElement CanonQuantityField;
	@FindBy(xpath="//div[@id='product']//button[@id='button-cart']")
	private WebElement canonAddToCardButton;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") ////div[@id='product-product']//ul[@class='breadcrumb']//following-sibling::div[1]
	private WebElement canonSuccessMessage;
	/**
	 * this method will click on add Canon EOS 5D Camera to cart Button
	 * and navigate you to a new page where you can see
	 * more detail of this product
	 */
	public void clickCanonAddToCartLink() {
		Utils.doClick(addCanonToCart);
	}
	/**
	 * this method will click on color drop down where you can select your 
	 * ordered Canon EOS 5D Camera's color
	 */
	public void clickOnColorDD() {
		Utils.doClick(colorDD);
		Utils.doClick(choseRedFormDD);
	}
	/**
	 * * this method will select the quantity of Canon EOS 5D Camera product 
	 * @param value is the number of your wanted quantity
	 */
	public void selectCanonQuantity(int value) {
		Utils.sendKeysOfInteger(CanonQuantityField, value);
	}
	/**
	 * this method will click on last add to cart button and 
	 * order of Canon EOS 5D Camera will be completed
	 */
	public void clickCanonAddToCartButton() {
		Utils.doClick(canonAddToCardButton);
	}
	/**
	 * this method will get success message of ordering Canon EOS 5D Camera
	 * product and will return it as String
	 * @return
	 */
	public String getSuccessTextCanon() {
		String actual = Utils.getTextFromUI(canonSuccessMessage);
		return actual;
	}
	
	@FindBy(xpath="//div[@class='image']//img[@alt='Canon EOS 5D Camera']")
	private WebElement canonPictureLink;
	@FindBy(xpath="//div[@id='content']//a[text()='Reviews (0)']")
	private WebElement reviewTab;
	@FindBy(xpath="//div[@id='content']//input[@id='input-name']")
	private WebElement reviewerNameField;
	@FindBy(xpath="//div[@id='content']//div[@class='tab-content']//form//textarea")
	private WebElement reviewInputBox;
	@FindBy(xpath="//input[@type='radio']")
	private List<WebElement> RateRadioButtons;
	@FindBy(xpath="//div[@id='content']//input[contains(@value,'5')]")
	private WebElement goodRateRadioButton;
	@FindBy(xpath="//button[@id='button-review']")
	private WebElement reviewButton;
	@FindBy(xpath="//div[text()=' Thank you for your review. It has been submitted to the webmaster for approval.']")
	private WebElement thanksMessageForReview;
	/**
	 * this method will click on  Canon EOS 5D Camera picture
	 * and navigate you to a new page where you can see
	 * more detail of this product
	 */
	public void canonPictureClick() {
		Utils.doClick(canonPictureLink);
	}
	/**
	 * this method will click on review tab on Canon EOS 5D Camera
	 * description page  
	 */
	public void reviewLinkClick() {
		Utils.doClick(reviewTab);
	}
	
	/**
	 * this method will take an string as parameter and will 
	 * send it to your review field
	 * @param name
	 */
	public void sendNameForReview(String name ) {
		Utils.sendKeys(reviewerNameField, name);
	}
	
	/**
	 * this method will take an string as parameter and will 
	 * send it to your review box
	 * @param reviewText
	 */
	public void sendTextForReview(String reviewText ) {
		Utils.sendKeys(reviewInputBox, reviewText);
	}
	
	/**
	 * this method will take your review value as string 
	 * and will loop through all available radio buttons 
	 * and will click on that radio button that matches with
	 * your review value
	 * @param rateValue
	 */
	public void ratingOptions(String rateValue){
		List<WebElement> reviewRate = RateRadioButtons;
		for(WebElement rate: reviewRate) {
			if(rate.getAttribute("value").equalsIgnoreCase(rateValue.trim())) {
				rate.click();
				break;
			}
		}
		
	}
	
	/**
	 * this method will click on continue button of review section
	 * @param name
	 */
	public void clickOnReviewButton() {
		Utils.doClick(reviewButton);
	}
	
	/**
	 * this method will return the text of success from UI after
	 * your review successfully affected
	 * @return
	 */
	public String getReagardText() {
		String actual = Utils.getTextFromUI(thanksMessageForReview);
		return actual;
	}
	
}
