Feature: Amazon Search

  Scenario: Search for a laptop on Amazon
    Given I am on the Amazon homepage
    When I type "laptop" in the search box
    And I click the search button
    Then I should see results related to "laptop"
