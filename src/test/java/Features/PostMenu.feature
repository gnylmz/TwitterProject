@Post
Feature: Twitter post Menu Cases


  @PostMenuControl
  Scenario: User controls post menu
    Given User goes to the link
    When User click login button
    When The user enters an true mail address
    When User click next  button
    When User enters true password
    When User logs in successfully
    When User click post menu
    Then User sees the post page open

  @PostOptions
  Scenario: User controls post options
    Given User goes to the link
    When User click login button
    When The user enters an true mail address
    When User click next  button
    When User enters true password
    When User logs in successfully
    When User click post menu
    Then User choose who can reply

  @ShareTextPost
  Scenario: User posts text
    Given User goes to the link
    When User click login button
    When The user enters an true mail address
    When User click next  button
    When User enters true password
    When User logs in successfully
    When User click post menu
    Then User posts

  @AskQuestion
  Scenario: User controls ask questions option
    Given User goes to the link
    When User click login button
    When The user enters an true mail address
    When User click next  button
    When User enters true password
    When User logs in successfully
    When User click post menu
    When User click poll option
    When User fill the info
    Then User posts


  @DraftAskQuestion
  Scenario: User draft ask question
    Given User goes to the link
    When User click login button
    When The user enters an true mail address
    When User click next  button
    When User enters true password
    When User logs in successfully
    When User click post menu
    When User click poll option
    When User fill the info
    Then User remove poll