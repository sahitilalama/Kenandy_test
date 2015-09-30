Feature: Amazon Apple Watch Rating

  Scenario: Apple Watch Rating 
  
    Given I open Amazon website
    When I enter apple watch in search field 
    Then I click on search button
    And I select Smart Watches under Electronics Category 
    Then I click on the link Apple Watch 38mm
    And I hover mouse over the Ratings
    And I get the ratings
    And I assert the rating as 4.2
    Then I close and quit the browser
    