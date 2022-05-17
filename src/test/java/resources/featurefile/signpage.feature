Feature: SignInTest
  As a User I want to sign into Automation practice website
  BackGround:
 Given Iam at homepage
  When I click On sign In Link
@sanity,@smoke,@regression
  Scenario: User should navigate to sign in page successfully

    Then I should see the message AUTHENTICATION


@smoke,@regression
    Scenario Outline: User should verify the error message with invalid credentials
      When I click on sign in Link
      And I enter email "<email>"
      And I enter password "<password>"
      And I click on sign in button
      Then I should see the error message "<errorMessage>"

      Examples:
      |  email          | password           | errorMessage           |
      |                 |123456              |An email address required|
      |abcd@gmail.com   |                     |Password id required   |
      |adfdfgfg         |123456               |Invalid email adress   |
      |abcd@gmail.com   |123456               |Authentication Failed   |
@Regression
Scenario: User should login successfully with valid credentials
  When I enter valid email
  And I enter valid password
  And I click on sign in button
  Then I verify signout link is displayed
@Regression
  Scenario:Verify User should LogOut successfully
    When I click on sign in button
    And I enter valid email
    And I enter valid password
    And I click on sign in button
    And I click On signout link
    Then I should see Sign In link
