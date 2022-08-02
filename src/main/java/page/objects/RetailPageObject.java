package page.objects;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.Utils;

public class RetailPageObject extends Base{
	
	public RetailPageObject() {
		
		PageFactory.initElements(driver, this);
	}

		@FindBy(xpath="//a[@title='My Account']")
		private WebElement myAccountDD;
		@FindBy(xpath="//a[text()='Login']")
		private WebElement loginLink;
		@FindBy(xpath="//input[@id='input-email']")
		private WebElement emailField;
		@FindBy(xpath="//input[@id='input-password']") 
		private WebElement passwordField;
		@FindBy(xpath="//input[@type='submit']")
		private WebElement loginButton;
		@FindBy(xpath="//a[text()='TEST ENVIRONMENT']") 
		private WebElement dashbordText;
		@FindBy(xpath="//a[text()='Register for an affiliate account']")
		private WebElement affiliateLink;
		@FindBy(xpath="//input[@id='input-company']")
		private WebElement companyField;
		@FindBy(xpath="//input[@id='input-website']")
		private WebElement websiteField;
		@FindBy(xpath="//input[@id='input-tax']")
		private WebElement taxIdField;
		@FindBy(xpath="//div[@class='radio']")
		private List<WebElement> paymentMethod;
		@FindBy(xpath="//input[@name='payment' and @value='cheque']")
		private WebElement chequeRadioButton;
		@FindBy(xpath="//input[@name='payment' and @value='paypal']")
		private WebElement paypalRadioButton;
		@FindBy(xpath="//input[@name='payment' and @value='bank']")
		private WebElement newBankTransferRadioButton;
		@FindBy(id="input-cheque")
		private WebElement chequePayeeName;
		@FindBy(xpath="//input[@name='agree' and @type='checkbox']")
		private WebElement aboutUsCheckBox;
		@FindBy(xpath="//input[@value='Continue' and @type='submit']")
		private WebElement continueButton;
		@FindBy(xpath="//div[@id='account-account']//div[@class='alert alert-success alert-dismissible']")
		private WebElement successMessageOfAffiliate;
		@FindBy(xpath="//ul[@class='dropdown-menu dropdown-menu-right']//a[text()='Register']")
		private WebElement newRegisterLink;
		@FindBy(id="input-firstname") 
		private WebElement newFirstNameField;
		@FindBy(id="input-lastname") 
		private WebElement newLastNameField;
		@FindBy(id="input-email") 
		private WebElement newEmailField;
		@FindBy(id="input-telephone") 
		private WebElement newTelephoneField;
		@FindBy(id="input-password")
		private WebElement newPasswordField;
		@FindBy(id="input-confirm")
		private WebElement newPasswordConfirmField;
		@FindBy(xpath="//input[@name='newsletter' and @value='1']") 
		private WebElement newYesNewsLetterRadioButton;
		@FindBy(xpath="//input[@name='newsletter' and @value='0']")
		private WebElement newNoNewsLetterRadioButton;
		@FindBy(name="agree")
		private WebElement newPrivacyPolicyCheckBox;
		@FindBy(xpath="//input[@type='submit' and @value='Continue']")
		private WebElement newContinueButton;
		//Your Account Has Been Created!
		@FindBy(xpath="//h1[text()='Your Account Has Been Created!']")
		private WebElement newAccountSuccessText;
		@FindBy(xpath="//a[text()='Continue']")
		private WebElement newContinueButtonAfterAccountCreated;
		
		public void clickOnRegisterLink() {
			Utils.doClick(newRegisterLink);
		}
		 public void fillNewAccountForm() {
			 Random rand = new Random();
				String random = "";
				int randomInt=1;
				for (int i = 0; i < 6; i++) {
					int x = rand.nextInt(26)+97;
					char a = (char)x;
					random = random+a;
					randomInt *=x;
				}
			 Utils.sendKeys(newFirstNameField, random);
			 Utils.sendKeys(newLastNameField, random);
			 Utils.sendKeys(newEmailField, random+"@gmail.com");
			 Utils.sendKeysOfInteger(newTelephoneField, randomInt);
			 Utils.sendKeysOfInteger(newPasswordField, 123456);
			 Utils.sendKeysOfInteger(newPasswordConfirmField, 123456);
		 }
		 public void clickOnCheckBoxes() {
			 Utils.doClick(newYesNewsLetterRadioButton);
			 Utils.doClick(newPrivacyPolicyCheckBox);
		 }
		 public void clickOnNewContinueButton() {
			 Utils.doClick(newContinueButton);
		 }
		 public String getNewAccountCreationSuccessMessage() {
			 String actual = Utils.getTextFromUI(newAccountSuccessText);
			 return actual;
		 }
		 public void clickOnContinueAfterAccountCreated() {
			 Utils.doClick(newContinueButtonAfterAccountCreated);
		 }
		
