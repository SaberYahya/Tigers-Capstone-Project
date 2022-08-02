package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.Utils;

public class LaptopNoteBooksPageObject extends Base {
	
	public LaptopNoteBooksPageObject() {
	PageFactory.initElements(driver, this);
}
	@FindBy(xpath="//nav[@id='menu']//a[text()='Laptops & Notebooks']")
	private WebElement laptopNotebookTab;
	@FindBy(xpath="//nav[@id='menu']//a[text()='Show All Laptops & Notebooks']")
	private WebElement showAllLaptopNotebookTab;
	@FindBy(xpath="//div[@id='content']//a[text()='MacBook']")
	private WebElement macBookLink;
	@FindBy(xpath="//div[@id='product']//button[text()='Add to Cart']")
	private WebElement macBookAddToCartButton;
	@FindBy(xpath="//ul[@class='breadcrumb']//following-sibling::div[@class='alert alert-success alert-dismissible']") 
	private WebElement addedToCartSuccessMessage;
	@FindBy(xpath="(//div[@id='content']//td[text()='$602.00'])[2]")
	private WebElement valueToPay;
	@FindBy(xpath="//div[@class='container']//div[@id='cart']//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']//span")
	private WebElement macBookCartButton;
	@FindBy(xpath="//div[@id='cart']//p//a[1]") 
	private WebElement LinkToSeeItemsInMacbookCart;
	@FindBy(xpath="//button[@data-original-title='Remove']") 
	private WebElement removeButton;
	@FindBy(xpath="//div[@class='row']//ul//p[text()='Your shopping cart is empty!']") 
	private WebElement emptyMacbookCart;
	@FindBy(xpath="//p[@class='text-right']//a[1]") 
	private WebElement cartLinkInsideCart;
	
	public void clickOnLaptopTab() {
		Utils.doClick(laptopNotebookTab);
	}
	
	public void clickOnShowAllLaptop() {
		Utils.doClick(showAllLaptopNotebookTab);
	}
	
	public void clickOnMacbookItem() {
		Utils.doClick(macBookLink);
	}
	
	public void clickOnAddToCartMacbook() {
		Utils.doClick(macBookAddToCartButton);
	}
	
	public String getSuccessMessageMacbook() {
		String actual = Utils.getTextFromUI(addedToCartSuccessMessage);
		return actual;
	}
	
	public void clickOnMacbookCart() {
		
		Utils.clickWithActions(macBookCartButton);
		Utils.clickWithActions(cartLinkInsideCart);
	}
	
	public String getPriceOfMacbook() {
		String actual = Utils.getTextFromUI(valueToPay);
		return actual;
		
	}
	
	public void removeMacbookItem() {
		Utils.doClick(removeButton);
	}
	
	public String showEmptyCartMacbook() {
		Utils.doClick(macBookCartButton);
		String actual = Utils.getTextFromUI(emptyMacbookCart);
		return actual;
	}
	
	
	@FindBy(xpath="(//div[@id='content']//div[@class='button-group'])[2]//button[@data-original-title='Compare this Product']")
	private WebElement macbookComparisonButton;
	@FindBy(xpath="//div[@id='content']/div[4]/div[3]/div/div[2]/div[2]/button[@data-toggle='tooltip'][2]")
	//(//div[@id='content']//div[@class='button-group'])[3]//button[@data-toggle='tooltip'][2]
	//div[@id='content']/div[4]/div[3]/div/div[2]/div[2]/button[3]
	//div[@id='content']/div[4]/div[3]/div/div[2]/div[2]/button[@data-toggle='tooltip'][2]
	//div[@id='content']/div[4]/div[3]/div/div[2]/div[2]/button[@data-toggle='tooltip'][2]/i
	private WebElement macbookAirComparisonButton;
	@FindBy(xpath="//body//div[@class='alert alert-success alert-dismissible']") 
	private WebElement comparisonSuccessMessage;
	@FindBy(xpath="//div[@class='form-group']//a[@id='compare-total' and text()='Product Compare (2)']") 
	private WebElement compareLink;
	@FindBy(xpath="//h1[text()='Product Comparison']") 
	private WebElement comparisonHeaderText;
	
	
	public void clickOnMacbookComparisonButton() {
		Utils.doClick(macbookComparisonButton);
	}
	
	public void clickOnMacbookAirComparisonButton() throws InterruptedException {
		Utils.scrolldownPage();
		Thread.sleep(6000);
		Utils.hoverMouseOverElement(macbookAirComparisonButton);
		//Utils.doClick(macbookAirComparisonButton);
		Utils.clickWithActions(macbookAirComparisonButton);
	}
	
	public String getComparisonSuccessMessage() throws InterruptedException {
		Utils.scrollUpPage();
		Thread.sleep(5000);
		String actual = Utils.getTextFromUI(comparisonSuccessMessage);
		return actual;
	}
	public void clickOnCompareLink() {
		Utils.doClick(compareLink);
	}
	
	public String getComparisonHeaderText() {
		String actual = Utils.getTextFromUI(comparisonHeaderText);
		return actual;
	}
	
	
	@FindBy(xpath="(//div[@id=\"content\"]//div[@class='product-thumb'])[5]//button[@data-original-title='Add to Wish List']")
	private WebElement sonnyVaioWishListButton;
	@FindBy(xpath="//body//div[@class='alert alert-success alert-dismissible']")
	private WebElement alertMessage;
	
	public void clickOnHeartOfSonnyVaio() {
		Utils.doClick(sonnyVaioWishListButton);
	}
	
	public String getAlertTextOfSignUp() {
		String actual = Utils.getTextFromUI(alertMessage);
		return actual;
	}
	
	
	
	
	
	@FindBy(xpath="//div[@id='content']//a[text()='MacBook Pro']") 
	private WebElement macBookProLink;
	@FindBy(xpath="//div[@id='content']//h2[text()='$2,000.00']")
	private WebElement macBookProPrice;
	
	public void clickOnMacBookProLink() {
		Utils.doClick(macBookProLink);
	}
	
	public String getMacbookPrice() {
		String actual = Utils.getTextFromUI(macBookProPrice);
		return actual;
	}
	
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
}