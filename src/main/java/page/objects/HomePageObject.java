package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import core.Base;
import utilities.Utils;

public class HomePageObject extends Base {
	public HomePageObject() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class='btn-group']//i")
	private WebElement currencyButton;
	@FindBy(xpath = "//div[@class='pull-left']//ul//button[text()='€ Euro']")
	private WebElement euroCurrency;
	@FindBy(xpath = "//div[@class='btn-group']//strong")
	private WebElement euroIsSelected;
	@FindBy(xpath = "//div[@class='pull-left']//ul//button[text()='£ Pound Sterling']")
	private WebElement poundCurrency;
	@FindBy(xpath = "//div[@class='pull-left']//ul//button[text()='$ US Dollar']")
	private WebElement UsDollarCurrency;
	@FindBy(xpath = "//ul[@class='list-inline']//li//span[text()='123456789']")
	private WebElement tekSchoolPhoneNumber;
	@FindBy(xpath = "//div[@id='top-links']//ul[@class='list-inline']//li[@class='dropdown']//span[text()='My Account']")
	private WebElement myAccountLink;
	@FindBy(xpath = "(//div[@id='top-links']//ul[@class='list-inline']//li[@class='dropdown']//following-sibling::li)[3]//span")
	private WebElement wishListLink;
	@FindBy(xpath = "//a[@title='Shopping Cart']//i")
	private WebElement shoppingCartLink;
	@FindBy(xpath="//div[@id='content']//p")
	private WebElement emptyShoppingCart;
	@FindBy(xpath = "//div[@id='logo']//child::a")
	private WebElement testEnvironmentText;
	@FindBy(xpath = "//div[@id='search']//child::input")
	private WebElement searchField;
	@FindBy(xpath = "//div[@id='search']//span//button//i")
	private WebElement searchFieldMagnifierIcon;
	@FindBy(xpath = "//div[@id='cart']//button[contains(@class,'btn-inverse')]//span[@id='cart-total']")
	private WebElement totalCartButton;
	@FindBy(xpath = "//div[@class='container']//nav[@id='menu']//descendant::a[text()='Desktops']")
	private WebElement desktopsLinkDD;
	@FindBy(xpath = "//li[@class='dropdown']//a[text()='PC (0)']")
	private WebElement pcLinkInDesktopDD;
	@FindBy(xpath = "//li[@class='dropdown']//a[text()='Mac (1)']")
	private WebElement macLinkInDesktopDD;
	@FindBy(xpath = "//li[@class='dropdown']//a[text()='Show All Desktops']")
	private WebElement showAllInDesktopDD;
	@FindBy(xpath = "//li[@class='dropdown']//a[text()='Laptops & Notebooks']")
	private WebElement laptopNotebookLinkDD;
	@FindBy(xpath = "//li[@class='dropdown']//a[text()='Macs (0)']")
	private WebElement macLinkInLaptopNotebookDD;
	@FindBy(xpath = "//li[@class='dropdown']//a[text()='Windows (0)']")
	private WebElement windowsLinkInLaptopNotebookDD;
	@FindBy(xpath = "//li[@class='dropdown']//a[text()='Show All Laptops & Notebooks']")
	private WebElement showAllInLaptopNotebookDD;
	@FindBy(xpath = "//li[@class='dropdown']//a[text()='Components']")
	private WebElement componentsLinkDD;
	@FindBy(xpath = "//li[@class='dropdown']//a[text()='Mice and Trackballs (0)']")
	private WebElement miceTrackballInComponentsDD;
	@FindBy(xpath = "//li[@class='dropdown']//a[text()='Monitors (2)']")
	private WebElement monitorsInComponentsDD;
	@FindBy(xpath = "//li[@class='dropdown']//a[text()='Printers (0)']")
	private WebElement printersInComponentsDD;
	@FindBy(xpath = "//li[@class='dropdown']//a[text()='Scanners (0)']")
	private WebElement scannersInComponentsDD;
	@FindBy(xpath = "//li[@class='dropdown']//a[text()='Web Cameras (0)']")
	private WebElement webCamerasInComponentsDD;
	@FindBy(xpath = "//li[@class='dropdown']//a[text()='Show All Components']")
	private WebElement showAllInComponentsDD;
	@FindBy(xpath = "//div[@class='navbar-header']//following-sibling::div//ul[contains(@class,'navbar')]//a[text()='Tablets']")
	private WebElement tabletsLink;
	@FindBy(xpath = "//div[@class='navbar-header']//following-sibling::div//ul[contains(@class,'navbar')]//a[text()='Software']")
	private WebElement softwareLink;
	@FindBy(xpath = "//div[@class='navbar-header']//following-sibling::div//ul[contains(@class,'navbar')]//a[text()='Phones & PDAs']")
	private WebElement phonesPdasLink;
	@FindBy(xpath = "//div[@class='navbar-header']//following-sibling::div//ul[contains(@class,'navbar')]//a[text()='Cameras']")
	private WebElement camerasLinkDD;
	@FindBy(xpath = "//li[@class='dropdown']//a[text()='Canon (1)']")
	private WebElement canonInCamerasDD;
	@FindBy(xpath = "//li[@class='dropdown']//a[text()='Nikon (1)']")
	private WebElement nikonInCamerasDD;
	@FindBy(xpath = "//li[@class='dropdown']//a[text()='Show All Cameras']")
	private WebElement showAllInCamerasDD;
	@FindBy(xpath = "//li[@class='dropdown']//a[text()='MP3 Players']")
	private WebElement mp3PlayersLinkDD;
	@FindBy(xpath = "//li[@class='dropdown']//a[text()='test 11 (0)']")
	private WebElement test11InMp3PlayerDD;
	@FindBy(xpath = "//li[@class='dropdown']//a[text()='test 12 (0)']")
	private WebElement test12InMp3PlayerDD;
	@FindBy(xpath = "//li[@class='dropdown']//a[text()='test 15 (0)']")
	private WebElement test15InMp3PlayerDD;
	@FindBy(xpath = "//li[@class='dropdown']//a[text()='test 16 (0)']")
	private WebElement test16InMp3PlayerDD;
	@FindBy(xpath = "//li[@class='dropdown']//a[text()='test 17 (0)']")
	private WebElement test17InMp3PlayerDD;
	@FindBy(xpath = "//li[@class='dropdown']//a[text()='test 18 (0)']")
	private WebElement test18InMp3PlayerDD;
	@FindBy(xpath = "//li[@class='dropdown']//a[text()='test 19 (0)']")
	private WebElement test19InMp3PlayerDD;
	@FindBy(xpath = "//li[@class='dropdown']//a[text()='test 20 (0)']")
	private WebElement test20InMp3PlayerDD;
	@FindBy(xpath = "//li[@class='dropdown']//a[text()='test 21 (0)']")
	private WebElement test21InMp3PlayerDD;
	@FindBy(xpath = "//li[@class='dropdown']//a[text()='test 22 (0)']")
	private WebElement test22InMp3PlayerDD;
	@FindBy(xpath = "//li[@class='dropdown']//a[text()='test 23 (0)']")
	private WebElement test23InMp3PlayerDD;
	@FindBy(xpath = "//li[@class='dropdown']//a[text()='test 24 (0)']")
	private WebElement test24InMp3PlayerDD;
	@FindBy(xpath = "//li[@class='dropdown']//a[text()='test 4 (0)']")
	private WebElement test4InMp3PlayerDD;
	@FindBy(xpath = "//li[@class='dropdown']//a[text()='test 5 (0)']")
	private WebElement test5InMp3PlayerDD;
	@FindBy(xpath = "//li[@class='dropdown']//a[text()='test 6 (0)']")
	private WebElement test6InMp3PlayerDD;
	@FindBy(xpath = "//li[@class='dropdown']//a[text()='test 7 (0)']")
	private WebElement test7InMp3PlayerDD;
	@FindBy(xpath = "//li[@class='dropdown']//a[text()='test 8 (0)']")
	private WebElement test8InMp3PlayerDD;
	@FindBy(xpath = "//li[@class='dropdown']//a[text()='test 9 (0)']")
	private WebElement test9InMp3PlayerDD;
	@FindBy(xpath = "//ul[@class='breadcrumb']//i")
	private WebElement homeIconLink;
	@FindBy(xpath = "//ul[@class='breadcrumb']//a[text()='Search']")
	private WebElement searchLink;
	@FindBy(xpath = "//div[@id='content']//h1")
	private WebElement searchHeader1;
	@FindBy(xpath = "//div[@id='content']//label")
	private WebElement searchCriteriaLabel;
	@FindBy(xpath = "//div[@id='content']//div[@class='row']//child::input[@id='input-search']")
	private WebElement searchFieldBellowSearchCriteria;
	@FindBy(xpath = "//div[@id='content']//div[@class='row']//child::select[@name='category_id']")
	private WebElement searchOption;
	@FindBy(xpath = "//div[@id='content']//div[@class='row']//child::select[@name='category_id']//child::option[1]")
	private WebElement selectAllCategory;
	@FindBy(xpath = "//div[@id='content']//div[@class='row']//child::select[@name='category_id']//child::option[2]")
	private WebElement selectDesktops;
	@FindBy(xpath = "//div[@id='content']//div[@class='row']//child::select[@name='category_id']//child::option[3]")
	private WebElement selectPc;
	@FindBy(xpath = "//div[@id='content']//div[@class='row']//child::select[@name='category_id']//child::option[4]")
	private WebElement selectMac;
	@FindBy(xpath = "//div[@id='content']//div[@class='row']//child::select[@name='category_id']//child::option[5]")
	private WebElement selectLaptopsNotebooks;
	@FindBy(xpath = "//div[@id='content']//div[@class='row']//child::select[@name='category_id']//child::option[6]")
	private WebElement selectMacs;
	@FindBy(xpath = "//div[@id='content']//div[@class='row']//child::select[@name='category_id']//child::option[7]")
	private WebElement selectWindows;
	@FindBy(xpath = "//div[@id='content']//div[@class='row']//child::select[@name='category_id']//child::option[8]")
	private WebElement selectComponents;
	@FindBy(xpath = "//div[@id='content']//div[@class='row']//child::select[@name='category_id']//child::option[9]")
	private WebElement selectMiceTrackballs;
	@FindBy(xpath = "//div[@id='content']//div[@class='row']//child::select[@name='category_id']//child::option[10]")
	private WebElement selectMonitors;
	@FindBy(xpath = "//div[@id='content']//div[@class='row']//child::select[@name='category_id']//child::option[11]")
	private WebElement selecttest1;
	@FindBy(xpath = "//div[@id='content']//div[@class='row']//child::select[@name='category_id']//child::option[12]")
	private WebElement selecttest2;
	@FindBy(xpath = "//div[@id='content']//div[@class='row']//child::select[@name='category_id']//child::option[13]")
	private WebElement selectPrinters;
	@FindBy(xpath = "//div[@id='content']//div[@class='row']//child::select[@name='category_id']//child::option[14]")
	private WebElement selectScanners;
	@FindBy(xpath = "//div[@id='content']//div[@class='row']//child::select[@name='category_id']//child::option[15]")
	private WebElement selectWebCameras;
	@FindBy(xpath = "//div[@id='content']//div[@class='row']//child::select[@name='category_id']//child::option[16]")
	private WebElement selectTablets;
	@FindBy(xpath = "//div[@id='content']//div[@class='row']//child::select[@name='category_id']//child::option[17]")
	private WebElement selectSoftware;
	@FindBy(xpath = "//div[@id='content']//div[@class='row']//child::select[@name='category_id']//child::option[18]")
	private WebElement selectPhonesPDAs;
	@FindBy(xpath = "//div[@id='content']//div[@class='row']//child::select[@name='category_id']//child::option[19]")
	private WebElement selectCameras;
	@FindBy(xpath = "//div[@id='content']//div[@class='row']//child::select[@name='category_id']//child::option[20]")
	private WebElement selectCanon;
	@FindBy(xpath = "//div[@id='content']//div[@class='row']//child::select[@name='category_id']//child::option[21]")
	private WebElement selectNikon;
	@FindBy(xpath = "//div[@id='content']//div[@class='row']//child::select[@name='category_id']//child::option[22]")
	private WebElement selectMp3Players;
	@FindBy(xpath = "//div[@id='content']//div[@class='row']//child::select[@name='category_id']//child::option[23]")
	private WebElement selectTest11;
	@FindBy(xpath = "//div[@id='content']//div[@class='row']//child::select[@name='category_id']//child::option[24]")
	private WebElement selectTest12;
	@FindBy(xpath = "//div[@id='content']//div[@class='row']//child::select[@name='category_id']//child::option[25]")
	private WebElement selectTest15;
	@FindBy(xpath = "//div[@id='content']//div[@class='row']//child::select[@name='category_id']//child::option[26]")
	private WebElement selectTest16;
	@FindBy(xpath = "//div[@id='content']//div[@class='row']//child::select[@name='category_id']//child::option[27]")
	private WebElement selectTest17;
	@FindBy(xpath = "//div[@id='content']//div[@class='row']//child::select[@name='category_id']//child::option[28]")
	private WebElement selectTest18;
	@FindBy(xpath = "//div[@id='content']//div[@class='row']//child::select[@name='category_id']//child::option[29]")
	private WebElement selectTest19;
	@FindBy(xpath = "//div[@id='content']//div[@class='row']//child::select[@name='category_id']//child::option[30]")
	private WebElement selectTest20;
	@FindBy(xpath = "//div[@id='content']//div[@class='row']//child::select[@name='category_id']//child::option[31]")
	private WebElement selectTest25;
	@FindBy(xpath = "//div[@id='content']//div[@class='row']//child::select[@name='category_id']//child::option[32]")
	private WebElement selectTest21;
	@FindBy(xpath = "//div[@id='content']//div[@class='row']//child::select[@name='category_id']//child::option[33]")
	private WebElement selectTest22;
	@FindBy(xpath = "//div[@id='content']//div[@class='row']//child::select[@name='category_id']//child::option[34]")
	private WebElement selectTest23;
	@FindBy(xpath = "//div[@id='content']//div[@class='row']//child::select[@name='category_id']//child::option[35]")
	private WebElement selectTest24;
	@FindBy(xpath = "//div[@id='content']//div[@class='row']//child::select[@name='category_id']//child::option[36]")
	private WebElement selectTest4;
	@FindBy(xpath = "//div[@id='content']//div[@class='row']//child::select[@name='category_id']//child::option[37]")
	private WebElement selectTest5;
	@FindBy(xpath = "//div[@id='content']//div[@class='row']//child::select[@name='category_id']//child::option[38]")
	private WebElement selectTest6;
	@FindBy(xpath = "//div[@id='content']//div[@class='row']//child::select[@name='category_id']//child::option[39]")
	private WebElement selectTest7;
	@FindBy(xpath = "//div[@id='content']//div[@class='row']//child::select[@name='category_id']//child::option[40]")
	private WebElement selectTest8;
	@FindBy(xpath = "//div[@id='content']//div[@class='row']//child::select[@name='category_id']//child::option[41]")
	private WebElement selectTest9;
	@FindBy(xpath = "//div[@id='content']//p//label[@class='checkbox-inline']")
	private WebElement searchDescriptionCheckBox;
	@FindBy(xpath = "//div[@class='container']//a[text()='About Us']")
	private WebElement aboutUsLink;
	@FindBy(xpath = "//div[@class='container']//a[text()='Delivery Information']")
	private WebElement deliveryInfoLink;
	@FindBy(xpath = "//div[@class='container']//a[text()='Privacy Policy']")
	private WebElement privacyPolicyLink;
	@FindBy(xpath = "//div[@class='container']//a[text()='Terms & Conditions']")
	private WebElement termsConditionsLink;
	@FindBy(xpath = "//div[@class='container']//a[text()='Contact Us']")
	private WebElement contactUsLink;
	@FindBy(xpath = "//div[@class='container']//a[text()='Returns']")
	private WebElement returnsLink;
	@FindBy(xpath = "//div[@class='container']//a[text()='Site Map']")
	private WebElement siteMapLink;
	@FindBy(xpath = "//div[@class='container']//a[text()='Brands']")
	private WebElement brandsLink;
	@FindBy(xpath = "//div[@class='container']//a[text()='Gift Certificates']")
	private WebElement giftCertificateLink;
	@FindBy(xpath = "//div[@class='container']//a[text()='Affiliate']")
	private WebElement affiliateLink;
	@FindBy(xpath = "//div[@class='container']//a[text()='Specials']")
	private WebElement specialsLink;
	@FindBy(xpath = "//div[@class='container']//a[text()='My Account']")
	private WebElement myAccountLinkPageBottom;
	@FindBy(xpath = "//div[@class='container']//a[text()='Order History']")
	private WebElement orderHistoryLink;
	@FindBy(xpath = "//div[@class='container']//a[text()='Wish List']")
	private WebElement wishListLinkOnBottom;
	@FindBy(xpath = "//div[@class='container']//a[text()='Newsletter']")
	private WebElement newsLetterLink;
	
	/**
	 * this method will get text of Test Environment from UI and will return it
	 * as String  
	 * @return
	 */
	public String retailPage() {
		String actual = Utils.getTextFromUI(testEnvironmentText);
		return actual;
	}
	
	/**
	 * this method will click on currency button on the UI
	 */
	public void clickOnCurrency() {
		Utils.doClick(currencyButton);
	}
	
	/**
	 * this method will select Euro currency type from drop down of currencies 
	 */
	public void chooseEuro() {
		Utils.doClick(euroCurrency);
	}
	
	/**
	 * this method will return Euro currency icon as String
	 * @return
	 */
	public String currencyType() {
		String actual = Utils.getTextFromUI(euroIsSelected);
		return actual;
	}
	
	/**
	 * this method will click on shopping cart link
	 */
	public void clickOnCart() {
		Utils.doClick(shoppingCartLink);
	}
	
	/**
	 * this method will return shopping cart status as String
	 * @return
	 */
	public String emptyShoppingCartMessage() {
		String actual = Utils.getTextFromUI(emptyShoppingCart);
		return actual;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
