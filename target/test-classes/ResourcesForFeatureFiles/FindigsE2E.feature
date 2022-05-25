Feature: Verify

  @sanity
    @Tc-2
    Scenario: Create Account
      Given I launch findigs create account page
      When  I type first name as 'Juliano'
      And I type last name as 'Heqimaj'
      And I type email as 'junjn@ccexfample.com'
      And I type phone number as '1234567890'
      And I type password as 'Findigs12!'
      And I type password confirmation as 'Findigs12!'
      And I click submit
      Then I verify 'Let’s verify your phone number.' is displayed
      And I type verification code as '0815'
      And I click Verify
      Then I verify Welcome before users name is displayed
      And I click Brooklyn
      And I select first property in Brooklyn
      And I click I'm ready to apply
      And I click start
      And I type my zip code '11103'





