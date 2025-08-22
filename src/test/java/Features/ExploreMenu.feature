@Explore
Feature: Twitter Explore Menu Cases


  @ExploreMenuControl
  Scenario: User controls explore menu
    Given User goes to the link
    When User click login button
    When The user enters an true mail address
    When User click next  button
    When User enters true password
    When User logs in successfully
    When User click explore menu
    Then User sees the search page open

  @SubMenuControl
  Scenario: User controls submenus
    Given User goes to the link
    When User click login button
    When The user enters an true mail address
    When User click next  button
    When User enters true password
    When User logs in successfully
    When User click explore menu
    When User click trending menu
    When User click news menu
    When User click sports menu
    When User click entertainment menu
