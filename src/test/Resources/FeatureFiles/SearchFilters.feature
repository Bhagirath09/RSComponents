Feature: Filters

  Scenario: user should be able to use search functionality and filter products
    Given user is on homepage
    When user enters "tester" in search box
    And clicks search button
    Then user should be navigated to tester product category page
    And user should see different types of testers in categories
    When user clicks on "Insulation Testers"
    Then user should be navigated to Insulation Testers page
    And user should see different types of Insulation Tester
    And user should see different filters such as Results per page, Price, Minimum Test Voltage etc

@Functional
Scenario: user should be able to use Results per page filter
    Given user is on Insulation Tester page
    And user can see different type of search filters
    When user clicks on Results per page filter
    And selects "50"
    Then "Fifty" products should be displayed on page

  @Functional
Scenario: user should be able to use Brand filter
  Given user is on Insulation Tester page
  And user can see different type of search filters
  When user clicks on Brand filter
  And selects Megger checkbox
  And clicks Apply filters
  Then user should see only Megger products on page

  @Functional
Scenario: : user should be able to use sort Price filter
    Given user is on Insulation Tester page
    And user can see different type of search filters
    When user clicks on sort ascending price filter
    Then all products should be sorted in price ascending order

