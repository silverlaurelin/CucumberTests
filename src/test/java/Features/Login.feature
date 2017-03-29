Feature: LoginFeature
  This feature deals with login functionality of the application


  Scenario: Login with correct username and password
    Given I navigate to the login page
    And I enter the following for Login
        | username | password      |
        | admin    | adminpassword |

    And I click login button
    Then I should see the userform page



  Scenario Outline: Login with correct username and password using Scenario Outline
    Given I navigate to the login page
    And I enter <username> and <password>

    And I click login button
    Then I should see the userform page

    Examples:
      |username|password     |
      |admin    |adminpassword|
      |admin2   |adminpassword|


