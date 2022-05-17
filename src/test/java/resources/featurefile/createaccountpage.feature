Feature: Create account test
  As a User I want to create an account on automation Practice website
  @sanity
  Scenario: User should create account successfully
    Given Iam at homepage
    When I click on sign in button
    And I enter a new email
    And I click Create an Account
    And I select Gender
    And I enter customer first name
    And I enter customer last name
    And I enter password
    And I select day of birth
    And I select month of birth
    And I selct year of birth
    And I enter first name
    And I enter last name
    And I enter company
    And I enter Address one
    And I enter address two
    And I enter city
    And I enter state
    And I enter post code
    And I enter country
    And I enter other details
    And I enter phone no
    And I enter mobile no
    And I enter alias address
    And I click on register button
    Then I should see my account


