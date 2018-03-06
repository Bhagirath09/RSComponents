Feature: Checkout
  User should be able to browse the shop,
  put an item in the basket,
  proceed to checkout,
  login as Guest,
  and  pay by credit card,


    @End2End
  Scenario: User goes to website and purchase LED Tube Lights successfully
    Given user is on homepage
    Then the page should display 5 navigation categories
    When user clicks on "All Products" category
    And clicks on Lighting category
    And clicks on LED Lamps
    And clicks on LED Tube Lights
    Then user should be navigated to LED Tube Lights page
    And user should see different type of Lights
    When user puts two "2" Sylvania ToLEDo, RS Stock No "123-4904" in quantity
    And clicks Add button
    And clicks Added View Basket
    Then user should be navigated to My basket page
    And user should see that same lights are added in basket
    And user clicks on Checkout Securely
    And user enters email to continue as a guest
    And clicks on Guest checkout
    Then user should be navigated to Delivery page
    When user enters all mandatory information on delivery page
    And clicks on Continue to payment
    Then user should be navigated to Payment page
    When user selects "MasterCard" as Card Type
    And enters all mandatory information
    And clicks on Continue to order review
    Then user should be navigated to Order review page
    And should see all order details
    When user clicks on Place order button
    Then user should be able to place an order successfully
    And should see "Your order has been successfully processed!" message after completing Checkout

  @End2End
  Scenario: User goes to website and purchase Battery Holders successfully
    Given user is on homepage
    Then the page should display 5 navigation categories
    When user clicks on "New Products" category
    And clicks on Batteries category
    Then user should be navigated to Batteries page
    And user should see different type of Batteries
    When user puts two "20" HARWIN Coin Cell Batter Holder, RS Stock No "161-3709" in quantity
    And clicks HARWIN Battery Holder Quantity Add button
    And clicks HARWIN Battery Holder View Basket
    Then user should be navigated to My basket page
    And user should see that same Battery Holders are added in basket
    And user clicks on Checkout Securely
    And user enters email to continue as a guest
    And clicks on Guest checkout
    Then user should be navigated to Delivery page
    When user enters all mandatory information on delivery page
    And clicks on Continue to payment
    Then user should be navigated to Payment page
    When user selects "MasterCard" as Card Type
    And enters all mandatory information
    And clicks on Continue to order review
    Then user should be navigated to Order review page
    And should see all order details HARWIN Battery Holder
    When user clicks on Place order button
    Then user should be able to place an order successfully
    And should see "Your order has been successfully processed!" message after completing Checkout
