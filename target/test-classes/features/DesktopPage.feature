#Author: yahya.hussaini@tekschool.us
@desktopPage, @Regression
Feature: Desktops Tab

  Background: 
    Given User is on Retail website

  @allItemsVisibleInDesktopLink
  Scenario: User verify all items are present in Desktops tab
    When User click on Desktops tab
    And User click on Show all desktops
    Then User should see all items are present in Desktop page

  @addingHPToCart
  Scenario: User add HP LP 3065  from Desktops tab to the cart
    When User click on Desktops tab
    And User click on Show all desktops
    And User click  ADD TO CART option on HP LP3065item
    And User select quantity 1
    And User click add to Cart button
    Then User should see a message ‘Success: you have added HP LP 3065 to your Shopping cart!’

  @addingCanonToCart
  Scenario: User add Canon EOS 5D from Desktops tab to the cart
    When User click on Desktops tab
    And User click on Show all desktops
    And User click  ADD TO CART option on Canon EOS 5Ditem
    And User select color from dropdown Red
    And User select quantity 1 for Canon
    And User click add to Cart button Of Canon
    Then User should see a message ‘Success: You have added Canon EOS 5D to your shopping cart!’

  @reviewPossibility
  Scenario: User add a review to Canon EOS 5D item inDesktops tab
    When User click on Desktops tab
    And User click on Show all desktops
    And User click on Canon EOS 5D item
    And User click on write a review link
    And user fill the review information with below information
      | yourname | yourReview                                              | Rating |
      | yahya    | this product is working well, i want to rate it as good |      5 |
    And User click on Continue Button
    Then User should see a message with ‘Thank you for your review. It has been submitted to the webmaster for approval.”                                     |
