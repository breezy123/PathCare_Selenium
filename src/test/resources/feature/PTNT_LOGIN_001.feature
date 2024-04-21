@web_automation
Feature: Login Functionality

  Background:
    Given that the user opens "google_chrome" browser
    When  the user navigates to PathCare Patient Portal "https://patients.pathcare.co.za/" website

    Scenario: Verify the login functionality of the system using valid credentials
      Then user enters username "7810275800089" and "Systemtest@012024"
      And  user is directed to the landing page
      Then user is displayed on the right top corner