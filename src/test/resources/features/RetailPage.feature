#Author: yahya.hussaini@tekschool.us
@retailPage, @Regression
Feature: Retail Page

  Background: 
    Given User is on Retail website
    And User click  on MyAccount

  @paymentMethod
  Scenario: Register as an Affiliate user with Cheque Payment Method
    When User click on register
    And User fill the Registration form
    And User clicks on yes for newsletter and privacy check box
    And User click on continue
    And User verify new Account Created 'Your Account Has Been Created!'
    And User click on continue to navigate to account
    And User click on Register for an Affiliate Account link
    And User fill affiliate form with below information
      | company   | website                | taxID | paymentMethodType | payeeName |
      | TEKSCHOOL | http://tek-school.com/ | 90901 | cheque            | Yahya     |
    And User check on About us check box
    And User click on Continue button
    Then User should see a success message

  @paymentMethodEdit
  Scenario: Edit your affiliate information from Cheque payment method to Bank Transfer
    When User click on Login
    And User enter username 'yahya.h@gmail.com' and password '5678'
    And User click on Login button
    Then User should be logged in to MyAccount dashboard
    When User click on ‘Edit your affiliate informationlink
    And user click on Bank Transfer radio button
    And User fill Bank information with below information
      | bankName | abaNumber | swiftCode | accountName | accountNumber  |
      | myBank   |    112233 |    454567 | Yahya       | 65452323424234 |
    And User click on Continue button
    Then User should see a success message

  @accountInfoEdit
  Scenario: Edit your account Information
    When User click on Login
    And User enter username 'yahya.h@gmail.com' and password '5678'
    And User click on Login button
    Then User should be logged in to MyAccount dashboard
    When User click on ‘Edit your account information’ link
    And User modify below information
      | firstname | lastName | email             | telephone  |
      | yahya     | Hussaini | yahya.h@gmail.com | 4545657567 |
    And User click on continue Button
    Then User should see a message 'Success: Your account has been successfully updated.'
