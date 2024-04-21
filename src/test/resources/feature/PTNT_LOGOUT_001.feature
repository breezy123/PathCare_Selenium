@web_automation
Feature: Logout Functionality

  Background:
    Given that the user opens "google_chrome" browser
    When  the user navigates to PathCare Patient Portal "https://patients.pathcare.co.za/" website

    Scenario: Verify the logout functionality of the system
      Then user enters username "7810275800089" and "Systemtest@012024"
      And user clicks on LogOut to logout of the system
      Then user validates username and password input fields