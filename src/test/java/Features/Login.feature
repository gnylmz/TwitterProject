@Login
Feature: Twitter Login Page Cases


  @Incorrectmail
  Scenario: The user enters incorrect mail
    Given User goes to the link
    When User click login button
    When The user enters an email address in an incorrect format
    Then An error message appears on the screen

  @Incorrectpassword
  Scenario: The user enters incorrect password
    Given User goes to the link
    When User click login button
    When The user enters an true mail address
    When User click next  button
    When User enters wrong password
    Then An error message appears on the screen

  @SuccessfullLogin
  Scenario: User logs in successfully
    Given User goes to the link
    When User click login button
    When The user enters an true mail address
    When User click next  button
    When User enters true password
    Then User logs in successfully


