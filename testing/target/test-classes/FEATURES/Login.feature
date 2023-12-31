@regression
Feature: Feature to test login functionality

  Scenario: Check login with valid credentials
    Given user is on login page
    When user enters username and pass
    And clicks on login button
    Then user is navigated to the home page

  #Scenario Outline: Check login with valid credentials
   # Given user is on login page
    #When user enters <username> and <pass>
    #And clicks on login button
    #Then user is navigated to the home page

    #Examples: 
     #| username | pass  |
      #| alek     | pass1 |
      #| user2    | pass2 |
      #| user3    | ssf@  |
