Feature: Verify

  @sanity
  @Tc-1
  Scenario: Verify text on Search Box and results is Displayed
    Given I am on Google homepage
    When  I click on Search Box
    And   I type 'ducks'
    And   I click search
    Then  I verify duck is present on Search Box
    Then  I verify results is Displayed
    And   I quit


