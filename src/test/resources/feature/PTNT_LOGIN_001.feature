@web_automation
Feature: Login Functionality

  Background:
    Given the user navigates to PathCare Patient Portal "https://patients.pathcare.co.za/" website

    Scenario: Verify the login functionality of the system using valid credentials
      When user enters username "7810275800089" and "Systemtest@012024"
      Then  user is directed to the landing page
      And user is displayed on the right top corner