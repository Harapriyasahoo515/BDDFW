Feature: Open SignUp and LoginPage
Background:
  Given user navigates to the application
  When use clicks in  signup or login  link
  Then Signup or login page should display

  @smoke
  Scenario: Test Data Inline with the login page

    And user enter username as "testmiuser@gmail.com" and password as "Testmiuser@01"
    And user click on the login button
    Then application should navigate to the user Home Page
    And user close the browser

    @regression
  Scenario Outline: Scenario outline demo

    And user enter username as "<username>" and password as "<password>"
    And user click on the login button
    Then application should navigate to the user Home Page
    And user close the browser
    Examples:
      | username | password |
      |testmiuser@gmail.com|Testmiuser@01|
      |testmiuser1@gmail.com|Testmiuser1@01|


 @smoke @regression
  Scenario: Navigate to the SignUp page with Map

    And user enter username  and password with map
      |username|password|
    |testmiuser@gmail.com|Testmiuser@01|
    |testmiuser1@gmail.com|Testmiuser1@01|
    |testmiuser2@gmail.com|Testmiuser2@01|
    And user click on the login button
    Then application should navigate to the user Home Page
    And user close the browser

  Scenario: Navigate to the SignUp page with List

    And user enter username  and password with list
      |username|password|
      |testmiuser@gmail.com|Testmiuser@01|
      |testmiuser1@gmail.com|Testmiuser1@01|
      |testmiuser2@gmail.com|Testmiuser2@01|
    And user click on the login button
    Then application should navigate to the user Home Page
    And user close the browser