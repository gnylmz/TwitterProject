@UserProfile
Feature: Twitter profile Menu Cases


  @ProfileMenuControl
  Scenario: User goes profile
    Given User goes to the link
    When User click login button
    When The user enters an true mail address
    When User click next  button
    When User enters true password
    When User logs in successfully
    Then User click profile menu

  @WhoToFollow
  Scenario: The user looks at the follower suggestion list
    Given User goes to the link
    When User click login button
    When The user enters an true mail address
    When User click next  button
    When User enters true password
    When User logs in successfully
    When User click profile menu
    When User click who to follow
    Then User sees the lists of suggestions

  @Followers
  Scenario: The user looks at the list of followers and people they follow
    Given User goes to the link
    When User click login button
    When The user enters an true mail address
    When User click next  button
    When User enters true password
    When User logs in successfully
    When User click profile menu
    When User click following
    When User click followers
    Then User backs mainpage

  @SetUpProfile
  Scenario: User changes their profile settings
    Given User goes to the link
    When User click login button
    When The user enters an true mail address
    When User click next  button
    When User enters true password
    When User logs in successfully
    When User click profile menu
    When User click set up profile
    Then User save settings