		/**
		 * this method clicks on my account drop down in home page
		 */
		public void clickOnMyAccountDD() {
			Utils.doClick(myAccountDD);
		}
		/**
		 * this method clicks on login link from my account drop down
		 */
		public void clickOnLoginLink() {
			Utils.doClick(loginLink);
		}
		/**
		 * this method will take email as parameter and send to email field
		 * @param email
		 */
		public void sendEmailToField(String email) {
			Utils.sendKeys(emailField, email);
		}
		/**
		 * this method will take password as parameter and send to password field
		 * @param password
		 */
		public void sendPassToField(String password) {
			Utils.sendKeys(passwordField, password);
		}
		/**
		 * this method will press on login button
		 */
		public void doLogin() {
			Utils.doClick(loginButton);
		}
		/**
		 * this method will get the specific text of dash-board on the UI 
		 * @return dash-board text
		 */
		public String dashboardText() {
			String dashboard = Utils.getTextFromUI(dashbordText);
			return dashboard;
		}
		public void clickOnAffiliateLink() {
			Utils.doClick(affiliateLink);
		}
		public void sendCompanyName(String company) {
			Utils.sendKeys(companyField, company);
		}
		public void sendWebsite(String website ) {
			Utils.sendKeys(websiteField, website);
		}
		public void sendTaxID(String taxID) {
			Utils.sendKeys(taxIdField, taxID);
		}
		public void sendPaymentMethod(String paymentMethodType) {
			if(paymentMethodType.equalsIgnoreCase("cheque")) {
				Utils.doClick(chequeRadioButton);
			}
			else if(paymentMethodType.equalsIgnoreCase("paypal")) {
				Utils.doClick(paypalRadioButton);
			}
			else if(paymentMethodType.equalsIgnoreCase("bank")) {
				Utils.doClick(newBankTransferRadioButton);
			}
			else {
				System.err.println("Correct Value is Not Selected");
			}
		}
		public void sendPayerName(String payeeName) {
			Utils.sendKeys(chequePayeeName, payeeName);
		}
		public void clickOnAboutUsCheckBox() {
			Utils.doClick(aboutUsCheckBox);
		}
		public void clickOnContinueButton() {
			Utils.doClick(continueButton);
		}
		public String getAffiliateSuccessMessage() {
			String successText = Utils.getTextFromUI(successMessageOfAffiliate);
			return successText;
		}
		@FindBy(xpath="//a[text()='Edit your affiliate information']")
		private WebElement editAffiliateLink;
		@FindBy(xpath="//input[@name='payment' and @value='cheque']")
		private WebElement bankTransferRadioButton;
		@FindBy(xpath="//input[@id='input-bank-name']")
		private WebElement bankNameField;
		@FindBy(xpath="//input[@id='input-bank-branch-number']")
		private WebElement bankBranchField;
		@FindBy(xpath="//input[@id='input-bank-swift-code']")
		private WebElement swiftNumberField;
		@FindBy(xpath="//input[@id='input-bank-account-name']")
		private WebElement accountNameField;
		@FindBy(xpath="//input[@id='input-bank-account-number']")
		private WebElement accountNumberField;
		@FindBy(xpath="//input[@type='submit' and @value='Continue']")
		private WebElement editBankInfoContinueButton;
		@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
		private WebElement bankInfoChangeSuccessMessage;
		
		public void clickOnEditAffiliate() {
			Utils.doClick(editAffiliateLink);
		}
		public void clickOnBankTransferRadioButton() {
			Utils.doClick(bankTransferRadioButton);
		}
		public void sendbankName(String bankName) {
			Utils.sendKeys(bankNameField, bankName);
		}
		public void sendbankBranch(String bankBranch) {
			Utils.sendKeys(bankBranchField, bankBranch);
		}
		public void sendswiftNumber(String swiftNumber) {
			Utils.sendKeys(swiftNumberField, swiftNumber);
		}
		public void sendAccountName(String accountName) {
			Utils.sendKeys(accountNameField, accountName);
		}
		public void sendAccountNumber(String accountNumber) {
			Utils.sendKeys(accountNumberField, accountNumber);
		}
		public void clickOnEditBankInfoContinueButton() {
			Utils.doClick(editBankInfoContinueButton);
		}
		public String getBankInfoChangeMessage() {
			String actual = Utils.getTextFromUI(bankInfoChangeSuccessMessage);
			return actual;
		}
		
		@FindBy(xpath="//a[text()='Edit your account information']")
		private WebElement editYourAccountInfoLink;
		@FindBy(xpath="//input[@id='input-firstname']")
		private WebElement editAccountInfoFirsnameField;
		@FindBy(xpath="//input[@id='input-lastname']")
		private WebElement editAccountInfoLastnameField;
		@FindBy(xpath="//input[@id='input-email']")
		private WebElement editAccountInfoEmailField;
		@FindBy(xpath="//input[@id='input-telephone']")
		private WebElement editAccountInfoTelephoneField;
		@FindBy(xpath="//input[@type='submit' and @value='Continue']")
		private WebElement editAccountInfoContinueButton;
		@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
		private WebElement editAccountInfoSuccessMessage;
		
		public void clickOnEditAccountInfo() {
			Utils.doClick(editYourAccountInfoLink);
		}
		public void sendNewFirstName(String name) {
			Utils.sendKeys(editAccountInfoFirsnameField, name);
		}
		public void sendNewLastName(String lastName) {
			Utils.sendKeys(editAccountInfoLastnameField, lastName);
		}
		public void sendNewEmail(String email) {
			Utils.sendKeys(editAccountInfoEmailField, email);
		}
		public void sendNewTelephone(String telePhone) {
			Utils.sendKeys(editAccountInfoTelephoneField, telePhone);
		}
		public void clickOnEditInfoContinueButton() {
			Utils.doClick(editAccountInfoContinueButton);
		}
		public String getEditAccountInfoSuccessMessage() {
			String actual = Utils.getTextFromUI(editAccountInfoSuccessMessage);
			return actual;
		}
		
		
		
		
		
		
		
		
}
