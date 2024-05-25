@web_automation
Feature: Logout Functionality

  Background:
    Given  the user navigates to PathCare Patient Portal "https://patients.pathcare.co.za/" website

    Scenario: Verify the logout functionality of the system
      When user enters username "7810275800089" and "Systemtest@012024"
      Then user clicks on LogOut to logout of the system
      And user validates username and password input fields